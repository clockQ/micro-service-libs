package com.pharbers.kafka.connect.oss;

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigException;
import org.apache.kafka.common.utils.AppInfoParser;
import org.apache.kafka.connect.connector.Task;
import org.apache.kafka.connect.source.SourceConnector;

import java.util.*;

/**
 * @author jeorch
 * @ProjectName micro-service-libs
 * @ClassName OssSourceConnector
 * @date 19-7-1下午7:45
 * @Description: TODO
 */
public class OssExcelSourceConnector extends SourceConnector {

    public static final String TOPIC_CONFIG = "topic";
    public static final String ENDPOINT_CONFIG = "endpoint";
    public static final String ACCESS_KEY_ID_CONFIG = "accessKeyId";
    public static final String ACCESS_KEY_SECRET_CONFIG = "accessKeySecret";
    public static final String BUCKET_NAME_CONFIG = "bucketName";
    public static final String KEY_CONFIG = "key";
    public static final String TASK_BATCH_SIZE_CONFIG = "batch.size";
    public static final String JOB_ID_CONFIG = "jobId";
    public static final String TRACE_ID_CONFIG = "traceId";
    public static final String AUTO_TITLE_CONFIG = "autoTitle";
    public static final String TITLES_CONFIG = "titles";

    public static final int DEFAULT_TASK_BATCH_SIZE = 2000;

    private static final ConfigDef CONFIG_DEF = new ConfigDef()
            .define(ENDPOINT_CONFIG, ConfigDef.Type.STRING, null, ConfigDef.Importance.HIGH, "Aliyun OSS Endpoint")
            .define(ACCESS_KEY_ID_CONFIG, ConfigDef.Type.STRING, null, ConfigDef.Importance.HIGH, "Aliyun OSS AccessKeyId")
            .define(ACCESS_KEY_SECRET_CONFIG, ConfigDef.Type.STRING, null, ConfigDef.Importance.HIGH, "Aliyun OSS AccessKeySecret")
            .define(BUCKET_NAME_CONFIG, ConfigDef.Type.STRING, null, ConfigDef.Importance.HIGH, "Aliyun OSS BucketName")
            .define(KEY_CONFIG, ConfigDef.Type.STRING, null, ConfigDef.Importance.HIGH, "Source ossKey(Aliyun OSS key)")
            .define(TOPIC_CONFIG, ConfigDef.Type.LIST, ConfigDef.Importance.HIGH, "The topic to publish data to")
            .define(JOB_ID_CONFIG, ConfigDef.Type.STRING,  UUID.randomUUID().toString(), ConfigDef.Importance.HIGH, "配置job id")
            .define(TRACE_ID_CONFIG, ConfigDef.Type.STRING,  UUID.randomUUID().toString(), ConfigDef.Importance.HIGH, "配置trace id")
            .define(AUTO_TITLE_CONFIG, ConfigDef.Type.STRING, "true", ConfigDef.Importance.LOW, "是否使用第一行为标题")
            .define(TITLES_CONFIG, ConfigDef.Type.LIST, new ArrayList<String>(), ConfigDef.Importance.LOW, "配置titles， autoTitle为false才能生效")
            .define(TASK_BATCH_SIZE_CONFIG, ConfigDef.Type.INT, DEFAULT_TASK_BATCH_SIZE, ConfigDef.Importance.LOW,
                    "The maximum number of records the Source task can read from file one time");

    private String endpoint;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;
    private String ossKey;
    private String topic;
    private String jobID;
    private String traceID;
    private String autoTitle;
    private List<String> titles;
    private int batchSize;

    @Override
    public String version() {
        return AppInfoParser.getVersion();
    }

    @Override
    public void start(Map<String, String> props) {
        AbstractConfig parsedConfig = new AbstractConfig(CONFIG_DEF, props);
        endpoint = parsedConfig.getString(ENDPOINT_CONFIG);
        if (endpoint == null)
            throw new ConfigException("'endpoint' in OssSourceConnector configuration requires definition");
        accessKeyId = parsedConfig.getString(ACCESS_KEY_ID_CONFIG);
        if (accessKeyId == null)
            throw new ConfigException("'accessKeyId' in OssSourceConnector configuration requires definition");
        accessKeySecret = parsedConfig.getString(ACCESS_KEY_SECRET_CONFIG);
        if (accessKeySecret == null)
            throw new ConfigException("'accessKeySecret' in OssSourceConnector configuration requires definition");
        bucketName = parsedConfig.getString(BUCKET_NAME_CONFIG);
        if (bucketName == null)
            throw new ConfigException("'bucketName' in OssSourceConnector configuration requires definition");
        ossKey = parsedConfig.getString(KEY_CONFIG);
        if (ossKey == null)
            throw new ConfigException("'key' in OssSourceConnector configuration requires definition");
        List<String> topics = parsedConfig.getList(TOPIC_CONFIG);
        if (topics.size() != 1)
            throw new ConfigException("'topic' in FileStreamSourceConnector configuration requires definition of a single topic");
        topic = topics.get(0);
        jobID = parsedConfig.getString(JOB_ID_CONFIG);
        traceID = parsedConfig.getString(TRACE_ID_CONFIG);
        autoTitle = parsedConfig.getString(AUTO_TITLE_CONFIG);
        titles = parsedConfig.getList(TITLES_CONFIG);
        batchSize = parsedConfig.getInt(TASK_BATCH_SIZE_CONFIG);
    }

    @Override
    public Class<? extends Task> taskClass() {
        return OssExcelSourceTask.class;
    }

    @Override
    public List<Map<String, String>> taskConfigs(int maxTasks) {
        ArrayList<Map<String, String>> configs = new ArrayList<>();
        // Only one input stream makes sense.
        Map<String, String> config = new HashMap<>();
        config.put(ENDPOINT_CONFIG, endpoint);
        config.put(ACCESS_KEY_ID_CONFIG, accessKeyId);
        config.put(ACCESS_KEY_SECRET_CONFIG, accessKeySecret);
        config.put(BUCKET_NAME_CONFIG, bucketName);
        config.put(KEY_CONFIG, ossKey);
        config.put(TOPIC_CONFIG, topic);
        config.put(JOB_ID_CONFIG, jobID);
        config.put(TRACE_ID_CONFIG, traceID);
        config.put(AUTO_TITLE_CONFIG, autoTitle);
        config.put(TITLES_CONFIG, String.join(",", titles));
        config.put(TASK_BATCH_SIZE_CONFIG, String.valueOf(batchSize));
        configs.add(config);
        return configs;
    }

    @Override
    public void stop() {
        // Nothing to do since FileStreamSourceConnector has no background monitoring.
    }

    @Override
    public ConfigDef config() {
        return CONFIG_DEF;
    }

}

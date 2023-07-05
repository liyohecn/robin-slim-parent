package cn.liyohe.robin.slim.autoconfigure;


import cn.liyohe.robin.slim.file.StorageProperties;
import cn.liyohe.robin.slim.file.service.StorageService;
import cn.liyohe.robin.slim.file.service.impl.AliOssStorageServiceImpl;
import cn.liyohe.robin.slim.file.service.impl.HuaweiObsStorageServiceImpl;
import cn.liyohe.robin.slim.file.service.impl.MinioStorageServiceImpl;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.common.auth.DefaultCredentialProvider;
import com.obs.services.ObsClient;
import io.minio.MinioClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 文件存储配置
 *
 * @author liyohe
 */

@ComponentScan(value = {
        "cn.liyohe.robin.slim.file",
})
@Configuration
@EnableConfigurationProperties({StorageProperties.class})
public class FileStorageConfiguration {

    @Bean
    @ConditionalOnProperty(prefix = "file.storage", name = "type", havingValue = "minio")
    public MinioClient minioClient(StorageProperties storageProperties) {
        return MinioClient.builder()
                .endpoint(storageProperties.getEndpoint())
                .region(storageProperties.getRegion())
                .credentials(storageProperties.getAccessKey(), storageProperties.getSecretKey())
                .build();
    }

    @Bean
    @ConditionalOnProperty(prefix = "file.storage", name = "type", havingValue = "oss")
    public OSS ossClient(StorageProperties storageProperties) {
        return OSSClientBuilder.create()
                .endpoint(storageProperties.getEndpoint())
                .region(storageProperties.getRegion())
                .credentialsProvider(new DefaultCredentialProvider(storageProperties.getAccessKey(), storageProperties.getSecretKey()))
                .build();
    }

    @Bean
    @ConditionalOnProperty(prefix = "file.storage", name = "type", havingValue = "obs")
    public ObsClient obsClient(StorageProperties storageProperties) {
        return new ObsClient(storageProperties.getAccessKey(), storageProperties.getSecretKey(), storageProperties.getEndpoint());
    }

    @Bean
    @ConditionalOnBean(value = MinioClient.class)
    public StorageService minioStorageService(StorageProperties properties, MinioClient client) {
        return new MinioStorageServiceImpl(properties, client);
    }

    @Bean
    @ConditionalOnBean(value = OSS.class)
    public StorageService ossStorageService(StorageProperties properties, OSS oss) {
        return new AliOssStorageServiceImpl(properties, oss);
    }

    @Bean
    @ConditionalOnBean(value = ObsClient.class)
    public StorageService obsStorageService(StorageProperties properties, ObsClient client) {
        return new HuaweiObsStorageServiceImpl(properties, client);
    }
}

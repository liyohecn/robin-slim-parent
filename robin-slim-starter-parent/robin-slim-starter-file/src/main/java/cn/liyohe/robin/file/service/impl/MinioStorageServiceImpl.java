package cn.liyohe.robin.file.service.impl;

import cn.liyohe.robin.file.StorageProperties;
import cn.liyohe.robin.file.service.StorageService;
import io.minio.GetObjectArgs;
import io.minio.MinioClient;

import java.io.InputStream;


public class MinioStorageServiceImpl implements StorageService {

    private final StorageProperties properties;
    private final MinioClient client;
    public MinioStorageServiceImpl(StorageProperties properties, MinioClient client) {
        this.properties = properties;
        this.client = client;
    }

    @Override
    public InputStream getFile(String key) {
        GetObjectArgs args = GetObjectArgs.builder()
                .bucket(properties.getBucket())
                .object(key)
                .build();
        try {
            return client.getObject(args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

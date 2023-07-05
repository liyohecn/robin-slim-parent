package cn.liyohe.robin.file.service.impl;

import cn.liyohe.robin.file.StorageProperties;
import cn.liyohe.robin.file.service.StorageService;
import com.aliyun.oss.OSS;

import java.io.InputStream;

public class AliOssStorageServiceImpl implements StorageService {

    private final StorageProperties properties;
    private final OSS oss;
    public AliOssStorageServiceImpl(StorageProperties properties, OSS oss) {
        this.properties = properties;
        this.oss = oss;
    }

    @Override
    public InputStream getFile(String key) {
        return null;
    }
}

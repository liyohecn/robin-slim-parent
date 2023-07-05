package cn.liyohe.robin.slim.file.service.impl;

import cn.liyohe.robin.slim.file.StorageProperties;
import cn.liyohe.robin.slim.file.service.StorageService;
import com.obs.services.ObsClient;

import java.io.InputStream;


public class HuaweiObsStorageServiceImpl implements StorageService {

    private final StorageProperties properties;
    private final ObsClient client;
    public HuaweiObsStorageServiceImpl(StorageProperties properties, ObsClient client) {
        this.properties = properties;
        this.client = client;
    }

    @Override
    public InputStream getFile(String key) {
        return null;
    }
}

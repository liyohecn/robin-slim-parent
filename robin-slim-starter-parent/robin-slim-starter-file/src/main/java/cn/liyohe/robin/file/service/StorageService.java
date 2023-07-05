package cn.liyohe.robin.file.service;


import java.io.InputStream;

/**
 * 存储服务
 *
 * @author liyohe
 * @date 2023-07-05
 */
public interface StorageService {

    InputStream getFile(String key);
}

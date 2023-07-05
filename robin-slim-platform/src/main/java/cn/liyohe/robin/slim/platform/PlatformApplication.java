package cn.liyohe.robin.slim.platform;


import cn.liyohe.robin.slim.autoconfigure.EnableFileStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 平台应用程序
 *
 * @author liyohe
 * @date 2023/07/05
 */

@EnableFileStorage
@SpringBootApplication
public class PlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformApplication.class, args);
    }
}

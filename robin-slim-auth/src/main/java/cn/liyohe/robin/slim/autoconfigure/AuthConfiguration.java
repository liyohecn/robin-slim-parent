package cn.liyohe.robin.slim.autoconfigure;


import cn.liyohe.robin.slim.AuthProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 文件存储配置
 *
 * @author liyohe
 */

@ComponentScan(value = {
        "cn.liyohe.robin.slim.auth",
})
@Configuration
@EnableConfigurationProperties({AuthProperties.class})
public class AuthConfiguration {
}

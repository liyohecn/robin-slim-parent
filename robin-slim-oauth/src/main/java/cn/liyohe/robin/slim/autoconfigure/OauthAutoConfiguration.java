package cn.liyohe.robin.slim.autoconfigure;


import cn.liyohe.robin.slim.oauth.OauthProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 文件存储配置
 *
 * @author liyohe
 */

@ComponentScan(value = {
        "cn.liyohe.robin.slim.oauth",
})
@Configuration
@EnableConfigurationProperties({OauthProperties.class})
public class OauthAutoConfiguration {
}

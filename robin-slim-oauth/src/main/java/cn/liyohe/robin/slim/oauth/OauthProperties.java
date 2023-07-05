package cn.liyohe.robin.slim.oauth;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 认证属性
 *
 * @author liyohe
 */
@ConfigurationProperties(prefix = "robin.oauth", ignoreUnknownFields = true)
public class OauthProperties {

}

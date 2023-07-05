package cn.liyohe.robin.slim.i18n;

import cn.liyohe.robin.slim.context.SpringContextHolder;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

/**
 * 国际化
 *
 * @author liyohe liyohe.cn@gmail.com
 */
public class MessageHolder {
    private static final MessageSource messageSource;

    static {
        messageSource = (MessageSource) SpringContextHolder.getBean("messageSource");
    }

    public static String getMessage(int code) {
        return getMessage(code, new String[0]);
    }

    public static String getMessage(int code, String... params) {
        return messageSource.getMessage(String.valueOf(code), params, LocaleContextHolder.getLocale());
    }
}

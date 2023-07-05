package cn.liyohe.robin.slim.autoconfigure;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(FileStorageAutoConfiguration.class)
public @interface EnableFileStorage {
}

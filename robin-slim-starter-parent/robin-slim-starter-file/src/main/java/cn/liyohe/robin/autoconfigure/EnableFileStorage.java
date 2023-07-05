package cn.liyohe.robin.autoconfigure;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(FileStorageConfiguration.class)
public @interface EnableFileStorage {
}

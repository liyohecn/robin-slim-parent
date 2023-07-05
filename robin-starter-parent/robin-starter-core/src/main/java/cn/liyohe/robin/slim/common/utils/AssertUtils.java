package cn.liyohe.robin.slim.common.utils;

import cn.liyohe.robin.slim.exception.ErrorCode;
import cn.liyohe.robin.slim.exception.RobinException;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * 校验工具类
 *
 * @author liyohe liyohe.cn@gmail.com
 */
public class AssertUtils {

    public static void isBlank(String str, String... params) {
        isBlank(str, ErrorCode.NOT_NULL, params);
    }

    public static void isBlank(String str, Integer code, String... params) {
        if (code == null) {
            throw new RobinException(ErrorCode.NOT_NULL, "code");
        }

        if (StringUtils.isBlank(str)) {
            throw new RobinException(code, params);
        }
    }

    public static void isNull(Object object, String... params) {
        isNull(object, ErrorCode.NOT_NULL, params);
    }

    public static void isNull(Object object, Integer code, String... params) {
        if (code == null) {
            throw new RobinException(ErrorCode.NOT_NULL, "code");
        }

        if (object == null) {
            throw new RobinException(code, params);
        }
    }

    public static void isArrayEmpty(Object[] array, String... params) {
        isArrayEmpty(array, ErrorCode.NOT_NULL, params);
    }

    public static void isArrayEmpty(Object[] array, Integer code, String... params) {
        if (code == null) {
            throw new RobinException(ErrorCode.NOT_NULL, "code");
        }

        if (array == null || array.length == 0) {
            throw new RobinException(code, params);
        }
    }

    public static void isListEmpty(List<?> list, String... params) {
        isListEmpty(list, ErrorCode.NOT_NULL, params);
    }

    public static void isListEmpty(List<?> list, Integer code, String... params) {
        if (code == null) {
            throw new RobinException(ErrorCode.NOT_NULL, "code");
        }

        if (list == null || list.isEmpty()) {
            throw new RobinException(code, params);
        }
    }

    public static void isMapEmpty(Map map, String... params) {
        isMapEmpty(map, ErrorCode.NOT_NULL, params);
    }

    public static void isMapEmpty(Map map, Integer code, String... params) {
        if (code == null) {
            throw new RobinException(ErrorCode.NOT_NULL, "code");
        }

        if (map == null || map.isEmpty()) {
            throw new RobinException(code, params);
        }
    }
}
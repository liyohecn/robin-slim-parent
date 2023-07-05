package cn.liyohe.robin.slim.file.domain;

import java.io.Serial;
import java.io.Serializable;

public class FileObject implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 文件名
     */
    private String filename;

    /**
     * 内容类型
     */
    private String contentType;

}

package cn.liyohe.robin.slim.exception;

import cn.liyohe.robin.slim.i18n.MessageHolder;

import java.io.Serial;

/**
 * Robin异常
 *
 * @author liyohe liyohe.cn@gmail.com
 */
public class RobinException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    private int code;
    private String msg;

    public RobinException(int code) {
        this.code = code;
        this.msg = MessageHolder.getMessage(code);
    }

    public RobinException(int code, String... params) {
        this.code = code;
        this.msg = MessageHolder.getMessage(code, params);
    }

    public RobinException(int code, Throwable e) {
        super(e);
        this.code = code;
        this.msg = MessageHolder.getMessage(code);
    }

    public RobinException(int code, Throwable e, String... params) {
        super(e);
        this.code = code;
        this.msg = MessageHolder.getMessage(code, params);
    }

    public RobinException(String msg) {
        super(msg);
        this.code = ErrorCode.INTERNAL_SERVER_ERROR;
        this.msg = msg;
    }

    public RobinException(String msg, Throwable e) {
        super(msg, e);
        this.code = ErrorCode.INTERNAL_SERVER_ERROR;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}

package com.pineapple.base.core.vo;

import java.io.Serializable;
import java.util.Map;

/**
 * module name :统一返回对象
 * Created by lyk on 2019/1/21.
 */
public class ResultVO<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 执行状态
     */
    private boolean status;

    /**
     * 返回对象
     */
    private T module;

    /**
     * 错误编码
     */
    private Map<String, Object> errMessage;


    public ResultVO() {
    }

    public ResultVO(boolean status) {
        this.status = status;
    }

    public ResultVO(boolean status, T module) {
        this.status = status;
        this.module = module;
    }

    public ResultVO(boolean status, Map<String, Object> errMessage) {
        this.status = status;
        this.errMessage = errMessage;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public T getModule() {
        return module;
    }

    public void setModule(T module) {
        this.module = module;
    }

    public Map<String, Object> getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(Map<String, Object> errMessage) {
        this.errMessage = errMessage;
    }
}

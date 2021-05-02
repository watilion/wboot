package top.watilion.wboot.common.enums;

/**
 * @author watilion
 * @date 2021/5/3 00:51
 */
public enum ResultCode {

    /**
     * 操作失败
     */
    FAIL(100000,false,"操作失败"),
    /**
     *提交数据重复
     */
    DUPLICATE(100003,false,"提交数据重复"),
    /**
     * 操作成功
     */
    SUCCESS(200000,true,"操作成功"),
    /**
     * 请求参数异常
     */
    REQUEST_PARAMS_ERR(400000,false,"请求参数异常"),

    /**
     * 用户未登录
     */
    UNAUTHORIZED(401000,false,"用户认证失败（未登录）"),
    NAME_OR_PWD_ERROR(401001,false,"用户名或密码错误"),
    TOKEN_EXPIRED(401002,false,"token已过期"),
    /**
     * 用户未授权
     */
    ACCESS_DENIED(403000,false,"用户无授权,拒绝访问"),

    USER_FROZEN(403001,false,"用户冻结"),

    /**
     * 执行错误
     */
    ERROR(500000,false,"执行错误"),
    /**
     * 系统繁忙无法响应请求
     */
    NO_RESPONSE(503000,false,"系统繁忙无法响应请求"),
    /**
     * 执行超时
     */
    TIMEOUT(504000,false,"执行超时");

    private final Integer code;
    private final boolean success;
    private final String message;

    ResultCode(Integer code, boolean success, String message) {
        this.code = code;
        this.success = success;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}

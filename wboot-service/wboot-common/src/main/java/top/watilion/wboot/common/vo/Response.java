package top.watilion.wboot.common.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import top.watilion.wboot.common.enums.ResultCode;

/**
 * @author watilion
 * @date 2021/5/3 00:41
 */
@Data
@Schema(description = "统一消息返回实体")
public class Response<T> {
    @Schema(name = "code", description = "返回状态编码")
    private Integer code;

    @Schema(description = "返回状态")
    private boolean success;

    @Schema(description = "返回信息")
    private String message;

    @Schema(description = "时间戳")
    private long timestamp = System.currentTimeMillis();

    @Schema(description = "分页信息")
    private Pagination pagination;

    @Schema(description = "返回数据")
    private T data;

    public Response<T> result(Integer code, boolean success, String message, T data, Pagination pagination) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.data = data;
        this.pagination = pagination;
        return this;
    }

    public Response<T> result(ResultCode resultCode) {
        return result(resultCode.getCode(), resultCode.isSuccess(), resultCode.getMessage(), null, null);
    }


    public Response<T> success() {
        return result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.isSuccess(), ResultCode.SUCCESS.getMessage(), null, null);
    }

    public Response<T> success(String message) {
        return result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.isSuccess(), message, null, null);
    }

    public Response<T> success(T data) {
        return result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.isSuccess(), ResultCode.SUCCESS.getMessage(), data, null);
    }

    public Response<T> success(T data, Pagination pagination) {
        return result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.isSuccess(), ResultCode.SUCCESS.getMessage(), data, pagination);
    }

    public Response<T> success(String message, T data) {
        return result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.isSuccess(), message, data, null);
    }

    public Response<T> success(String message, T data, Pagination pagination) {
        return result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.isSuccess(), message, data, pagination);
    }

    public Response<T> fail() {
        return result(ResultCode.FAIL.getCode(), ResultCode.FAIL.isSuccess(), ResultCode.FAIL.getMessage(), null, null);
    }

    public Response<T> fail(String message) {
        return result(ResultCode.FAIL.getCode(), ResultCode.FAIL.isSuccess(), message, null, null);
    }

    public Response<T> fail(T data) {
        return result(ResultCode.FAIL.getCode(), ResultCode.FAIL.isSuccess(), ResultCode.FAIL.getMessage(), data, null);
    }

    public Response<T> fail(int code, String message) {
        return result(code, ResultCode.FAIL.isSuccess(), message, null, null);
    }

    public Response<T> fail(String message, T data) {
        return result(ResultCode.FAIL.getCode(), ResultCode.FAIL.isSuccess(), message, data, null);
    }

    public Response<T> fail(int code, String message, T data) {
        return result(code, ResultCode.FAIL.isSuccess(), message, data, null);
    }
}

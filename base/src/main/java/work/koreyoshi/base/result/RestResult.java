package work.koreyoshi.base.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import work.koreyoshi.base.exception.BaseCustomException;

import java.io.Serializable;
import java.util.Map;

/**
 * @author zhoujx
 */
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestResult implements Serializable {

    private String message;

    private Integer code;

    private Object data;

    public RestResult() {
    }

    public RestResult(String message, Integer code, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public static RestResult ok() {
        return ok(null);
    }

    public static RestResult ok(Object data) {
        return ok("Success", 1, data);
    }

    public static RestResult ok(String message, int code, Object data) {
        return new RestResult(message, code, data);
    }

    public static RestResult error() {
        return error("Fail", -1);
    }

    public static RestResult error(String message, int code) {
        return new RestResult(message, code, null);
    }

    public static RestResult error(BaseCustomException e) {
        return error(e.getMessage(), e.getCode());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

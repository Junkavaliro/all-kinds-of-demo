package work.koreyoshi.project.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseToken<M extends BaseToken<M>> extends Model<M> implements IBean {

	public void setUserId(java.lang.String userId) {
		set("user_id", userId);
	}
	
	public java.lang.String getUserId() {
		return getStr("user_id");
	}

	public void setToken(java.lang.String token) {
		set("token", token);
	}
	
	public java.lang.String getToken() {
		return getStr("token");
	}

	public void setExpireTime(java.util.Date expireTime) {
		set("expire_time", expireTime);
	}
	
	public java.util.Date getExpireTime() {
		return get("expire_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}
	
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

}
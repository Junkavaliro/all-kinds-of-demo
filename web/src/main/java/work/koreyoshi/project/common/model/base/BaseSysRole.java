package work.koreyoshi.project.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysRole<M extends BaseSysRole<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setRole(java.lang.String role) {
		set("role", role);
	}
	
	public java.lang.String getRole() {
		return getStr("role");
	}

	public void setDescription(java.lang.String description) {
		set("description", description);
	}
	
	public java.lang.String getDescription() {
		return getStr("description");
	}

	public void setIsFrozen(java.lang.Boolean isFrozen) {
		set("is_frozen", isFrozen);
	}
	
	public java.lang.Boolean getIsFrozen() {
		return get("is_frozen");
	}

	public void setAppId(java.lang.String appId) {
		set("app_id", appId);
	}
	
	public java.lang.String getAppId() {
		return getStr("app_id");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}
	
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setIsDeleted(java.lang.Boolean isDeleted) {
		set("is_deleted", isDeleted);
	}
	
	public java.lang.Boolean getIsDeleted() {
		return get("is_deleted");
	}

	public void setSeqNum(java.lang.Integer seqNum) {
		set("seq_num", seqNum);
	}
	
	public java.lang.Integer getSeqNum() {
		return getInt("seq_num");
	}

}

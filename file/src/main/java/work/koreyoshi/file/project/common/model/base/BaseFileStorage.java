package work.koreyoshi.file.project.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseFileStorage<M extends BaseFileStorage<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setFileName(java.lang.String fileName) {
		set("file_name", fileName);
	}
	
	public java.lang.String getFileName() {
		return getStr("file_name");
	}

	public void setFileSuffix(java.lang.String fileSuffix) {
		set("file_suffix", fileSuffix);
	}
	
	public java.lang.String getFileSuffix() {
		return getStr("file_suffix");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}
	
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

}
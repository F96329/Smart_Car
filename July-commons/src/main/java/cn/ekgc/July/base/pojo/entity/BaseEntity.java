package cn.ekgc.July.base.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *<b>智慧公务车信息平台-基础实体信息</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = -4017251728360411015L;
	private Integer status;                 //系统状态
	private Long creatUser;                 //创建人
	private Date createTime;                //创建时间
	private Long updateUser;                //修改人
	private Date updateTime;                //修改时间

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getCreatUser() {
		return creatUser;
	}

	public void setCreatUser(Long creatUser) {
		this.creatUser = creatUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}

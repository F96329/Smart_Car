package cn.ekgc.July.pojo.entity;

import cn.ekgc.July.base.pojo.entity.BaseEntity;

/**
 *<b>智慧公务车信息平台-部门实习信息</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
public class Department extends BaseEntity {
	private static final long serialVersionUID = -6761089102456032406L;
	private String id;                          //主键
	private String name;                        //部门名称
	private String code;                        //部门编码

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}

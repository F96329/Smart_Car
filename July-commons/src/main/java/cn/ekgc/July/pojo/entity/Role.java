package cn.ekgc.July.pojo.entity;

import cn.ekgc.July.base.pojo.entity.BaseEntity;

import java.util.List;

/**
 *<b>智慧公务车信息平台-角色实体信息</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
public class Role extends BaseEntity {
	private static final long serialVersionUID = 656824827749919844L;
	private String id;                                //主键
	private String name;                            //角色名称
	private String code;                            //角色编码
	private List<Menu> menuList;                    //角色所对应菜单

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
		code = code;
	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}
}

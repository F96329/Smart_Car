package cn.ekgc.July.pojo.entity;

import cn.ekgc.July.base.pojo.entity.BaseEntity;

import java.util.List;

/**
 *<b>智慧公务车信息平台-菜单实体信息</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
public class Menu extends BaseEntity {
	private static final long serialVersionUID = 8744617561578235808L;
	private String id;                          //主键
	private Menu parent;                        //上级菜单
	private String text;                        //菜单文本
	private String code;                        //菜单编码
	private String url;                         //链接地址
	private String icon;                        //菜单图标
	private List<Menu> children;                //下级菜单列表
	private List<Role> roleList;                //拥有菜单角色列表

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Menu getParent() {
		return parent;
	}

	public void setParent(Menu parent) {
		this.parent = parent;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<Menu> getChildren() {
		return children;
	}

	public void setChildren(List<Menu> children) {
		this.children = children;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
}

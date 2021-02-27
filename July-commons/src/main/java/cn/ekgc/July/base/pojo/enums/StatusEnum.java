package cn.ekgc.July.base.pojo.enums;

/**
 *<b>智慧公务车信息平台-系统状态枚举信息</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
public enum StatusEnum {

	STATUS_DISABLE(EnumConstant.STATUS_DISABLE,"禁用"),
	STATUS_ENABLE(EnumConstant.STATUS_ENABLE,"启用");
	private Integer code;                   //编码
	private String remark;                  //说明

	private StatusEnum(Integer code,String remark){
		this.code=code;
		this.remark=remark;

	}
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

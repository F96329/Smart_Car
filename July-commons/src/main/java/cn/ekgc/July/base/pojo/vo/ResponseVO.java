package cn.ekgc.July.base.pojo.vo;

import cn.ekgc.July.base.pojo.enums.ResponseEnum;

import java.io.Serializable;

/**
 *<b>智慧公务车信息平台-系统响应视图信息</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
public class ResponseVO<E> implements Serializable {

	private static final long serialVersionUID = 1446912847014467891L;
	private Integer code;                       //系统响应编码
	private E data;                             //系统响应数据

	private ResponseVO (Integer code){
		this.code=code;
	}
	private ResponseVO(Integer code,E data){
		this.code=code;
		this.data=data;
	}
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
	public static ResponseVO successResponseVO(){
		/**
		 * <b>获得系统响应码处理成功视图</b>
		 */
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS.getCode());

	}

	public static ResponseVO successResponseVO(Object data){
		/**
		 * <b>获得系统响应码处理成功视图</b>
		 */
		return new ResponseVO(ResponseEnum.RESPONSE_SUCCESS.getCode(),data);

	}
	public static ResponseVO errorResponseVO(Object data){
		/**
		 * <b>获得系统响应码处理失败视图</b>
		 */
		return new ResponseVO(ResponseEnum.RESPONSE_ERROR.getCode(),data);

	}
	public static ResponseVO exceptionResponseVO(Object data){
		/**
		 * <b>获得系统响应码处理失败视图</b>
		 */
		return new ResponseVO(ResponseEnum.RESPONSE_EXCEPTION.getCode(),data);

	}
}

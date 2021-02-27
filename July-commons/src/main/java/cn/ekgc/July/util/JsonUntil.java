package cn.ekgc.July.util;

import com.fasterxml.jackson.databind.json.JsonMapper;

/**
 *<b>智慧公务车信息平台-JSON数据转换工具类</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
public class JsonUntil {
	/**
	 * <b>将对象转换为JSON格式数据</b>
	 * @param obj
	 * @return
	 */
	public static String parseToJSON(Object obj){
		//创建JSONMapper对象
		JsonMapper jsonMapper = new JsonMapper();
		//进行数据转化
		try {
			return jsonMapper.writeValueAsString(obj);
		}catch (Exception e){
			e.printStackTrace();
		}
		return "{}";
	}
	public static Object parseToObject(String json , Class argClass){
		JsonMapper jsonMapper = new JsonMapper();
		try {
			return jsonMapper.readValue(json,argClass);
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}

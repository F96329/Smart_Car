package cn.ekgc.July.util;

import java.util.Properties;

/**
 *<b>智慧公务车信息平台-常量工具类</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
public class ConstanUtil {
	private static Properties props = new Properties();

	static {
		try {
			props.load(ConstanUtil.class.getClassLoader().getResourceAsStream("props/system.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * <b>系统分页信息：默认当前页码</b>
	 */
	public static final Integer PAGE_NUM=Integer.parseInt(props.getProperty("page.num"));
	/**
	 * <b>系统分页信息：默认每页显示数量</b>
	 */
	public static final Integer PAGE_SIZE=Integer.parseInt(props.getProperty("page.size"));

}

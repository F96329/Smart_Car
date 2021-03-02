package cn.ekgc.July.util;

import cn.ekgc.July.base.pojo.vo.PageVO;
import cn.ekgc.July.pojo.entity.Department;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * <b>智慧公务车信息平台-分页工具类</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
public class PageUtil<E> {
	public void parseFromPageInfotoPageVO(List<E> list, PageVO<E> pageVO){
//创建PageInfo对象
		PageInfo<E> pageInfo = new PageInfo<E>(list);
		//提取数据
		pageVO.setList(pageInfo.getList());
		pageVO.setTotalCount(pageInfo.getTotal());
		pageVO.setTotalPage(pageInfo.getPages());

	}
}

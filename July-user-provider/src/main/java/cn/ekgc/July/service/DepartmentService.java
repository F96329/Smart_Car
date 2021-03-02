package cn.ekgc.July.service;

import cn.ekgc.July.base.pojo.vo.PageVO;
import cn.ekgc.July.pojo.entity.Department;

import java.util.List;

/**
 *<b>智慧公务车信息平台-部门功能业务层接口</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
public interface DepartmentService {
	/**
	 * <b>根据查询对象进行分页查询</b>
	 * @param query
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	PageVO<Department> getPageVOByQuery(Department query, PageVO<Department> pageVO)throws Exception;

	/**
	 * <b>根据查询对象获得查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Department> getListByQuery(Department query) throws Exception;

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Department getById(String id )throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean save(Department entity)throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean update(Department entity)throws Exception;





}

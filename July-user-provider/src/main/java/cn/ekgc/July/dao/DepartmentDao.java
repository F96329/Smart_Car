package cn.ekgc.July.dao;

import cn.ekgc.July.pojo.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *<b>智慧公务车信息平台-部门功能数据持久层接口</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface DepartmentDao {
	/**
	 * <b>按照查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Department> findListByQuery(Department query)throws Exception;

	/**
	 * <b>保存对象信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(Department entity) throws Exception;

	/**
	 * <b>修改对象信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(Department entity)throws Exception;

}

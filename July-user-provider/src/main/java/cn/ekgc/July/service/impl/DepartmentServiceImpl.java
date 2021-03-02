package cn.ekgc.July.service.impl;

import cn.ekgc.July.base.pojo.vo.PageVO;
import cn.ekgc.July.dao.DepartmentDao;
import cn.ekgc.July.pojo.entity.Department;
import cn.ekgc.July.service.DepartmentService;
import cn.ekgc.July.util.IdGenerator;
import cn.ekgc.July.util.PageUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *<b>智慧公务车信息平台-部门功能业务层接口实现类</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("departmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentDao dao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * <b>根据查询对象进行分页查询</b>
	 * @param query
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageVO<Department> getPageVOByQuery(Department query, PageVO<Department> pageVO) throws Exception {
		//打开pagehelper 过滤器
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		//进行列表查询
		List<Department> list = dao.findListByQuery(query);
		//创建分页对象
		new PageUtil<Department>().parseFromPageInfotoPageVO(list,pageVO);
		return pageVO;
	}

	/**
	 * <b>根据查询对象获得查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Department> getListByQuery(Department query) throws Exception {

		return dao.findListByQuery(query);
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public Department getById(String id) throws Exception {
		//创建查询对象
		Department query = new Department();
		query.setId(id);
		//分页查询
		List<Department> list = dao.findListByQuery(query);
		if(list != null && list.isEmpty()){
			return list.get(0);
		}
		return null;
	}


	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(Department entity) throws Exception {
		//设定数据主键
		entity.setId(idGenerator.createId());

		if(dao.save(entity) > 0){
			return true;
		}
		return false;
	}


	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */

	@Override
	public boolean update(Department entity) throws Exception {
		if(dao.update(entity) > 0){
			return true;
		}
		return false;
	}
}

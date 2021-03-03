package cn.ekgc.July.service.impl;

import cn.ekgc.July.base.pojo.vo.PageVO;
import cn.ekgc.July.dao.RoleDao;
import cn.ekgc.July.pojo.entity.Role;
import cn.ekgc.July.service.RoleService;
import cn.ekgc.July.util.IdGenerator;
import cn.ekgc.July.util.PageUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *<b>智慧公务车信息平台-角色功能业务层接口实现类</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao dao;
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
	public PageVO<Role> getPageVOByQuery(Role query, PageVO<Role> pageVO) throws Exception {
		//打开pagehelper 过滤器
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		//进行列表查询
		List<Role> list = dao.findListByQuery(query);
		//创建分页对象
		new PageUtil<Role>().parseFromPageInfotoPageVO(list,pageVO);
		return pageVO;
	}

	/**
	 * <b>根据查询对象获得查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Role> getListByQuery(Role query) throws Exception {

		return dao.findListByQuery(query);
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public Role getById(String id) throws Exception {
		//创建查询对象
		Role query = new Role();
		query.setId(id);
		//分页查询
		List<Role> list = dao.findListByQuery(query);
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
	public boolean save(Role entity) throws Exception {
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
	public boolean update(Role entity) throws Exception {
		if(dao.update(entity) > 0){
			return true;
		}
		return false;
	}
}

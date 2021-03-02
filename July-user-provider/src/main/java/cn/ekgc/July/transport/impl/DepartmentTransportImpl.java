package cn.ekgc.July.transport.impl;

import cn.ekgc.July.base.pojo.vo.PageVO;
import cn.ekgc.July.base.pojo.vo.QueryVO;
import cn.ekgc.July.pojo.entity.Department;
import cn.ekgc.July.service.DepartmentService;
import cn.ekgc.July.transport.DepartmentTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Service;
import java.util.List;
/**
 *<b>智慧公务车信息平台-部门功能传输层接口实现类</b>
 * @author July
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("departmentTransport")
@RequestMapping("/user/transport")
public class DepartmentTransportImpl implements DepartmentTransport {
	@Autowired
	private DepartmentService service;
		/**
		 * <b>根据查询对象分页查询</b>
		 * @param queryVO
		 * @return
		 * @throws Exception
		 */
	@PostMapping("/page")
	@Override
	public PageVO<Department> getPageVOByQuery(@RequestBody QueryVO<Department> queryVO) throws Exception{
		//从查询视图中获得分页视图和查询对象
		Department query = queryVO.getQuery();
		PageVO<Department> pageVO = queryVO.getPageVO();
		return service.getPageVOByQuery(query,pageVO);
	}


		/**
		 * <b>根据查询对象获得查询列表</b>
		 * @param query
		 * @return
		 * @throws Exception
		 */
		@PostMapping("/list")
		@Override
		public List<Department> getListByQuery(@RequestBody Department query) throws Exception{
			return service.getListByQuery(query);

		}

		/**
		 * <b>根据主键查询对象</b>
		 * @param id
		 * @return
		 * @throws Exception
		 */
		@PostMapping("/id")
		@Override
		public Department getById(@RequestParam String id )throws Exception{
			return service.getById(id);

		}

		/**
		 * <b>保存对象</b>
		 * @param entity
		 * @return
		 * @throws Exception
		 */
		@PostMapping("/save")
		@Override
		public boolean save(Department entity)throws Exception{
			return service.save(entity);

		}

		/**
		 * <b>修改对象</b>
		 * @param entity
		 * @return
		 * @throws Exception
		 */
		@PostMapping("/update")
		@Override
		public boolean update( @RequestBody Department entity)throws Exception{
			return service.update(entity);

		}
}

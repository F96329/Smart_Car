package cn.ekgc.July.base.pojo.vo;

import java.io.Serializable;

public class QueryVO<E> implements Serializable {
	private static final long serialVersionUID = -6706350550910931358L;
	private E query;                         //查询对象
	private PageVO<E> pageVO;                //分页对象

	public QueryVO(E query, PageVO<E> pageVO) {
		this.query = query;
		this.pageVO = pageVO;
	}

	public E getQuery() {
		return query;
	}

	public void setQuery(E query) {
		this.query = query;
	}

	public PageVO<E> getPageVO() {
		return pageVO;
	}

	public void setPageVO(PageVO<E> pageVO) {
		this.pageVO = pageVO;
	}
}

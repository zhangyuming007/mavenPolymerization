package org.openSource.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author 张玉明
 *
 * @see 自定义分类pojo
 */
public class PageTools {
	/**
	 * 数据总行数
	 */
	private Integer rowsNumber = 0;

	/**
	 * 每页显示行数
	 */
	private Integer rowsPrePage = 6;

	/**
	 * 总页数
	 */
	private Integer maxPage = 1;

	/**
	 * 真-当前在页
	 */
	private Integer goPage = 1;

	//private List<T> arr;

	/**
	 * @param goPage		当前所在页
	 * @param maxPage 		总页数 
	 * @param rowsNumber	数据总行数
	 * @param rowsPrePage	每页显示行数
	 */
	public PageTools(Integer rowsNumber, Integer rowsPrePage, Integer maxPage, Integer goPage) {
		this.rowsNumber = rowsNumber;
		this.rowsPrePage = rowsPrePage;
		this.maxPage = maxPage;
		this.goPage = goPage;
	}
	
	public PageTools() {
	}

	public Integer getRowsNumber() {
		return rowsNumber;
	}

	public void setRowsNumber(Integer rowsNumber) {
		this.rowsNumber = rowsNumber;
		this.maxPage = rowsNumber / this.rowsPrePage + (rowsNumber % this.rowsPrePage == 0 ? 0 : 1);
	}

	public Integer getRowsPrePage() {
		return rowsPrePage;
	}

	public void setRowsPrePage(Integer rowsPrePage) {
		this.rowsPrePage = rowsPrePage;
	}

	public Integer getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(Integer maxPage) {
		this.maxPage = maxPage;
	}

	public Integer getGoPage() {
		return goPage;
	}

	public void setGoPage(Integer goPage) {
		this.goPage = goPage;
	}

	@Override
	public String toString() {
		return "PageTools{" +
				"rowsNumber=" + rowsNumber +
				", rowsPrePage=" + rowsPrePage +
				", maxPage=" + maxPage +
				", goPage=" + goPage +
				'}';
	}

}

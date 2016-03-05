package com.zhku.my21days.base;

import java.io.Serializable;
import java.util.*;

public class Pager<E> extends ArrayList<E> implements Iterable<E>, Serializable  {
    private static final long serialVersionUID = 20100628L;
    private int totalRows;			//总的记录数
    private List<E> data;			
	private int pageNumber;			//指定查询的页数
	private int maxRowsPerPage;		//每页最大记录数
	private int totalPages;			//总页数
 
    public Pager() {
    	
    }

    /**
     * 构造函数
     * @param totalRows 总数
     * @param data 数据
     */
    public Pager(int totalRows, List<E> data) {
        this.totalRows = totalRows;
        this.data  = data;
    }

	public Pager(int pageNumber, int maxRowsPerPage, List<E> pageElement, int totalRows) {
		super(pageElement);
		this.pageNumber = pageNumber;
		this.maxRowsPerPage = maxRowsPerPage;
		this.data = pageElement;
		this.totalRows = totalRows;
		if (totalRows % maxRowsPerPage == 0) {
			this.totalPages = totalRows / maxRowsPerPage;
		} else {
			this.totalPages = totalRows / maxRowsPerPage + 1;
		}
	}
	
    /**
     * 数据库记录的总数
     * @return int
     */
    public int getTotalRows() {
        return totalRows;
    }

    /**
     * <p>查询数据库返回的数据。</p>
     * @return 数据库记录
     */
    public List<E> getData() {
        return data;
    }

    public Iterator<E> iterator() {
        return data.iterator();
    }
    

	public int getMaxRowsPerPage() {
		return maxRowsPerPage;
	}

	public int getTotalPages() {
		return totalPages;
	}
 
	public int getPageNumber() {
		return pageNumber;
	}

 
	public boolean hasNextPage() {
		return pageNumber < totalPages;
	}
	
 
	public boolean hasPreviousPage() {
		return pageNumber > 1 && pageNumber <= totalRows;
	}
	
	public boolean isNotEmpty() {
		if (totalRows > 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFirstPage() {
		return pageNumber == 1;
	}
	
	public boolean isLastPage() {
		return pageNumber == totalPages;
	}
	
    
}

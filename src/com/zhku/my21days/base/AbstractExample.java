package com.zhku.my21days.base;

public abstract class AbstractExample
{

    public AbstractExample()
    {
    }

    public void setPageNumber(Integer pageNumber)
    {
        if(pageNumber.intValue() <= 0)
            this.pageNumber = Integer.valueOf(1);
        this.pageNumber = pageNumber;
    }

    public Integer getPageNumber()
    {
        return pageNumber;
    }

    public void setMaxRowsPerPage(Integer maxRowsPerPage)
    {
        if(maxRowsPerPage.intValue() <= 0)
            this.maxRowsPerPage = DEFAULT_MAX_ROWS_PERPAGE;
        this.maxRowsPerPage = maxRowsPerPage;
    }

    public Integer getMaxRowsPerPage()
    {
        return maxRowsPerPage;
    }

    public final void setFromNumber(Integer fromNumber)
    {
        if(fromNumber == null || fromNumber.intValue() < 0)
        {
            throw new IllegalStateException("\u67E5\u8BE2\u8303\u56F4\u7684\u5F00\u59CB\u4F4D\u7F6E\u4E0D\u80FD\u4E3A\u8D1F\u6570");
        } else
        {
            this.fromNumber = fromNumber;
            return;
        }
    }

    public final Integer getFromNumber()
    {
        return fromNumber;
    }

    public final void setToNumber(Integer toNumber)
    {
        if(toNumber == null || toNumber.intValue() < 1)
        {
            throw new IllegalStateException("\u6570\u636E\u5E93\u67E5\u8BE2\u8303\u56F4\u7684\u7ED3\u675F\u4F4D\u7F6E\u4E0D\u80FD\u5C0F\u4E8E\u96F6");
        } else
        {
            this.toNumber = toNumber;
            return;
        }
    }

    public final Integer getToNumber()
    {
        return toNumber;
    }

    public abstract void clear();

    public abstract String getOrderByClause();

    public abstract void setOrderByClause(String s);

    public static final Integer DEFAULT_PAGE_NUMBER = Integer.valueOf(0);
    public static final Integer DEFAULT_MAX_ROWS_PERPAGE = Integer.valueOf(15);
    private Integer pageNumber;
    private Integer maxRowsPerPage;
    private Integer fromNumber;
    private Integer toNumber;

}

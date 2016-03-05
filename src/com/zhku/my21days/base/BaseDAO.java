package com.zhku.my21days.base;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.engine.cache.CacheModel;
import com.zhku.my21days.util.ClassUtil;

public abstract class BaseDAO<ENTITY, EXAMPLE extends AbstractExample> extends SqlMapClientDaoSupport {
    private String TABLE_NAME ;
    
    /**
     * 构造函数
     */
    @SuppressWarnings("unchecked")
    public BaseDAO() {
        super();
        ParameterizedType pt = (ParameterizedType) getClass().getGenericSuperclass();
        Class<ENTITY>  entityClass = (Class<ENTITY>) pt.getActualTypeArguments()[0];
        this.TABLE_NAME = ClassUtil.getTableName(entityClass);
    }

    /**
     * <p>查询满足条件的记录总数</p>
     * @param example 动态条件
     * @return 数据库记录的总数
     */
    public int countByExample(EXAMPLE example) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject(this.TABLE_NAME + ".countByExample", example);
        return count;
    }

    /**
     * <p>根据动态条件删除数据库记录。</p>
     * @param example 动态条件
     * @return 数据库删除记录的数量
     */
    public int deleteByExample(EXAMPLE example) {
        int rows = getSqlMapClientTemplate().delete(this.TABLE_NAME + ".deleteByExample", example);
        return rows;
    }

    /**
     * <p>根据主键删除数据库记录。</p>
     * @param entity 主键
     * @return 数据库存在该主键的记录时返回1，否则返回0。
     */
    public int deleteByPrimaryKey(ENTITY entity) {
        int rows = getSqlMapClientTemplate().delete(this.TABLE_NAME + ".deleteByPrimaryKey", entity);
        return rows;
    }

    /**
     * <p>往数据库里插入一条记录。</p>
     * @param entity 实体
     */
    public String insert(ENTITY entity) {
    	 Object newKey = getSqlMapClientTemplate().insert(this.TABLE_NAME + ".insert", entity);
        return String.valueOf(newKey);
    }

    /**
     * <p>往数据库插入一条记录。</p>
     * @param entity 实体
     */
    public String insertSelective(ENTITY entity) {
    	 Object newKey = getSqlMapClientTemplate().insert(this.TABLE_NAME + ".insertSelective", entity);
    	 return  String.valueOf(newKey);
    }

    /**
     * <p>根据动态条件查询数据库。</p>
     * @param example 动态条件
     * @return 查询结果
     */
    @SuppressWarnings("unchecked")
    public List<ENTITY> selectByExample(EXAMPLE example) {
        List<?> list = getSqlMapClientTemplate().queryForList(this.TABLE_NAME + ".selectByExample", example);
    	if(null == list || CacheModel.NULL_OBJECT.toString().equals(list.toString())){
    		return null;
    	}
        return (List<ENTITY>) list;
    }

    /**
     * <p>根据动态条件，分页查询数据库记录。</p>
     * @param example 动态条件
     * @return 分页数据
     */
    @SuppressWarnings("unchecked")
    public Pager<ENTITY> pagingByExample(EXAMPLE example) {
        int totalRows = countByExample(example);
        if (totalRows == 0) {
            return new Pager<ENTITY>(totalRows, new ArrayList<ENTITY>());
        }
        if (example.getFromNumber() == null) {
        	if (example.getPageNumber() == null) {
        		example.setFromNumber(AbstractExample.DEFAULT_PAGE_NUMBER);
			}else{
				if (example.getMaxRowsPerPage()== null) {
					example.setFromNumber((example.getPageNumber()-1)*AbstractExample.DEFAULT_MAX_ROWS_PERPAGE );
				}else{
					if(totalRows <= example.getMaxRowsPerPage())	example.setPageNumber(1);
					example.setFromNumber((example.getPageNumber()-1)*example.getMaxRowsPerPage());
				}				
			}
        }
        
        int startRow = example.getFromNumber();
        if (example.getToNumber() == null) {
        	if (example.getMaxRowsPerPage() == null) {
        		 example.setToNumber(startRow + AbstractExample.DEFAULT_MAX_ROWS_PERPAGE);	
			}else{
				 example.setToNumber(startRow + example.getMaxRowsPerPage());
			}
        }
        
        int maxResults = example.getFromNumber() - example.getToNumber();
        if (maxResults >= 0) {
            throw new IllegalStateException("数据库查询范围的结束数必须大于开始数");
        }
        List<ENTITY> result = getSqlMapClientTemplate().queryForList(this.TABLE_NAME+ ".selectByExample",example);
        return new Pager<ENTITY>(totalRows, result);
    }

    /**
     * <p>根据主键查询数据库记录。</p>
     * @param entity 主键
     * @return 实体对象
     */
    @SuppressWarnings("unchecked")
    public ENTITY selectByPrimaryKey(ENTITY entity) {
        Object record = getSqlMapClientTemplate().queryForObject(this.TABLE_NAME + ".selectByPrimaryKey", entity);
    	if(null == record || CacheModel.NULL_OBJECT.toString().equals(record.toString())){
    		return null;
    	}
        return (ENTITY) record;
    }

    /**
     * <p>根据主键更新数据库记录。</p>
     * @param entity 实体对象 
     * @return 数据库更新行数
     */
    public int updateByPrimaryKeySelective(ENTITY entity) {
        int rows = getSqlMapClientTemplate().update(this.TABLE_NAME + ".updateByPrimaryKeySelective",entity);
        return rows;
    }

    /**
     * <p>根据主键更新数据库记录。</p>
     * @param entity 实体
     * @return 数据库有更新内容返回1，否则返回0。
     */
    public int updateByPrimaryKey(ENTITY entity) {
        int rows = getSqlMapClientTemplate().update(this.TABLE_NAME + ".updateByPrimaryKey", entity);
        return rows;
    }

    /**
     * <p>根据动态条件更新数据库记录，如果实体的属性为null时忽略更新。</p>
     * @param entity 实体内容
     * @param example 动态条件
     * @return 数据库记录更新的数量
     */
    public abstract int updateByExampleSelective(ENTITY entity, EXAMPLE example);

    /**
     * <p>根据动态条件更新数据库记录。</p>
     * @param entity 实体内容
     * @param example 动态条件
     * @return 数据库记录更新的数量
     */
    public abstract int updateByExample(ENTITY entity, EXAMPLE example);
    
	/**
	 * 获取SYS_GUID()序列值
	 * @return String 
	 */
    public String getGUID(){
    	return (String)getSqlMapClientTemplate().queryForObject("NETARK_FRAMEWORK.getGUID");
    }
    
	/**
	 * 获取数据库sysdate时间值
	 * @return String 
	 */
    public Date getSysDate(){
    	return (Date)getSqlMapClientTemplate().queryForObject("NETARK_FRAMEWORK.getSysDate");
    }
    public String getSysDateString(){
    	return (String)getSqlMapClientTemplate().queryForObject("NETARK_FRAMEWORK.getSysDateString");
    }
    
    /**
     * 获取指定序列名称的值
     * @param sequenceName String 
     * @return Integer
     */
    public Long getNextValBySeqName(String sequenceName){
    	if(StringUtils.isBlank(sequenceName)){
    		throw new IllegalArgumentException("sequenceName is null");
    	}
    	return  (Long)getSqlMapClientTemplate().queryForObject("NETARK_FRAMEWORK.getNextValBySeqName",sequenceName);
    }
    
    

    
    
	protected boolean isBlank(String srcStr){
		return StringUtils.isBlank(srcStr);
	}
	
	protected boolean isNotBlank(String srcStr){
		return StringUtils.isNotBlank(srcStr);
	}
	
	protected boolean isNumber(String srcStr){
		return NumberUtils.isNumber(srcStr);
	}
	
	protected boolean equals(String srcStr,String destStr){
		return StringUtils.equals(srcStr, destStr);
	}
	
	protected boolean equalsIgnoreCase(String srcStr,String destStr){
		return StringUtils.equalsIgnoreCase(srcStr, destStr);
	}
	
	protected String trimToEmpty(String srcStr){
		return StringUtils.trimToEmpty(srcStr);
	}
	
	protected String[] split(String srcStr,String separator){
		return StringUtils.split(srcStr,separator);
	}
	
	protected String  defaultIfEmpty(String srcStr,String defaultStr) {
		return StringUtils.defaultIfEmpty(srcStr, defaultStr);
	}
    
}
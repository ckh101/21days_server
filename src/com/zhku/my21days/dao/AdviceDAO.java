package com.zhku.my21days.dao;

import com.zhku.my21days.base.BaseDAO;
import com.zhku.my21days.vo.Advice;
import com.zhku.my21days.vo.AdviceExample;

/**

 * <p>表名称：advices</p> 
 * <p>域对象：Advice.java</p> 
 * <p>SQL映射文件：com.zhku.my21days.vo.advices_SqlMap.xml</p>
 * @see com.zhku.my21days.vo.Advice
 * @see com.zhku.my21days.vo.AdviceExample
 * @author 陈凯浩
 * @Create On：2014-04-24 23:10:35
 */
public class AdviceDAO extends BaseDAO<Advice, AdviceExample> {

    public AdviceDAO() {
        super();
    }

    public int updateByExampleSelective(Advice record, AdviceExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("advices.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(Advice record, AdviceExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("advices.updateByExample", parms);
        return rows;
    }

    /**
     * 对应关联的表名为:  advices
     */
    private static class UpdateByExampleParms extends AdviceExample {
        private Object record;

        public UpdateByExampleParms(Object record, AdviceExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}
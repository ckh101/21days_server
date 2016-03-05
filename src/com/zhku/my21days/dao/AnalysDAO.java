package com.zhku.my21days.dao;

import com.zhku.my21days.base.BaseDAO;
import com.zhku.my21days.vo.Analys;
import com.zhku.my21days.vo.AnalysExample;

/**
 
 * <p>表名称：test_analys</p> 
 * <p>域对象：Analys.java</p> 
 * <p>SQL映射文件：org.androidpn.server.model.test_analys_SqlMap.xml</p>
 * @see org.androidpn.server.model.Analys
 * @see org.androidpn.server.model.AnalysExample
 * @author 陈凯浩
 * @Create On：2014-03-22 16:35:35
 */
public class AnalysDAO extends BaseDAO<Analys, AnalysExample> {

    public AnalysDAO() {
        super();
    }

    public int updateByExampleSelective(Analys record, AnalysExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("test_analys.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(Analys record, AnalysExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("test_analys.updateByExample", parms);
        return rows;
    }

    /**
     * 对应关联的表名为:  test_analys
     */
    private static class UpdateByExampleParms extends AnalysExample {
        private Object record;

        public UpdateByExampleParms(Object record, AnalysExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}
package com.zhku.my21days.dao;

import com.zhku.my21days.base.BaseDAO;
import com.zhku.my21days.vo.Task;
import com.zhku.my21days.vo.TaskExample;

/**

 * <p>表名称：tasklist</p> 
 * <p>域对象：Task.java</p> 
 * <p>SQL映射文件：com.zhku.my21days.vo.tasklist_SqlMap.xml</p>
 * @see com.zhku.my21days.vo.Task
 * @see com.zhku.my21days.vo.TaskExample
 * @author 陈凯浩
 * @Create On：2014-04-26 23:05:33
 */
public class TaskDAO extends BaseDAO<Task, TaskExample> {

    public TaskDAO() {
        super();
    }

    public int updateByExampleSelective(Task record, TaskExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tasklist.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(Task record, TaskExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tasklist.updateByExample", parms);
        return rows;
    }

    /**
     * 对应关联的表名为:  tasklist
     */
    private static class UpdateByExampleParms extends TaskExample {
        private Object record;

        public UpdateByExampleParms(Object record, TaskExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}
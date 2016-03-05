package com.zhku.my21days.dao;

import com.zhku.my21days.base.BaseDAO;
import com.zhku.my21days.vo.Question;
import com.zhku.my21days.vo.QuestionExample;

/**

 * <p>表名称：test_question</p> 
 * <p>域对象：Question.java</p> 
 * <p>SQL映射文件：org.androidpn.server.model.test_question_SqlMap.xml</p>
 * @see org.androidpn.server.model.Question
 * @see org.androidpn.server.model.QuestionExample
 * @author 陈凯浩
 * @Create On：2014-03-22 16:35:35
 */
public class QuestionDAO extends BaseDAO<Question, QuestionExample> {

    public QuestionDAO() {
        super();
    }

    public int updateByExampleSelective(Question record, QuestionExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("test_question.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(Question record, QuestionExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("test_question.updateByExample", parms);
        return rows;
    }

    /**
     * 对应关联的表名为:  test_question
     */
    private static class UpdateByExampleParms extends QuestionExample {
        private Object record;

        public UpdateByExampleParms(Object record, QuestionExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}
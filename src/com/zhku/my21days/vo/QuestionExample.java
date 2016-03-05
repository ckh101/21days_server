package com.zhku.my21days.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zhku.my21days.base.AbstractExample;

/**
 * <p>系统名称： <b>NETARK-通用网管平台V1.0</b></p>
 * <p>公司：  中通服软件科技有限公司</p>
 * <p>表名称：test_question</p> 
 * <p>域对象：Question.java</p> 
 * <p>SQL映射文件：org.androidpn.server.model.test_question_SqlMap.xml</p>
 * @see org.androidpn.server.model.Question
 * @see org.androidpn.server.dao.QuestionDAO
 * @author 戈亮锋
 * @Create On：2014-03-22 16:35:35
 */
public class QuestionExample extends AbstractExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected QuestionExample(QuestionExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
    }

    public String getTableName() {
        return  "test_question";
    }

    /**
     * 对应关联的表名为:  test_question
     */
    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andQIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andQIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andQIdEqualTo(Integer value) {
            addCriterion("id =", value, "qId");
            return this;
        }

        public Criteria andQIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "qId");
            return this;
        }

        public Criteria andQIdGreaterThan(Integer value) {
            addCriterion("id >", value, "qId");
            return this;
        }

        public Criteria andQIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "qId");
            return this;
        }

        public Criteria andQIdLessThan(Integer value) {
            addCriterion("id <", value, "qId");
            return this;
        }

        public Criteria andQIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "qId");
            return this;
        }

        public Criteria andQIdIn(List<Integer> values) {
            addCriterion("id in", values, "qId");
            return this;
        }

        public Criteria andQIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "qId");
            return this;
        }

        public Criteria andQIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "qId");
            return this;
        }

        public Criteria andQIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "qId");
            return this;
        }

        public Criteria andQnumIsNull() {
            addCriterion("qnum is null");
            return this;
        }

        public Criteria andQnumIsNotNull() {
            addCriterion("qnum is not null");
            return this;
        }

        public Criteria andQnumEqualTo(Integer value) {
            addCriterion("qnum =", value, "qnum");
            return this;
        }

        public Criteria andQnumNotEqualTo(Integer value) {
            addCriterion("qnum <>", value, "qnum");
            return this;
        }

        public Criteria andQnumGreaterThan(Integer value) {
            addCriterion("qnum >", value, "qnum");
            return this;
        }

        public Criteria andQnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("qnum >=", value, "qnum");
            return this;
        }

        public Criteria andQnumLessThan(Integer value) {
            addCriterion("qnum <", value, "qnum");
            return this;
        }

        public Criteria andQnumLessThanOrEqualTo(Integer value) {
            addCriterion("qnum <=", value, "qnum");
            return this;
        }

        public Criteria andQnumIn(List<Integer> values) {
            addCriterion("qnum in", values, "qnum");
            return this;
        }

        public Criteria andQnumNotIn(List<Integer> values) {
            addCriterion("qnum not in", values, "qnum");
            return this;
        }

        public Criteria andQnumBetween(Integer value1, Integer value2) {
            addCriterion("qnum between", value1, value2, "qnum");
            return this;
        }

        public Criteria andQnumNotBetween(Integer value1, Integer value2) {
            addCriterion("qnum not between", value1, value2, "qnum");
            return this;
        }

        public Criteria andQuestionIsNull() {
            addCriterion("question is null");
            return this;
        }

        public Criteria andQuestionIsNotNull() {
            addCriterion("question is not null");
            return this;
        }

        public Criteria andQuestionEqualTo(String value) {
            addCriterion("question =", value, "question");
            return this;
        }

        public Criteria andQuestionNotEqualTo(String value) {
            addCriterion("question <>", value, "question");
            return this;
        }

        public Criteria andQuestionGreaterThan(String value) {
            addCriterion("question >", value, "question");
            return this;
        }

        public Criteria andQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("question >=", value, "question");
            return this;
        }

        public Criteria andQuestionLessThan(String value) {
            addCriterion("question <", value, "question");
            return this;
        }

        public Criteria andQuestionLessThanOrEqualTo(String value) {
            addCriterion("question <=", value, "question");
            return this;
        }

        public Criteria andQuestionLike(String value) {
            addCriterion("question like", value, "question");
            return this;
        }

        public Criteria andQuestionNotLike(String value) {
            addCriterion("question not like", value, "question");
            return this;
        }

        public Criteria andQuestionIn(List<String> values) {
            addCriterion("question in", values, "question");
            return this;
        }

        public Criteria andQuestionNotIn(List<String> values) {
            addCriterion("question not in", values, "question");
            return this;
        }

        public Criteria andQuestionBetween(String value1, String value2) {
            addCriterion("question between", value1, value2, "question");
            return this;
        }

        public Criteria andQuestionNotBetween(String value1, String value2) {
            addCriterion("question not between", value1, value2, "question");
            return this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return this;
        }
    }
}
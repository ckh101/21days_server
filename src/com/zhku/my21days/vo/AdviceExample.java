package com.zhku.my21days.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zhku.my21days.base.AbstractExample;

/**

 * <p>表名称：advices</p> 
 * <p>域对象：Advice.java</p> 
 * <p>SQL映射文件：com.zhku.my21days.vo.advices_SqlMap.xml</p>
 * @see com.zhku.my21days.vo.Advice
 * @see com.zhku.my21days.dao.AdviceDAO
 * @author 陈凯浩
 * @Create On：2014-04-24 23:10:35
 */
public class AdviceExample extends AbstractExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public AdviceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected AdviceExample(AdviceExample example) {
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
        return  "advices";
    }

    /**
     * 对应关联的表名为:  advices
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

        public Criteria andAdIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andAdIdEqualTo(Integer value) {
            addCriterion("id =", value, "adId");
            return this;
        }

        public Criteria andAdIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "adId");
            return this;
        }

        public Criteria andAdIdGreaterThan(Integer value) {
            addCriterion("id >", value, "adId");
            return this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "adId");
            return this;
        }

        public Criteria andAdIdLessThan(Integer value) {
            addCriterion("id <", value, "adId");
            return this;
        }

        public Criteria andAdIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "adId");
            return this;
        }

        public Criteria andAdIdIn(List<Integer> values) {
            addCriterion("id in", values, "adId");
            return this;
        }

        public Criteria andAdIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "adId");
            return this;
        }

        public Criteria andAdIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "adId");
            return this;
        }

        public Criteria andAdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "adId");
            return this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return this;
        }

        public Criteria andPart1IsNull() {
            addCriterion("part1 is null");
            return this;
        }

        public Criteria andPart1IsNotNull() {
            addCriterion("part1 is not null");
            return this;
        }

        public Criteria andPart1EqualTo(String value) {
            addCriterion("part1 =", value, "part1");
            return this;
        }

        public Criteria andPart1NotEqualTo(String value) {
            addCriterion("part1 <>", value, "part1");
            return this;
        }

        public Criteria andPart1GreaterThan(String value) {
            addCriterion("part1 >", value, "part1");
            return this;
        }

        public Criteria andPart1GreaterThanOrEqualTo(String value) {
            addCriterion("part1 >=", value, "part1");
            return this;
        }

        public Criteria andPart1LessThan(String value) {
            addCriterion("part1 <", value, "part1");
            return this;
        }

        public Criteria andPart1LessThanOrEqualTo(String value) {
            addCriterion("part1 <=", value, "part1");
            return this;
        }

        public Criteria andPart1Like(String value) {
            addCriterion("part1 like", value, "part1");
            return this;
        }

        public Criteria andPart1NotLike(String value) {
            addCriterion("part1 not like", value, "part1");
            return this;
        }

        public Criteria andPart1In(List<String> values) {
            addCriterion("part1 in", values, "part1");
            return this;
        }

        public Criteria andPart1NotIn(List<String> values) {
            addCriterion("part1 not in", values, "part1");
            return this;
        }

        public Criteria andPart1Between(String value1, String value2) {
            addCriterion("part1 between", value1, value2, "part1");
            return this;
        }

        public Criteria andPart1NotBetween(String value1, String value2) {
            addCriterion("part1 not between", value1, value2, "part1");
            return this;
        }

        public Criteria andPart2IsNull() {
            addCriterion("part2 is null");
            return this;
        }

        public Criteria andPart2IsNotNull() {
            addCriterion("part2 is not null");
            return this;
        }

        public Criteria andPart2EqualTo(String value) {
            addCriterion("part2 =", value, "part2");
            return this;
        }

        public Criteria andPart2NotEqualTo(String value) {
            addCriterion("part2 <>", value, "part2");
            return this;
        }

        public Criteria andPart2GreaterThan(String value) {
            addCriterion("part2 >", value, "part2");
            return this;
        }

        public Criteria andPart2GreaterThanOrEqualTo(String value) {
            addCriterion("part2 >=", value, "part2");
            return this;
        }

        public Criteria andPart2LessThan(String value) {
            addCriterion("part2 <", value, "part2");
            return this;
        }

        public Criteria andPart2LessThanOrEqualTo(String value) {
            addCriterion("part2 <=", value, "part2");
            return this;
        }

        public Criteria andPart2Like(String value) {
            addCriterion("part2 like", value, "part2");
            return this;
        }

        public Criteria andPart2NotLike(String value) {
            addCriterion("part2 not like", value, "part2");
            return this;
        }

        public Criteria andPart2In(List<String> values) {
            addCriterion("part2 in", values, "part2");
            return this;
        }

        public Criteria andPart2NotIn(List<String> values) {
            addCriterion("part2 not in", values, "part2");
            return this;
        }

        public Criteria andPart2Between(String value1, String value2) {
            addCriterion("part2 between", value1, value2, "part2");
            return this;
        }

        public Criteria andPart2NotBetween(String value1, String value2) {
            addCriterion("part2 not between", value1, value2, "part2");
            return this;
        }

        public Criteria andPart3IsNull() {
            addCriterion("part3 is null");
            return this;
        }

        public Criteria andPart3IsNotNull() {
            addCriterion("part3 is not null");
            return this;
        }

        public Criteria andPart3EqualTo(String value) {
            addCriterion("part3 =", value, "part3");
            return this;
        }

        public Criteria andPart3NotEqualTo(String value) {
            addCriterion("part3 <>", value, "part3");
            return this;
        }

        public Criteria andPart3GreaterThan(String value) {
            addCriterion("part3 >", value, "part3");
            return this;
        }

        public Criteria andPart3GreaterThanOrEqualTo(String value) {
            addCriterion("part3 >=", value, "part3");
            return this;
        }

        public Criteria andPart3LessThan(String value) {
            addCriterion("part3 <", value, "part3");
            return this;
        }

        public Criteria andPart3LessThanOrEqualTo(String value) {
            addCriterion("part3 <=", value, "part3");
            return this;
        }

        public Criteria andPart3Like(String value) {
            addCriterion("part3 like", value, "part3");
            return this;
        }

        public Criteria andPart3NotLike(String value) {
            addCriterion("part3 not like", value, "part3");
            return this;
        }

        public Criteria andPart3In(List<String> values) {
            addCriterion("part3 in", values, "part3");
            return this;
        }

        public Criteria andPart3NotIn(List<String> values) {
            addCriterion("part3 not in", values, "part3");
            return this;
        }

        public Criteria andPart3Between(String value1, String value2) {
            addCriterion("part3 between", value1, value2, "part3");
            return this;
        }

        public Criteria andPart3NotBetween(String value1, String value2) {
            addCriterion("part3 not between", value1, value2, "part3");
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
package org.androidpn.server.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.zhku.my21days.base.AbstractExample;

/**
 * <p>系统名称： <b>NETARK-通用网管平台V1.0</b></p>
 * <p>公司：  中通服软件科技有限公司</p>
 * <p>表名称：apn_user</p> 
 * <p>域对象：User.java</p> 
 * <p>SQL映射文件：org.androidpn.server.model.apn_user_SqlMap.xml</p>
 * @see org.androidpn.server.model.User
 * @see org.androidpn.server.dao.UserDAO
 * @author 戈亮锋
 * @Create On：2014-03-05 10:26:34
 */
public class UserExample extends AbstractExample {
    protected String orderByClause;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected UserExample(UserExample example) {
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
        return  "apn_user";
    }

    /**
     * 对应关联的表名为:  apn_user
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("id =", value, "userId");
            return this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("id >", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("id <", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "userId");
            return this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("id in", values, "userId");
            return this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "userId");
            return this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("username is null");
            return this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("username is not null");
            return this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("username =", value, "userName");
            return this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("username <>", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("username >", value, "userName");
            return this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("username <", value, "userName");
            return this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "userName");
            return this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("username like", value, "userName");
            return this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("username not like", value, "userName");
            return this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("username in", values, "userName");
            return this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("username not in", values, "userName");
            return this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "userName");
            return this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "userName");
            return this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return this;
        }

        public Criteria andEmaliIsNull() {
            addCriterion("email is null");
            return this;
        }

        public Criteria andEmaliIsNotNull() {
            addCriterion("email is not null");
            return this;
        }

        public Criteria andEmaliEqualTo(String value) {
            addCriterion("email =", value, "emali");
            return this;
        }

        public Criteria andEmaliNotEqualTo(String value) {
            addCriterion("email <>", value, "emali");
            return this;
        }

        public Criteria andEmaliGreaterThan(String value) {
            addCriterion("email >", value, "emali");
            return this;
        }

        public Criteria andEmaliGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "emali");
            return this;
        }

        public Criteria andEmaliLessThan(String value) {
            addCriterion("email <", value, "emali");
            return this;
        }

        public Criteria andEmaliLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "emali");
            return this;
        }

        public Criteria andEmaliLike(String value) {
            addCriterion("email like", value, "emali");
            return this;
        }

        public Criteria andEmaliNotLike(String value) {
            addCriterion("email not like", value, "emali");
            return this;
        }

        public Criteria andEmaliIn(List<String> values) {
            addCriterion("email in", values, "emali");
            return this;
        }

        public Criteria andEmaliNotIn(List<String> values) {
            addCriterion("email not in", values, "emali");
            return this;
        }

        public Criteria andEmaliBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "emali");
            return this;
        }

        public Criteria andEmaliNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "emali");
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

        public Criteria andOnlineIsNull() {
            addCriterion("online is null");
            return this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("online is not null");
            return this;
        }

        public Criteria andOnlineEqualTo(Boolean value) {
            addCriterion("online =", value, "online");
            return this;
        }

        public Criteria andOnlineNotEqualTo(Boolean value) {
            addCriterion("online <>", value, "online");
            return this;
        }

        public Criteria andOnlineGreaterThan(Boolean value) {
            addCriterion("online >", value, "online");
            return this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("online >=", value, "online");
            return this;
        }

        public Criteria andOnlineLessThan(Boolean value) {
            addCriterion("online <", value, "online");
            return this;
        }

        public Criteria andOnlineLessThanOrEqualTo(Boolean value) {
            addCriterion("online <=", value, "online");
            return this;
        }

        public Criteria andOnlineIn(List<Boolean> values) {
            addCriterion("online in", values, "online");
            return this;
        }

        public Criteria andOnlineNotIn(List<Boolean> values) {
            addCriterion("online not in", values, "online");
            return this;
        }

        public Criteria andOnlineBetween(Boolean value1, Boolean value2) {
            addCriterion("online between", value1, value2, "online");
            return this;
        }

        public Criteria andOnlineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("online not between", value1, value2, "online");
            return this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("created_date is null");
            return this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("created_date is not null");
            return this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterionForJDBCDate("created_date =", value, "createdDate");
            return this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("created_date <>", value, "createdDate");
            return this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("created_date >", value, "createdDate");
            return this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created_date >=", value, "createdDate");
            return this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterionForJDBCDate("created_date <", value, "createdDate");
            return this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created_date <=", value, "createdDate");
            return this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterionForJDBCDate("created_date in", values, "createdDate");
            return this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("created_date not in", values, "createdDate");
            return this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created_date between", value1, value2, "createdDate");
            return this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created_date not between", value1, value2, "createdDate");
            return this;
        }

        public Criteria andUpdatedDateIsNull() {
            addCriterion("updated_date is null");
            return this;
        }

        public Criteria andUpdatedDateIsNotNull() {
            addCriterion("updated_date is not null");
            return this;
        }

        public Criteria andUpdatedDateEqualTo(Date value) {
            addCriterionForJDBCDate("updated_date =", value, "updatedDate");
            return this;
        }

        public Criteria andUpdatedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("updated_date <>", value, "updatedDate");
            return this;
        }

        public Criteria andUpdatedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("updated_date >", value, "updatedDate");
            return this;
        }

        public Criteria andUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updated_date >=", value, "updatedDate");
            return this;
        }

        public Criteria andUpdatedDateLessThan(Date value) {
            addCriterionForJDBCDate("updated_date <", value, "updatedDate");
            return this;
        }

        public Criteria andUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updated_date <=", value, "updatedDate");
            return this;
        }

        public Criteria andUpdatedDateIn(List<Date> values) {
            addCriterionForJDBCDate("updated_date in", values, "updatedDate");
            return this;
        }

        public Criteria andUpdatedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("updated_date not in", values, "updatedDate");
            return this;
        }

        public Criteria andUpdatedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updated_date between", value1, value2, "updatedDate");
            return this;
        }

        public Criteria andUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updated_date not between", value1, value2, "updatedDate");
            return this;
        }
    }
}
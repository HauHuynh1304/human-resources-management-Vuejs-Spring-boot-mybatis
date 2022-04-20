package com.company.hrsystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Do not use this class
public class SystemAccountExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    public SystemAccountExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSystemAccountIdIsNull() {
            addCriterion("system_account_id is null");
            return (Criteria) this;
        }

        public Criteria andSystemAccountIdIsNotNull() {
            addCriterion("system_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andSystemAccountIdEqualTo(Integer value) {
            addCriterion("system_account_id =", value, "systemAccountId");
            return (Criteria) this;
        }

        public Criteria andSystemAccountIdNotEqualTo(Integer value) {
            addCriterion("system_account_id <>", value, "systemAccountId");
            return (Criteria) this;
        }

        public Criteria andSystemAccountIdGreaterThan(Integer value) {
            addCriterion("system_account_id >", value, "systemAccountId");
            return (Criteria) this;
        }

        public Criteria andSystemAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("system_account_id >=", value, "systemAccountId");
            return (Criteria) this;
        }

        public Criteria andSystemAccountIdLessThan(Integer value) {
            addCriterion("system_account_id <", value, "systemAccountId");
            return (Criteria) this;
        }

        public Criteria andSystemAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("system_account_id <=", value, "systemAccountId");
            return (Criteria) this;
        }

        public Criteria andSystemAccountIdIn(List<Integer> values) {
            addCriterion("system_account_id in", values, "systemAccountId");
            return (Criteria) this;
        }

        public Criteria andSystemAccountIdNotIn(List<Integer> values) {
            addCriterion("system_account_id not in", values, "systemAccountId");
            return (Criteria) this;
        }

        public Criteria andSystemAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("system_account_id between", value1, value2, "systemAccountId");
            return (Criteria) this;
        }

        public Criteria andSystemAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("system_account_id not between", value1, value2, "systemAccountId");
            return (Criteria) this;
        }

        public Criteria andSystemEmailIsNull() {
            addCriterion("system_email is null");
            return (Criteria) this;
        }

        public Criteria andSystemEmailIsNotNull() {
            addCriterion("system_email is not null");
            return (Criteria) this;
        }

        public Criteria andSystemEmailEqualTo(String value) {
            addCriterion("system_email =", value, "systemEmail");
            return (Criteria) this;
        }

        public Criteria andSystemEmailNotEqualTo(String value) {
            addCriterion("system_email <>", value, "systemEmail");
            return (Criteria) this;
        }

        public Criteria andSystemEmailGreaterThan(String value) {
            addCriterion("system_email >", value, "systemEmail");
            return (Criteria) this;
        }

        public Criteria andSystemEmailGreaterThanOrEqualTo(String value) {
            addCriterion("system_email >=", value, "systemEmail");
            return (Criteria) this;
        }

        public Criteria andSystemEmailLessThan(String value) {
            addCriterion("system_email <", value, "systemEmail");
            return (Criteria) this;
        }

        public Criteria andSystemEmailLessThanOrEqualTo(String value) {
            addCriterion("system_email <=", value, "systemEmail");
            return (Criteria) this;
        }

        public Criteria andSystemEmailLike(String value) {
            addCriterion("system_email like", value, "systemEmail");
            return (Criteria) this;
        }

        public Criteria andSystemEmailNotLike(String value) {
            addCriterion("system_email not like", value, "systemEmail");
            return (Criteria) this;
        }

        public Criteria andSystemEmailIn(List<String> values) {
            addCriterion("system_email in", values, "systemEmail");
            return (Criteria) this;
        }

        public Criteria andSystemEmailNotIn(List<String> values) {
            addCriterion("system_email not in", values, "systemEmail");
            return (Criteria) this;
        }

        public Criteria andSystemEmailBetween(String value1, String value2) {
            addCriterion("system_email between", value1, value2, "systemEmail");
            return (Criteria) this;
        }

        public Criteria andSystemEmailNotBetween(String value1, String value2) {
            addCriterion("system_email not between", value1, value2, "systemEmail");
            return (Criteria) this;
        }

        public Criteria andSystemPasswordIsNull() {
            addCriterion("system_password is null");
            return (Criteria) this;
        }

        public Criteria andSystemPasswordIsNotNull() {
            addCriterion("system_password is not null");
            return (Criteria) this;
        }

        public Criteria andSystemPasswordEqualTo(String value) {
            addCriterion("system_password =", value, "systemPassword");
            return (Criteria) this;
        }

        public Criteria andSystemPasswordNotEqualTo(String value) {
            addCriterion("system_password <>", value, "systemPassword");
            return (Criteria) this;
        }

        public Criteria andSystemPasswordGreaterThan(String value) {
            addCriterion("system_password >", value, "systemPassword");
            return (Criteria) this;
        }

        public Criteria andSystemPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("system_password >=", value, "systemPassword");
            return (Criteria) this;
        }

        public Criteria andSystemPasswordLessThan(String value) {
            addCriterion("system_password <", value, "systemPassword");
            return (Criteria) this;
        }

        public Criteria andSystemPasswordLessThanOrEqualTo(String value) {
            addCriterion("system_password <=", value, "systemPassword");
            return (Criteria) this;
        }

        public Criteria andSystemPasswordLike(String value) {
            addCriterion("system_password like", value, "systemPassword");
            return (Criteria) this;
        }

        public Criteria andSystemPasswordNotLike(String value) {
            addCriterion("system_password not like", value, "systemPassword");
            return (Criteria) this;
        }

        public Criteria andSystemPasswordIn(List<String> values) {
            addCriterion("system_password in", values, "systemPassword");
            return (Criteria) this;
        }

        public Criteria andSystemPasswordNotIn(List<String> values) {
            addCriterion("system_password not in", values, "systemPassword");
            return (Criteria) this;
        }

        public Criteria andSystemPasswordBetween(String value1, String value2) {
            addCriterion("system_password between", value1, value2, "systemPassword");
            return (Criteria) this;
        }

        public Criteria andSystemPasswordNotBetween(String value1, String value2) {
            addCriterion("system_password not between", value1, value2, "systemPassword");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagIsNull() {
            addCriterion("deleted_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagIsNotNull() {
            addCriterion("deleted_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagEqualTo(Boolean value) {
            addCriterion("deleted_flag =", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagNotEqualTo(Boolean value) {
            addCriterion("deleted_flag <>", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagGreaterThan(Boolean value) {
            addCriterion("deleted_flag >", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted_flag >=", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagLessThan(Boolean value) {
            addCriterion("deleted_flag <", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted_flag <=", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagIn(List<Boolean> values) {
            addCriterion("deleted_flag in", values, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagNotIn(List<Boolean> values) {
            addCriterion("deleted_flag not in", values, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted_flag between", value1, value2, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted_flag not between", value1, value2, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table system_account
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 13 17:24:19 ICT 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table system_account
     *
     * @mbg.generated Wed Apr 13 17:24:19 ICT 2022
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
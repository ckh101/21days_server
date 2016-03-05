package com.zhku.my21days.dao;

import com.zhku.my21days.base.BaseDAO;
import com.zhku.my21days.vo.SysUser;
import com.zhku.my21days.vo.SysUserExample;

/**

 * <p>SQL映射文件：com.zhku.my21days.vo.user_SqlMap.xml</p>
 * @see com.zhku.my21days.vo.SysUser
 * @see com.zhku.my21days.vo.SysUserExample
 * @author 陈凯浩
 * @Create On：2014-04-28 01:03:59
 */
public class SysUserDAO extends BaseDAO<SysUser, SysUserExample> {

    public SysUserDAO() {
        super();
    }

    public int updateByExampleSelective(SysUser record, SysUserExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("user.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(SysUser record, SysUserExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("user.updateByExample", parms);
        return rows;
    }

    /**
     * 对应关联的表名为:  user
     */
    private static class UpdateByExampleParms extends SysUserExample {
        private Object record;

        public UpdateByExampleParms(Object record, SysUserExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}
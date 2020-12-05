package com.maoqinfeng.dao.impl;

import com.maoqinfeng.admin.AdminDao;
import com.maoqinfeng.dao.impl.BaseDao;
import com.maoqinfeng.pojo.Admin;

public class AdminDaoImpl extends BaseDao implements AdminDao {


    @Override
    public Admin queryAdminByAdminname(String adminname) {
        String sql = "select `id`,`adminname`,`password`,`email` from t_admin where adminname = ?";
        return queryForOne(Admin.class, sql, adminname);
    }

    @Override
    public Admin queryAdminByAdminnameAndPassword(String adminname, String password) {
        String sql = "select `id`,`adminname`,`password`,`email` from t_admin where adminname = ? and password = ?";
        return queryForOne(Admin.class, sql, adminname,password);
    }

    @Override
    public int saveAdmin(Admin admin) {
        String sql = "insert into t_admin(`adminname`,`password`,`email`) values(?,?,?)";
        return update(sql, admin.getAdminname(),admin.getPassword(),admin.getEmail());    }
}

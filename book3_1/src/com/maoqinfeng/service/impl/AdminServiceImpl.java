package com.maoqinfeng.service.impl;

import com.maoqinfeng.admin.AdminDao;
import com.maoqinfeng.admin.AdminService;
import com.maoqinfeng.dao.impl.AdminDaoImpl;
import com.maoqinfeng.pojo.Admin;

public class AdminServiceImpl implements AdminService {

    private AdminDao adminDao = new AdminDaoImpl();

    @Override
    public Admin loginAdmin(Admin admin) {

        return adminDao.queryAdminByAdminnameAndPassword(admin.getAdminname(), admin.getPassword());
    }

    @Override
    public boolean existsAdminname(String adminname) {
        if (adminDao.queryAdminByAdminname(adminname) == null) {
            // 等于null,说明没查到，没查到表示可用
            return false;
        }

        return true;

    }

}

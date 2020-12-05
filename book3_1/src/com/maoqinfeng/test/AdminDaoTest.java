package com.maoqinfeng.test;

import com.maoqinfeng.admin.AdminDao;
import com.maoqinfeng.dao.impl.AdminDaoImpl;
import com.maoqinfeng.pojo.Admin;
import org.junit.Test;

public class AdminDaoTest {

    AdminDao userDao = new AdminDaoImpl();

    @Test
    public void queryAdminByAdminname() {

        if (userDao.queryAdminByAdminname("admin1234") == null ){
            System.out.println("用户名可用！");
        } else {
            System.out.println("用户名已存在！");
        }
    }

    @Test
    public void queryAdminByAdminnameAndPassword() {
        if ( userDao.queryAdminByAdminnameAndPassword("com/maoqinfeng/admin", "com/maoqinfeng/admin") == null) {
            System.out.println("用户名或密码错误，登录失败");
        } else {
            System.out.println("查询成功");
        }
    }

    @Test
    public void saveUser() {
        System.out.println( userDao.saveAdmin(new Admin(null,"wzg168", "123456", "wzg168@qq.com")) );
    }
}
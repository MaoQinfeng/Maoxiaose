package com.maoqinfeng.dao;

import com.maoqinfeng.pojo.Admin;

public interface AdminDao {

    /**
     * 根据用户名查询用户信息
     * @param adminname 用户名
     * @return 如果返回null,说明没有这个用户。反之亦然
     */
    public Admin queryAdminByAdminname(String adminname);

    /**
     * 根据 用户名和密码查询用户信息
     * @param adminname
     * @param password
     * @return 如果返回null,说明用户名或密码错误,反之亦然
     */
    public Admin queryAdminByAdminnameAndPassword(String adminname, String password);

    /**
     * 保存用户信息
     * @param admin
     * @return 返回-1表示操作失败，其他是sql语句影响的行数
     */
    public int saveAdmin(Admin admin);


}

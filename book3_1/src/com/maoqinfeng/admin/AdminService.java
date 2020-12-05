package com.maoqinfeng.admin;

import com.maoqinfeng.pojo.Admin;

public interface AdminService {

    public Admin loginAdmin(Admin admin);

    /**
     * 检查 用户名是否可用
     * @param adminname
     * @return 返回true表示用户名已存在，返回false表示用户名可用
     */
    public boolean existsAdminname(String adminname);
}

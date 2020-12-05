package com.maoqinfeng.pojo;

public class Admin {
    private Integer id;
    private String adminname;
    private String password;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", adminname='" + adminname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Admin() {
    }

    public Admin(Integer id, String adminname, String password, String email) {
        this.id = id;
        this.adminname = adminname;
        this.password = password;
        this.email = email;
    }
}

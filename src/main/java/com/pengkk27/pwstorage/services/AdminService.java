package com.pengkk27.pwstorage.services;

public interface AdminService {

    /**
     * @param admin 管理员登陆账号
     * @param password 管理员登陆密码
     * @return 是否登陆成功
     */
    boolean adminLogin(String admin, String password);
}

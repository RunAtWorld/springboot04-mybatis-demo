package com.lpf.userdomain.service;

import com.github.pagehelper.PageInfo;
import com.lpf.userdomain.model.UserDomain;

/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}

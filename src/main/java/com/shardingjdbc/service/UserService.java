package com.shardingjdbc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shardingjdbc.model.JsonResult;
import com.shardingjdbc.model.User;

public interface UserService extends IService<User> {

    /** 查询用户列表 **/
    JsonResult<IPage<User>> searchUserList(Integer currtentPage, Integer size,String name);
}

/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserServiceImpl
 * Author:   zlh
 * Date:     2018/5/7 19:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.impl;

import com.jk.service.UserService;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zlh
 * @create 2018/5/7
 * @since 1.0.0
 */
public class UserServiceImpl implements UserService{

    @Override
    public void sayHello(String age, String name) {
        System.out.println("姓名"+name+",年龄"+age);
    }

    @Override
    public String returnStr(String name, String age) {
        return "姓名"+name+",年龄"+age;
    }
}
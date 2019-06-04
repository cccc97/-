package cn.javabs.dao.impl;

import cn.javabs.dao.UserDao;
import cn.javabs.entity.User;
import cn.javabs.util.DbcpUtil;
import org.apache.commons.dbutils.QueryRunner;

public class UserDaoImpl implements UserDao {
        QueryRunner qr=new QueryRunner (DbcpUtil.getDataSource());

        @Override
        public int addUser(User user)  {
            try{
                return  qr.update("insert into users(username,password,sex) values (?,?,?)", user.getUsername(),user.getPassword(),user.getSex());
            } catch (Exception e){
                throw new RuntimeException(e);
            }
        }
}

package com.huang.dao;

import com.huang.domain.Book;
import com.huang.domain.Product;
import com.huang.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Select("select * from user where username = #{username}")
    public User login(User user);

    //@Select("select * from product limit 3")
    @Select("select * from product")
    public List<Product> findNavProduct();

    //查询前5个数据为精品图书
    @Select("select * from book limit 5")
    public List<Book> findBook5();

}

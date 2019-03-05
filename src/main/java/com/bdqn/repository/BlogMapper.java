package com.bdqn.repository;

import com.bdqn.entity.Blog;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BlogMapper {
//    @Select("select * from blog where id = #{id}")
//    @Results(id="blogResultMap",value = {
//            @Result(property = "id",column = "id"),
//            @Result(property = "title",column = "title" ),
//            @Result(property = "authorId",column = "author_id")
//    })
    Blog selectBlog(Integer id);
    //@Insert("insert into BLOG(title, author_id)  values (#{title ,jdbcType=VARCHAR,javaType=java.lang.String},#{authorId})")
    int saveBlog(Blog blog);
//    @Select("select *  from BLOG;")
//    @ResultMap("blogResultMap")
    List<Blog> selectAllBlogs();

}

package com.bdqn.repository;

import com.bdqn.entity.Author;
import com.bdqn.entity.Blog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BlogMapperTest {
    private InputStream inputStream;  //输入流
    private static SqlSessionFactory sqlSessionFactory;
    private SqlSession session;

    BlogMapperTest() throws IOException {
        inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

//    @Test
//    public void test(){
//        session = sqlSessionFactory.openSession();
//        BlogMapper mapper = session.getMapper(BlogMapper.class);
//        AuthorMapper authorMapper = session.getMapper(AuthorMapper.class);
//
//        Author author = new Author("tom","123456","tom@email.com","en");
//        authorMapper.saveAuthor(author);
//
//        mapper.saveBlog(new Blog("title2",author));
//        List<Blog> blogs = mapper.selectAllBlogs();
//        blogs.forEach(System.out::println);
//        Blog blog = new Blog();
//        System.out.println(blog);
//        mapper.saveBlog(blog);
//        System.out.println(blog);
//        session.commit();
//        session.close();
//    }

    @Test
    public void t(){
        session = sqlSessionFactory.openSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        mapper.selectAllBlogs();
        mapper.selectAllBlogs();
        session.close();

        session = sqlSessionFactory.openSession();
        mapper = session.getMapper(BlogMapper.class);

        mapper.selectAllBlogs();
        session.close();
    }

}
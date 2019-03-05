package com.bdqn.util;

import com.bdqn.entity.Blog;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.util.List;
import java.util.Properties;

public class ExampleObjectFactory extends DefaultObjectFactory {
//    @Override
//    public <T> T create(Class<T> type) {
//        T t = super.create(type);
//        if(type.equals(Blog.class)){
//            Blog blog = (Blog)t;
//            blog.setAuthorId(10);
//        }
//        return t;
//    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        return super.create(type, constructorArgTypes, constructorArgs);
    }

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return super.isCollection(type);
    }
}

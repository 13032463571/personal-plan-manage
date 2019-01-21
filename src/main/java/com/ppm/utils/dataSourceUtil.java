package com.ppm.utils;

import com.ppm.mapper.ItemsMapper;
import com.ppm.pojo.Items;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class dataSourceUtil {
    private static final String resource = "mybatis/mybatis.xml";
    private static SqlSessionFactory factory = null;
    private static Configuration configuration = null;

    public static void createSessionFactory() throws Exception{
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(is);
        configuration = factory.getConfiguration();
    }
    public static void main(String[] args) throws Exception {
        createSessionFactory();
        SqlSession session = factory.openSession();
        ItemsMapper itemsMapper = session.getMapper(ItemsMapper.class);
        List<Items> list = itemsMapper.selectAllItems();
        for (Items m: list) {
            System.out.println(m.toString());
        }
    }
}

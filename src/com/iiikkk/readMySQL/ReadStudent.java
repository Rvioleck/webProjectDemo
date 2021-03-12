package com.iiikkk.readMySQL;

import com.mysql.cj.jdbc.result.ResultSetImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReadStudent {

    public List<StudentInfo> readFirst() throws SQLException{
        List<StudentInfo> list = new ArrayList<StudentInfo>();
        ConnectMySQL open = new ConnectMySQL();
        Connection con = open.getConnection(); // 连接类
        // 创建Statement类对象，用来执行SQL语句
        Statement statement = con.createStatement(); // statement实现增删改查
        String sql = "select id, name from student"; // sql语句
        // 创建ResultSet类对象用于存放结果集
        ResultSet resultSet = statement.executeQuery(sql);

        int id = 0;
        String name = null;
        while (resultSet.next()){
            id = resultSet.getInt("id");
            name = resultSet.getString("name");
            StudentInfo stu = new StudentInfo(id, name);
            list.add(stu);
        }
        resultSet.close();
        con.close();
        return list;
    }

}

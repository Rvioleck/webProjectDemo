package com.iiikkk.readMySQL;

import java.sql.Connection;

public class Test {

    public static void main(String[] args){
        ConnectMySQL open = new ConnectMySQL();
        Connection conn = open.getConnection();
        System.out.println(conn);
    }

}

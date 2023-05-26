package com.dao;



import com.entity.StudentEntity;
import com.util.Mayiktjdbcutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class StudentDao {
    //学生对象访问层
    public ArrayList<StudentEntity> allStudent() {
        ArrayList<StudentEntity> list = new ArrayList<StudentEntity>();
        Connection connection=null;
        ResultSet rs=null;
        Statement statement=null;
        try {

            connection = Mayiktjdbcutils.getConnection();

            statement = connection.createStatement();
            String sql = "select * from student";
            rs = statement.executeQuery(sql);
            while(rs.next()) {
                Integer sno = rs.getInt("id");
                String sname = rs.getString("name");
                String ssex = rs.getString("sex");
                String sage = rs.getString("age");
                String sdept = rs.getString("birthday");
                String college = rs.getString("college");
                String telephone = rs.getString("telephone");
                Integer grade = rs.getInt("grade");
                list.add(new StudentEntity(sno,sname,ssex,sage,sdept,college,telephone,grade));

            }
            return list;


        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            Mayiktjdbcutils.closeConnection(rs, statement, connection);


        }


    }
    public StudentEntity getByIdStudent(Integer stuid){
        if(stuid == null) {
            return null;
        }
        Connection connection=null;
        ResultSet rs=null;
        Statement statement=null;
        try {
            connection = Mayiktjdbcutils.getConnection();
            statement = connection.createStatement();
            String sql = "select * from student where id="+stuid;
            rs = statement.executeQuery(sql);
            boolean result = rs.next();
            if(!result) {
                return null;
            }
            Integer sno = rs.getInt("id");
            String sname = rs.getString("name");
            String ssex = rs.getString("sex");
            String sage = rs.getString("age");
            String sdept = rs.getString("birthday");
            String college = rs.getString("college");
            String telephone = rs.getString("telephone");
            Integer grade = rs.getInt("grade");
            StudentEntity studentEntity = new StudentEntity(sno,sname,ssex,sage,sdept,college,telephone,grade);


            return studentEntity;

        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            Mayiktjdbcutils.closeConnection(rs, statement, connection);


        }
    }
    public int insertStudent(StudentEntity stu) {
        Connection connection=null;
        Statement statement=null;
        try {
            connection = Mayiktjdbcutils.getConnection();
            statement = connection.createStatement();
            String sql = "insert into student values(null,'"+stu.getName()+"','"+stu.getSex()+"','"+stu.getAge()+"','"+stu.getBirthday()+"','"+stu.getCollege()+"','"+stu.getTelephone()+"','"+stu.getGrade()+"')";
            System.out.println(sql);
            int result = statement.executeUpdate(sql);

            return result;

        }catch(Exception e) {
            e.printStackTrace();
            return 0;
        }finally {
            Mayiktjdbcutils.closeConnection( statement, connection);


        }

    }
    public int updateStudent(StudentEntity stu) {
        Connection connection=null;
        Statement statement=null;
        try {
            connection = Mayiktjdbcutils.getConnection();
            statement = connection.createStatement();
            String sql = " update student set name='"+stu.getName()+"',sex='"+stu.getSex()+"',age="+stu.getAge()+",birthday='"+stu.getGrade()+"' where id="+stu.getId()+"";
            System.out.println(sql);
            int result = statement.executeUpdate(sql);

            return result;

        }catch(Exception e) {
            e.printStackTrace();
            return 0;
        }finally {
            Mayiktjdbcutils.closeConnection( statement, connection);


        }

    }
    public int deleteStudent(StudentEntity stu) {
        Connection connection=null;
        Statement statement=null;
        try {
            connection = Mayiktjdbcutils.getConnection();
            statement = connection.createStatement();
            String sql = " delete  from student where id="+stu.getId()+"";
            System.out.println(sql);
            int result = statement.executeUpdate(sql);

            return result;

        }catch(Exception e) {
            e.printStackTrace();
            return 0;
        }finally {
            Mayiktjdbcutils.closeConnection(statement, connection);


        }

    }

}

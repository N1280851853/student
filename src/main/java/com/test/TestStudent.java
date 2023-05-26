package com.test;


import com.dao.StudentDao;
import com.entity.StudentEntity;

import java.util.ArrayList;
import java.util.Scanner;


public class TestStudent {
    private static StudentDao studentDao = new StudentDao();

    /**
     * new对象存放 堆内存
     *
     * @param args
     */
    public static void main(String[] args) {
        mainMenu();
    }

    /**
     * 1.需要定义主菜单程序的入口
     */
    public static void mainMenu() {
        while (true) {
            // 1.提示语
            System.out.println("欢迎来到物联网1班第五小组学生信息管理系统");
            System.out.println("1.查询所有的学生信息");
            System.out.println("2.根据学生id查询学生信息");
            System.out.println("3.新增学生信息");
            System.out.println("4.根据学生id修改学生信息");
            System.out.println("5.根据学生id删除学生信息");
            System.out.println("请选择对应序号:");
            // 2.接受用户输入的序号 int
            Scanner scanner = new Scanner(System.in);
            int result = scanner.nextInt();
            // 3.在根据用户选择的序号 判断
            switch (result) {
                case 1:
                    showAllStudent();
                    break;//直接让我们while退出了
                case 2:
                    findByIdStudent();
                    break;
                case 3:
                    insertStudent();
                    break;
                case 4:
                    updateIdStudent();
                    break;
                case 5:
                    delIdStudent();
                    break;
            }
        }
    }

    /**
     * 查询所有学生信息
     */
    public static void showAllStudent() {
        System.out.println("查询所有学生信息如下:");
        ArrayList<StudentEntity> studentEntities = studentDao.allStudent();
        for (StudentEntity stu : studentEntities) {
            System.out.println(stu);
        }
    }

    /**
     * 根据学生id查询学生信息
     */
    public static void findByIdStudent() {
        System.out.println("请输入学生的sno：");
        Scanner scanner = new Scanner(System.in);
        Integer stuId = scanner.nextInt();
        // 根据用户输入的学生id查询学生信息
        // 根据用户输入的学生id查询学生信息 查询不到  查询得到
        StudentEntity student = studentDao.getByIdStudent(stuId);
        if (student == null) {
            System.out.println("该学生sno" + student + ",不存在的");
            return;// 后面代码不会继续执行
        }
        // 查询到了学生信息
        System.out.println("学生信息：" + student);
    }

    /**
     * 根据学生id删除学生信息
     */
    public static void delIdStudent() {
        System.out.println("请输入学生的sno：");
        Scanner scanner = new Scanner(System.in);
        Integer stuId = scanner.nextInt();
        StudentEntity byIdStudent = studentDao.getByIdStudent(stuId);
        int result = studentDao.deleteStudent(byIdStudent);
        if (result > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    /**
     * 插入我们的学生信息
     */
    public static void insertStudent() {
        Scanner scanner = new Scanner(System.in);
        //        System.out.println("请输入学生的id：");
        //        Long stuId = scanner.nextLong();
        System.out.println("请输入学生的姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生的性别：");
        String sex = scanner.nextLine();
        System.out.println("请输入学生的年龄：");
        String age = scanner.nextLine();
//        scanner.nextLine(); // 跳过
        System.out.println("请输入学生的生日：");
        String birth = scanner.nextLine();
        System.out.println("请输入学生的班级：");
        String collage = scanner.nextLine();
        System.out.println("请输入学生的电话：");
        String tel = scanner.nextLine();
        System.out.println("请输入学生的成绩：");
        Integer grade = scanner.nextInt();
        StudentEntity studentEntity = new StudentEntity(name,sex, age, birth,collage,tel,grade);
        int result = studentDao.insertStudent(studentEntity);
        if (result > 0) {
            System.out.println("插入学生信息成功");
        } else {
            System.out.println("插入学生信息失败");
        }
    }

    public static void updateIdStudent() {
        // 需要先根据学生的id查询该学生信息 如果查询得到的情况下 才会修改学生信息
        // 查询不到的情况下 就不会修改学生信息
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的sno：");
        int stuId = scanner.nextInt();
        // 根据学生id查询学生信息
        StudentEntity student = studentDao.getByIdStudent(stuId);
        if (student == null) {
            System.out.println("没有查询该学生的id对应学生信息");
            return;
        }
        scanner.nextLine();
        System.out.println("请输入学生的姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生的性别：");
        String sex = scanner.nextLine();
        System.out.println("请输入学生的年龄：");
        String age = scanner.nextLine();
//        scanner.nextLine(); // 跳过
        System.out.println("请输入学生的生日：");
        String birth = scanner.nextLine();
        System.out.println("请输入学生的班级：");
        String collage = scanner.nextLine();
        System.out.println("请输入学生的电话：");
        String tel = scanner.nextLine();
        System.out.println("请输入学生的成绩：");
        Integer grade = scanner.nextInt();
        // 封装接受的参数 变成学生对象
        StudentEntity studentEntity = new StudentEntity(stuId, name,sex, age, birth,collage,tel,grade);
        int result = studentDao.updateStudent(studentEntity);
        if (result > 0) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }
}
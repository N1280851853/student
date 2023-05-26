package com.entity;

public class StudentEntity {
    private Integer id;                          //学号
    private String name;                        //姓名
    private String sex;                         //性别
    private String age;                         //年龄
    private String birthday;                    //出生日期
    private String college;                     //学院
    private String telephone;                   //电话
    private Integer grade;                          //成绩

    public StudentEntity() {
    }

    public StudentEntity(Integer id, String name, String sex, String age, String birthday, String college, String telephone, Integer grade) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.college = college;
        this.telephone = telephone;
        this.grade = grade;
    }
    public StudentEntity( String name, String sex, String age, String birthday, String college, String telephone, Integer grade) {

        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.college = college;
        this.telephone = telephone;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", birthday='" + birthday + '\'' +
                ", college='" + college + '\'' +
                ", telephone='" + telephone + '\'' +
                ", grade=" + grade +
                "";
    }
}
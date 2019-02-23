package com.demo.controller.action;

import com.demo.entities.Student;
import com.demo.models.StudentModel;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import java.util.List;

@Namespace(value = "/student")
public class StudentAction extends ActionSupport {
    private List<Student> studentList;
    private Student student;

    @Action(value = "index", results = {@Result(name = SUCCESS, location = "student.index", type = "tiles")})
    public String index(){
        StudentModel studentModel = new StudentModel();
        this.studentList = studentModel.findAll();
        return SUCCESS;
    }

    @Action(value = "add", results = {
            @Result(name = SUCCESS, location = "student.add", type = "tiles")
    })
    public String add(){
        this.studentList = new StudentModel().findAll();
        return SUCCESS;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Student getStudent() {return student;}

    public void setStudent(Student student) {this.student = student;}
}

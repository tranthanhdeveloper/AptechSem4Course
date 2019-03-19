package com.demo.controller.action;

import com.demo.com.demo.constant.map.SessionMap;
import com.demo.entities.Student;
import com.demo.models.StudentModel;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.mindrot.jbcrypt.BCrypt;

import java.util.List;
import java.util.Map;

@Namespace(value = "/student")
public class StudentAction extends ActionSupport implements SessionAware {
    private List<Student> students;
    private Student student;
    private int studentId;
    private String username;
    private String password;
    private Map<String, Object> sessionMap;

    @Action(value = "index", results = {@Result(name = SUCCESS, location = "student.index", type = "tiles")})
    public String index(){
        StudentModel studentModel = new StudentModel();
        this.students = studentModel.findAll();
        return SUCCESS;
    }

    @Action(value = "add", results = {@Result(name = SUCCESS, location = "student.add", type = "tiles")})
    public String add(){
        this.student = new Student();
        return SUCCESS;
    }

    @Action(value = "update", results = {@Result(name = SUCCESS, location = "student.update", type = "tiles")})
    public String update(){

        this.student = new StudentModel().findById(this.studentId);
        return SUCCESS;
    }

    @Action(value = "login", results = {@Result(name = SUCCESS, location = "student.login", type = "tiles")})
    public String login(){
        return SUCCESS;
    }

    @Action(value = "logout", results = {@Result(name = INPUT, type = "redirectAction", params = {"namespace", "/student","actionName", "login"})})
    public String logout(){
        sessionMap.remove(SessionMap.USER_LOGIN_MAP);
        return SUCCESS;
    }

    @Action(value = "checkLogin", results = {@Result(name = SUCCESS, type = "redirectAction",params = {"namespace", "/student","actionName", "index"}),
                                             @Result(name = INPUT, type = "redirectAction",params = {"namespace", "/student","actionName", "login"})
                                            }
    )
    public String checkLogin(){
        try {
            StudentModel studentModel = new StudentModel();
            Student loginStudent = studentModel.findByUsername(this.username);
            if (loginStudent!= null && BCrypt.checkpw(this.password, loginStudent.getPassword())){
                sessionMap.put(SessionMap.USER_LOGIN_MAP, loginStudent.getUsername());
                return SUCCESS;
            }
        }catch (Exception e){
            return INPUT;
        }
        return INPUT;
    }

    @Action(value = "save", results = {@Result(name = SUCCESS, type = "redirectAction",params = {"namespace", "/student","actionName", "index"})})
    public String save(){
        StudentModel studentModel = new StudentModel();
        try {
            String hashedPw = BCrypt.hashpw(this.student.getPassword(), BCrypt.gensalt());
            this.student.setPassword(hashedPw);
            studentModel.save(this.student);
        }catch (Exception e){
            return ERROR;
        }
        return SUCCESS;
    }

    @Action(value = "saveUpdate", results = {@Result(name = SUCCESS, type = "redirectAction",params = {"namespace", "/student","actionName", "index"})})
    public String saveUpdate(){
        StudentModel studentModel = new StudentModel();
        try {
            if (this.student.getPassword().trim().length() > 0){
                String hashedPw = BCrypt.hashpw(this.student.getPassword(), BCrypt.gensalt());
                this.student.setPassword(hashedPw);
            }
            studentModel.update(this.student);
        }catch (Exception e){
            return ERROR;
        }
        return SUCCESS;
    }

    @Action(value = "delete", results = {@Result(name = SUCCESS, type = "redirectAction",params = {"namespace", "/student", "actionName", "index"})})
    public String delete(){
        StudentModel studentModel = new StudentModel();
        System.out.println(studentModel.findById(this.studentId));
        studentModel.delete(studentModel.findById(this.studentId));
        return SUCCESS;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.sessionMap = sessionMap;
    }
}

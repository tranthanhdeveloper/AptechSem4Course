package com.demo.models;

import com.demo.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class StudentModel {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public List<Student> findAll(){
        List<Student> studentList = null;
        Session session = null;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            studentList = session.createQuery("from Student ").getResultList();
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            session.close();
        }
        return studentList;
    }

    public Student findById(int id){
        Student student = null;
        Session session = null;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            student = (Student) session.createQuery("select student from Student student where student.id=:id").setParameter("id", id).getSingleResult();
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            session.close();
        }
        return student;
    }

    public Student findByUsername(String username){
        Student student = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            student = (Student) session.createQuery("select student from Student student where student.username=:username").setParameter("username", username).getSingleResult();
        }finally {
            session.close();
        }
        return student;
    }

    public boolean save(Student student){
        boolean insertResult = false;
        Session session = null;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
            insertResult = true;
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            session.close();
        }
        return insertResult;
    }

    public boolean delete(Student student){
        boolean deleteResult = false;
        Session session = null;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(student);
            transaction.commit();
            deleteResult = true;
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            session.close();
        }
        return deleteResult;
    }

    public boolean update(Student student){
        boolean updateResult = false;
        Session session = null;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.update(student);
            transaction.commit();
            updateResult = true;
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            session.close();
        }
        return updateResult;
    }
}

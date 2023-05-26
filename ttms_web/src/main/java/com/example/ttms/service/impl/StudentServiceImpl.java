//package com.example.ttms.service.impl;
//
//import com.example.ttms.dao.StudentMapper;
//import com.example.ttms.pojo.Student;
//import com.example.ttms.service.StudentService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@Slf4j
//public class StudentServiceImpl implements StudentService {
//    @Autowired(required = false)
//    private StudentMapper studentMapper;
//    @Override
//    public List<Student> findAllService() {
//        try {
//            List<Student> allStudent = studentMapper.findAllStudent();
//            return allStudent;
//        }catch (Exception ex) {
//            log.info(ex.getMessage());
//        }
//        return null;
//    }
//
//    @Override
//    public void updateStudentService(Student student) {
//        try {
//            studentMapper.updateStudent(student);
//        }catch (Exception ex){
//            log.info(ex.getMessage());
//        }
//    }
//
//    @Override
//    public Student addStudentService(Student student) {
//        try{
//            studentMapper.addStudent(student);
//            return student;
//        }catch (Exception ex){
//            log.info(ex.getMessage());
//        }
//        return null;
//    }
//
//    @Override
//    public void deleteStudentService(int id) {
//        try{
//            studentMapper.deleteStudent(id);
//        }catch (Exception ex){
//            log.info(ex.getMessage());
//        }
//    }
//}
//

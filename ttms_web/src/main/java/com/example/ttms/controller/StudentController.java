//package com.example.ttms.controller;
//
//import com.example.ttms.pojo.Student;
//import com.example.ttms.service.StudentService;
//import com.example.ttms.vo.ActionResult;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class StudentController {
//    @Autowired(required = false)
//    private StudentService studentService;
//    @CrossOrigin //标识接受跨域处理
//    @RequestMapping(value="/studentList" ,method= RequestMethod.GET)
//    public ActionResult findAllStu(){
//        ActionResult actionResult = new ActionResult();
//        List<Student> allService = studentService.findAllService();
//        actionResult.setStatusCode(200);
//        actionResult.setData(allService);
//        return actionResult;
//    }
//
//    //修改学生信息
//    @CrossOrigin
//    @RequestMapping(value = "/updateStudent",method = RequestMethod.PUT)
//    public ActionResult updateStu(@RequestBody Student student){
//        studentService.updateStudentService(student);
//        ActionResult actionResult = new ActionResult();
//        actionResult.setStatusCode(200);
//        actionResult.setMsg("Update Success!!!");
//        return actionResult;
//    }
//
//
//    //添加学生信息
//    @CrossOrigin
//    @RequestMapping(value="/addStudent" ,method= RequestMethod.POST)
//    public ActionResult  addStu(@RequestBody Student student){
//        Student student1 = studentService.addStudentService(student);
//        ActionResult result = new ActionResult();
//        result.setStatusCode(200);
//        result.setMsg("add Success!!!");
//        result.setData(student1);
//        return result;
//    }
//
//    //删除学生信息
//    @CrossOrigin
//    @RequestMapping(value = "/deleteStudent",method = RequestMethod.GET)
//    public ActionResult deleteStu(@RequestParam("id") int id){
//        studentService.deleteStudentService(id);
//        ActionResult actionResult = new ActionResult();
//        actionResult.setStatusCode(200);
//        actionResult.setMsg("Update Success!!!");
//        return actionResult;
//    }
//}
//

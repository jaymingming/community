package com.nowcoder.community.controller;


import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@Controller
@RequestMapping("/alpha")
public class AlphaController {

    @Autowired
    private AlphaService alphaService;
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return alphaService.find();
    }

    @RequestMapping("/http")
    public void http(HttpServletRequest request, HttpServletResponse response){
        // 获取请求数据
        System.out.println(request.getMethod());
        System.out.println(request.getServletPath());
        Enumeration<String> enumeration = request.getHeaderNames();
        while (enumeration.hasMoreElements()) {
            String name = enumeration.nextElement();
            String value = request.getHeader(name);
            System.out.println(name + ": " + value);
        }
        System.out.println(request.getParameter("code"));

        // 返回响应数据
        response.setContentType("text/html;charset=utf-8");
        try (
                PrintWriter writer = response.getWriter();
        ) {
            writer.write("<h1>牛客网</h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping(path = "student", method = RequestMethod.GET)
    @ResponseBody
    public String getStudents(
            @RequestParam(name = "current",required = false, defaultValue = "1")int current,
            @RequestParam(name = "limit",required = false, defaultValue = "1")int limit
    ){
        System.out.println(current);
        System.out.println(limit);
        return "some student";
    }
    @RequestMapping(path = "/student/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String GetStudent(@PathVariable("id") int id){
        System.out.println(id);
        return "a student";
    }
    //post请求
    @RequestMapping(path = "/student", method = RequestMethod.POST)
    @ResponseBody
    public String saveStudent(String name, String age){
        System.out.println(name);
        System.out.println(age);
        return "success";
    }
    //相应html数据
    @RequestMapping(path = "/teacher", method = RequestMethod.GET)
    public ModelAndView getTeacher(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","张三");
        mv.addObject("age",30);
        mv.setViewName("/demo/view");
        return mv;
    }

    @RequestMapping(path = "/school",method = RequestMethod.GET)
    public String getSchool(Model model){
        model.addAttribute("name","江苏科技大学");
        model.addAttribute("age",80);
        return "/demo/view";
    }
    @RequestMapping(path = "/emp",method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object>getEmp(){
        Map<String, Object>emp = new HashMap<>();
        emp.put("name","张三");
        emp.put("age",23);
        return emp;
    }
    @RequestMapping(path = "/emp1",method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, Object>> getEmp1(){
        List<Map<String, Object>>getmap = new ArrayList<>();
        Map<String, Object>emp = new HashMap<>();
        emp.put("name","张三");
        emp.put("age",23);
        getmap.add(emp);
        Map<String, Object>emp1 = new HashMap<>();
        emp.put("name","李四");
        emp.put("age",24);
        getmap.add(emp);
        return getmap;
    }
}
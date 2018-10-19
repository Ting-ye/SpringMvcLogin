package com.dy.controller;


import com.dy.pojo.Users;
import com.dy.service.UsersService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class UsersController {
    @Resource
    private UsersService usersServiceImpl;

    @RequestMapping("register")
    public String regist(Users users, MultipartFile file, HttpServletRequest req){
        String fileName=UUID.randomUUID().toString()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String path=req.getServletContext().getRealPath("images")+"/"+fileName;
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(),new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        users.setPhoto(fileName);
        int index= usersServiceImpl.insRegister(users);
        if (index>0){
            return "/main.jsp";
        }else{
            return "redirect:/index.jsp";
        }
    }
}

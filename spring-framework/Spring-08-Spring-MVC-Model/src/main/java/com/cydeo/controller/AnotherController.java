package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/anotherMentor")
public class AnotherController {

    @RequestMapping("list")
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor(45, "Mike","Smith", Gender.MALE));
        mentorList.add(new Mentor(65, "Tom","Hanks", Gender.MALE));
        mentorList.add(new Mentor(25, "Ammy","Bryan", Gender.FEMALE));

        model.addAttribute("mentors",mentorList);
        return "/mentor/mentor-list";
    }
}

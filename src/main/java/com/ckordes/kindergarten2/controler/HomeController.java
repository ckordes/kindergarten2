package com.ckordes.kindergarten2.controler;

import com.ckordes.kindergarten2.entity.GeneralInfo;
import com.ckordes.kindergarten2.repository.GeneralInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    GeneralInfoRepository generalInfoRepository;

    @ModelAttribute(name="generalInfo")
    public List<GeneralInfo> generalInfoList(){
        List<GeneralInfo> generalInfoList = generalInfoRepository.findAll();
        if (generalInfoList == null) {
            generalInfoList = new ArrayList<>();
        }else{
            Collections.reverse(generalInfoList);
        }
        return generalInfoList;
    }


    @RequestMapping("/")
    public String homeAction(Model model){
        return "index";
    }

}

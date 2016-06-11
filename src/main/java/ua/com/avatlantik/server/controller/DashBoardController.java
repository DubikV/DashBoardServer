package ua.com.avatlantik.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/dashboard")
public class DashBoardController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getBashBoard(ModelMap model){
        return "Its Dash Board!!!";
    }

}

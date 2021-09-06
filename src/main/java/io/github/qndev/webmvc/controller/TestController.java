package io.github.qndev.webmvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.github.qndev.webmvc.model.RadioModel;

@Controller
@RequestMapping("/spring")
public class TestController {

    @RequestMapping(value = "/init")
    public String testInitRadiobutton(Model model, HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse) {

        Map<String, String> radiobuttons = new HashMap<>();
        radiobuttons.put("01", "James");
        radiobuttons.put("02", "Amy");
        radiobuttons.put("03", "Young");
        List<Map.Entry<String, String>> radiobuttonsList = radiobuttons.entrySet().stream()
                .collect(Collectors.toList());

        httpServletRequest.setAttribute("radiobuttonsList", radiobuttonsList);

        model.addAttribute("RadioModel", new RadioModel());

        return "InitRadioButton";

    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String testSubmitRadiobutton(@ModelAttribute("RadioModel") RadioModel radioModel,
            HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        String key = radioModel.getRadioButtonKey();

        // String value = radioModel.getRadioButtonValue();

        httpServletRequest.setAttribute("radioKey", key);
        // httpServletRequest.setAttribute("radioValue", value);

        return "Success";

    }

}

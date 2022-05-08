package garanti.garantiIslemleri.controller;

import garanti.garantiIslemleri.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
@RequiredArgsConstructor
public class HomePageController {



    @GetMapping
    public ModelAndView index(){
        ModelAndView model = new ModelAndView();

        model.setViewName("index");

        return model;
    }
}

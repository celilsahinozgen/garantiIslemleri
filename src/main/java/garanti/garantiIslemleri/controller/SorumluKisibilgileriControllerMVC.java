package garanti.garantiIslemleri.controller;

import garanti.garantiIslemleri.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("sorumlukisibilgileri")
@RequiredArgsConstructor
public class SorumluKisibilgileriControllerMVC {

    private final UserService userService;

    @GetMapping
    public ModelAndView userinformationPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("sorumlukisilistesi",userService.findAll());
        model.setViewName("sorumlukisibilgileri");

        return model;
    }

    @GetMapping("/delete")
    public String delete(Long id){
    //    userService.findById(id);
     //       userService.delete(id);
//        ModelAndView model = new ModelAndView();
//        model
        userService.delete(id);

        return "redirect:/sorumlukisibilgileri";
    }

}

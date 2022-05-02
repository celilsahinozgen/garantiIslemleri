package garanti.garantiIslemleri.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("cagriac")
@RequiredArgsConstructor
public class CagriAcController {

    @GetMapping
    public ModelAndView cagriac(){
        ModelAndView model = new ModelAndView();
      //  model.addObject()
        model.setViewName("cagriac");
        return model;
    }

}

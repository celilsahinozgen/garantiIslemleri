package garanti.garantiIslemleri.controller;

import garanti.garantiIslemleri.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("sorumlukisiekle")
@RequiredArgsConstructor
public class SorumluKisiEkleMVC {

    private final UserController userController;

    @GetMapping
    public ModelAndView sorumlukisieklePage(){
        ModelAndView model = new ModelAndView();
        model.addObject("sorumluduzenle" ,userController.findAll());
        model.setViewName("sorumlukisiekle");
        return model;

    }
    @PostMapping
    public String saveSorumlukisi(String sorumluname,String sorumlulastname,
                                 String eposta,String telefon ){
        userController.save(User.builder()
                .name(sorumluname)
                .lastname(sorumlulastname)
                        .eposta(eposta)
                .iletisim(telefon).build());
        return "redirect:/sorumlukisiekle";
    }

}

package garanti.garantiIslemleri.controller;


import garanti.garantiIslemleri.entity.CagriFormu;
import garanti.garantiIslemleri.service.FirmaService;
import garanti.garantiIslemleri.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/cagriac")
@RequiredArgsConstructor
public class CagriFormuControllerMVC {

    private final UserService userService;
    private final FirmaService firmaService;
    private final CagriAcController cagriAcController;

    @GetMapping
    public ModelAndView kisilistesi(){
        ModelAndView model = new ModelAndView();
        model.addObject("kisilistesi",userService.findAll());
        model.addObject("firmalistesi",firmaService.findAll());
        model.setViewName("cagriac");
        return model;
    }

    @PostMapping
    public ModelAndView saveCagriformu(int kisi_select,int firma_select,String arizatanimi,
    int marka_select,int model_select,String serinumarasi) {
        ModelAndView model = new ModelAndView();
        cagriAcController.save(CagriFormu.builder()
                .kisi_select(kisi_select)
                .firma_select(firma_select)
                .arizatanimi(arizatanimi)
                .marka_select(marka_select)
                .model_select(model_select)
                .serinumarasi(serinumarasi).build());
        return model;
    }








}

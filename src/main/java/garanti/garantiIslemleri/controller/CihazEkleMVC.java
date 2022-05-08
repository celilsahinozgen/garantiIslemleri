package garanti.garantiIslemleri.controller;

import garanti.garantiIslemleri.entity.Cihaz;
import garanti.garantiIslemleri.entity.Firma;
import garanti.garantiIslemleri.service.CihazService;
import garanti.garantiIslemleri.service.FirmaService;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("cihazekle")
@RequiredArgsConstructor
public class CihazEkleMVC {

    private final CihazService cihazService;
    private final FirmaService firmaService;
    private final FirmaController firmaController;
    private final CihazController cihazController;

    @GetMapping
    public ModelAndView cihazeklemePage(){
        ModelAndView model =new ModelAndView();
        model.setViewName("cihazekle");
        model.addObject("firmabilgileri",firmaService.findAll());
        model.addObject("cihazbilgileri",cihazService.findAll());

        return model;
    }

    @PostMapping
    public ModelAndView savecihaz(
            Firma firma_select,
            String cihazcinsi,
            String  cihazmarka,
            String  cihazmodel,
            String cihazalimtarihi,
            String garantibitis) {
        ModelAndView model = new ModelAndView();
////        Firma _firma = new Firma();
//
//
//        Optional<Firma> optionalFirma;
//        optionalFirma= firmaController.findById(firma_select);
//


        cihazController.save(Cihaz.builder()
//                        .firma()
                .cinsi(cihazcinsi)
                .marka(cihazmarka)
                .model(cihazmodel)
                .alinantarih(cihazalimtarihi)
                .garantibitis(garantibitis)
                .build());


        return model;



    }

// int to firma cevirme işlemi
//    Firma _firma = new Firma();
//
//        cihazController.save(Cihaz.builder()
//                .firma(_firma)




}

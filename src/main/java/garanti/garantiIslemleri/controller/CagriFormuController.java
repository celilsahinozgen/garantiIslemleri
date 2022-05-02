package garanti.garantiIslemleri.controller;


import garanti.garantiIslemleri.entity.CagriFormu;
import garanti.garantiIslemleri.service.CagriFormuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cagriformu")
@RequiredArgsConstructor
public class CagriFormuController {

    private final CagriFormuService cagriFormuService;


    @PostMapping
    public String saveCagriformu(int kisi_select,int firma_select,String arizatanimi,
    int marka_select,int model_select,String serinumarasi) {
        cagriFormuService.save(CagriFormu.builder()
                .kisi_select(kisi_select)
                .firma_select(firma_select)
                .arizatanimi(arizatanimi)
                .marka_select(marka_select)
                .model_select(model_select)
                .serinumarasi(serinumarasi).build());
        return "redirect: /index";
    }







}

package garanti.garantiIslemleri.controller;

import garanti.garantiIslemleri.entity.CagriFormu;
import garanti.garantiIslemleri.service.CagriFormuService;
import garanti.garantiIslemleri.service.FirmaService;
import garanti.garantiIslemleri.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("cagri")
@RequiredArgsConstructor
public class CagriAcController {

    private final CagriFormuService cagriFormuService;

    @PostMapping("/save")
    public ResponseEntity<CagriFormu> save(@RequestBody CagriFormu cagriFormu){
        if (cagriFormu.getId() !=null) {
            ResponseEntity.badRequest().build();
        }
        cagriFormuService.save(cagriFormu);
       return ResponseEntity.ok().build();
    }
    @PutMapping("/update")
    public ResponseEntity<CagriFormu> update(@RequestBody CagriFormu cagriFormu){
        if (cagriFormu == null) {
            ResponseEntity.badRequest().build();
        }
        cagriFormuService.save(cagriFormu);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        try {
            cagriFormuService.delete(id);
            return ResponseEntity.noContent().build();
        }catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }

    }
    @GetMapping("/findbyid/{id}")
    public ResponseEntity<CagriFormu> findById(@PathVariable Long id){
        Optional<CagriFormu> optionalCagriFormu;
        try {
            optionalCagriFormu = cagriFormuService.findById(id);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optionalCagriFormu.get());
    }



    @GetMapping("/findall")
    public ResponseEntity<List<CagriFormu>> findAll(){
       return ResponseEntity.ok(cagriFormuService.findAll());
    }










}

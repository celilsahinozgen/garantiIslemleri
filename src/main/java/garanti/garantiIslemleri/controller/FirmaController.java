package garanti.garantiIslemleri.controller;

import garanti.garantiIslemleri.entity.Firma;
import garanti.garantiIslemleri.service.FirmaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/firma")
@RequiredArgsConstructor
public class FirmaController {
    private final FirmaService firmaService;

    @PostMapping("/save")
    public ResponseEntity<Firma> save(@RequestBody Firma firma) {
        if (firma.getId() != null) {
            ResponseEntity.badRequest().build();
        }
        firmaService.save(firma);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/update")
    public ResponseEntity<Firma> update(@RequestBody Firma firma) {
        if (firma.getId() == null) {
            ResponseEntity.badRequest().build();
        }
        firmaService.update(firma);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        try {
            firmaService.delete(id);
           return ResponseEntity.noContent().build();
        }catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Firma> findById(@PathVariable Long id){
        Optional<Firma> optionalFirma;
        try {
            optionalFirma = firmaService.findById(id);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optionalFirma.get());
    }
    @GetMapping("/findall")
    public ResponseEntity<List<Firma>> findAll(){
        return ResponseEntity.ok(firmaService.findAll());
    }
}

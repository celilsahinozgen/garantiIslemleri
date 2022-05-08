package garanti.garantiIslemleri.controller;


import garanti.garantiIslemleri.entity.Cihaz;
import garanti.garantiIslemleri.service.CihazService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/cihaz")
@RestController
public class CihazController {

    private final CihazService cihazService;

    @PostMapping
    public ResponseEntity<Cihaz> save(@RequestBody Cihaz cihaz) {
        if (cihaz.getId() != null) {
            ResponseEntity.badRequest().build();
        }
        cihazService.save(cihaz);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Cihaz> update(@RequestBody Cihaz cihaz){
        if (cihaz.getId() == null) {
            ResponseEntity.badRequest().build();
        }
        cihazService.update(cihaz);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping({"id"})
    public ResponseEntity<Void> delete (@PathVariable Long id){
        try {
            cihazService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping({"id"})
    public ResponseEntity<Cihaz> findById(@PathVariable Long id){
        Optional<Cihaz> optionalCihaz;
       try {
           optionalCihaz = cihazService.findById(id);
       } catch (RuntimeException e){
           return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok(optionalCihaz.get());
    }
    @GetMapping
    public ResponseEntity<List<Cihaz>> findAll() {
        return ResponseEntity.ok(cihazService.findAll());
    }


}

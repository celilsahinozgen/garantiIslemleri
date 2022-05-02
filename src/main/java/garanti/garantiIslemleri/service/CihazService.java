package garanti.garantiIslemleri.service;


import garanti.garantiIslemleri.entity.Cihaz;

import java.util.List;
import java.util.Optional;

public interface CihazService {

    Cihaz save(Cihaz cihaz);
    Cihaz update(Cihaz cihaz);
    void delete(Long id);
    Optional<Cihaz> findById(Long id);
    List<Cihaz> findAll();
}

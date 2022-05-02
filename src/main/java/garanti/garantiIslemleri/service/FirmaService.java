package garanti.garantiIslemleri.service;

import garanti.garantiIslemleri.entity.Firma;

import java.util.List;
import java.util.Optional;

public interface FirmaService {

    Firma save(Firma firma);
    Firma update(Firma firma);
    void delete(Long id);
    Optional<Firma> findById(Long id);
    List<Firma> findAll();
}

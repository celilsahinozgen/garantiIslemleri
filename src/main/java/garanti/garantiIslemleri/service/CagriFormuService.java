package garanti.garantiIslemleri.service;

import garanti.garantiIslemleri.entity.CagriFormu;

import java.util.List;
import java.util.Optional;

public interface CagriFormuService {

    CagriFormu save(CagriFormu cagriFormu);
    CagriFormu update(CagriFormu cagriFormu);
    void delete(Long id);
    Optional<CagriFormu> findById(Long id);
    List<CagriFormu> findAll();
}

package garanti.garantiIslemleri.service.impl;

import garanti.garantiIslemleri.entity.CagriFormu;
import garanti.garantiIslemleri.repository.CagriFormuRepository;
import garanti.garantiIslemleri.service.CagriFormuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CagriFormuServiceImpl implements CagriFormuService {

    private final CagriFormuRepository cagriFormuRepository;

    @Override
    public CagriFormu save(CagriFormu cagriFormu) {
        return cagriFormuRepository.save(cagriFormu);
    }

    @Override
    public CagriFormu update(CagriFormu cagriFormu) {
        return cagriFormuRepository.save(cagriFormu);
    }

    @Override
    public void delete(Long id) {
        cagriFormuRepository.deleteById(id);

    }

    @Override
    public Optional<CagriFormu> findById(Long id) {
        return cagriFormuRepository.findById(id);
    }

    @Override
    public List<CagriFormu> findAll() {
        return cagriFormuRepository.findAll();
    }
}

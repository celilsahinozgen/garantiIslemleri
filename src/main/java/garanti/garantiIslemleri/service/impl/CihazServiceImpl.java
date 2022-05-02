package garanti.garantiIslemleri.service.impl;

import garanti.garantiIslemleri.entity.Cihaz;
import garanti.garantiIslemleri.repository.CihazRepository;
import garanti.garantiIslemleri.service.CihazService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CihazServiceImpl implements CihazService {

    private final CihazRepository cihazRepository;

    @Override
    public Cihaz save(Cihaz cihaz) {
        return cihazRepository.save(cihaz);
    }

    @Override
    public Cihaz update(Cihaz cihaz) {
        return cihazRepository.save(cihaz);
    }

    @Override
    public void delete(Long id) {
        cihazRepository.deleteById(id);

    }

    @Override
    public Optional<Cihaz> findById(Long id) {
        return cihazRepository.findById(id);
    }

    @Override
    public List<Cihaz> findAll() {
        return cihazRepository.findAll();
    }
}

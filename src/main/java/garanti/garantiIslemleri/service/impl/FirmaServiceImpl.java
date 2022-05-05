package garanti.garantiIslemleri.service.impl;

import garanti.garantiIslemleri.entity.Firma;
import garanti.garantiIslemleri.repository.FirmaRepository;
import garanti.garantiIslemleri.service.FirmaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FirmaServiceImpl implements FirmaService {

    private final FirmaRepository firmaRepository;


    @Override
    public Firma save(Firma firma) {
        return firmaRepository.save(firma);

    }

    @Override
    public Firma update(Firma firma) {
        return firmaRepository.save(firma);
    }

    @Override
    public void delete(Long id) {
        firmaRepository.deleteById(id);
//        try {
//            Optional<Firma> item = firmaRepository.findById(id);
//            if (item.isPresent())
//            firmaRepository.delete(item.get());
//            return true;
//        }catch (Exception exception){
//            return false;
//        }

    }

    @Override
    public Optional<Firma> findById(Long id) {
        return firmaRepository.findById(id);
    }

    @Override
    public List<Firma> findAll() {
        return firmaRepository.findAll();
    }
}

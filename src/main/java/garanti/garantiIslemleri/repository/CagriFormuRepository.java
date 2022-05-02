package garanti.garantiIslemleri.repository;

import garanti.garantiIslemleri.entity.CagriFormu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CagriFormuRepository extends JpaRepository<CagriFormu ,Long> {
}

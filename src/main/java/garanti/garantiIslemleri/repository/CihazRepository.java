package garanti.garantiIslemleri.repository;

import garanti.garantiIslemleri.entity.Cihaz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CihazRepository  extends JpaRepository<Cihaz,Long> {


}

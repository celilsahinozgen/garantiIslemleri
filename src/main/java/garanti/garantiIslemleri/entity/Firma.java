package garanti.garantiIslemleri.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table( name ="tblfirma")
@Entity
@Builder
public class Firma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    String adres;
    String eposta;
    String telefon;
    String sorumlu;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "cihaz_id")
    @JsonIgnore
    List<Cihaz> cihaz;


}

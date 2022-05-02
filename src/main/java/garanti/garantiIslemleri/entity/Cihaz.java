package garanti.garantiIslemleri.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tblcihaz")
@Entity
@Builder
public class Cihaz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String marka;
    String model;
    String alinantarih;
    String garantibitis;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "firma_id",nullable = false)
    @JsonIgnore
    Firma firma;


}

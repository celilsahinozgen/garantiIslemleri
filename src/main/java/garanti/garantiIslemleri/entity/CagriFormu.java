package garanti.garantiIslemleri.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "tblcagriformu")
@Builder
public class CagriFormu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    int kisi_select;
    int firma_select;
    String arizatanimi;
    int marka_select;
    int model_select;
    String serinumarasi;


}

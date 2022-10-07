package entily;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productsId;
    private String productsName;
    private String productsPrice;
    private String productsQtd;
    private String productsCategory;

}

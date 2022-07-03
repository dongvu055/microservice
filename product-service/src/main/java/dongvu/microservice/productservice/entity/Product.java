package dongvu.microservice.productservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "product")
@Data
public class Product {

    @Id
    @Column(name = "id_product")
    private int productId;

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private String weight;

}

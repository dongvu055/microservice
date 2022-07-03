package dongvu.microservice.recommendationservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recommendation")
@Data
public class Recommendation {

    @Id
    @Column(name = "id_recommendation")
    private int recommendationId;

    @Column(name = "id_product")
    private int productId;

    @Column(name = "author")
    private String author;

    @Column(name = "rate")
    private String rate;

    @Column(name = "content")
    private String content;

}

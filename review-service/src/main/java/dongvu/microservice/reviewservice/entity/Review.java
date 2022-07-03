package dongvu.microservice.reviewservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "review")
@Data
public class Review {

    @Id
    @Column(name = "id_review")
    private int reviewId;

    @Column(name = "id_product")
    private int productId;

    @Column(name = "author")
    private String author;

    @Column(name = "content")
    private String content;

    @Column(name = "subject")
    private String subject;

}

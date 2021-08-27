package springdemojpa.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "new")
@Data
public class NewEntity extends BaseEntity{
    private String title;
    private String thumbnail;
    private String shortdescription;
    private String content;
    private String categorycode;

    @ManyToOne
    @JoinColumn(name = "categoryid")
    private CategoryEntity category;
}

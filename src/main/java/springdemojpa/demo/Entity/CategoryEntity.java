package springdemojpa.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
@Data
public class CategoryEntity extends BaseEntity {
    private String name;
    private String code;

    @OneToMany(
            mappedBy = "category"
    )
    private List<NewEntity> news = new ArrayList<>();
}

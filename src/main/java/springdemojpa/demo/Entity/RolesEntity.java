package springdemojpa.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "roles")
@Data
public class RolesEntity extends BaseEntity{
   private String name;
   private String code;

   @ManyToMany(mappedBy = "roles")
   private List<UserEntity> users = new ArrayList<>();
}

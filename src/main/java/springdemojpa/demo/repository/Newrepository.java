package springdemojpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springdemojpa.demo.Entity.NewEntity;

@Repository
public interface Newrepository extends JpaRepository<NewEntity,Long> {

}

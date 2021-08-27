package springdemojpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdemojpa.demo.Entity.CategoryEntity;

import java.util.Locale;

public interface Categoryrepository extends JpaRepository<CategoryEntity,Long> {
  CategoryEntity findOneByCode(String code);
}

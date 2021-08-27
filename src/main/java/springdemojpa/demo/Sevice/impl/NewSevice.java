package springdemojpa.demo.Sevice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdemojpa.demo.Entity.CategoryEntity;
import springdemojpa.demo.Entity.NewEntity;
import springdemojpa.demo.Sevice.INewSevice;
import springdemojpa.demo.convert.NewConvert;
import springdemojpa.demo.dto.NewDTO;
import springdemojpa.demo.repository.Categoryrepository;
import springdemojpa.demo.repository.Newrepository;

@Service
public class NewSevice implements INewSevice {
    @Autowired
    private Newrepository newrepository;

    @Autowired
    private Categoryrepository categoryrepository;

    @Autowired
    private NewConvert newConvert;

    @Override
    public NewDTO save(NewDTO newDTO) {
        CategoryEntity categoryEntity = categoryrepository.findOneByCode(newDTO.getCategorycode());
        NewEntity newEntity = newConvert.toEntity(newDTO);
        newEntity.setCategory(categoryEntity);
        newEntity = newrepository.save(newEntity);
        return newConvert.toDto(newEntity);
    }

    @Override
    public NewDTO update(NewDTO newDTO) {
        NewEntity oldEntity = newrepository.findOne(newDTO.getId());
        NewEntity newEntity = newConvert.toEntity(newDTO,oldEntity);
        CategoryEntity categoryEntity = categoryrepository.findOneByCode(newDTO.getCategorycode());
        newEntity.setCategory(categoryEntity);
        newEntity = newrepository.save(newEntity);
        return  newConvert.toDto(newEntity);
    }
}

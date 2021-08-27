package springdemojpa.demo.convert;

import org.springframework.stereotype.Component;
import springdemojpa.demo.Entity.NewEntity;
import springdemojpa.demo.dto.NewDTO;

@Component
public class NewConvert {
    public NewEntity toEntity(NewDTO newDTO) {
        NewEntity entity = new NewEntity();
        entity.setTitle(newDTO.getTitle());
        entity.setThumbnail(newDTO.getThumbnail());
        entity.setShortdescription(newDTO.getThumbnail());
        entity.setContent(newDTO.getContent());
        entity.setCategorycode(newDTO.getCategorycode());
        return entity;
    }

    public NewDTO toDto(NewEntity entity) {
        NewDTO newDTO = new NewDTO();
        newDTO.setTitle(entity.getTitle());
        newDTO.setThumbnail(entity.getThumbnail());
        newDTO.setShortdescription(entity.getThumbnail());
        newDTO.setContent(entity.getContent());
        newDTO.setCategorycode(entity.getCategorycode());
        return newDTO;
    }
    public NewEntity toEntity(NewDTO newDTO,NewEntity entity) {
        entity.setTitle(newDTO.getTitle());
        entity.setThumbnail(newDTO.getThumbnail());
        entity.setShortdescription(newDTO.getThumbnail());
        entity.setContent(newDTO.getContent());
        entity.setCategorycode(newDTO.getCategorycode());
        return entity;
    }
}

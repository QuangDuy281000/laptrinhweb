package springdemojpa.demo.Sevice;

import springdemojpa.demo.dto.NewDTO;

public interface INewSevice {
    NewDTO save(NewDTO newDTO);
    NewDTO update(NewDTO newDTO);
}

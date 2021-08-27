package springdemojpa.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springdemojpa.demo.Sevice.INewSevice;
import springdemojpa.demo.dto.NewDTO;

@CrossOrigin
@RestController
public class NewApi {
    @Autowired
    private INewSevice iNewSevice;
    @PostMapping("/new")
    public NewDTO createNew(@RequestBody NewDTO model){
        return iNewSevice.save(model);
    }

    @PutMapping("/new/{id}")
    public NewDTO updateNew(@RequestBody  NewDTO model,@PathVariable("id") Long id){

        return model;
    }

    @DeleteMapping("/new")
    public NewDTO deleteNew(@RequestBody  NewDTO model){
        return model;
    }
}

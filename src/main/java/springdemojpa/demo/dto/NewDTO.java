package springdemojpa.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewDTO extends AbtrackDTO<NewDTO>{
    private String title;
    private String thumbnail;
    private String shortdescription;
    private String content;
    private String categorycode;
}

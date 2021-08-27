package springdemojpa.demo.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class AbtrackDTO<T> {
    private Long id;
    private Date createddate;
    private Date modifieddate;
    private String createdby;
    private String modifiedb;
    private List<T> list = new ArrayList<>();
}

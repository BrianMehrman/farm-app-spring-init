package mehrman.demo.farmappspringinit.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class HarvestForm {

    private  Integer id;
    private String name;
    private Integer qty;
    private Float price;
    private String location;
    private String description;
    private  boolean status;
    private LocalDate deliveryDate;
    private  String type;
    private  String owner;
}

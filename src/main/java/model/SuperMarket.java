package model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class SuperMarket<address> {
    private int Supermarketid;
    private  String SuperMarketaddress;
    @Id
    private  double SuperMarketcash;
}

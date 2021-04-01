package com.supermarket.controller;
import com.supermarket.Repository.SuperMarketrepo;
import model.SuperMarket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SuperMarketcont {
    @Autowired//creation of object for repository
    private SuperMarketrepo marketrepo;

    @PostMapping
    public void createSuperMarketrecord(@RequestBody SuperMarket supermarket) {
        marketrepo.save(supermarket);
    }

    @GetMapping
    public  List<SuperMarket> getdetails() {

        List<SuperMarket> all = marketrepo.findAll();
        return all;
    }
}






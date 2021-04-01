package com.supermarket.Repository;

import model.SuperMarket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperMarketrepo extends MongoRepository<SuperMarket, Double> {
}

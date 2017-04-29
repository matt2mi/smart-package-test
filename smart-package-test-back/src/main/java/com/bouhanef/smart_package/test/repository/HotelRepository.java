package com.bouhanef.smart_package.test.repository;

import com.bouhanef.smart_package.test.model.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bouhanefhamdi on 29/04/2017.
 */
@Repository
public interface HotelRepository extends MongoRepository<Hotel, String> {
}

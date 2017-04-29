package com.bouhanef.smart_package.test.service;

import com.bouhanef.smart_package.test.model.Hotel;
import com.bouhanef.smart_package.test.model.StaticHotel;
import com.bouhanef.smart_package.test.repository.HotelRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;

/**
 * Created by bouhanefhamdi on 29/04/2017.
 */
@Service
public class HotelService {

    private HotelRepository repository;

    @Autowired
    public HotelService(HotelRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void init() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Hotel> result = mapper.readValue(StaticHotel.HOTELS, TypeFactory.defaultInstance().constructCollectionType(List.class, Hotel.class));
        repository.save(result);
    }

    public List<Hotel> getHotels() {
        return repository.findAll();
    }

}

package com.bouhanef.smart_package.test.controller;

import com.bouhanef.smart_package.test.model.Hotel;
import com.bouhanef.smart_package.test.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bouhanefhamdi on 29/04/2017.
 */
@RestController
@RequestMapping("api/hotel")
public class HotelController {

    private HotelService service;

    @Autowired
    public HotelController(HotelService service) {
        this.service = service;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Hotel> getHotels() {
        return service.getHotels();
    }

}

package com.sunil.service;

import com.sunil.entities.Camera;
import com.sunil.entities.Location;
import com.sunil.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public List<Location> listAll() {
        return locationRepository.findAll();
    }

    public void save(Location location) {
        locationRepository.save(location);
    }

    public Location get(long id) {
        return locationRepository.findById(id).get();
    }

    public void delete(long id) {
        locationRepository.deleteById(id);
    }
}

package com.sunil.service;

import com.sunil.entities.Vehicle;
import com.sunil.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;
    public List<Vehicle> listAll() {
        return vehicleRepository.findAll();
    }

    public void save(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    public Vehicle get(long id) {
        return vehicleRepository.findById(id).get();
    }

    public void delete(long id) {
        vehicleRepository.deleteById(id);
    }
}

package com.sunil.service;

import com.sunil.entities.Camera;
import com.sunil.repositories.CameraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CameraService {

    @Autowired
    private CameraRepository cameraRepository;

    public List<Camera> listAll() {
        return cameraRepository.findAll();
    }

    public void save(Camera camera) {
        cameraRepository.save(camera);
    }

    public Camera get(long id) {
        return cameraRepository.findById(id).get();
    }

    public void delete(long id) {
        cameraRepository.deleteById(id);
    }
}

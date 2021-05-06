package com.sunil.controller;

import com.sunil.entities.Camera;
import com.sunil.entities.Location;
import com.sunil.entities.Vehicle;
import com.sunil.service.CameraService;
import com.sunil.service.LocationService;
import com.sunil.service.UserService;
import com.sunil.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private LocationService locationService;
    @Autowired
    private CameraService cameraService;
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String home(@RequestParam("username") String username,
                       @RequestParam("password") String password){
        if (username.equals("admin") && password.equals("admin"))
        {
            return "home";
        }
        else
            return "login";
    }
    @RequestMapping("/add_location")
    public String showAddLocationPage(Model model) {
        Location location = new Location();
        model.addAttribute("location", location);

        return "add_location";
    }

    @RequestMapping("/add_camera")
    public String showAddCameraPAge(Model model) {
        Camera camera = new Camera();
        model.addAttribute("camera", camera);

        return "add_camera";
    }

    @RequestMapping("/add_vehicle")
    public String showAddVehiclePage(Model model) {
        Vehicle vehicle = new Vehicle();
        model.addAttribute("vehicle", vehicle);

        return "add_vehicle";
    }

    @RequestMapping(value = "/savecam", method = RequestMethod.POST)
    public String saveCamera(@ModelAttribute("camera") Camera camera) {
        cameraService.save(camera);

        return "redirect:/";
    }
    @RequestMapping(value = "/saveloc", method = RequestMethod.POST)
    public String saveLocation(@ModelAttribute("location") Location location) {
        locationService.save(location);

        return "redirect:/";
    }

    @RequestMapping(value = "/saveVehicle", method = RequestMethod.POST)
    public String saveVehicle(@ModelAttribute("vehicle") Vehicle vehicle) {
        vehicleService.save(vehicle);

        return "redirect:/";
    }
}

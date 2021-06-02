package com.example.demo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class SimCardController {
    @Autowired
    private SimCardService service;

    //To get all SimCards
    @GetMapping("/allSimCard")
    @JsonPropertyOrder({ "simId", "operatorCode", "country","status" })
    private List<SimCard> getAllSimCards()
    {

        return service.getAllSimCards();
    }

    //To get All SimCard Filtered by a Status
    @GetMapping("/allSimCardAW/{status}")
    @ResponseBody
    private List<SimCard> findByStatus(@PathVariable DeviceStatus status)
    {
        return service.findByStatus(status.name());
    }
    //Sort Sim Id Ascending Order
    @GetMapping("/sortAscById")
    @ResponseBody
    private List<SimCard> sortById()
    {

        return service.sortById();
    }
    //Get Sim card by Sim ID
    @GetMapping("/SimCardById/{SimId}")
    @ResponseBody
    private SimCard getSimCardById(@PathVariable("SimId") Long SimId)
    {
        return service.getSimCardById(SimId);
    }


    //Update Status with new Status
    //@PutMapping("/updateSimCard/{SimId}/{status}")
    @GetMapping("/updateSimCard/{SimId}/{status}")
    @ResponseBody
    private List<SimCard> updateSimC(@PathVariable("SimId") Long SimId,@PathVariable DeviceStatus status)
    {
        return service.updateSimCard(status.name(),SimId);
    }


    //Update Status by null
    @GetMapping("/updateSimCToNull/{SimId}")
    @ResponseBody
    private List<SimCard> updateSimCToNull(@PathVariable("SimId") Long SimId)
    {
        return service.updateSimCardStatusToNull(SimId);
    }

    //Delete Status
    //@DeleteMapping("/deleteSimCard/{SimId}/{status}")
    @GetMapping("/deleteSimCard/{SimId}/{status}")
    @ResponseBody
    private List<SimCard> deleteSimC(@PathVariable("SimId") Long SimId,@PathVariable DeviceStatus status)
    {
        return service.deleteSimCard(status.name(),SimId);
    }

}



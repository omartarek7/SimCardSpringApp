package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimCardService {
        @Autowired
        private  SimCardRepository repo;


    public List<SimCard> getAllSimCards()
    {
        return repo.findAll();
    }
    public List<SimCard> findByStatus(String status){
        if(status!=null){
            return repo.findByStatus(status);
        }
        return repo.findAll();
    }

    public List<SimCard> sortById(){

        return repo.sortById();
    }

    public SimCard getSimCardById(Long id)
    {
        try {
            return repo.findById(id).get();
        } catch (Exception e) {
            // do nothing or add action code
        }
        return repo.findById(id).get();
    }



    public List<SimCard> updateSimCard(String status, Long SimId){
        repo.updateSimCard(status,SimId);

        return null;
    }

    public List<SimCard> updateSimCardStatusToNull(Long SimId){
        repo.updateSimCardStatusToNull(SimId);
        return null;
    }

    public List<SimCard> deleteSimCard(String status, Long SimId){
        repo.deleteSimCard(status,SimId);

        return null;
    }



}

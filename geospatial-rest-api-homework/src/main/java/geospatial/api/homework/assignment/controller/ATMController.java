package geospatial.api.homework.assignment.controller;

import geospatial.api.homework.assignment.exception.ResourceNotFoundException;
import geospatial.api.homework.assignment.model.ATM;
import geospatial.api.homework.assignment.repository.ATMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by ManiSamani on 17/06/22.
 */
@RestController
@RequestMapping("/api")
public class ATMController {

    @Autowired
    ATMRepository ATMRepository;

    @GetMapping("/atm")
    public List<ATM> getAllNotes() {
        return ATMRepository.findAll();
    }

    @PostMapping("/atm")
    public ATM createNote(@Valid @RequestBody ATM atm) {
        return ATMRepository.save(atm);
    }

    @GetMapping("/atm/{id}")
    public ATM getATMById(@PathVariable(value = "id") Long ATMId) {
        return ATMRepository.findById(ATMId)
                .orElseThrow(() -> new ResourceNotFoundException("ATM", "id", ATMId));
    }

    @PutMapping("/atm/{id}")
    public ATM updateATM(@PathVariable(value = "id") Long ATMId,
                         @Valid @RequestBody ATM ATMDetails) {

        ATM atm = ATMRepository.findById(ATMId)
                .orElseThrow(() -> new ResourceNotFoundException("ATM", "id", ATMId));

        atm.setProvider(ATMDetails.getProvider());
        atm.setAddress(ATMDetails.getAddress());

        ATM updatedATM = ATMRepository.save(atm);
        return updatedATM;
    }

    @DeleteMapping("/atm/{id}")
    public ResponseEntity<?> deleteATM(@PathVariable(value = "id") Long atmId) {
        ATM atm = ATMRepository.findById(atmId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "id", atmId));

        ATMRepository.delete(atm);

        return ResponseEntity.ok().build();
    }
}

package se.iths.flightplanning.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.iths.flightplanning.entity.CancellationProtectionEntity;
import se.iths.flightplanning.service.CancellationProtectionService;

@RestController
@RequestMapping("cancel")
public class CancellationProtectionController {

    private final CancellationProtectionService cancellationProtectionService;

    public CancellationProtectionController(CancellationProtectionService cancellationProtectionService){
        this.cancellationProtectionService = cancellationProtectionService;
    }

    @PostMapping
    public ResponseEntity<CancellationProtectionEntity> createCancellationProtection(@RequestBody CancellationProtectionEntity cancellationProtectionEntity){
        CancellationProtectionEntity createProtection = cancellationProtectionService.createProtection(cancellationProtectionEntity);

        return new ResponseEntity<>(createProtection ,HttpStatus.CREATED);
    }

    @GetMapping
    public  ResponseEntity<Iterable<CancellationProtectionEntity>> findAllProtections(){
        Iterable<CancellationProtectionEntity> allProtection = cancellationProtectionService.findAllProtection();
        return new ResponseEntity<>(allProtection, HttpStatus.OK);
    }
}

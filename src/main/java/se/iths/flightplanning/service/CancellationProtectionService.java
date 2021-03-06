package se.iths.flightplanning.service;

import org.springframework.stereotype.Service;
import se.iths.flightplanning.entity.CancellationProtectionEntity;
import se.iths.flightplanning.repository.CancellationProtectionRepository;


@Service
public class CancellationProtectionService {
    private final CancellationProtectionRepository cancellationProtectionRepository;

    public CancellationProtectionService(CancellationProtectionRepository cancellationProtectionRepository){
        this.cancellationProtectionRepository = cancellationProtectionRepository;
    }
    public CancellationProtectionEntity createProtection(CancellationProtectionEntity cancellationProtectionEntity){
        return cancellationProtectionRepository.save(cancellationProtectionEntity);
    }

    public Iterable<CancellationProtectionEntity>findAllProtection(){
        return cancellationProtectionRepository.findAll();
    }
}

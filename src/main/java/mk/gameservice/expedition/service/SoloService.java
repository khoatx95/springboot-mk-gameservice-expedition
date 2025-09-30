package mk.gameservice.expedition.service;

import org.springframework.stereotype.Service;

import mk.gameservice.expedition.model.Solo;
import mk.gameservice.expedition.repository.SoloRepositoryMongoDB;

@Service
public class SoloService {
  private final SoloRepositoryMongoDB soloRepository;
  
  public SoloService(SoloRepositoryMongoDB soloRepository) {
    this.soloRepository = soloRepository;
  }

  public Solo create(String userId, String code) {
    Solo solo = new Solo(userId, code, System.currentTimeMillis());
    soloRepository.save(solo);
    return solo;
  }
}

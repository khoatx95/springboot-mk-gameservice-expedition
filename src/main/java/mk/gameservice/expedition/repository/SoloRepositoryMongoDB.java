package mk.gameservice.expedition.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import mk.gameservice.expedition.model.Solo;

public interface SoloRepositoryMongoDB extends MongoRepository<Solo, String> {}

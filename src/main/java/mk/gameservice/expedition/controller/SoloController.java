package mk.gameservice.expedition.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mk.gameservice.expedition.dto.CreateSoloDTO;
import mk.gameservice.expedition.dto.SoloDTO;
import mk.gameservice.expedition.model.Solo;
import mk.gameservice.expedition.service.SoloService;

@RestController
@RequestMapping("/expedition/users/{userId}/solos")
public class SoloController {
  private final SoloService soloService;

  public SoloController(SoloService soloService) {
    this.soloService = soloService;
  }

  @PostMapping()
  public SoloDTO create(@PathVariable String userId, @RequestBody CreateSoloDTO body) {
    Solo solo = soloService.create(userId, body.code());
    return new SoloDTO(solo);
  }
}

package mk.gameservice.expedition.dto;

import mk.gameservice.expedition.model.Solo;

public class SoloDTO {
  public final String id;
  public final String code;
  public final Long endTime;

  public SoloDTO(Solo solo) {
    this.id = solo.id();
    this.code = solo.code;
    this.endTime = solo.endTime;
  }
}

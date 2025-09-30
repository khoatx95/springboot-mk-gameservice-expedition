package mk.gameservice.expedition.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "solos")
public class Solo {
  @Id
  private String id;
  public final String userId;
  public final String code;
  public final Long endTime;

  public Solo(String userId, String code, Long endTime) {
    this.userId = userId;
    this.code = code;
    this.endTime = endTime;
  }

  public String id() {
    return this.id;
  }
}

package lana.thingwebservice.thing;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Thing {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String description;

    private String generic;
}

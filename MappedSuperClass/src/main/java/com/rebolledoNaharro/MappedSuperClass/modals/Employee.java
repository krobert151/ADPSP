package com.rebolledoNaharro.MappedSuperClass.modals;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee extends Person {

    private String puesto;

}

package com.ennaoumi.ams.entities;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@Entity
public class Planning {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalTime startMorning;
    private LocalTime endMorning;
    private LocalTime startAfternoon;
    private LocalTime endAfternoon;
    private Integer duration;



}

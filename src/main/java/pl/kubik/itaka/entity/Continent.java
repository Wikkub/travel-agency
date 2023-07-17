package pl.kubik.itaka.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}

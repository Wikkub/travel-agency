package pl.kubik.itaka.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "counties")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne()
    private Continent continent;
}

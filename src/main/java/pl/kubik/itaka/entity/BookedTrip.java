package pl.kubik.itaka.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "booked_trips")
public class BookedTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    private Trip trip;
    private String participants;
}

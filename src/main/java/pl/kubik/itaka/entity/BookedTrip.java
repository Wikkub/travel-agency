package pl.kubik.itaka.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.kubik.itaka.dto.CreateBookedTripDto;

@Entity
@Table(name = "booked_trips")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BookedTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    private Trip trip;
    private String participants;

    public BookedTrip(CreateBookedTripDto dto) {
        this.participants = dto.getParticipants();
    }
}

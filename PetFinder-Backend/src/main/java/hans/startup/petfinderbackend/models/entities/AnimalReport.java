package hans.startup.petfinderbackend.models.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "animal_report")
@Data
public class AnimalReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer animalReportId;
    private String reporterName;
    private String reporterEmail;
    private LocalDateTime reportedDate;
    private String note;

    @ManyToOne
    @JoinColumn(name = "animal_id", referencedColumnName = "animalId")
    private Animal animal;
}

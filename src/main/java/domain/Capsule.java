package domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "capsules")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Capsule {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private String title;

    private String message;

    private LocalDateTime openningDate;

    private String urlFileImage;

    private CapsuleType capsuleType;

    private Integer daysReminder;

}

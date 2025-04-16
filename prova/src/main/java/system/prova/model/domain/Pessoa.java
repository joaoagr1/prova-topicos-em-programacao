package system.prova.model.domain;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "pessoas")
@Data
@NoArgsConstructor
@Getter
@Setter
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private int age;

    @ManyToOne
    @Nullable
    @JoinColumn(name = "emprego_id", nullable = false)
    private Emprego emprego;

    public Pessoa(Long id, String name, int age, @Nullable Emprego emprego) {
        this.id = id;
        this.name = name;
        this.age = age;

        if(Objects.isNull(emprego)){
            this.emprego = new Emprego();
        } else {
            this.emprego = emprego;
        }

    }
}


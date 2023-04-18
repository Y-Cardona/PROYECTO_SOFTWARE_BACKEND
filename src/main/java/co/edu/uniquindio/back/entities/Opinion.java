package co.edu.uniquindio.back.entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
public class Opinion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOpinion;

    private int idItem;

    private int idEstudiante;

    @Column (nullable = false)
    private int valoracion;

    public Opinion() {
    }

    public Opinion(int idItem, int idEstudiante, int valoracion) {
        this.idItem = idItem;
        this.idEstudiante = idEstudiante;
        this.valoracion = valoracion;
    }
}
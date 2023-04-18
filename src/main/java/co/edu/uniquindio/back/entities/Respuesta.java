package co.edu.uniquindio.back.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table (name = "Respuesta")
@Getter
@Setter
public class Respuesta {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idRespuesta;

    private int idPregunta;


    private int idEstudiante;

    @Column (nullable = false)
    private int valoracion;
    public Respuesta() {
    }

    public Respuesta(int idPregunta, int idEstudiante, int valoracion) {
        this.idPregunta = idPregunta;
        this.idEstudiante = idEstudiante;
        this.valoracion = valoracion;
    }
}

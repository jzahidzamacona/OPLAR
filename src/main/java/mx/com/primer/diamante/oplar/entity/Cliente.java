package mx.com.primer.diamante.oplar.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "tbl_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int cliente_id;
    private String nombre;
    private String apellidop;
    private String apellidom;
}

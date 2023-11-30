package org.uv.tpcs_practica04.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author miran
 */
@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "cliente_id_seq")
    @SequenceGenerator(name="cliente_id_seq",sequenceName = "cliente_id_seq",initialValue = 1, allocationSize = 1)
    @Column(name="id")
    private long idCliente;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="rfc")
    private String rfc;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy = "cliente")
    private List<Venta> ListVenta;
    

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public List<Venta> getListVenta() {
        return ListVenta;
    }

    public void setListVenta(List<Venta> ListVenta) {
        this.ListVenta = ListVenta;
    }
    
    
}

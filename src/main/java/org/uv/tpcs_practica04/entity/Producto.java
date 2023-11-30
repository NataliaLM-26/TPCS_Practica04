package org.uv.tpcs_practica04.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author miran
 */
@Entity
@Table(name="producto")
public class Producto implements Serializable{
    @Id
    @GeneratedValue(generator = "producto_id_seq", strategy=GenerationType.SEQUENCE)
    @SequenceGenerator(name = "producto_id_seq",sequenceName = "producto_id_seq",initialValue = 1, allocationSize = 1)
    @Column(name="id")
    private long idProducto;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="existencia")
    private Integer existencia;
    
    @Column(name="precio")
    private double precio;

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}

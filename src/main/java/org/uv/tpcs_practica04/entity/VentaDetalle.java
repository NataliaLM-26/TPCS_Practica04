package org.uv.tpcs_practica04.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author miran
 */
@Entity
@Table(name="det_venta")
public class VentaDetalle implements Serializable{
     @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "cliente_id_seq")
    @SequenceGenerator(name="cliente_id_seq",sequenceName = "cliente_id_seq",initialValue = 1, allocationSize = 1)
    @Column(name="idDetalleVenta")
    private long idDetalleVenta;
     
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_venta",referencedColumnName = "id")
    private Venta venta;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_producto",referencedColumnName = "id")
    private Producto producto;
    
    @Column(name="cantidad")
    private Integer cantidad;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="precio")
    private double precio;

    public long getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(long idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}

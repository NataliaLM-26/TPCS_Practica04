package org.uv.tpcs_practica04.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
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

/*@author miran*/
@Entity
@Table(name="venta")
public class Venta implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="det_venta_idDetalleVenta_seq")
    @SequenceGenerator(name="det_venta_idDetalleVenta_seq",sequenceName = "det_venta_idDetalleVenta_seq",initialValue = 1, allocationSize = 1)
    @Column(name="id")
    private long idVenta;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_cliente",referencedColumnName = "id")
    private Cliente cliente;
    
    @Column(name="fecha")
    private Date fecha;
    
    @Column(name="total")
    private BigDecimal total;

    public long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(long idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    
}

package org.uv.tpcs_practica04;

import java.math.BigDecimal;
import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.uv.tpcs_practica04.entity.Cliente;
import org.uv.tpcs_practica04.entity.Producto;
import org.uv.tpcs_practica04.entity.Venta;
import org.uv.tpcs_practica04.entity.VentaDetalle;

/**
 *
 * @author miran
 */
public class TPCS_Practica04 {

    public static void main(String[] args) {
       // Session session = HibernateUtil.getSessionFactory().openSession();
        //Transaction transaction=session.beginTransaction();
        
//producto
//        Producto p1=new Producto();
//        p1.setNombre("Jabon");
//        p1.setExistencia(10);
//        p1.setPrecio(10);
//        p1.setDescripcion("Jabon en barra");
//        session.save(p1);
//        
//        Producto p2=new Producto();
//        p2.setNombre("Papel");
//        p2.setExistencia(10);
//        p2.setPrecio(10);
//        p2.setDescripcion("Papel higiénico");
        //session.save(p2);
        
//        Cliente cliente=new Cliente();
//        cliente.setNombre("Natalia");
//        cliente.setRfc("LOMN");
//        
//        session.save(cliente);
        

//        Cliente c1= new Cliente();
//        c1.setIdCliente(1);
//        
//        Venta venta = new Venta();
//        venta.setCliente(c1);
//        venta.setFecha(new Date(new java.util.Date().getTime()));
//        venta.setTotal(new BigDecimal(20));
//        
//        session.save(venta);

//consulta
        
//        Cliente c2= session.get(Cliente.class, 1L);
//        //Cliente c2= session.load(Cliente.class, 2L);
//        if (c2!=null){
//            System.out.println("ID"+c2.getIdCliente()+ "Nombre" +c2.getNombre()+"RFC" +c2.getRfc());
//        }else{
//            System.out.println("No existe");
//        }

//venta
//        Venta c2=session.get(Venta.class, 1L);
//        if (c2!=null){
//            System.out.println("ID"+c2.getIdVenta()+ "Fecha" +c2.getFecha().toString()+"Total" +c2.getTotal()
//                    +"Cliente"+c2.getCliente().getNombre());
//        }else{
//            System.out.println("No existe");
//        }
        
        
//        Cliente c=session.get(Cliente.class,1L);
//        if(c!=null){
//            System.out.println("RFC: "+c.getRfc()+"Nombre: "+c.getNombre()+"Ventas: "+c.getListVenta().size());
//            if(c.getListVenta().size()>0){
//                List<Venta> lstVenta=c.getListVenta();
//                for(Venta venta :lstVenta){
//                    System.out.println("venta"+venta.getIdVenta()+"Total:"+venta.getTotal());
//                }
//            }
//        }


//        Cliente c1= new Cliente();
//        c1.setIdCliente(1);
//        
//        Venta v1 = new Venta();
//        v1.setCliente(c1);
//        v1.setFecha(new Date(new java.util.Date().getTime()));
//        v1.setTotal(new BigDecimal(15));
//        session.save(v1);
//        
//        Producto p=session.get(Producto.class, 1L);
//        if(p!=null){
//            VentaDetalle d1=new VentaDetalle();
//            d1.setProducto(p);
//            d1.setDescripcion(p.getDescripcion());
//            d1.setCantidad(1);
//            d1.setPrecio(p.getPrecio());
//            d1.setVenta(v1);
//            session.save(d1);
//        }
//        
//        
//        Producto p2=session.get(Producto.class, 1L);
//        if(p2!=null){
//            VentaDetalle d2=new VentaDetalle();
//            d2.setProducto(p2);
//            d2.setDescripcion(p2.getDescripcion());
//            d2.setCantidad(1);
//            d2.setPrecio(p2.getPrecio());
//            d2.setVenta(v1);
//            session.save(d2);
//        }
        

       // transaction.commit();
        
       // session.close();
        System.out.println("Hello World!");
    }
}

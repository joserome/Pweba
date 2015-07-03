/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author T-107
 */
public class TestPojos {

   
    public static void main(String[] args)throws Exception{
    
        System.out.println("Probaremos las operaciones SQL");
        //Paso 1  crear el SessionFactory
        
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
        
        //Obtenemos la apertura de sesion actual
        Session sesion= factory.openSession();
        //Creamos la transaccion(evita que 2 usuarios abran la sesion al mismo tiempo)
        Transaction tranza= sesion.beginTransaction();
        

                /*

                //Nos apuramos a hacer una transaccion(insercion,update, delete, select all, select id)
                    //Insertar
                Usuario u=new Usuario();
                u.setEmail("juanmartinez.jimenez@hotmail.com");
                u.setNombre("Juan Manuel");
                u.setLogin("juanm");
                u.setPassword("12345");
                
                sesion.save(u);
                //Liberar la transaccion y despues cerrar la sesion 
                tranza.commit();
                sesion.close();
        
        
      
                
                System.out.println("Se inserto correctamente  tu registro");
                
                */
        
        
       
        
        
        
      /*  
            //Actualizar
        Usuario u=new Usuario();
                u.setId(1);
                u.setEmail("jm@hotmail.com");
                u.setNombre("jose");
                u.setLogin("raton");
                u.setPassword("vaquero");
                sesion.update(u);
                tranza.commit();
                sesion.close();
                
                
         System.out.println("Se actualizo correctamente");
              
         */
        
        
       /* 
            //select por id
                //Buscar
       
        Usuario u= (Usuario)sesion.createCriteria(Usuario.class)
                .add(Restrictions.idEq(3)).uniqueResult();
        
                tranza.commit();
                sesion.close();
                System.out.println("El usuario buscado tiene nombre: "+ u.getNombre());
       */
       /*
               //Mostrar por lista
       List<Usuario> usuarios= sesion.createCriteria(Usuario.class).list();
                
        
                tranza.commit();
                sesion.close();
                for(Usuario usu:usuarios){
                System.out.println("El usuario buscado tiene nombre: "+ usu.getNombre());
                }
 */
        
        Usuario u=new Usuario();
                u.setEmail("guapo@hot.com");
                u.setNombre("cuaco");
                u.setLogin("cuacooo");
                u.setPassword("9874");
                
                /*sesion.save(u);
                //Liberar la transaccion y despues cerrar la sesion 
                tranza.commit();
                sesion.close();*/
                
                DAOUsuario daou=new DAOUsuario();
                daou.guardar(u);
        
        
      
                
                System.out.println("Se inserto correctamente  tu registro");
        
    } 
       
    
    
}

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

/**
 *
 * @author T-107
 */
public class DAOAdministracion {

    //Ponemos static para que se cargen inmediatamente antes de iniciar sesion.
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    
    public static void abrirSesion(){
        factory= HibernateUtilidades.getSessionFactory();
        session= factory.openSession();
        tranza= session.beginTransaction();
    
    }
    
    public static void cerrarTodo(){
        tranza.commit();
        session.close();
        
    }
    
    public DAOAdministracion(){
    
    }
    
    //Creamos el insert
    public void guardar(Administracion u)throws Exception{
        //Aqui poner el codigo de tu guardado
        //despues invocas el metodo cerrar todo
        session.save(u);
        cerrarTodo();
    }
    
    //Creamos un update
    public void actualizar(Administracion u)throws Exception{
        session.update(u);
        cerrarTodo();
        
    }
    
    //Creamos el buscar todos
    public List<Administracion> buscarTodos()throws Exception{
    
        return null;
    }
    
    //Creamos el buscar por ID
    public Administracion buscarPorId(Integer id)throws Exception{
    
        return null;
    }
    
    //Creamos el de autenticar
    public boolean autenticar(Administracion u)throws Exception{
    
        return false;
    }
}

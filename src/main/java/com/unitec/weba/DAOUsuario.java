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
public class DAOUsuario {

    //Ponemos static para que se cargen inmediatamente antes de iniciar sesion.
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    
    public void abrirSesion(){
        factory= HibernateUtilidades.getSessionFactory();
        session= factory.openSession();
        tranza= session.beginTransaction();
    
    }
    
    public static void cerrarTodo(){
        tranza.commit();
        session.close();
        
    }
    
    public DAOUsuario(){
    
    }
    
    //Creamos el insert
    public void guardar(Usuario u)throws Exception{
        //Aqui poner el codigo de tu guardado
        //despues invocas el metodo cerrar todo
        session.save(u);
        cerrarTodo();
    }
    
    //Creamos un update
    public void actualizar(Usuario u)throws Exception{
        session.update(u);
        cerrarTodo();
        
    }
    
    //Creamos el buscar todos
    public List<Usuario> buscarTodos()throws Exception{
        abrirSesion();
        List<Usuario> usuarios = session.createCriteria(Usuario.class).list();
        return usuarios;
    }
    
    //Creamos el buscar por ID
    public Usuario buscarPorId(Integer id)throws Exception{
    
        return null;
    }
    
    //Creamos el de autenticar
    public boolean autenticar(Usuario u)throws Exception{
    
        return false;
    }
}

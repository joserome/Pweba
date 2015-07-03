/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T-107
 */
public class ServletAutenticar extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String login= request.getParameter("login");
        String password=request.getParameter("password");
        String ip=request.getRemoteAddr();
        Date fecha=Calendar.getInstance().getTime();
                  
        //buscar aqui el usuario cuyo login y password se proporcionaron
        //una vez buscado, verificar su id,suponiendo que es 1
        Usuario u1=new Usuario();
                u1.setId(1);
        //despues de esto guardar la sesion con la clase Administracion
        Administracion a=new Administracion ();
        a.setFecha(fecha);
        a.setId(u1);
        a.setIp(ip);
        DAOAdministracion daoadmon=new DAOAdministracion();
        try {
        daoadmon.guardar(a);
        } catch (Exception ex) {
            
        }
                
        //Creeamos un model 
        Usuario u = new Usuario();
        //Ajustamos su login y password
            u.setLogin(login);
            u.setPassword(password);
            
        //Redireccionamos el servlet
            ModeloAutenticar modelo=new ModeloAutenticar();
            
            if(modelo.autenticar(u)){
                      
            RequestDispatcher despachador=request.getRequestDispatcher("/bienvenido.jsp");
            despachador.forward(request, response);
            }else{
            RequestDispatcher despachador=request.getRequestDispatcher("/error.jsp");
            despachador.forward(request, response);
            }
            
            
    }
}
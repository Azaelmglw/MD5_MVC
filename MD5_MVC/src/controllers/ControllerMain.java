package controllers;

import models.*;
import views.*;

/**
 *
 * @author Azaelmglw
 */

public class ControllerMain {
    
    private final ModelMain model_main;
    private final ModelVerificacionUsuario model_verificacion_usuario;
    private final ViewMain view_main;
    private final ViewVerificacionUsuario view_verificacion_usuario;
    private final ViewAdmin view_admin;
    private final ViewVendedor view_vendedor;
    
    public ControllerMain(Object[] models, Object[] views){
        this.model_main = (ModelMain)models[0];
        this.model_verificacion_usuario = (ModelVerificacionUsuario)models[1];
        this.view_main = (ViewMain)views[0];
        this.view_verificacion_usuario = (ViewVerificacionUsuario)views[1];
        this.view_admin = (ViewAdmin)views[2];
        this.view_vendedor = (ViewVendedor)views[3];
        initView();
    }
    
    public void initView(){
        Definir_Action_Listeners();
        view_main.setTitle("MD5_MVC");
        view_main.jmi_admin.setVisible(false);
        view_main.jmi_vendedor.setVisible(false);
        view_main.setLocationRelativeTo(null);
        view_main.setVisible(true);
    } 
    
    public void Definir_Action_Listeners(){
        view_main.jmi_verificacion_usuario.addActionListener(e -> jmi_verificacion_usuarioMouseClicked());
        view_main.jmi_admin.addActionListener(e -> jmi_adminMouseClicked());
        view_main.jmi_vendedor.addActionListener(e -> jmi_vendedorMouseClicked());
        view_main.jmi_salir.addActionListener(e -> jmi_salirMouseClicked());
    }
    
    public void jmi_verificacion_usuarioMouseClicked(){
        view_main.setContentPane(view_verificacion_usuario);
        view_main.revalidate();
        view_main.repaint();
    }
    
    public void jmi_adminMouseClicked(){
        view_main.setContentPane(view_admin);
        view_main.revalidate();
        view_main.repaint();
    }
    
    public void jmi_vendedorMouseClicked(){
        view_main.setContentPane(view_vendedor);
        view_main.revalidate();
        view_main.repaint();
    }
    
    public void jmi_salirMouseClicked(){
        System.exit(0);
    }
}
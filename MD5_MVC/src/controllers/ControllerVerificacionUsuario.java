package controllers;

import models.ModelVerificacionUsuario;
import views.ViewMain;
import views.ViewVerificacionUsuario;

/**
 *
 * @author Azaelmglw
 */

public class ControllerVerificacionUsuario {
    
    private final ModelVerificacionUsuario model_verificacion_usuario;
    private final ViewMain view_main;
    private final ViewVerificacionUsuario view_verificacion_usuario;
    private final ControllerMain controller_main; 
    
    public ControllerVerificacionUsuario(Object[] models, Object[] views, Object[] controllers){
        this.model_verificacion_usuario = (ModelVerificacionUsuario)models[1];
        this.view_main = (ViewMain)views[0];
        this.view_verificacion_usuario = (ViewVerificacionUsuario)views[1];
        this.controller_main = (ControllerMain)controllers[0];
        initView();
    }
    
    public void initView(){
        Definir_Action_Listeners();
    }
    
    public void Definir_Action_Listeners(){
        view_verificacion_usuario.jbtn_iniciar.addActionListener(e -> jbtn_iniciarMouseClicked());
    }
    
    public void setDatos(){
        model_verificacion_usuario.setUsuario(view_verificacion_usuario.jtf_usuario.getText());
        model_verificacion_usuario.setContraseña_Usuario(view_verificacion_usuario.jpwd_contraseña.getPassword());
    }
    
    public void jbtn_iniciarMouseClicked(){
        setDatos();
        model_verificacion_usuario.Verificar_Usuario();
        model_verificacion_usuario.Verificar_Tipo_Usuario();
        if(model_verificacion_usuario.getTipo_Usuario().equals("Admin")){
            view_main.jmi_admin.setVisible(true);
            view_main.jmi_vendedor.setVisible(false);
        }
        else{
            view_main.jmi_vendedor.setVisible(true);
            view_main.jmi_admin.setVisible(false);
        }
        view_verificacion_usuario.jtf_usuario.setText("");
        view_verificacion_usuario.jpwd_contraseña.setText("");
    }
}
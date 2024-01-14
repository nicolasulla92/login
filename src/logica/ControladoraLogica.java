package logica;

import java.util.ArrayList;
import persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia ctrlPersis = new ControladoraPersistencia();
    
    public void crarUsuario (User usuario){
        ctrlPersis.crearUsuario(usuario);
    }

    public String validarUsuario(User usuario) {
        String mensaje = null;
        ArrayList<User> usuarios = new ArrayList<User>(ctrlPersis.traerUsuarios());
        for(User usuario2 : usuarios){
            if(usuario2.getUser().equals(usuario.getUser())){
                if(usuario2.getPassword().equals(usuario.getPassword())){
                    mensaje = "Usted ha ingresado correctamente!!!!! La puta que lo pario!!!!!";
                    break;
                }else{
                    mensaje = "Contraseña invalida";
                    break;
                }
            }else{
                mensaje = "Usuario invalido";
            }
        }
        return mensaje;
    }
}

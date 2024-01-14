package persistencia;

import java.util.ArrayList;
import java.util.List;
import logica.User;

public class ControladoraPersistencia {
    
    UserJpaController jpaUser = new UserJpaController();
    
    public void crearUsuario (User usuario){
        jpaUser.create(usuario);
    }

    public ArrayList<User> traerUsuarios() {
        List<User> listita = jpaUser.findUserEntities();
        ArrayList<User> listaUsuarios = new ArrayList<>(listita);
        return listaUsuarios;
    }
    
}


package login;

import igu.PrincipalLogin;
import logica.ControladoraLogica;
import logica.User;


public class Login {

    
    public static void main(String[] args) {
        
        ControladoraLogica ctrlLogica = new ControladoraLogica();
        
        /*User usuario = new User(0, "adfgsdfsdfgsdfsdfmin", "123Prsdfsdfgsdfsdfgsdfgsdfsdfueba");
        ctrlLogica.crarUsuario(usuario);*/
        PrincipalLogin login = new PrincipalLogin();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        
    }
    
}

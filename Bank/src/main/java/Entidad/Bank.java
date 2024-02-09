package Entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

    private List<UserAccount> users;

    public Bank() {
        users = new ArrayList<>();
    }

    public List<UserAccount> getUsers() {
        return users;
    }

    public void setUsers(List<UserAccount> users) {
        this.users = users;
    }

    //Método para crear usuarios
    Scanner leer = new Scanner(System.in);
    public void createUser() {
    UserAccount ua = new UserAccount();
        System.out.println("Ingrese el nombre de Usuario");
        ua.setUser(leer.next());
        System.out.println("Ingrese la contrasena");
        ua.setPassword(leer.next());
        users.add(ua);

    }
    
    public void showUsers(){
        for (UserAccount u: users
             ) {
            System.out.println(u);

        }
        
    }

    public void factory(){

        String res;
        do {
            System.out.println("Crear usuario");
            createUser();
            System.out.println("Usuario creado con éxito");
            System.out.println("Desea agregar otro usuario (s/n)");
            res = leer.next();
        }while(res.equalsIgnoreCase("s"));




    }
}

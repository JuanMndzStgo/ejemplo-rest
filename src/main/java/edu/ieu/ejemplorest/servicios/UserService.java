package edu.ieu.ejemplorest.servicios;

import java.util.List;

import edu.ieu.ejemplorest.entities.Usuario;

public interface UserService {
	
	Usuario findById(long id);
    Usuario findByNombre(String name);
    
    List<Usuario> findAll(); 
    public boolean isUserExist(Usuario user);
    
    void saveUser(Usuario user);
    
    void updateUser(Usuario user);
    
    void deleteUserById(long id);
    
}

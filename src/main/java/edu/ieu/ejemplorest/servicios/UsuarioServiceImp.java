package edu.ieu.ejemplorest.servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ieu.ejemplorest.entities.Usuario;
import edu.ieu.ejemplorest.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServiceImp implements UserService{
	@Autowired
	private UsuarioRepositorio userDao;
	
	//	private static final AtomicLong counter = new AtomicLong();
//    private static List<Usuario> users;
//	
//    static{
//        users = populateDummyUsers();
//    }
//    
//	private static List<Usuario> populateDummyUsers() {
//		List<Usuario> users = new ArrayList<Usuario>();
//        users.add(new Usuario( (int)counter.incrementAndGet(),"sam@email.com","sam", "Sam", "Simpson"));
//        users.add(new Usuario( (int)counter.incrementAndGet(),"tom@email.com", "tom", "Tom", "Smith"));
//        users.add(new Usuario( (int)counter.incrementAndGet(),"jrome@email.com","jor", "Jerome", "Blatzi"));
//        users.add(new Usuario( (int)counter.incrementAndGet(),"silvia@email","sil", "Silvia", "Romero"));
//        return users;
}
    
	@Override
	public Usuario findById(long id) {
		return userDao.findById((int)id).orElse(null);
//Optional<Usuario> userDao.findById(id);
		
//		if (opt.isPresent()) {
//		return opt.get();
//		}else {
//			return null;
//		for(Usuario user : users){
//            if(user.getId() == id){
//                return user;
//            }
//        }
//        return null;
	}

	@Override
	public Usuario findByNombre(String name) {
		userDao.findByNombre(name);
		return userDao.findByNombre(name);
//		for(Usuario user : users){
//            if(user.getNombre().equalsIgnoreCase(name)){
//                return user;
//            }
//        }
   //     return null;
	}

	@Override
	public List<Usuario> findAll() {
		List<Usuario> lista = new ArrayList<>();
		userDao.findAll()
		.forEach(lista::add	);
			return lista;
		//	return users;
	}

	@Override
	public boolean isUserExist(Usuario user) {	
		return userDao.existsById(user.getId());
		//return findByNombre(user.getNombre()) != null;
	}

	@Override
	public void saveUser(Usuario user) {
		userDao.save(user);
//		user.setId((int) counter.incrementAndGet());
//        users.add(user);
//		
	}

	@Override
	public void updateUser(Usuario user) {
		Usuario userdb = userDao.findById(user.getId()).orElse(null);
		if(userdb!= null) {
			userdb.setApellidos(user.getApellidos());
			userdb.setEmail(user.getEmail());
			userdb.setNombre(user.getNombre());
			userdb.setPassword(user.getPassword());
			userDao.save(user);
//		int index = users.indexOf(user);
//        users.set(index, user);
	}

	@Override
	public void deleteUserById(long id) {
//		for (Iterator<Usuario> iterator = users.iterator(); iterator.hasNext(); ) {
//            Usuario user = iterator.next();
//            if (user.getId() == id) {
//                iterator.remove();
//            }
//        }		
	}
	
}
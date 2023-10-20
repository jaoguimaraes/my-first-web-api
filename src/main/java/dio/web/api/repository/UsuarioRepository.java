package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
            System.out.println(usuario);
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um ", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando todos os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Joao", "password"));
        usuarios.add(new Usuario("Pedro", "masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um ", id));
        return new Usuario("Joao", "password");
    }
    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %S para localizar um usuario", username));
        return new Usuario("Joao", "password");
    }

    public Usuario update(Usuario usuario) {
        System.out.println(String.format("UPDATE/username - Atualizando o username: %S", usuario));
        return new Usuario("Joca", "passwordJoca");
    }
}

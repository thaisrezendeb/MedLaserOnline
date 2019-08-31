package mlo.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mlo.model.dao.UsuarioDAO;
import mlo.model.pojo.Usuario;

public class UsuarioService implements BaseService<Usuario> {

    public Usuario readById(Long id) throws Exception {
        UsuarioDAO dao = new UsuarioDAO();
        return dao.readById(id);
    }

    public List<Usuario> readByCriteria(Map<String, Object> criteria) throws Exception {
        UsuarioDAO dao = new UsuarioDAO();
        return dao.readByCriteria(criteria);
    }

    public void delete(Long id) throws Exception {
        UsuarioDAO dao = new UsuarioDAO();
        dao.delete(id);
    }

    public Usuario login(String login, String senha) throws Exception {
        Map<String, Object> criteria = new HashMap<String, Object>();
        Usuario usuario = null;

        if (login != null && !login.isEmpty()) {
            if (senha != null && !senha.isEmpty()) {
                criteria.put("login", login);
                List<Usuario> usuarios = this.readByCriteria(criteria);
                if (usuarios.size() > 0) {
                    for (int i = 0; i < usuarios.size(); i++) {
                        if (usuarios.get(i).getLogin().equals(login)) {
                            if (usuarios.get(i).getSenha().equals(senha)) {
                                usuario = usuarios.get(i);
                                break;
                            } else {
                                usuario = null;
                            }
                        }
                    }
                } else{
                    usuario = null;
                }
            }
        }
        return usuario;
    }

    public Map<String, String> create(Usuario usuario) throws Exception {
        Map<String, String> errors = new HashMap<String, String>();
        errors = validateForCreate(usuario);
        if (errors.size() == 0) {
            UsuarioDAO dao = new UsuarioDAO();
            dao.create(usuario);
        }
        return errors;
    }

    public Map<String, String> update(Usuario usuario) throws Exception {
        Map<String, String> errors = new HashMap<String, String>();
        errors = validateForUpdate(usuario);
        if (errors.size() == 0) {
            UsuarioDAO dao = new UsuarioDAO();
            dao.update(usuario);
        }
        return errors;
    }

    public Map<String, String> validateForCreate(Usuario usuario) throws Exception {
        Map<String, String> errors = new HashMap<String, String>();

        if (usuario != null) {

            //CAMPO NOME
            String nome = usuario.getNome();
            if (nome == null || nome.trim().isEmpty()) {
                errors.put("errorNome", "Campo Obrigatório!");
            } else {
                //quem sabe uma validação de UNIQUE;
            }

            //CAMPO LOGIN
            String login = usuario.getLogin();
            if (login == null || login.trim().isEmpty()) {
                errors.put("errorLogin", "Campo Obrigatório!");
            } else {
                //quem sabe uma validação de UNIQUE;
            }

            //CAMPO SENHA
            String senha = usuario.getSenha();
            if (senha == null || senha.trim().isEmpty()) {
                errors.put("errorSenha", "Campo Obrigatório!");
            }

            Long perfil = usuario.getPerfil();
            if (perfil < 0) {
                errors.put("errorPerfil", "Campo Obrigatório!");
            }

//            CAMPO ADMINISTRADOR:
            Usuario admiministrador = usuario.getAdministrador();
            if(admiministrador == null){
                errors.put("errorAdministrador", "Campo Obrigatório!");
            }

        } else {
            throw new Exception();
        }

        return errors;
    }

    public Map<String, String> validateForUpdate(Usuario usuario) throws Exception {

        Map<String, String> errors = new HashMap<String, String>();

        if (usuario != null) {
            //CAMPO NOME
            String nome = usuario.getNome();
            if (nome == null || nome.trim().isEmpty()) {
                errors.put("errorNome", "Campo Obrigatório!");
            } else {
                //quem sabe uma validação de UNIQUE;
            }

            String login = usuario.getLogin();
            if (login == null || login.trim().isEmpty()) {
                errors.put("errorLogin", "Campo Obrigatório!");
            } else {
                //quem sabe uma validação de UNIQUE;
            }

            //CAMPO SENHA
            String senha = usuario.getSenha();
            if (senha == null || senha.trim().isEmpty()) {
                errors.put("errorSenha", "Campo Obrigatório!");
            }

            Long perfil = usuario.getPerfil();
            if (perfil < 0) {
                errors.put("errorPerfil", "Campo Obrigatório!");
            }

//            CAMPO ADMINISTRADOR:
            Usuario admiministrador = usuario.getAdministrador();
            if(admiministrador == null){
                errors.put("errorAdministrador", "Campo Obrigatório!");
            }

        } else {
            throw new Exception();
        }
        return errors;
    }
}

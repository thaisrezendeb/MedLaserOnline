package mlo.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mlo.model.ConnectionManager;
import mlo.model.ServiceLocator;
import mlo.model.pojo.Usuario;

public class UsuarioDAO implements BaseDAO<Usuario> {

    public Usuario readById(Long id) throws Exception {
        Usuario usuario = null;
        String SQL = "SELECT * FROM usuarios WHERE id_usuario = ?";
        try {
            Connection c = ConnectionManager.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement(SQL);
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getLong("id_usuario"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setNome(rs.getString("nome"));
                usuario.setPerfil(rs.getLong("perfil"));
                Long adm = rs.getLong("administrador");
                if (adm != null) {
                    usuario.setAdministrador(ServiceLocator.getUsuarioService().readById(rs.getLong("administrador")));
                }
            }
            rs.close();
            ps.close();
            c = null;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return usuario;
    }

    public List<Usuario> readByCriteria(Map<String, Object> criteria) throws Exception {
        List<Usuario> resultado = new ArrayList<Usuario>();
        try {

            //carregar do banco de dados:
            String SQL = "SELECT * FROM usuarios";
            Connection c = ConnectionManager.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            List<Usuario> usuarios = new ArrayList<Usuario>();

            while (rs.next()) {
                Usuario aux = new Usuario();
                aux.setId(rs.getLong("id_usuario"));
                aux.setLogin(rs.getString("login"));
                aux.setSenha(rs.getString("senha"));
                aux.setNome(rs.getString("nome"));
                aux.setPerfil(rs.getLong("perfil"));
                Long adm = rs.getLong("administrador");
                if (adm != null) {
                    aux.setAdministrador(ServiceLocator.getUsuarioService().readById(rs.getLong("administrador")));
                }
                usuarios.add(aux);
            }

            //EXTRAIR OS CRITERIOS:
            //criterio nome:
            String criterioNome = (String) criteria.get("nome");

            if (criterioNome != null && !criterioNome.trim().isEmpty()) {
                criterioNome.toLowerCase();
            }

            //criterio login:
            String criterioLogin = (String) criteria.get("login");

            if (criterioLogin != null && !criterioLogin.trim().isEmpty()) {
                criterioLogin.toLowerCase();
            }

            //criterio perfil:
            Long criterioPerfil = (Long) criteria.get("perfil");

            //Criterio Administrador:
            Usuario criterioAdministrador = ServiceLocator.getUsuarioService().readById((Long) criteria.get("administrador"));

            //ITERAÇÃO
            for (int i = 0; i < usuarios.size(); i++) {
                Usuario aux2 = usuarios.get(i);
                boolean ok = true;

                //nome:
                if ((criterioNome != null) && (!criterioNome.isEmpty())) {
                    if (aux2.getNome().toLowerCase().indexOf(criterioNome) < 0) {
                        ok = false;
                    }
                }

                //login: aqui alterado to lower case
                if ((criterioLogin != null) && (!criterioLogin.isEmpty())) {
                    if (!(aux2.getLogin().toLowerCase().equals(criterioLogin))) {
                        ok = false;
                    }
                }

                //criterio perfil; perfil 0 inexistente ou root
                if ((criterioPerfil != null) && (criterioPerfil > 0)) {
                    if (!(aux2.getPerfil().equals(criterioPerfil))) {
                        ok = false;
                    }
                }

                if (criterioAdministrador != null) {
                    if (!(aux2.getAdministrador().equals(criterioAdministrador))) {
                        ok = false;
                    }
                }

                if (ok) {
                    resultado.add(aux2);
                }
                rs.close();
                ps.close();
                c = null;
            }
        } catch (Exception ex) {
        }

        return resultado;
    }

    public void delete(Long id) throws Exception {
        String SQL = "DELETE FROM usuarios WHERE id_usuario = ?";
        try {
            Connection c = ConnectionManager.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement(SQL);
            ps.setLong(1, id);
            ps.execute();
            ps.close();
            c = null;
        } catch (Exception ex) {
        }
    }

    public void create(Usuario usuario) throws Exception {
        String SQL = "INSERT INTO usuarios(id_usuario, login, senha, nome, perfil, administrador) "
                + "VALUES(nextval('usuarios_seq'), ?, ?, ?, ?, ?)";
        try {
            Connection c = ConnectionManager.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement(SQL);
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getNome());
            ps.setLong(4, usuario.getPerfil());
            ps.setLong(5, usuario.getAdministrador().getId());
            ps.execute();
            ps.close();
            c = null;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update(Usuario usuario) throws Exception {
        String SQL = "UPDATE usuarios SET login = ?, senha = ?, nome = ?, perfil = ?, administrador = ? WHERE id_usuario = ?";
        try {
            Connection c = ConnectionManager.getInstance().getConnection();
            PreparedStatement ps = c.prepareStatement(SQL);
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getNome());
            ps.setLong(4, usuario.getPerfil());
            ps.setLong(5, usuario.getAdministrador().getId());
            ps.setLong(6, usuario.getId());
            ps.execute();
            ps.close();
            c = null;
        } catch (Exception ex) {
        }
    }
}

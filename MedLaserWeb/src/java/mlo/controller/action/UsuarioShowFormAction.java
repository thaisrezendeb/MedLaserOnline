/* USUARIO SHOW FORM ACTION
Action responsável por pegar os dados do objeto e jogar nos campos da página (UPDATE).
 */

package mlo.controller.action;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mlo.model.ServiceLocator;
import mlo.model.pojo.Usuario;
import org.mentawai.core.BaseAction;

public class UsuarioShowFormAction extends BaseAction{

    @Override
    public String execute() throws Exception {
       Long id = input.getLong("id");
       if(id != null && id > 0){
           Usuario usuario = ServiceLocator.getUsuarioService().readById(id);
           output.setValue("ovUsuario", usuario);
//           output.setValue("perfil", usuario.getPerfil());
//           output.setValue("administradorId", usuario.getAdministrador().getId());
       }
       this.preload();
       return SUCCESS;
    }

    private void preload() throws Exception {
        Map<Long, String> perfilOptions = new LinkedHashMap<Long, String>();
        perfilOptions.put(1L, "Administrador");
        perfilOptions.put(2L, "Gerente");
        perfilOptions.put(3L, "Funcionario");
        output.setValue("perfilOptions", perfilOptions);

        Map<String, Object> criteria = new HashMap<String, Object>();
        criteria.put("perfil", 1L);
        List<Usuario> administradorList = ServiceLocator.getUsuarioService().readByCriteria(criteria);
        Map<Long, String> administradorOptions = new LinkedHashMap<Long, String>();

        for(int i = 0; i < administradorList.size(); i++){
            administradorOptions.put(administradorList.get(i).getId(), administradorList.get(i).getNome());
        }
        Usuario userLog = (Usuario) this.getSession().getAttribute("usuarioLogado");
            if (userLog.getId() == 1){
                administradorOptions.put(1L, userLog.getNome());
            }
        output.setValue("administradorOptions", administradorOptions);
    }
}

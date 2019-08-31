/* USUARIO CREATE ACTION
Action responsável por criar um novo usuário e armazenar no arquivo xml.
 */

package mlo.controller.action;

import java.util.HashMap;
import java.util.Map;
import mlo.model.ServiceLocator;
import mlo.model.pojo.Usuario;
import org.mentawai.core.BaseAction;

public class UsuarioCreateAction extends BaseAction{

    @Override
    public String execute() throws Exception {
        String consequence = ERROR;
        Long id = input.getLong("id");
        Usuario usuario = (Usuario) input.getValue("voCreate");
        //Long perfilusuario = (Long) input.getLong("perfil");
        Long adm = (Long) input.getLong("administradorId");        
        usuario.setAdministrador(ServiceLocator.getUsuarioService().readById(adm));        

        Map<String, String> errors = new HashMap<String, String>();
        errors = ServiceLocator.getUsuarioService().create(usuario);
        if(errors.size() == 0){
            consequence = SUCCESS;
        }
        else{
            output.setValue("errors", errors);
        }

        return consequence;
    }
}
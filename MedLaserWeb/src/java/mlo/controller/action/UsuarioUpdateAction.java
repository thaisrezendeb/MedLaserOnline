/* USUARIO UPDATE ACTION
Action responsável por pegar os dados dos campos da página e armazenar no objeto.
 */

package mlo.controller.action;

import java.util.HashMap;
import java.util.Map;
import mlo.model.ServiceLocator;
import mlo.model.pojo.Usuario;
import org.mentawai.core.BaseAction;

public class UsuarioUpdateAction extends BaseAction{

    @Override
    public String execute() throws Exception {
        String consequence = ERROR;
        Usuario usuario = (Usuario) input.getValue("voUpdate");
        Long adm = (Long) input.getLong("administradorId");
        usuario.setAdministrador(ServiceLocator.getUsuarioService().readById(adm));
        
        // Sem validacao
        //ServiceLocator.getUsuarioService().update(usuario);

        // Com validacao
        Map<String, String> errors = new HashMap<String, String>();
        errors = ServiceLocator.getUsuarioService().update(usuario);
        if(errors.size() == 0){
            consequence = SUCCESS;
        }
        else{
            output.setValue("errors", errors);
        }
        
        return consequence;
    }

}

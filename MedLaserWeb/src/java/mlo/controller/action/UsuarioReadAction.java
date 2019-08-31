/* USUARIO READ ACTION
 Action responsável por ler cada campo do usuário do arquivo e jogar na tela.
 */

package mlo.controller.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mlo.model.ServiceLocator;
import mlo.model.pojo.Usuario;
import org.mentawai.core.BaseAction;

public class UsuarioReadAction extends BaseAction{

    @Override
    public String execute() throws Exception {
        String consequence = ERROR;
        Map<String, Object> criteria = new HashMap<String, Object>();        
        criteria.put("nome", input.getString("usuario"));//Filtro de busca
        List<Usuario> usuarios = ServiceLocator.getUsuarioService().readByCriteria(criteria);
        output.setValue("usuarios", usuarios);
        consequence = SUCCESS;

        return consequence;
    }

}

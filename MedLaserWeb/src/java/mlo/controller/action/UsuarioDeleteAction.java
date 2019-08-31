/* USUARIO DELETE ACTION
Action responsavel por excluir um usuário do arquivo xml, através de seu id.
 */

package mlo.controller.action;

import mlo.model.ServiceLocator;
import org.mentawai.core.BaseAction;

public class UsuarioDeleteAction extends BaseAction{

    @Override
    public String execute() throws Exception {
        String consequence = ERROR;
        Long id = input.getLong("id");
        ServiceLocator.getUsuarioService().delete(id);
        consequence = SUCCESS;
        return consequence;
    }

}

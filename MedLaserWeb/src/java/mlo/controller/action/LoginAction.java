/* LOGIN ACTION
Action responsável por validar usuários para acesso ao site.
 */

package mlo.controller.action;

import mlo.model.ServiceLocator;
import mlo.model.pojo.Usuario;
import org.mentawai.action.BaseLoginAction;

public class LoginAction extends BaseLoginAction {

    @Override
    public String execute() throws Exception {
        String consequence = ERROR;
        String user = input.getString("usuario");
        String pass = input.getString("senha");

        if  (user == null || user.trim().equals("")) {
            output.setValue("errorLogin", "Usuário ou senha inválidos!");
            return ERROR;
        }

        if (pass == null || pass.trim().equals("")) {
            output.setValue("errorLogin", "Usuário ou senha inválidos!");
            return ERROR;
        }

        Usuario usuario = ServiceLocator.getUsuarioService().login(user, pass);
        if(usuario != null){            
            this.setUserSession(usuario);
            this.getSession().setAttribute("usuarioLogado", usuario);
            consequence = SUCCESS;
        }else{
            output.setValue("errorLogin", "Usuário ou senha inválidos!");
        }
        return consequence;
    }
}

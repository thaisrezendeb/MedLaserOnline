/* APPLICATION MANAGER
Classe responsável por gerenciar todas as chamadas da aplicação web.
 */

package mlo.controller;

import mlo.controller.action.HomeAction;
import mlo.controller.action.LoginAction;
import mlo.controller.action.LogoutAction;
import mlo.controller.action.UsuarioCreateAction;
import mlo.controller.action.UsuarioDeleteAction;
import mlo.controller.action.UsuarioReadAction;
import mlo.controller.action.UsuarioShowFormAction;
import mlo.controller.action.UsuarioUpdateAction;
import mlo.model.pojo.Usuario;
import org.mentawai.core.ActionConfig;
import org.mentawai.core.Forward;
import org.mentawai.core.Redirect;
import org.mentawai.filter.AuthenticationFilter;
import org.mentawai.filter.OVFilter;
import org.mentawai.filter.VOFilter;

public class ApplicationManager extends org.mentawai.core.ApplicationManager{

    @Override
    public void loadActions() {
        ActionConfig ac;

        // Filtro para evitar que pessoas não autenticadas acessem as páginas
        this.addGlobalFilter(new AuthenticationFilter());
        this.addGlobalConsequence(AuthenticationFilter.LOGIN, new Redirect("login.jsp"));

        //Chamar action LoginAction para verificar login e senha e redirecionar para a pagina Home.
        ac = new ActionConfig("Login", LoginAction.class);
        ac.addConsequence(LoginAction.SUCCESS, new Redirect("Home.mtw"));
        ac.addConsequence(LoginAction.ERROR,  new Forward("login.jsp"));
        addActionConfig(ac);

        // Chama LogoutAction para destruir a sessão do usuario
        ac = new ActionConfig("Logout", LogoutAction.class);
        ac.addConsequence(LogoutAction.SUCCESS, new Redirect("login.jsp"));
        addActionConfig(ac);

        //HomeAction redireciona para a pagina home ao clicar no link Página Inicial.
        ac = new ActionConfig("Home", HomeAction.class);
        ac.addConsequence(SUCCESS, new Forward("jsp/home.page"));
        this.addActionConfig(ac);

        //Monta formulário para criar um novo usuário.
        ac = new ActionConfig("UsuarioShowCreateForm", UsuarioShowFormAction.class);
        ac.addConsequence(SUCCESS, new Forward("jsp/usuario/usuarioCreateForm.page"));
        this.addActionConfig(ac);

        //Monta formulário para editar um usuário existente.
        ac = new ActionConfig("UsuarioShowUpdateForm", UsuarioShowFormAction.class);
        ac.addFilter(new OVFilter("ovUsuario"));
        ac.addConsequence(SUCCESS, new Forward("jsp/usuario/usuarioUpdateForm.page"));
        this.addActionConfig(ac);

        //Armazena o novo usuário criado no arquivo xml e redireciona para a action UsuarioRead.
        ac = new ActionConfig("UsuarioCreate", UsuarioCreateAction.class);
        ac.addFilter(new VOFilter(Usuario.class, "voCreate"));
        ac.addConsequence(ERROR, new Forward("UsuarioShowCreateForm.mtw"));
        ac.addConsequence(SUCCESS, new Redirect("UsuarioRead.mtw"));
        this.addActionConfig(ac);

        //Mostra todos os usuários cadastrados.
        ac = new ActionConfig("UsuarioRead", UsuarioReadAction.class);
        ac.addConsequence(SUCCESS, new Forward("jsp/usuario/usuarioList.page"));
        this.addActionConfig(ac);

        //Exclui um usuário existente.
        ac = new ActionConfig("UsuarioDelete", UsuarioDeleteAction.class);
        ac.addConsequence(SUCCESS, new Redirect("UsuarioRead.mtw"));
        this.addActionConfig(ac);

        //Edita um usuário existente.
        ac = new ActionConfig("UsuarioUpdate", UsuarioUpdateAction.class);
        ac.addFilter(new VOFilter(Usuario.class, "voUpdate"));
        ac.addConsequence(ERROR, new Forward("UsuarioShowUpdateForm.mtw"));
        ac.addConsequence(SUCCESS, new Redirect("UsuarioRead.mtw"));
        this.addActionConfig(ac);
    }

}

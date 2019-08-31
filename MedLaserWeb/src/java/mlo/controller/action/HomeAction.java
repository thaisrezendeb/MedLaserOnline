/* HOME ACTION
 Action responsável por apenas retornar SUCCESS para redirecionar para a página inicial home.jsp
 ao clicar no link Página Inicial, localizado em home.jsp.
 */

package mlo.controller.action;

import org.mentawai.core.BaseAction;

public class HomeAction extends BaseAction{

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

}

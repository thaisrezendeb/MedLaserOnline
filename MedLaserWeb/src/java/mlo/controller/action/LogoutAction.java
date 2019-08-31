package mlo.controller.action;

import org.mentawai.core.BaseAction;
import org.mentawai.filter.AuthenticationFree;

/**
 *
 * @author Thais
 */
public class LogoutAction extends BaseAction {

    protected void logout(){
        session.reset();
    }

    @Override
    public String execute() throws Exception {
        this.logout();
        return SUCCESS;
    }

}

package mlo.model;

import mlo.model.service.UsuarioService;

public class ServiceLocator {

    public static UsuarioService getUsuarioService() {
        return new UsuarioService();
    }
//     Repetir o metodo pra cada classe de serviço...
}

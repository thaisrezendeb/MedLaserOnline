/*
 Gerencia o template e cria blocos para template.jsp.
 */
package mlo.controller;

import org.mentawai.template.ConventionController;
import org.mentawai.template.Page;

public class TemplateManager extends org.mentawai.template.TemplateManager {

    @Override
    public void configurePages() {
        Page page = new Page("jsp/.*", "jsp/template/template.jsp", ConventionController.class);
        page.setBlock("menu", new Page("jsp/template/menu.jsp"));
        page.setBlock("header", new Page("jsp/template/header.jsp"));
        page.setBlock("footer", new Page("jsp/template/footer.jsp"));
        add(page);
    }
}

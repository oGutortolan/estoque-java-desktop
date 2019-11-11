package br.com.pooestoque.view;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author augusto.ortolan
 */
public class GerenteDeJanelas {
    
    private static JDesktopPane jd1;
    
    public GerenteDeJanelas(JDesktopPane jd1){
        GerenteDeJanelas.jd1 = jd1;
    }
    
    public void abrirJanelas(JInternalFrame jint){
        if(jint.isVisible()){
            jint.toFront();
            jint.requestFocus();
        }else{
            jd1.add(jint);
            jint.setVisible(true);
        }
    }
    
}

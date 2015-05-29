/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import java.awt.Graphics;
import java.awt.print.*;

/**
 *
 * @author Alice
 */
public class EssaiMedecinImprimable implements Printable {

    @Override
    public int print(Graphics grphcs, PageFormat pf, int i) throws PrinterException {
        int retValue = Printable.NO_SUCH_PAGE;
        switch(i){
            case 0 : {
                retValue = Printable.PAGE_EXISTS;
            }
        }
        return retValue;
    }
    
}

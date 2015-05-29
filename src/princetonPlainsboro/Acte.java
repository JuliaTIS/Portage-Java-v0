package princetonPlainsboro;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

class Acte implements Printable {
    private Code code;
    private int coef;
    
    public Acte(Code code, int coef) {
        this.code = code;
        this.coef = coef;
        }
    
    public String toString() {
        return getCode().toString() + ", coefficient : " + getCoef();
        }
    
    public double cout() {
        return getCode().calculerCout(getCoef());
        }

    /**
     * @return the code
     */
    public Code getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Code code) {
        this.code = code;
    }

    /**
     * @return the coef
     */
    public int getCoef() {
        return coef;
    }

    /**
     * @param coef the coef to set
     */
    public void setCoef(int coef) {
        this.coef = coef;
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
       
        if (pageIndex != 0)
 if (pageIndex > 0) {
			return NO_SUCH_PAGE;
		}
		/* On définit une marge pour l'impression */
		int marge=30;

		/* On récupère les coordonnées des bords de la page */
		int x = (int)pageFormat.getImageableX();
		int y = (int)pageFormat.getImageableY();
		int w = (int)pageFormat.getImageableWidth();
		int h = (int)pageFormat.getImageableHeight();

		/* Dessin d'un cadre gris clair*/
		graphics.setColor(Color.LIGHT_GRAY);
		graphics.fillRect(x+10, y+10, w-20, h-20);

		/* On écrit une ligne de titre en rouge, en gras de taille 18 */
		graphics.setFont(new Font("Arial", Font.BOLD, 18));
		graphics.setColor(Color.RED);
		graphics.drawString("Acte\r \n", x + marge, y+marge);

		/* On écrit une ligne en noir de taille 14 */
		graphics.setFont(new Font("Arial", Font.PLAIN, 14));
		graphics.setColor(Color.BLACK);
		graphics.drawString(this.toString(), x+marge, y+marge+20);

		return PAGE_EXISTS;
        
        
    }
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

/**
 *
 * @author Alice
 */
public enum TypeActe {
    
    DIAGNOSTIQUE("diagnostique"),
    THERAPEUTIQUE("th�rapeutique");
    
    private String type;
    
    
    private TypeActe(String type) {
        this.type = type;
        }
    
    /**
     * 
     * @return retourne une cha�ne de caract�re correspondant � la description du code
     */
    public String toString() {
        return "Acte : " + type ;
        }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mollete.negocio;

/**
 * Contiene la funcion Evaluar.
 * @author Jose Abelardo Reyes Galaz
 */
public class Operacion{
    
    /**
     * Recive la frase ingresada, la knvierte y conmpara a la original retornando un booleano.
     * @param frase
     * @return boolean
     */
    public static boolean Evaluar (String frase){
     
        String fraseCorregida = frase.replace(",", "").toLowerCase().replace(" ", "").replace(".", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o".replace("ú", "u"));
        
        String fraseInversa = "";
        
        
        for (int invertida = fraseCorregida.length() -1; invertida >=0;invertida--){
            
            fraseInversa += fraseCorregida.charAt(invertida);
            
        }
        
        if (fraseCorregida.equals(fraseInversa)){
                return true;
            }else{
                return false;
            }
        
}
    
}

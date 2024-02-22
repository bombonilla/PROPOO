/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_modificadores_acceso;

import otro_paq.ClasePrueba2;

/**
 *
 * @author eduar
 */
public class EVA1_3_MODIFICADORES_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciacion de un objeto de la clase prueba.
        //La instancia se llama objPrueba
        Prueba objPrueba = new Prueba ();
        objPrueba.x = 0; //visible (protected) mismo paquete
        objPrueba.y = 0; //visible (public) siempre visible
        objPrueba.z = 0;//visible (default) mismo paquete
        
        //ClasePrueba2 ESTA EN OTRO PAUQETE, diferente al
        //de la clase EVA1_3_MODIFICADORES_ACCESO
        ClasePrueba2 objClasePrueba2 = new ClasePrueba2();
        objClasePrueba2.y = 0;//visible (public) siempre visible
        
    }    
}
//Esta clase es DEFAULT)
class Prueba{
    private int w;
    protected int x;
    public int y;
    int z; //DEFAULT
    
    
}

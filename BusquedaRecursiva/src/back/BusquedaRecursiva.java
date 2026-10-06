
package back;

import java.util.Random;

public class BusquedaRecursiva {

    
    private int[] vector;
    private int[] longitud;
    
    public int[] retornarVector(){
        Random rd = new Random();
        for(int i = 0; i<vector.length; i++){
            vector[i] = rd.nextInt(20);
            
        }
        return vector;
    }
    
    public BusquedaRecursiva(int longitud){
        this.vector = new int[longitud];
    }
    
    public void imprimirVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("["+i+"] ->" + vector[i]);
            
        }
    } 
    
   //-------Busqueda secuencial
    
    public boolean secuencial(int[] vector, int indice, int valor){
        if(indice == vector.length){
            return false;
        }
        
        if(vector[indice] == valor){
            return true;
        }
        return secuencial(vector, indice +1, valor);
    }
    
    //--------Busqueda por indice
    
    public int buscarIndice(int[] vector, int indice, int valor){
        if(indice >= vector.length){
            return -1;
        }
        if(vector[indice] == valor){
            return indice;
        }
        return buscarIndice(vector, indice+1, valor);
    }
    
    //---Busqueda Binaria
    
    public int buscarBinaria(int[] vector, int inicio, int fin, int valor){
     
        if(inicio>fin){
            return -1;
        }
        
        int medio = (inicio + fin)/2;
        
        if(vector[medio] == valor){
            return medio;
        }
        if(valor<vector[medio]){
            return buscarBinaria(vector, inicio, medio-1, valor);
        }
        
        return buscarBinaria(vector, medio+1, fin, valor);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] vec;
        BusquedaRecursiva bs = new BusquedaRecursiva(20);
        vec = bs.retornarVector();
        
        bs.imprimirVector(vec);
        
        int valor =12;
        System.out.println("Valor buscado: "+valor);
        
        //---Bsuq Secuencial
        //if(secuencial(vec, 0, valor)){
        //    System.out.println("Elemento encontrado");
        //}else{
        //    System.out.println("Elemento no encontrado");
        //}
        
        //---Busq Indice
        //int indice = bs.buscarIndice(vec, 0, valor);
        //if(indice>0){
        //    System.out.println("Elemento encontrado en el indice: "+indice);
        //}else{
        //    System.out.println("Elemento no encontrado");
        //}
        
        //---Busq Binaria
        
        //int pBinaria = bs.buscarBinaria(vec, 0, vec.length, valor);
        //if(pBinaria>0){
        //    System.out.println("Elemento encontrado en la posicion: "+pBinaria);
        //}else{
        //    System.out.println("Elemento no encontrado");
        //}
        
        
        
    }
    
}

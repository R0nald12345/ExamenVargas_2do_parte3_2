/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoExamenEd2Arboles_3_p2;

/**
 *
 * @author pumar
 *
 * 
 */


public class ListaArbol {
    
    public static final int MAX = 50;
    
    //atributos
    private Arbol[] v;
    
    
    //Constructor
    public ListaArbol() {
        v = new Arbol[MAX];
        for (int i = 1; i < MAX; i++) {
            v[i] = new Arbol();
        }
    }
    
    //Inserta la cadena, en la respectiva posicion del vector para el arbol
    public void insertar(String cad){
        int cantidad;
        cantidad = cad.length();
        v[cantidad].insertar(cad);
    }
    
    //Me muestra el arbol, en el vector dado la posicion para verlo
    public void Mostrar(int pos){
        v[pos].inOrden();
    }
    
//    public void modificar_A_Minuscula(int pos){
//        v[pos].modificarLetrasMinuscula();
//    }
  
    
    public static void main(String[] args) {
        ListaArbol liA1 =  new ListaArbol();
        
        liA1.insertar("ab");
        liA1.insertar("abc");
        liA1.insertar("abc");
        liA1.insertar("abc");
        liA1.insertar("pqr");
        liA1.insertar("ab");
        liA1.insertar("a");
        liA1.insertar("u");
        liA1.insertar("e");
        liA1.insertar("o");
        liA1.insertar("i");
        liA1.insertar("abcd");//1
        liA1.insertar("xyz");
        liA1.insertar("xxyz");//2
        liA1.insertar("xyyx");//3
        liA1.insertar("aei");
        liA1.insertar("ab");
        liA1.insertar("pqr");
        liA1.insertar("abcd");//4
        liA1.insertar("bcde");//5
        liA1.insertar("abcd");//6
        liA1.insertar("a");
        liA1.insertar("a");
        

        liA1.Mostrar(3);


//        liA1.modificar_A_Minuscula(3);
//        liA1.Mostrar(3);
        
        
    }
}

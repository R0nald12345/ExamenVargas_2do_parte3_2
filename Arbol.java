package ProyectoExamenEd2Arboles_3_p2;

/**
 *
 * @author pumar
 */
public class Arbol {

    public Nodo raiz;

    //constructo
    public Arbol() {
        raiz = null;
    }

    //Si devulve un -1 es que no pillo la posicion "Metodo Vector Exclusivo para insertar"
    private int obtenerPosicion(String cad) {
        String abecedario = "abcdefghigklmnopqrstuvwxyz";
        int contador = -1;
        for (int i = 0; i < abecedario.length(); i++) {
            if (cad.charAt(0) == abecedario.charAt(i)) {
                contador = i;
                break;
            }
        }
        if (contador > -1) {
            return contador;
        } else {
            return -1;
        }
    }

    //inserta una nuecva cadena en el arbol, caso constrario si existe no aumento sino suma +1 la frecuencia
    public void insertar(String cadena) {
        boolean bandera = existeNodoCadena(cadena);
        if (bandera) {
            ModificarNodo(cadena);
        } else {
            raiz = insertar(raiz, cadena);
        }

    }

    //Modifica el Nodo, para incrementar la frecuencia
    public void ModificarNodo(String cadena) {
        raiz = modificarArbol(raiz, cadena);
    }

    //Retorna el puntero Nodo modificado
    public Nodo modificarArbol(Nodo p, String cadena) {
        if (p.cad == cadena) {
            p.frecuencia++;
        } else {
            int pos1, pos2;
            pos1 = obtenerPosicion(cadena);
            pos2 = obtenerPosicion(p.cad);
            if (pos1 < pos2) {
                p.izq = modificarArbol(p.izq, cadena);

            } else {
                p.der = modificarArbol(p.der, cadena);
            }
        }
        return p;
    }

    //Inserta una nueva cadena, en el Arbol
    public Nodo insertar(Nodo p, String cadena) {
        if (p == null) {
            return new Nodo(cadena, 1);
        } else {
            int pos1, pos2;
            pos1 = obtenerPosicion(cadena);
            pos2 = obtenerPosicion(p.cad);
            if (pos1 < pos2) {
                p.izq = insertar(p.izq, cadena);
            } else {
                p.der = insertar(p.der, cadena);
            }
            return p;
        }

    }

    //Verifica si el Nodo cadena Existe
    public boolean existeNodoCadena(String cadena) {
        return existeNodoCadena(raiz, cadena);
    }

    private boolean existeNodoCadena(Nodo p, String cadena) {
        if (p == null) {
            return false;
        }
        if (cadena == p.cad) {
            return true;
        }
        int pos1, pos2;
        pos1 = obtenerPosicion(cadena);
        pos2 = obtenerPosicion(p.cad);
        if (pos1 < pos2) {
            return existeNodoCadena(p.izq, p.cad);
        } else {
            return existeNodoCadena(p.der, p.cad);
        }
    }

    //Muestra el resutado mas la frecuencia
    public void inOrden() {
        inOrden(raiz);
    }

    public void inOrden(Nodo p) {
        if (p == null) {
            return;
        } else {
            inOrden(p.izq);
            System.out.println("Dato: " + p.cad + "| " + "Frecuencia: " + p.frecuencia);
            inOrden(p.der);
        }
    }
/*
    //convertir mayuscula en minuscula
    private String convertirAMinuscula(String cadena) {
        char[] caracteres = cadena.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            // Verificar si el carácter está en mayúscula
            if (Character.isUpperCase(caracteres[i])) {
                // Convertir el carácter a minúscula
                caracteres[i] = Character.toLowerCase(caracteres[i]);
            }
        }

        // Crear una nueva cadena con los caracteres convertidos
        String cadenaMinuscula = new String(caracteres);
        return cadenaMinuscula;
    }

    public static boolean esMinuscula(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            // Verificar si algún carácter no es una letra minúscula
            if (!Character.isLowerCase(cadena.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    */
/*
    public void modificarLetrasMinuscula() {
        raiz = modificarLetrasMinuscula(raiz);
    }

    //Modifica el elemento a Minuscula
    public Nodo modificarLetrasMinuscula(Nodo p) {
        if (p == null) {
            String cad = "";
            if(!esMinuscula(p.cad)){
                cad = convertirAMinuscula(p.cad);
            }
            p.cad = cad;
        } else {
            p.izq = modificarLetrasMinuscula(p.izq);
            p.der = modificarLetrasMinuscula(p.der);
            String cad = convertirAMinuscula(p.cad);
            p.cad = cad;
        }
        return p;
    }
  */

}

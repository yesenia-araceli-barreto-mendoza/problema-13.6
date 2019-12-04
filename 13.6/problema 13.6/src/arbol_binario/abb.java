package arbol_binario;

public class abb {

    private class nodoArbol {

        private abb hd;

        private abb hi;

        private int dato;

        private void nodoArbol() {

            hd = null;

            hi = null;

            dato = 0;

        }

    }

    public nodoArbol raiz;

    public void abb() {

        nodoArbol raiz = new nodoArbol();

    }

    public boolean esVacio() {

        return (raiz == null);

    }

    /*public void insertar(int a) {
        if (esVacio()) {
            nodoArbol nuevo = new nodoArbol();
            nuevo.dato = a;
            nuevo.hd = new abb();
            nuevo.hi = new abb();
            raiz = nuevo;
        } else {
            if (a > raiz.dato) {
                (raiz.hd).insertar(a);
            }
            if (a < raiz.dato) {
                (raiz.hi).insertar(a);
            }
        }
    
    }*/
     public void insertar(abb nodo, abb raiz) {
        if (raiz == null) {
            this.setRaiz(nodo);
        } else {
            if (nodo.getDato() <= raiz.getDato()) {
                if (raiz.getIzdo() == null) {
                    raiz.setIzdo(nodo);
                } else {
                    agregar(nodo, raiz.getIzdo());
                }
            } else {
                if (raiz.getDere() == null) {
                    raiz.setDere(nodo);
                } else {
                    agregar(nodo, raiz.getDere());
                }
            }

        }

    }

    

    public void preOrder() {

        if (!esVacio()) {

            System.out.print(raiz.dato + ", ");

            raiz.hi.preOrder();

            raiz.hd.preOrder();

        }

    }

    public void inOrder() {

        if (!esVacio()) {

            raiz.hi.inOrder();

            System.out.print(raiz.dato + ", ");

            raiz.hd.inOrder();

        }

    }

    public void posOrder() {

        if (!esVacio()) {
            raiz.hd.posOrder();
            raiz.hi.posOrder();
            System.out.print(raiz.dato + ", ");
        }
    }

    public abb buscar(int a) {

        abb arbolito = null;

        if (!esVacio()) {

            if (a == raiz.dato) {

                return this;

            } else {

                if (a < raiz.dato) {

                    arbolito = raiz.hi.buscar(a);

                } else {

                    arbolito = raiz.hd.buscar(a);

                }

            }

        }

        return arbolito;

    }

    public boolean existe(int a) {

        if (!esVacio()) {

            if (a == raiz.dato) {

                return true;

            } else {

                if (a < raiz.dato) {

                    raiz.hi.existe(a);

                } else {

                    raiz.hd.existe(a);

                }

            }

        }

        return false;

    }

    public int cantidad() {

        if (esVacio()) {

            return 0;

        } else {

            return (1 + raiz.hd.cantidad() + raiz.hi.cantidad());

        }

    }

    public int altura() {

        if (esVacio()) {

            return 0;

        } else {

            return (1 + Math.max(((raiz.hi).altura()), ((raiz.hd).altura())));

        }

    }

    public int buscarMin() {

        abb arbolActual = this;

        while (!arbolActual.raiz.hi.esVacio()) {

            arbolActual = arbolActual.raiz.hi;

        }

        int devuelvo = arbolActual.raiz.dato;

        arbolActual.raiz = null;

        return devuelvo;

    }

    public int buscarMan() {

        abb arbolActual = this;

        while (!arbolActual.raiz.hd.esVacio()) {

            arbolActual = arbolActual.raiz.hd;

        }

        int devuelvo = arbolActual.raiz.dato;

        arbolActual.raiz = null;

        return devuelvo;

    }

    public boolean esHoja() {

        boolean hoja = false;

        if ((raiz.hi).esVacio() && (raiz.hd).esVacio()) {

            hoja = true;

        }

        return hoja;

    }

    public void eliminar(int a) {

        abb paraEliminar = buscar(a);

        if (!paraEliminar.esVacio()) {

            if (paraEliminar.esHoja()) {

                paraEliminar.raiz = null;

            } else {

                if (!paraEliminar.raiz.hi.esVacio() && !paraEliminar.raiz.hd.esVacio()) {

                    paraEliminar.raiz.dato = paraEliminar.raiz.hd.buscarMin();

                } else {

                    if (paraEliminar.raiz.hi.esVacio()) {

                        paraEliminar.raiz = paraEliminar.raiz.hd.raiz;

                    } else {

                        paraEliminar.raiz = paraEliminar.raiz.hi.raiz;

                    }

                }

            }

        }

    }

    public abb buscarMayorQue(int a) {
        abb arbolito = null;
        if (!esVacio()) {
            if (a == raiz.dato) {
                return this;
            }
        } else {
            if (a == raiz.dato) {
                int aux= raiz.dato;
                raiz.dato = a;
                if (a < aux) {
                    arbolito = raiz.hi.buscarMayorQue(a);
                } else {
                    arbolito = raiz.hd.buscarMayorQue(a);
                }
            }
        }
        return arbolito;
    }
}

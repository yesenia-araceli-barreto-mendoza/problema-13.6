
package arbol_binario;

import javax.swing.JOptionPane;

public class Arbol_binario {

    public static void main(String[] args) {
       int Opcion,a,b,c,d;
        abb al = new abb();
        do{
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR DATO\n"+
                    "2. PREORDEN\n"+
                    "3. INORDEN\n"+
                    "4. POSORDEN\n"+
                    "5. BUSCAR\n"+
                    "6. EXISTE\n"+
                    "7. CANTIDAD\n"+
                    "8. ALTURA\n"+
                    "9. BUSCAR MIN\n"+
                    "10. BUSCAR MAN\n"+
                    "11. ES HOJA\n"+  
                    "12. ES BUSCAR MAYOR\n"+    
                    "13. SALIR\n"+
                    "--------------------------------------------------------\n"+
                    "INGRESE LA OPCION [1 - 13]","MENU COLA",JOptionPane.QUESTION_MESSAGE));
             

            switch(Opcion)
            {
                case 1: 
                    a=Integer.parseInt(JOptionPane.showInputDialog(null," ingrasa el numero a agragar"));
                    al.insertar(a);break;
                case 2: al.preOrder();break;
                case 3: al.inOrder();break;
                case 4: al.posOrder();break;
                case 5: b=Integer.parseInt(JOptionPane.showInputDialog(null," ingrasa el numero a Buscar"));
                    al.buscar(b);break;
                case 6:c=Integer.parseInt(JOptionPane.showInputDialog(null," ingrasa el numero a EXISTENCIA"));
                    al.existe(c) ;break;
                case 7:al.cantidad();break;
                case 8:al.altura() ;break;
                case 9:al.buscarMin() ;break;
                case 10:al.buscarMan() ;break;
                case 11:al.esHoja() ;break;
                case 12: d=Integer.parseInt(JOptionPane.showInputDialog(null," ingras el numero que deseas comparar"));
                    al.buscarMayorQue(d) ;break;
                case 13: System.exit(0);break;
                default: JOptionPane.showMessageDialog(null,"INGRESE UNA OPCION VALIDA \n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);break;
            }
        }while(true); 
    }
    }


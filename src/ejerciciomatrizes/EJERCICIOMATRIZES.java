/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciomatrizes;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos David Sabogal
 */

public class EJERCICIOMATRIZES {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String [][]estudiantes= new String[9][6];
    int fila=0;
    int columna=0;
    String nombreUsuario = null;
    String edadUsuario = null;
    String fechaUsuario = null;
     JOptionPane.showMessageDialog(null, "Seleccione 1 para buscar curso,2 para saber si aprobo.,3 para saber la edad,4 el promedio");
    String datos= JOptionPane.showInputDialog ( "Introduzca un numero de 1-4:" );
      
      
      int dato=Integer.parseInt(datos);
       

        for(int i=0;i<9;i++){
            
            if(i==0 || i==3 ||i==6){
             nombreUsuario = JOptionPane.showInputDialog ( "Introduzca un nombre:" );
            edadUsuario = JOptionPane.showInputDialog ( "Introduzca su edad:" );
             fechaUsuario = JOptionPane.showInputDialog ( "Introduzca su fecha de nacimiento:" );
            }
     
            
            estudiantes[i][0]=nombreUsuario;            
            estudiantes[i][1]=edadUsuario;
            estudiantes[i][2]=fechaUsuario;

            String CursosUsuario = JOptionPane.showInputDialog ( "Introduzca el curso,2003,2004,2005:" );
            estudiantes[i][3]=CursosUsuario;
            String notasUsuario= JOptionPane.showInputDialog ( "Introduzca su nota:" );
            estudiantes[i][4]=notasUsuario;
                }
   
                int contador=0;
        for(int j=0;j<9;j++){
        System.out.print(estudiantes[j][0]);
        System.out.print(estudiantes[j][1]);
        System.out.print(estudiantes[j][2]);   
        System.out.print(estudiantes[j][3]);
        System.out.println(estudiantes[j][4]);
        contador=j;
          if(j==2 || j==5 ){
              
              
               System.out.println();
          }
        }
        
        
       
        switch (dato){

            case 1:{
       String BuscarCurso = JOptionPane.showInputDialog("Que Curso desea buscar");
		System.out.print(BuscarCurso);
                if(BuscarCurso!=estudiantes[0][3]){
                 System.out.print("El nombre del estudiante es"+estudiantes[0][0]);
                 
                }
                else if (BuscarCurso!=estudiantes[1][3]){
                 System.out.print("El nombre del estudiante es"+estudiantes[1][0]);
                }
                else if (BuscarCurso!=estudiantes[2][3]){
                 System.out.print("El nombre del estudiante es"+estudiantes[2][0]);
                }
                else{
                System.out.print("El curso no existe");
                
                }
               break;
            }
 
     case 2:{
                
         int suma=Integer.parseInt(estudiantes[0][4])+Integer.parseInt(estudiantes[1][4])+ Integer.parseInt(estudiantes[2][4]);     
        if(suma>3){
        System.out.println("El Estudiante ha aprobado la materia");
        }
        else{
        System.out.println("El Estudiante ha reprobado");
        }
      break;
        }
      case 3:{
          
       String numbers = estudiantes[0][2].substring(estudiantes[0][2].length()-4);
       int suma=2021-Integer.parseInt(numbers);
        System.out.println("la edad del estudiante es"+suma);
        break;
        }
       case 4:{
          
        int sum=Integer.parseInt(estudiantes[0][4])+Integer.parseInt(estudiantes[1][4])+ Integer.parseInt(estudiantes[2][4]);    
        System.out.println("El promedio de "+ estudiantes[0][0]+" es "+sum/3);
        int suma2=Integer.parseInt(estudiantes[3][4])+Integer.parseInt(estudiantes[4][4])+ Integer.parseInt(estudiantes[5][4]);    
        System.out.println("El promedio de"+ estudiantes[0][1]+" es "+suma2/3);
        int suma3=Integer.parseInt(estudiantes[6][4])+Integer.parseInt(estudiantes[7][4])+ Integer.parseInt(estudiantes[8][4]);    
        System.out.println("El promedio de "+ estudiantes[0][2]+"alumno es "+suma3/3);
        break;
        }
        

     }
    }
}

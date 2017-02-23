package saladovic;
import java.util.InputMismatchException;
import java.util.Scanner;


public class User {
	//B-Quito el valor que recibia la funcion ya que no tiene sentido
	public static String[] user() {
		Scanner lector = new Scanner(System.in);
		//B-el valor que recibia la funcion lo declaro aqui
		String ver;
		int amics=0;
		//B-En ningun momento se usan estas variables de abajo, las comento
		//int fila1=0;
		//int opcion=-1;
		/*String [] columnes= new String[3];
		columnes[0]="nom";
		columnes[1]="gols equip local";
		columnes[2]="gols equip visitant";	
*/
		System.out.println("Cuantos usuarios quereis hechar una porra?");
		try {

		amics=lector.nextInt();

 		 }catch(InputMismatchException e)  {

 			 // Controlamos que siempre introduzca un valor numerico

 			 System.out.println("El valor tiene que ser numerico...");

 			 lector.nextLine();

 			 //opcion=-1;
 		 	
		 }
		
		String[] porra= new String[amics];
		for(int columnas=0;columnas<porra.length;columnas++){
			//B-Corrijo lo que mostraba por pantalla
			System.out.println("Dime el nombre del usuario "+(columnas+1));
			porra[columnas]= lector.next();
			ver=porra[columnas];
			//B-Suponiendo que la variable VER la quieres mostrar por pantalla
			//Ya que no tiene sentido asignarle algo en cada bucle y machacarlo
			//sin usarlo en ningun momento, a cada itineracion lo muestro por pantalla
			System.out.println(ver);
			
		}
		//lector.close();
		return porra  ;
		
		
	}
	
	
}

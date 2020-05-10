package emailapp;

import java.util.Scanner;

public class Email {

		//Declaramos las variables para almacenar los datos
	    //y las encapsulamos con el modificador de acceso private
		private String firstName;
		private String lastName;
		private String password;
		private String department;
		private String alternateEmail;
		private int mailboxCapacity;
		
		//Constructor que recibe firstname y lastname
		
		public Email( String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
			System.out.println("Email Creado: " + this.firstName + " " + this.lastName);
			
			//Llamamos al metodo preguntando por el departamento - y devuelve el departamento
			this.department = estableceDepartamento(); //llamamos al metodo y lo guardamos en la variable department
			System.out.println("Departamento: " +this.department); // imprime eleccion
		}
		
		//Metodo Preguntamos por department 
		private String estableceDepartamento(){
			System.out.print("Ingrese Departamento\n1 Ventas \n2 Desarrollo\n3 Cuentas\n4 Nada\nElija uno por favor...");
			Scanner in = new Scanner(System.in); //lee eleccion
			int elijeDepartment = in.nextInt(); //declaramos variable para almacenar eleccion
			if(elijeDepartment == 1) {  //creamos condicional de las posibles elecciones
				return "Ventas";
			}else if(elijeDepartment == 2) {
				return "Desarrollo";
			}else if(elijeDepartment == 3) {
				return "Cuentas";
			}else {return "";}
		}
		
		//Generamos un password aleatorio
		
		
		//Establecemos capacidad del email
		
		
		//Establecemos email alternativo
		
		
		//Cambiar de password
	
		
}

package emailapp;

import java.util.Scanner;

public class Email {

		//Declaramos las variables para almacenar los datos
	    //y las encapsulamos con el modificador de acceso private
		private String firstName;
		private String lastName;
		private String password;
		private String department;
		private String email;
		private String alternateEmail;
		private int mailboxCapacity;
		private String companySuffix = "companyName.com";
		private int defaultPassLength = 10;

		
		
		//Constructor que recibe firstname y lastname
		
		public Email( String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
			System.out.println("Email Creado: " + this.firstName + " " + this.lastName);
			
			//Llamamos al metodo preguntando por el departamento - y devuelve el departamento
			this.department = estableceDepartamento(); //llamamos al metodo y lo guardamos en la variable department
			System.out.println("Departamento elegido: " +this.department); // imprime eleccion
			
			//Llamamos al metodo que devuelve un pass aleatorio
			this.password = passAleatorio(defaultPassLength);
			System.out.println("Your password is: " + this.password);
			
			// combinamos elementos para generar email 
			email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ "@"+department + "." +companySuffix;
			System.out.println("Tu email es: "+ email);
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
		private String passAleatorio(int length) {
			String establecePassword= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
			char[] password = new char[length];
			for (int i=0; i<length; i++) {
				int rand = (int) (Math.random() * establecePassword.length());
				password[i] = establecePassword.charAt(rand); 
			}
			return new String(password);
		}
		
		//Establecemos capacidad del email
		
		
		//Establecemos email alternativo
		
		
		//Cambiar de password
	
		
}

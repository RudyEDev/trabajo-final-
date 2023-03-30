package bankperu;
import java.util.Scanner;

public abstract class clasepadreabst {
	
	protected int transacciones, retiro, deposito;
	private static int saldo;
	Scanner entrada = new Scanner(System.in);
	
	public void Condicion() {
		int bandera = 0;
		int seleccion = 0;
		
		do {
			do {
				System.out.println("Elija la operacion a realizar en base al número:");
				System.out.println(" [1] Consulta de Saldo:");
				System.out.println(" [2] Retiro de Efectivo:");
				System.out.println(" [3] Deposito de Efectivo:");
				System.out.println(" [4] Salir:");
				seleccion = entrada.nextInt();
				if (seleccion >= 1 && seleccion <= 4) {					
					bandera = 1;
				}else {
					System.out.println("----------------------------------------------");
					System.out.println("Error! Opcion no Valida,vuelva a intentarlo:");
					System.out.println("----------------------------------------------");
				}							
								
			}while (bandera == 0);
			
			if(seleccion == 1) {
				clasepadreabst mensajero = new clasehijaconsul();
				            mensajero.Transacciones();				            
			} else if (seleccion == 2) {
				clasepadreabst mensajero = new clasehijaretiro();
				            mensajero.Transacciones();
			} else if (seleccion == 3) {
				clasepadreabst mensajero = new clasehijadepos();
				            mensajero.Transacciones(); 				
 			} else if (seleccion == 4) {
				System.out.println("----------------------------------------------------------------------------------");
				System.out.println("Gracias Por Utilizar Nuestros Servicios, Su operacion fue realizada correctamente.");
				System.out.println("----------------------------------------------------------------------------------");
				bandera = 2;
			}
				
		} while (bandera != 2);
		
		
			
	}
	//METODO PARA SOLICITAR RETIRO 
	public void retiro() {
		retiro = entrada.nextInt();
	}
	//METODO PARA SOLICITAR DEPOSITO 
	public void Deposito () {
		deposito = entrada.nextInt();
	}
    //METODO ABSTRATO
	public abstract void Transacciones();
	
    //METODO SETTER Y GETTER 
	public int getsaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


}

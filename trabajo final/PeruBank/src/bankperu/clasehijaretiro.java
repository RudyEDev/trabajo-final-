package bankperu;

public class clasehijaretiro extends clasepadreabst{

	@Override
	public void Transacciones() {
		// TODO Auto-generated method stub
		
		System.out.println("Digite Su Monto a Retirar: ");
		retiro();
		
		if (retiro <= getsaldo()) {
			transacciones = getsaldo();
			setSaldo(transacciones - retiro);
			System.out.println("==========================================");
			System.out.println("Tu retiro fue de: " + retiro);
			System.out.println("Tu Saldo actual es de: " + getsaldo());
			System.out.println("==========================================");
				
			
		}else {
			System.out.println("-------------------------------");
			System.out.println("Fondo Insuficiente" );			
			System.out.println("-------------------------------");
		}
		
	}

}

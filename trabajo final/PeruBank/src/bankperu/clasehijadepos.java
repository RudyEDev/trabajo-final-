package bankperu;

public class clasehijadepos extends clasepadreabst{

	@Override
	public void Transacciones() {
		// TODO Auto-generated method stub
		
		System.out.println("Digite Su Monto a Depositar: ");
		Deposito();
		
		
		transacciones = getsaldo();
		setSaldo(transacciones + deposito);
		System.out.println("=================================================");
		System.out.println("Su depósito es de: " + deposito);
		System.out.println("Su Saldo Actual Es " + getsaldo());
		System.out.println("=================================================");
		
	}

}

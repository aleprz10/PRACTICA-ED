package es.estudium.TestBanco;

public class TestBanco {
	private static final String TXTLCD = "La cuenta de ";
	private static final String TXTt = "tiene ";
	private static final String DIVISAEU = "euros.";
	private static final double €PORDEFECTO = 100;
	
	public static void main(String[] args) 
	{
		/* Antonio y Beatriz se hacen cliente del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
 
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = new Cuenta(48151, €PORDEFECTO, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, €PORDEFECTO, beatriz);
 
		/* Antonio y Beatriz consultan el saldo */
		System.out.println(TXTLCD + cuentaAntonio.getCliente().getNombre() + TXTt
				+ cuentaAntonio.getSaldo() + TXTt);
		System.out.println(TXTLCD + cuentaBeatriz.getCliente().getNombre() + TXTt
				+ cuentaBeatriz.getSaldo() + TXTt);
 
		/* Beatriz transfiere 50€ a Antonio */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 50);
 
		/* Antonio y Beatriz vuelven a consultar para comprobar que todo ha ido bien */
		System.out.println(TXTLCD + cuentaAntonio.getCliente().getNombre() + TXTt
				+ cuentaAntonio.getSaldo() + TXTt);
		System.out.println(TXTLCD + cuentaBeatriz.getCliente().getNombre() + TXTt
				+ cuentaBeatriz.getSaldo() + TXTt);
 
		/* Antonio gana 100€ en una rifa y hace un ingreso en su cuenta */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + €PORDEFECTO);
 
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30);
 
		/* Antonio transfiere 50€ a Beatriz */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);
	}
}
package Tarefa1;

public class Principal {
	
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente (91.2, 1.84);
		Paciente paciente2 = new Paciente (72.7, 1.73);
		Paciente paciente3 = new Paciente (60.1, 1.58);
		
		
		System.out.println("------Paciente 1------");
		paciente1.calcularIMC();
		paciente1.diagnostico();
		System.out.println("------Paciente 2------");
		paciente2.calcularIMC();
		paciente2.diagnostico();
		System.out.println("------Paciente 3------");
		paciente3.calcularIMC();
		paciente3.diagnostico();
	}
}
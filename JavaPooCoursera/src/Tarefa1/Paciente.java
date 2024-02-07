package Tarefa1;

public class Paciente {
	double peso, altura, imc;
	String diagnostico, valorIMC;
	
	
	public Paciente (double pesoPaciente, double alturaPaciente) {
		peso=pesoPaciente;
		altura=alturaPaciente; 
	}
	
	void calcularIMC() {
		imc = peso / (altura * altura);
	}
	
	public void diagnostico() {

        if (imc < 16) {
            System.out.println("IMC: " + imc + "\nBaixo peso muito grave = IMC abaixo de 16 kg");
        } else if ((imc >= 16) && (imc <= 16.99)) {
            System.out.println("IMC: " + imc + "\nBaixo peso grave = IMC entre 16 e 16,99 kg");
        } else if ((imc >= 17) && (imc <= 18.49)) {
            System.out.println("IMC: " + imc + "\nBaixo peso = IMC entre 17 e 18,49 kg");
        } else if ((imc >= 18.50) && (imc <= 24.99)) {
            System.out.println("IMC: " + imc + "\nPeso normal = IMC entre 18,50 e 24,99 kg");
        } else if ((imc >= 25) && (imc <= 29.99)) {
            System.out.println("IMC: " + imc + "\nSobrepeso = IMC entre 25 e 29,99 kg");
        } else if ((imc >= 30) && (imc <= 34.99)) {
            System.out.println("IMC: " + imc + "\nObesidade grau I = IMC entre 30 e 34,99 kg");
        } else if ((imc >= 35) && (imc <= 39.99)) {
            System.out.println("IMC: " + imc + "\nObesidade grau II = IMC entre 35 e 39,99 kg");
        } else if ((imc >= 40)) {
            System.out.println("IMC: " + imc + "\nObesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg");
        }
    }
}
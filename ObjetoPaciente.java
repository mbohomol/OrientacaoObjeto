package br.com.generation.poo;

public class ObjetoPaciente {

	public static void main(String[] args) {
		
		Paciente objeto_paciente = new Paciente();
		
		objeto_paciente.nome = "Milene";
		objeto_paciente.idade = 19;
		objeto_paciente.altura = 1.65;
		objeto_paciente.peso = 55.0;
	
		
		System.out.println("O nome do paciente é: " + objeto_paciente.nome);
		System.out.println("A idade do paciente é: " + objeto_paciente.idade);
		System.out.println("A altura do paciente é: " + objeto_paciente.altura);
		System.out.println("O peso do paciente é: " + objeto_paciente.peso);
			objeto_paciente.paciente_dieta();
			objeto_paciente.paciente_exercicios();
			System.out.println();
		
		
			}
		
	}



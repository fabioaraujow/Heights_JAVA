package application;

import java.util.Scanner;
import entities.PeopleData;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		String nome;
		
		System.out.print("Informe a quantidade de dados a serem inseridos: ");

		 while (true) {
	            if (sc.hasNextInt()) {
	                n = sc.nextInt();
	                if (n > 0) {
	                	sc.nextLine();
	                	break;
	                } else {
	                	System.out.println("Dados inválidos. Tente novamente!");
		                System.out.print("Informe a quantidade de dados a serem inseridos: ");
		                sc.nextLine();
	                }
	            } else {
	                System.out.println("Dados inválidos. Tente novamente!");
	                System.out.print("Informe a quantidade de dados a serem inseridos: ");
	                sc.nextLine();
	            }
	        }
		
		PeopleData dadosPessoas = new PeopleData();
		PeopleData[] dPessoas = new PeopleData[n];
		
		double altura;
		int idade;
		
		for (int i = 0; i < dPessoas.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			
			System.out.print("Primeiro nome: ");
			while (true) {
			    nome = sc.nextLine();
			    if (nome.matches("[a-zA-ZÀ-ÿ]+")) {
			        break;
			    } else {
			        System.out.println("Dado(S) inválido(S). Tente novamente!");
			        System.out.print("Primeiro nome: ");
			    }
			}
			
			System.out.print("Idade: ");
			while (true) {
	            if (sc.hasNextInt()) {
	                idade = sc.nextInt();
	                if (idade > 0) {
	                	sc.nextLine();
	                	break;
	                } else {
	                	System.out.println("Dados inválidos. Tente novamente!");
		                System.out.print("Idade: ");
		                sc.nextLine();
	                }
	            } else {
	                System.out.println("Dados inválidos. Tente novamente!");
	                System.out.print("Idade: ");
	                sc.nextLine();
	            }
	        }
			
			System.out.print("Altura: ");
			while (true) {
	            if (sc.hasNextDouble()) {
	                altura = sc.nextDouble();
	                if (altura > 0) {
	                	sc.nextLine();
	                	break;
	                } else {
	                	System.out.println("Dados inválidos. Tente novamente!");
		                System.out.print("Altura: ");
		                sc.nextLine();
	                }
	            } else {
	                System.out.println("Dados inválidos. Tente novamente!");
	                System.out.print("Altura: ");
	                sc.nextLine();
	            }
	        }
			dPessoas[i] = new PeopleData(nome, idade, altura);
		}
		
		double somaAlturas = 0.0, menores16 = 0.0; 
		
		for (int i = 0; i < dPessoas.length; i++) {
			somaAlturas += dPessoas[i].getAlturas();
			if (dPessoas[i].getIdades() < 16) {
				menores16++;
			}
		}
		
		double mediaAlturas = dadosPessoas.calculoMedia(somaAlturas, n);
		double porcentagem = dadosPessoas.calculoPorcentagemMenores16(menores16, n);
		
		System.out.printf("%nAltura Média = %.2f%n", mediaAlturas);
		
		System.out.printf("Pessoas com menos de 16 anos = %.2f%%%n", porcentagem);
		
		for (int i = 0; i < dPessoas.length; i++) {
			if (dPessoas[i].getIdades() < 16) {
				System.out.println(dPessoas[i].getNomes());
			}
		}	
		sc.close();
	}
}

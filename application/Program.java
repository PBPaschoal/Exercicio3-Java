/* Rio de Janeiro, Dia 12/01/2023
Exercício 3 
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestre do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). 
Ao final, mostrar qual a nota final do aluno no ano.
Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
Você deve criar uma classe Student para resolver este problema.

Exemplos:
Entrada:			Saída:
Alex Green			FINAL GRADE = 90.00
27.00				PASS
31.00
32.00

Entrada:			Saída:
Alex Green			FINAL GRADE = 52.00
17.00				FAILED
20.00				MISSING 8.00 POINTS
15.00 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner (System.in);
		
		Student student = new Student();
		
		student.name = teclado.nextLine();
		student.grade1 = teclado.nextDouble();
		student.grade2 = teclado.nextDouble();
		student.grade3 = teclado.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if(student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		teclado.close();
	}

}

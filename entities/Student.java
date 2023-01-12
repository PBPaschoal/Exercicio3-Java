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

package entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
	}
}

package NivelIntermediario.Exercicios.Ex03;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Matheus", 5000, NivelFuncionario.JUNIOR);

        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Nível do funcionario: " + funcionario.getNivel());
        System.out.println("Bônus: " + funcionario.calcularBonus());
        System.out.println();

        funcionario.promover();

        System.out.println("Nível do funcionario promovido: " + funcionario.getNivel());
        System.out.println("Novo bônus: " + funcionario.calcularBonus());
        System.out.println();

        for (NivelFuncionario nivelFuncionario : NivelFuncionario.values()) {
            System.out.println(nivelFuncionario);
        }
    }
}

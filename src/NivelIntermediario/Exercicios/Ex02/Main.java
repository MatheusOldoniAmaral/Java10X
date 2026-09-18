package NivelIntermediario.Exercicios.Ex02;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Matheus");
        funcionario.setSalario(5000);
        funcionario.setNivel(NivelFuncionario.SENIOR);

        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Nível do funcionario: " + funcionario.getNivel());

        funcionario.promover();
        System.out.println("Nível do funcionario promovido: " + funcionario.getNivel());
        System.out.println();

        for (NivelFuncionario nivelFuncionario : NivelFuncionario.values()) {
            System.out.println(nivelFuncionario);
        }
    }
}

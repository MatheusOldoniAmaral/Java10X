package NivelIntermediario.Exercicios.Ex03;

public class Funcionario {
    private String nome;
    private double salario;
    private NivelFuncionario nivel;

    public Funcionario(String nome, double salario, NivelFuncionario nivel) {
        this.nome = nome;
        this.salario = salario;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public NivelFuncionario getNivel() {
        return nivel;
    }

    public void setNivel(NivelFuncionario nivel) {
        this.nivel = nivel;
    }

    public void promover() {
        if (nivel == NivelFuncionario.JUNIOR) {
            nivel = NivelFuncionario.PLENO;
        } else if (nivel == NivelFuncionario.PLENO) {
            nivel = NivelFuncionario.SENIOR;
        } else if (nivel == NivelFuncionario.SENIOR) {
            nivel = NivelFuncionario.TECH_LEAD;
        }
    }

    public double calcularBonus() {
        return salario * nivel.getPercentualBonus();
    }
}

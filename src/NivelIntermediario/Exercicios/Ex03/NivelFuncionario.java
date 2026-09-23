package NivelIntermediario.Exercicios.Ex03;

public enum NivelFuncionario {
    JUNIOR(0.05),
    PLENO(0.10),
    SENIOR(0.15),
    TECH_LEAD(0.20);

    double percentualBonus;

    NivelFuncionario(double percentualBonus) {
        this.percentualBonus = percentualBonus;
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }
}

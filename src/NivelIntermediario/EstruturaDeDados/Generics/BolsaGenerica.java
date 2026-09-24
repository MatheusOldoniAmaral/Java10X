package NivelIntermediario.EstruturaDeDados.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos = new ArrayList<>();

    public BolsaGenerica() {
    }

    public BolsaGenerica(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    // Colocar equipamentos Genericos
    public void adicionarEquipamentos(T equipamentoGenerico) {
        equipamentos.add(equipamentoGenerico);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipantos: " + equipamentos.toString();
    }
}

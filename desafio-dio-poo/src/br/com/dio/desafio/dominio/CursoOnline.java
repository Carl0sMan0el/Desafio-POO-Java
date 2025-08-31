package br.com.dio.desafio.dominio;

public class CursoOnline extends Atividade {

    private int duracaoHoras;

    @Override
    public double obterExperiencia() {
        return VALOR_BASE_XP * duracaoHoras;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    @Override
    public String toString() {
        return "CursoOnline{" +
                "nome='" + getNome() + '\'' +
                ", detalhes='" + getDetalhes() + '\'' +
                ", duracaoHoras=" + duracaoHoras +
                '}';
    }
}

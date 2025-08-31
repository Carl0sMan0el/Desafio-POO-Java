package br.com.dio.desafio.dominio;

public abstract class Atividade {

    protected static final double VALOR_BASE_XP = 12d;

    private String nome;
    private String detalhes;

    public abstract double obterExperiencia();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}

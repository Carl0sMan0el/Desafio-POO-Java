package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Desenvolvedor {

    private String nome;
    private Set<Atividade> atividadesPendentes = new LinkedHashSet<>();
    private Set<Atividade> atividadesConcluidas = new LinkedHashSet<>();

    public void participarTrilha(Trilha trilha) {
        this.atividadesPendentes.addAll(trilha.getAtividades());
        trilha.getParticipantes().add(this);
    }

    public void avancar() {
        Optional<Atividade> atividade = this.atividadesPendentes.stream().findFirst();
        if (atividade.isPresent()) {
            this.atividadesConcluidas.add(atividade.get());
            this.atividadesPendentes.remove(atividade.get());
        } else {
            System.err.println("Nenhuma atividade pendente para avançar.");
        }
    }

    public double calcularExperienciaTotal() {
        return this.atividadesConcluidas
                .stream()
                .mapToDouble(Atividade::obterExperiencia)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Atividade> getAtividadesPendentes() {
        return atividadesPendentes;
    }

    public void setAtividadesPendentes(Set<Atividade> atividadesPendentes) {
        this.atividadesPendentes = atividadesPendentes;
    }

    public Set<Atividade> getAtividadesConcluidas() {
        return atividadesConcluidas;
    }

    public void setAtividadesConcluidas(Set<Atividade> atividadesConcluidas) {
        this.atividadesConcluidas = atividadesConcluidas;
    }
}

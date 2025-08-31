package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class SessaoMentoria extends Atividade {

    private LocalDate agendamento;

    @Override
    public double obterExperiencia() {
        return VALOR_BASE_XP + 25d;
    }

    public LocalDate getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(LocalDate agendamento) {
        this.agendamento = agendamento;
    }

    @Override
    public String toString() {
        return "SessaoMentoria{" +
                "nome='" + getNome() + '\'' +
                ", detalhes='" + getDetalhes() + '\'' +
                ", agendamento=" + agendamento +
                '}';
    }
}

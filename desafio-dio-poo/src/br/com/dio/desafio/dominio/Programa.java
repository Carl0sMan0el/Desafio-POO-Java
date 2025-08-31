package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Programa {
    public static void main(String[] args) {

        CursoOnline javaBasico = new CursoOnline();
        javaBasico.setNome("Introdução ao Java");
        javaBasico.setDetalhes("Aprenda os fundamentos da linguagem Java.");
        javaBasico.setDuracaoHoras(10);

        CursoOnline springBoot = new CursoOnline();
        springBoot.setNome("Spring Boot Essencial");
        springBoot.setDetalhes("Crie APIs modernas com Spring Boot.");
        springBoot.setDuracaoHoras(8);

        SessaoMentoria mentoriaJava = new SessaoMentoria();
        mentoriaJava.setNome("Mentoria de Java");
        mentoriaJava.setDetalhes("Sessão para tirar dúvidas sobre Java.");
        mentoriaJava.setAgendamento(LocalDate.now());

        Trilha trilhaJava = new Trilha();
        trilhaJava.setTitulo("Trilha Java Developer");
        trilhaJava.setResumo("Aprenda do básico ao avançado em Java.");
        trilhaJava.getAtividades().add(javaBasico);
        trilhaJava.getAtividades().add(springBoot);
        trilhaJava.getAtividades().add(mentoriaJava);

        Desenvolvedor devAna = new Desenvolvedor();
        devAna.setNome("Ana");
        devAna.participarTrilha(trilhaJava);
        System.out.println("Atividades pendentes de Ana: " + devAna.getAtividadesPendentes());
        devAna.avancar();
        System.out.println("Atividades concluídas de Ana: " + devAna.getAtividadesConcluidas());
        System.out.println("XP total de Ana: " + devAna.calcularExperienciaTotal());

        System.out.println("----");

        Desenvolvedor devCarlos = new Desenvolvedor();
        devCarlos.setNome("Carlos");
        devCarlos.participarTrilha(trilhaJava);
        System.out.println("Atividades pendentes de Carlos: " + devCarlos.getAtividadesPendentes());
        devCarlos.avancar();
        devCarlos.avancar();
        System.out.println("Atividades concluídas de Carlos: " + devCarlos.getAtividadesConcluidas());
        System.out.println("XP total de Carlos: " + devCarlos.calcularExperienciaTotal());
    }
}

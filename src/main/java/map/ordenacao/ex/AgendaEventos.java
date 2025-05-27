package main.java.map.ordenacao.ex;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate,Evento> agendaEventosMap;

    public AgendaEventos() {
        agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate date, String nome, String atracao) {
        agendaEventosMap.put(date, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate date = LocalDate.now();
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);

        LocalDate proximoData = null;
        Evento proximoEvento = null;

        for(Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()) {
            proximoData = entry.getKey();
            if(proximoData.equals(date)|| proximoData.isAfter(date)) {
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento+ " acontecerá em "+proximoData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025,10,23),"Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025,05,26),"Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MAY,23),"Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024,6,23),"Evento 4", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023,7,23),"Evento 5", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2025,8,23),"Evento 6", "Atração 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}

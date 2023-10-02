package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap
                .isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
       if (!agendaContatoMap.isEmpty()) {
          numeroPorNome = agendaContatoMap.get(nome);
       }
       return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Raquel", 123456);
        agendaContatos.adicionarContato("Raquel", 5665);
        agendaContatos.adicionarContato("Raquel Silva", 11111111);
        agendaContatos.adicionarContato("Raquel 010", 4564987);
        agendaContatos.adicionarContato("Raquel Bezerra", 11111111);
        agendaContatos.adicionarContato("Raquel", 444444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Raquel Bezerra");
        agendaContatos.exibirContatos();
        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Raquel 010"));
    }
}

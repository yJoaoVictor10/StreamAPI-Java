package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PokeminComStream {
    public static void main(String[] args) {
        HashMap<String, String> pokemons = new HashMap<>();
        do{
            try {
                String nome, tipo;
                do{
                    nome = JOptionPane.showInputDialog("Digite o nome de um pokémon ou digite FIM para encerrar").toUpperCase();
                    if(!nome.equals("FIM")){
                        if(pokemons.containsKey(nome)){
                            JOptionPane.showMessageDialog(null, "Este pokémon já foi capturado!");
                        }else{
                            tipo = JOptionPane.showInputDialog("Digite o tipo deste pokémon").toUpperCase();
                            pokemons.put(nome, tipo);
                        }
                    }
                }while(!nome.equals("FIM"));
                String escolha = JOptionPane.showInputDialog("Escolha um tipo qualquer de pokémon").toUpperCase();
                ArrayList<String> nomesEncontrados = new ArrayList<>();
                for(Map.Entry<String, String> pokemon : pokemons.entrySet()){
                    if(pokemon.getValue().equals(escolha)){
                        nomesEncontrados.add(pokemon.getKey());
                    }
                }
                if(nomesEncontrados.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Não há pokémons capturados do tipo: " + escolha);
                }else{
                    JOptionPane.showMessageDialog(null, "Lista de pokémons capturados do tipo: " + escolha + "\n" + nomesEncontrados);
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION)==0);
        JOptionPane.showMessageDialog(null, "Fim de programa", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}

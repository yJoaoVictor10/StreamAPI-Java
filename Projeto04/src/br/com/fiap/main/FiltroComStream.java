package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroComStream {
    public static void main(String[] args) {
        ArrayList<String> herois = new ArrayList<>(
                Arrays.asList("Homem Aranha", "Wolverine", "Hulk", "Homem Elástico",
                        "Mulher Invísivel", "Tocha Humana", "Coisa", "Homem de Ferro",
                        "Viúva Negra", "Super Homem", "Mulher Maravilha", "Batman", "Lanterna",
                        "Verde", "Ciclope")
        );
        List<String> heroisComH = herois.stream()
                .filter(heroi -> heroi.startsWith("H"))
                .collect(Collectors.toList());

        JOptionPane.showMessageDialog(null, "Heróis que começam com a letra H:\n" + heroisComH);
    }
}

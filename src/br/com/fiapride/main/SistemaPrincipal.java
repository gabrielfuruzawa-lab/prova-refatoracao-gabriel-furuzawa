package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {
        System.out.println("--- Teste de Refatoração FiapRide ---");

        Veiculo veiculo1 = new Veiculo("Carlos", "ABC-1234");
        
        System.out.println("\n--- Status do Veículo ---");
        System.out.println("Motorista: " + veiculo1.getMotorista() + 
                           " | Placa: " + veiculo1.getPlaca() + 
                           " | Gasolina: " + veiculo1.getGasolina() + "L");

        System.out.println("\n>>> Tentando adicionar valor negativo:");
        veiculo1.adicionarGasolina(-10); 

        System.out.println("\n>>> Adicionando gasolina corretamente:");
        veiculo1.adicionarGasolina(50); 

        System.out.println("\n>>> Tentando gastar mais do que tem no tanque:");
        veiculo1.gastarGasolina(100);

        System.out.println("\n>>> Gastando gasolina corretamente:");
        veiculo1.gastarGasolina(20); 

        System.out.println("\n--- Status do Veículo ---");
        System.out.println("Motorista: " + veiculo1.getMotorista() + 
                           " | Placa: " + veiculo1.getPlaca() + 
                           " | Gasolina: " + veiculo1.getGasolina() + "L");
    }
}
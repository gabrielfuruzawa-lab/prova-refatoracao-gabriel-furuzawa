package br.com.fiapride.model;

public class Veiculo {
    
    private String motorista;
    private String placa;
    private double litrosGasolina; 

    public Veiculo(String motorista, String placa) {
        this.motorista = motorista;
        this.placa = placa;
        this.litrosGasolina = 0.0;
    }

    public void abastecer(double litros) {
        if (litros <= 0) {
            System.out.println("Erro: A quantidade de litros gasolina para abastecimento deve ser maior que zero.");
            return;
        }
        this.litrosGasolina += litros;
        System.out.println("Abastecimento realizado com sucesso. Gasolina atual: " + this.litrosGasolina + " L");
    }

    public void consumirCombustivel(double litros) {
        if (litros <= 0) {
            System.out.println("Erro: A quantidade a ser gasta é inválida.");
            return;
        }
        if (this.litrosGasolina < litros) {
            System.out.println("Erro: Combustível insuficiente no tanque para realizar este percurso!");
            return;
        }
        this.litrosGasolina -= litros;
        System.out.println("Percurso realizado. Gasolina restante: " + this.litrosGasolina + " L");
    }

    public String getMotorista() {
        return motorista;
    }

    public String getPlaca() {
        return placa;
    }

    public double getLitrosGasolina() {
        return litrosGasolina;
    }
}
package br.com.fiapride.model;

public class Veiculo {
    
    private String motorista;
    private String placa;
    private double gasolina; 

    public Veiculo(String motorista, String placa) {
        this.motorista = motorista;
        this.placa = placa;
        this.gasolina = 0.0;
    }

    public void adicionarGasolina(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade de gasolina para abastecer deve ser maior que zero.");
            return;
        }
        this.gasolina += quantidade;
        System.out.println("Abastecimento realizado com sucesso. Gasolina atual: " + this.gasolina + "L");
    }

    public void gastarGasolina(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade a ser gasta é inválida.");
            return;
        }
        if (this.gasolina < quantidade) {
            System.out.println("Erro: Combustível insuficiente no tanque para realizar este percurso!");
            return;
        }
        this.gasolina -= quantidade;
        System.out.println("Percurso realizado. Gasolina restante: " + this.gasolina + "L");
    }

    public String getMotorista() {
        return motorista;
    }

    public String getPlaca() {
        return placa;
    }

    public double getGasolina() {
        return gasolina;
    }
}
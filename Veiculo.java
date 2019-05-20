public class Veiculo{
    private final double consumoPorLitro = 12;
    private final double tanque = 50; 
    private Placa placa;
    private double combustivel;
    
    public Veiculo(Placa placa){
        this.placa = placa;
        combustivel = 0;
    }

    public void setPais(String pais){
        placa.setPais(pais);
    }

    public Placa getPlaca(){
        return placa;
    }

    public double getCombustivelNoTanque(){
        return combustivel;
    }

    public double abastece(double litros){
        double soma = combustivel + litros;
        if (litros > 0.0){
            if(soma > tanque){
                litros = tanque - combustivel;
                combustivel = tanque;
            }
            else combustivel = soma;
        }
        return litros;
    }

    public double dirige(double distancia){
        // Calcula o consumo para a distancia
        double consumo = distancia / consumoPorLitro;
        // Diminui o combustivel gasto e retorna a distancia percorrida
        if (combustivel >= consumo){
            combustivel -= consumo;
            return distancia;
        }else{
            double distPossivel = combustivel * consumoPorLitro;
            combustivel = 0.0;
            return distPossivel;
        }
    }

    public String toString(){
        return "Placa: "+getPlaca()+", combustivel no tanque: "+getCombustivelNoTanque();
    }
}
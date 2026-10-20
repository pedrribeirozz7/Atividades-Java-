

public class Estacionamento {
    public static void main(){
        String veiculo = IO.readln("Entre com o veículo (M/C/CE): ");
        double tempo = Double.parseDouble(IO.readln("Entre com o tempo (h): "));
        int dia = Integer.parseInt(IO.readln("Entre com o dia (1/2/3)"));
        try{
        double valorTotal = calculaTarifa(veiculo, tempo, dia);
        IO.println(String.format("Valor a pagar:  %.2f" , valorTotal));
        } catch (RuntimeException e){
            IO.println("Erro: " + e.getMessage());
        }
    }
    static double obtemTarifaBase(String veiculo){
        double tarifaBase = 0; 
        switch(veiculo){
            case "M": tarifaBase += 5.00; break;
            case "C": tarifaBase += 10.00; break;
            case "CE": tarifaBase += 20.00; break;
            default: throw new RuntimeException("Veiculo não identificado");
        }
        return tarifaBase; 
    }
    static double calculaAdicional(double horas){
        if (horas <= 0){
            throw new RuntimeException("horário inválido");
        }
        else{
            if(horas <= 0.5){
                return 0;
            }
            else
            if(horas > 0.5 && horas <= 2.0){
                return 8.0;
            }
            else 
            if(horas > 2.0 && horas <= 6.0){
                return 20.0; 
            }
            else{
                double limite = 6.0; 
                double excedente = (horas - limite) * 60;  
                return 30 + (excedente * 0.05);
            }
        }
        }
    static double aplicaDia(int dia){
        double valorDia = 1;
        switch(dia){
            case 1: valorDia = 1;
            break;
            case 2: valorDia = valorDia - (valorDia * 0.20);
            break; 
            case 3: valorDia = valorDia * 2;
            break;
            default: throw new RuntimeException("dia inválido");
        }
        return valorDia;
    }
    static double calculaTarifa(String veiculo, double horas, int dia){
        double tarifaVec = obtemTarifaBase(veiculo);
        double taxaHoras = calculaAdicional(horas);
        double valorDia = aplicaDia(dia);
        double valorTotal = (tarifaVec + taxaHoras) * valorDia; 
        return valorTotal;
    }

}

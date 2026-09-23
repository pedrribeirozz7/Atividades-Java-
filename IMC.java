void main(){
    double peso = Double.parseDouble(IO.readln("entre com o peso"));
    double altura = Double.parseDouble(IO.readln("entre com a altura"));
    double imc = peso / (altura * altura);
    if (imc < 18.5 ) {
        IO.println(String.format("%.2f", imc));
        IO.println("Abaixo do peso)");
    }
    else if (imc >= 18.5 && imc <= 24.9) {
        IO.println(String.format("%.2f", imc));
        IO.println("bom");
    }
    else if (imc >= 25.0 && imc <= 29.9) {
        IO.println(String.format("%.2f", imc));
        IO.println("Acima do peso");
    }
    else if (imc >= 30.0 && imc <= 34.9) {
        IO.println(String.format("%.2f", imc));
        IO.println("obesidade grau 1");
    }
    else if (imc >= 35.0 && imc <= 39.9) {
        IO.println(String.format("%.2f", imc));
        IO.println("obesidade grau 2");
    }
    else if (imc >= 40.0) {
        IO.println(String.format("%.2f", imc));
        IO.println("obesidade mórbida");
    }


}
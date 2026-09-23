//especificação do split :
void main() {
    String linha = IO.readln("altura e peso"); //aqui define qual vai ser o valor da string, mas não são valores reais, apenas uma frase.
    String[] partes = linha.split(" ");//aqui define de que jeito vai separar, pode ser de (" "), (/) ou (",")
    double altura = Double.parseDouble(partes[0]); //as partes significam literalmente em quantas partes a frase lida vai ser separada.
    double peso = Double.parseDouble(partes[1]);//aqui a altura e peso foram transformadas em double 
    IO.println("altura é: " + altura + "m²" + "e peso é: " + peso + "kg");

}

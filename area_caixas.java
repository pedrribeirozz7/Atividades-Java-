void main() {
    double altura = Double.parseDouble(IO.readln("Entre com a altura em m2: "));
    double largura = Double.parseDouble(IO.readln("Entre com a largura em m2: "));
    double profundidade = Double.parseDouble(IO.readln("Entre com a profundidade em m2: "));
    double volume = (largura * altura * profundidade);
    double area = 2 * (altura * largura + altura + profundidade + largura * profundidade);
    IO.println("A area é: " + area + "m2, e o volume é: " + volume + "m3");

}
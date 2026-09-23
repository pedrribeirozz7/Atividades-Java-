void main() {
    double fixo = 2000;
    double vendas = Double.parseDouble(IO.readln("Valor das vendas: "));
    int av_v = Integer.parseInt(IO.readln("Avaliação de vendedor"));
    double comissão;
        comissão = vendas * 0.05;
        double saltotal = fixo + comissão;
     if (vendas > 10.000) {
        comissão = vendas * 0.07;
    }
    if (av_v >= 8){
          saltotal += 500.0;
    }
    IO.println(String.format("%.2f" , saltotal));
}

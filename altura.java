void main() {
    String linha = IO.readln("Entre com os pés + polegadas");
    String[] partes = linha.split(" | ");
    double pés = Double.parseDouble(partes [0]);
    double polegadas = Double.parseDouble(partes [1]);
    double polegadasTotais = (pés * 12) + polegadas; // 1 pé, que vale 12 polegadas, mais as polegadas que foram pedidas, tudo fica em polegadas
    double cm = polegadasTotais * 2.54; // todas as polegadas acumuladas * 2.54
    double altura = cm / 100;// converte pra metros
    String resposta = String.format("A altura em metros: %.2f m2,", altura); // faz essa bosta ai pra deixar bonitin
    IO.println(resposta);
    
    
    
}

void main(){
    String linha = IO.readln("Entre com a P1 + R1");
    String[] partes = linha.split(" ");
    double P1 = Double.parseDouble(partes [0]);
    double R1 = Double.parseDouble(partes [1]);

    String linha2 = IO.readln("Entre com a P2 + R2");
    String[] partes2 = linha2.split(" ");
    double P2 = Double.parseDouble(partes2 [0]);
    double R2 = Double.parseDouble(partes2[1]);

    String linha3 = IO.readln("Entre com a P3 + R3");
    String[] partes3 = linha3.split(" ");
    double P3 = Double.parseDouble(partes3 [0]);
    double R3 = Double.parseDouble(partes3[1]);

    int frequencia = Integer.parseInt(IO.readln("Entre com a frequencia"));

    Double AV1 = Math.max(P1, R1);
    Double AV2 = Math.max(P2, R2);
    Double AV3 = Math.max(P3, R3);

    double media = (AV1 + AV2 + AV3) / 3;
    long media_arr = Math.round(media);

    boolean aprovado = (media >= 6 || frequencia >= 75); 

    IO.println(String.format("Média %.1f", media));
    IO.println("Media arredondada: " + media_arr);
    IO.println(aprovado);


    


}

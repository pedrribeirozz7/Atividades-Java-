void main() {
    String linha = IO.readln("Entre com a data de hoje em dia/mes/ano");
    String[] partes = linha.split("/");
    int dia = Integer.parseInt(partes [0]);
    int mes = Integer.parseInt(partes[1]);
    int ano = Integer.parseInt(partes [2]);

    String nomeMes = switch (mes) {
        case 1 -> "January";
        case 2 -> "February";
        case 3 -> "March";
        case 4 -> "April";
        case 5 -> "May";
        case 6 -> "June";
        case 7 -> "July";
        case 8 -> "August";
        case 9 -> "September";
        case 10 -> "October";
        case 11 -> "November";
        case 12 -> "December";
        default -> "Mês inválido";
    };
   String sufixo =  switch (dia) {
        case 1, 21, 31 -> "st";
        case 2, 22 -> "nd";
        case 3, 23 -> "rd";
        case 4, 14, 24 -> "th";
        default -> "th";
    };

    IO.println(nomeMes + " " + dia + sufixo + "," + ano );
}

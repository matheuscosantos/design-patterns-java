public class TesteDeDescontos {

    public static void main(String[] args) {
        CalculadorDeDesconto descontos = new CalculadorDeDesconto();

        Orcamento orcamento = new Orcamento(400);

        orcamento.adicionaItem(new Item("Caneta", 280.0));
        orcamento.adicionaItem(new Item("Lapis", 250));
        orcamento.adicionaItem(new Item("Lapis", 250));
        orcamento.adicionaItem(new Item("Lapis", 250));
        orcamento.adicionaItem(new Item("Lapis", 250));
        orcamento.adicionaItem(new Item("Lapis", 250));

        double descontoFinal = descontos.calcula(orcamento);

        System.out.println(descontoFinal);

    }

}

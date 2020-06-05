public class TesteDaNotaFiscal {
    public static void main(String[] args) {

        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.paraEmpresa("Caelum")
            .comCNPJ("12.111.111/0001-12")
            .comItem(new ItemDaNota("Item 1", 200.0))
            .comItem(new ItemDaNota("Item 2", 300.0))
            .comItem(new ItemDaNota("Item 3", 400.0))
            .comObservacoes("Observações")
            .naDataAtual();

        NotaFiscal notaFiscal = builder.constroi();

        System.out.println(notaFiscal.getValorBruto());
    }
}

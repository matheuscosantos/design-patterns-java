public class TesteAcoes{
    public static void main(String[] args) {
        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.adicionaAcao(new EnviadorDeEmail());
        builder.adicionaAcao(new NotaFiscalDAO());
        builder.adicionaAcao(new EnviadorDeSms());
        builder.adicionaAcao(new Impressora());

        NotaFiscal nf = builder.paraEmpresa("Caelum")
                               .comCNPJ("11111111111")
                               .comItem(new ItemDaNota("Item",100))
                               .comObservacoes("obs")
                               .naDataAtual()
                               .constroi();

        System.out.println(nf.getValorBruto());
    }
}

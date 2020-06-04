public abstract class TemplateDeImpostoCondicional implements Imposto{

    @Override
    public double calcula(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)){
            return maximaTaxacao(orcamento);
        }else{
            return minimaTaxacao(orcamento);
        }
    }

    abstract double minimaTaxacao(Orcamento orcamento);

    abstract double maximaTaxacao(Orcamento orcamento);

    abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}

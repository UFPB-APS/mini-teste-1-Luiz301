public class CustoSobreValorTotal implements Custo{
    
    private String nome;
    private double taxa;
   
    public CustoSobreValorTotal(String nome, double taxa){
        this.nome = nome;
        this.taxa = taxa;
    }
    
    public double CalcularCustoTotal(Venda venda){
        return venda.getTotal() * taxa;
    }
}
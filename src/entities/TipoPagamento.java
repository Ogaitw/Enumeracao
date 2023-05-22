package entities;

public enum TipoPagamento {
    credito{
        @Override
        public double calculaDesconto(double valor) {
            return  valor*0.05;
        }
    }, debito{
        @Override
        public double calculaDesconto(double valor) {
            return valor*0.1;
        }
    };

    public double calculaDesconto (double valor){
        return 0;
    }

}

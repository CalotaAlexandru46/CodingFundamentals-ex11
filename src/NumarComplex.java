public class NumarComplex {
    double parteReala;
    double parteImaginara;

    NumarComplex(double parteReala, double parteImaginara) {
        this.parteReala = parteReala;
        this.parteImaginara = parteImaginara;
    }

    public String toString() {
        return parteReala+"+"+parteImaginara+"*i";
    }
    public NumarComplex sum(NumarComplex n){
        double rez_parteImaginara;
        double rez_parteReala;
        rez_parteImaginara=parteImaginara+n.parteImaginara;
        rez_parteReala=parteReala+n.parteReala;
        return new NumarComplex(rez_parteReala,rez_parteImaginara);
    }

    public NumarComplex substract(NumarComplex n){
        return new NumarComplex(parteReala-n.parteReala,parteImaginara-n.parteImaginara);
    }

    public boolean isReal(){
        return parteImaginara==0;
    }

}

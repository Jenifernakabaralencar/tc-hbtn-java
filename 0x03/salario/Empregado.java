public class Empregado {
    protected double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    public double calcularBonus(Departamento departamento){
        if (departamento.alcancouMeta()){
            return salarioFixo / 100 * 10;
        }else {
            return 0;
        }
    }

    public double calcularSalarioTotal(Departamento departamento){
        return salarioFixo + calcularBonus(departamento);
    }
    public double getSalarioFixo() {
        return salarioFixo;
    }

}

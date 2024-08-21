public class PessoaJuridica extends Pessoa{

    private String cpnj;

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    @Override
    public void pagarImposto(){
        System.out.println("CNPJ: " + this.cpnj + " [IRPJ pago]");
    }

}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PessoaFisica pf1 = new PessoaFisica();
        pf1.setNome("Diego");
        pf1.setCpf("0000000020");
        pf1.pagarImposto();

        PessoaFisica pf2 = new PessoaFisica();
        pf2.setNome("BORGES");
        pf2.setCpf("0000000090");
        pf2.pagarImposto();



        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setNome("EBAC");
        pj1.setCpnj("0001000020");
        pj1.pagarImposto();

        PessoaJuridica pj2 = new PessoaJuridica();
        pj2.setNome("ATUC");
        pj2.setCpnj("0002000010");
        pj2.pagarImposto();

    }

}
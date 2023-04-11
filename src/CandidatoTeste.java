import java.time.LocalDate;

public class CandidatoTeste {
    public static void main(String[] args) {
        Candidato cand = new Candidato();
        cand.nome = "Horácio Augusto da Silveira";
        cand.dataNascimento = LocalDate.of(2000,10,8);
        cand.email = "hc.augusto.silver@gmail.com";
        cand.celular = "(11) 99999-8888";
        cand.escolaridade = "Superior cursando";
        cand.funcao = "Bibliotecário";
        cand.pretensaoSalario = 2500.00;
        cand.estaEmpregado = false;
        cand.aceitaEstagio = true;
    }
}

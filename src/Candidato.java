import java.time.LocalDate;

public class Candidato {
    String nome;
    LocalDate dataNascimento;
    String email;
    String celular;
    String escolaridade;
    String funcao;
    double pretensaoSalario;
    boolean estaEmpregado;
    boolean aceitaEstagio;

    String verificarIdade(){
        LocalDate novaData = dataNascimento.plusYears(18);
        if(novaData.isBefore(LocalDate.now()))
            return "Maior de idade";
        else
            return "Menor de idade";

    }


    String verificarEstagio(){
        if (aceitaEstagio){
            if(!escolaridade.equals("Ensino medio - Cursando") && !escolaridade.equals("ensino superior - cursando"))
                return "O estágio só será permitido caso esteja cursando um curso, favor alterar sua escolha";
        }
        return "";
    }


}
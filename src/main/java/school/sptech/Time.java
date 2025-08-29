package school.sptech;

public class Time {
    String nome;
    Integer vitorias = 0, empates = 0, derrotas = 0;

    public void registrarVitoria() {
        vitorias++;
    }

    public void registrarEmpate() {
        empates++;
    }

    public void registrarDerrota() {
        derrotas++;
    }

    public Integer getPontos() {
        return (vitorias * 3) + empates;
    }

    public Integer getTotalPartidas() {
        return vitorias + derrotas + empates;
    }

    public Integer getAproveitamento() {
        double aproveitamento = (double)vitorias / getTotalPartidas() * 100;
        return(int) aproveitamento;
    }

    public void compararAproveitamento(Time TimeAdversario) {
        int aproveitamentoAdversario = TimeAdversario.getAproveitamento();
        if (this.getAproveitamento() > aproveitamentoAdversario) {
            System.out.println("O time " + this.nome +  " tem um aproveitamento maior que o time " + TimeAdversario.nome);
        } else {
            System.out.println("O time " + TimeAdversario.nome +  " tem um aproveitamento maior que o time " + this.nome);
        }
    }

    public void exibirInformacoes() {
        System.out.println("Time: " + nome);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
        System.out.println('\n');
        System.out.println("Pontos: " + getPontos());
        System.out.println("Total de Partidas: " + getTotalPartidas());
        System.out.println("Aproveitamento: " + getAproveitamento());
        System.out.println("\n---\n");
    }
}

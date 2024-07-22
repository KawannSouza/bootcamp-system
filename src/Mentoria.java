import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;
    
    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularXp'");
    }
}

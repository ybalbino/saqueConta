package excecoes;

public class ExcecaoComercial extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ExcecaoComercial(String msg){
        super(msg);
    }
}

class Ferista extends Funcionario
{
    private int periodo;

    public Ferista(int periodo){
        super(String nome, double salario);
        setPeriodo(periodo);
    }

    public int getPeriodo(){ return periodo; }

    public void setPeriodo(int periodo){
        this.periodo = (periodo < 0) ? 0 : periodo;
    }
}

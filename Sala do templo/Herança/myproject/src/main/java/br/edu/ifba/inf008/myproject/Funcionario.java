class Funcionario
{
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        setSalario(salario);
    }


    public String getNome(){ return nome; }
    public double getSalario(){ return salario; }

    public void setNome(String nome){ this.nome = nome; }
    public void setSalario(double salario){

        this.salario = (salario < 0) ? 0.0 : salario;
    }

    public double calcularPagamento(int dias, int horasTrabalhadas)
    {
        this.salario = horasTrabalhadas * dias;
    }

    public void exibirDados()
    {
        System.out.println("Nome do Funcionario: " + nome + "salario: " + salario);
    }

}

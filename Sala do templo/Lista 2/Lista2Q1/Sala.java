package Lista2Q1;

class Sala
{
    private int codigo;
    private int capacidade;
    private boolean status;

    public Sala(int codigo, int capacidade)
    {
        this.codigo = codigo;
        this.capacidade = capacidade;
        this.status = false;
    }

    public void display()
    {
        System.out.println("Sala " + codigo +
                            " | Capacidade: " + capacidade +
                            " | Ocupada: " + status);
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public boolean isBusy()
    {
        return status;
    }
}

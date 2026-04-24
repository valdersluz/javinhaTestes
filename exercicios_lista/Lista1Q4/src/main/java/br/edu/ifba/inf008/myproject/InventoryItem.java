package br.edu.ifba.inf008.myproject;

class InventoryItem
{
    private int itemCode;
    private String description;
    private double unitPrice;
    private int quantityInStock;
    private int minimumStockLevel;

    // construtores

    public InventoryItem(){

    }

    public InventoryItem(int itemCode){
        this.itemCode = itemCode;
        System.out.println("primeiro construtor");
    }

    public InventoryItem(int itemCode, String description){
        this(itemCode);
        this.description = description;
        System.out.println("segundo construtor");
    }

    // implementar um construtor que chama outro construtor para evitar duplicação de código

    public InventoryItem(String description, double unitPrice, int quantityInStock, int minimumStockLevel){
        this();
        this.unitPrice = unitPrice;
        this.quantityInStock = quantityInStock;
        this.minimumStockLevel = minimumStockLevel;
        System.out.println("terceiro construtor");
    }

    // getters e setters

    public int getItemCode(){
        return itemCode;
    }

    public String getDescription(){
        return description;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public int getQuantityInStock(){
        return quantityInStock;
    }

    public int getMinimumStockLevel(){
        return minimumStockLevel;
    }

    public void setItemCode(int itemCode){
        this.itemCode = itemCode;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public void setQuantityInStock(int quantityInStock){
        this.quantityInStock = quantityInStock;
    }

    public void setMinimumStockLevel(int minimumStockLevel){
        this.minimumStockLevel = minimumStockLevel;
    }



    // métodos
/*
    public void applyDiscount(double percentage){


    }

    public void updateStock(int quantity){   // com sobrecarga para diferentes cenários


    }

    public void isBelowMinimumStock(){   // verifica se está abaixo do estoque mínimo


    }
*/
}

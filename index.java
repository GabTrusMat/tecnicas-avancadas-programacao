class Carro {
    private String marca;
    private String modelo;
    
    // Método para definir a marca do carro
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    // Método para obter a marca do carro
    public String getMarca() {
        return marca;
    }
    
    // Método para definir o modelo do carro
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    // Método para obter o modelo do carro
    public String getModelo() {
        return modelo;
    }
}
public class index {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro();
        
        // Definindo valores para os atributos
        meuCarro.setMarca("Toyota");
        meuCarro.setModelo("Corolla");
        
        // Exibindo as informações do carro
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
    }
}
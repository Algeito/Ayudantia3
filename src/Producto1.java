public class Producto1 {
    private int id;
    private String name;
    private int precio;
    private boolean descuento;

    public Producto1(int id, String name, int precio, boolean descuento) {
        this.id = id;
        this.name = name;
        this.precio = precio;
        this.descuento = descuento;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }
}

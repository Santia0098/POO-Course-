public class Paypal extends Payment {
    String correo;

    public Paypal(Integer id, String correo) {
        super(id);
        this.correo = correo;
    }
}

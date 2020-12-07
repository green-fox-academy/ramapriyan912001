public class F16 extends Aircraft{

    public F16() {
        super(30,8);
    }

    public String getType() {
        return "F16";
    }

    public boolean isPriority() {
        return false;
    }
}

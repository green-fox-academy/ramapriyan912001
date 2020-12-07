public class F35 extends Aircraft{

    public F35() {
        super(50, 12);
    }

    public String getType() {
        return "F35";
    }

    public boolean isPriority() {
        return true;
    }
}

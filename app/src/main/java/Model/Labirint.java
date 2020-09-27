package Model;

public class Labirint {
    private int id;
    private int codigo;
    private float dist;
    private int codLeft;
    private int codRight;
    private int codFront;
    private int armPerCent;
    private int event;

    public Labirint() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getDist() {
        return dist;
    }

    public void setDist(float dist) {
        this.dist = dist;
    }

    public int getCodLeft() {
        return codLeft;
    }

    public void setCodLeft(int codLeft) {
        this.codLeft = codLeft;
    }

    public int getCodRight() {
        return codRight;
    }

    public void setCodRight(int codRight) {
        this.codRight = codRight;
    }

    public int getCodFront() {
        return codFront;
    }

    public void setCodFront(int codFront) {
        this.codFront = codFront;
    }

    public int getArmPerCent() {
        return armPerCent;
    }

    public void setArmPerCent(int armPerCent) {
        this.armPerCent = armPerCent;
    }

    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }
}

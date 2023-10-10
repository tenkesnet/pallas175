
public class CloneExample implements Cloneable {
    int i;
    XYZ xyz;

    public CloneExample(int i, XYZ xyz) {
        this.i = i;
        this.xyz = xyz;
    }

    public CloneExample clone() throws CloneNotSupportedException {
        return (CloneExample) super.clone();
    }

    @Override
    public String toString() {
        return String.format("[i=%d, xyz=%s]", i, xyz);
    }

    public static void main(String[] x) throws CloneNotSupportedException {
        CloneExample ct = new CloneExample(1, new XYZ(2, 3, 4));
        System.out.println("orig : " + ct);
        System.out.println("clone: " + ct.clone());
    }
}

class XYZ {
    int x, y, z;

    public XYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("[%d, %d, %d]", x, y, z);
    }
}

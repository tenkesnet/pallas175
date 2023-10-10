class XYZv1 {
    int x, y, z;
}

class Cloner1 implements Cloneable {
    int i;
    XYZv1 xyz1 = new XYZv1();

    public Cloner1 clone() throws CloneNotSupportedException {
        Cloner1 ct = (Cloner1) super.clone();

        // fordítási hiba: The method clone() from the type Object is not visible
        // ct.xyz1 = (XYZv1) ct.xyz1.clone();

        return ct;
    }
}

class XYZv2 {
    int x, y, z;

    public XYZv2 clone() throws CloneNotSupportedException {
        return (XYZv2) super.clone();
    }
}

class Cloner2 implements Cloneable {
    int i;
    XYZv2 xyz2 = new XYZv2();

    public Cloner2 clone() throws CloneNotSupportedException {
        Cloner2 ct = (Cloner2) super.clone();

        ct.xyz2 = (XYZv2) ct.xyz2.clone();

        return ct;
    }
}

class XYZv3 implements Cloneable {
    int x, y, z;

    public XYZv3 clone() throws CloneNotSupportedException {
        return (XYZv3) super.clone();
    }
}

class Cloner3 implements Cloneable {
    int i;
    XYZv3 xyz3 = new XYZv3();

    public Cloner3 clone() throws CloneNotSupportedException {
        Cloner3 ct = (Cloner3) super.clone();

        ct.xyz3 = (XYZv3) ct.xyz3.clone();

        return ct;
    }
}

public class CloneTrial implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        cloneTest1();
        cloneTest2();
        cloneTest3();
    }

    private static void cloneTest3() throws CloneNotSupportedException {
        Cloner3 orig3 = new Cloner3();
        Cloner3 clone = orig3.clone();
        orig3.xyz3.x = 1234;
        System.out.println(clone.xyz3.x);
    }

    private static void cloneTest2() {
        try {
            Cloner2 orig2 = new Cloner2();
            Cloner2 clone2 = orig2.clone();
            orig2.xyz2.x = 1234;
            System.out.println(clone2.xyz2.x);
        } catch (CloneNotSupportedException e) {
            System.out.println("v2: clone not supported");
        }
    }

    private static void cloneTest1() throws CloneNotSupportedException {
        Cloner1 orig1 = new Cloner1();
        Cloner1 clone1 = orig1.clone();
        orig1.xyz1.x = 1234;
        System.out.println(clone1.xyz1.x);
    }
}

//Old Style
public class W {
    public static void main(String a[]) {
        byte b = 2;
        Byte br = new Byte(b);
        
        int i =23;
        Integer ir = new Integer(i);
        
        boolean bo = true;
        Boolean boo = new Boolean(bo);
        
        double d = 23.44;
        Double dr = new Double(d);
        
        //autoboxing
        System.out.println(ir);
        System.out.println(br);
        System.out.println(dr);
        System.out.println(boo);
       //unboxing
        int in = ir;
        byte bn = br;
        double dn = dr;
        boolean brr = boo;
        
        System.out.println(in);
        System.out.println(bn);
        System.out.println(dn);
        System.out.println(brr);

    }
}






public class W {
    public static void main(String a[]) {
        //new style
        //autoboxing
        byte b = 2;
        Byte br = Byte.valueOf(b);
        
        int i =23;
        Integer ir = Integer.valueOf(i);
        
        boolean bo = true;
        Boolean boo = Boolean.valueOf(bo);
        
        double d = 23.44;
        Double dr = Double.valueOf(d);
        
        System.out.println(ir);
        System.out.println(br);
        System.out.println(dr);
        System.out.println(boo);
       //unboxing
        int in = ir.intValue();
        byte bn = br;
        double dn = dr;
        boolean brr = boo;
        
        System.out.println(in);
        System.out.println(bn);
        System.out.println(dn);
        System.out.println(brr);

    }
}
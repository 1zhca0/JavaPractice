package basic.July2019;

public class I {
	 public G g = new G();  
	    public static E statice0 = new E();  
	    static {  
	        statice0 = new E();  
	        System.out.println("判断static执行的顺序");  
	    }  
	    public static E statice1;  
	    public static F f1;  
	    static {  
	        System.out.println("测试在static块中执行的顺序1");  
	        statice1 = new E();  
	        f1 = new F();  
	    }  
	    static {  
	        System.out.println("测试在static块中执行的顺序2");  
	        f1 = new F();  
	        statice1 = new E();  
	    }  
	    public static H h = new H();  
	  
	    public E e;  
	    {  
	        System.out.println("aaa");  
	        e = new E();  
	    }  
	  
	    public I(int i) {  
	        statice0 = new E();  
	        f1 = new F();  
	        e = new E();          
	    }  
	  
	    public static void main(String[] args) {  
	        I i = new I(1);  
	    }  
}

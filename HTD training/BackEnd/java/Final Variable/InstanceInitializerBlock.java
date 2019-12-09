
public class InstanceInitializerBlock {
     final int MAXIMUM;
     final double PI;
     
    public InstanceInitializerBlock() {
    	System.out.println("Constructor is called");
    }
	public InstanceInitializerBlock(int a)
	{
	    
	    System.out.println("Constructor is overloaded");
	    
	}
    
    {
    	System.out.println("Instance Initialization block");
    	this.MAXIMUM=3000;
    	this.PI=3.88;
    }
}

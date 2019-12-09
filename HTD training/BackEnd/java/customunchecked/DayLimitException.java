package customunchecked;

public class DayLimitException extends RuntimeException{
    String msg="exceeds day limit";
    public DayLimitException()
    {
    	super();
    }
    public DayLimitException(String m)
    {
    	this.msg=m;
    }
     public String getMessage()
    {
    	return this.msg;
    }
}

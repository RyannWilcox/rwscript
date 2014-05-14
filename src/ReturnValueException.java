
public class ReturnValueException extends Exception {

    private Integer returnValue = null;

    public ReturnValueException (Integer returnValue) {
	this.returnValue = returnValue;
    }

    public Integer getReturnValue () {
	return this.returnValue;
    }
}
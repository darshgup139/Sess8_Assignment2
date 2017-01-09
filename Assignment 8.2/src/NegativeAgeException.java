
public class NegativeAgeException extends RuntimeException {
	String exceptionMsg;

	public NegativeAgeException(String exceptionMsg) {
		super();
		this.exceptionMsg = exceptionMsg;
	}

	@Override
	public String toString() {
		return "NegativeAgeException [" + exceptionMsg + "]";
	}

}

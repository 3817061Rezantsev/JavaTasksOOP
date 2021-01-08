package hortsmannInterfaces;

public interface IIntSequence {
	public int next();

	public static IIntSequence constant(int i) {
		return () -> {
			return i;
		};
	}
}

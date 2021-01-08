package hortsmannInterfaces;

public class IntSequence {
	public int next() {
		return -1;
	}

	public boolean hasNext() {
		return false;
	}

	public static IntSequence of(int... seq) {
		return new IntSequence() {
			private int[] s = seq;
			private int pos = 0;

			@Override
			public int next() {
				return s[pos++];
			}

			@Override
			public boolean hasNext() {
				if (pos < s.length)
					return true;
				return false;
			}
		};

	}

	public static void main(String[] args) {
		IntSequence seq = IntSequence.of(1, 2, 3, 45, 5);
		while (seq.hasNext()) {
			System.out.print(seq.next());
		}
		IIntSequence s = IIntSequence.constant(3);
		System.out.print(s.next());
		System.out.print(s.next());
		System.out.print(s.next());
	}
}

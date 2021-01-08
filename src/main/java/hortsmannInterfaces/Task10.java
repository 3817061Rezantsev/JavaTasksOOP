package hortsmannInterfaces;

public class Task10 {
	public static void runTogether(Runnable... tasks) throws InterruptedException {
		class Executor implements Runnable {
			private Runnable[] tasks;

			Executor(Runnable... tasks) {
				this.tasks = tasks;
			}

			public void run() {
				for (Runnable task : tasks)
					task.run();
			}
		}

		Thread thread = new Thread(new Executor(tasks));
		thread.start();
		thread.join();
	}

	public static void runInOrder(Runnable... tasks) {
		for (Runnable task : tasks)
			task.run();
	}

	public static void main(String[] args) throws InterruptedException {
		class InnerRunnable implements Runnable {
			int n;

			InnerRunnable(int n) {
				this.n = n;
			}

			public void run() {
				System.out.println(n);
			}
		}

		runTogether(new InnerRunnable(1), new InnerRunnable(2), new InnerRunnable(3), new InnerRunnable(4));

		runInOrder(new InnerRunnable(10), new InnerRunnable(11), new InnerRunnable(12), new InnerRunnable(13));
	}
}

package pond.shore;

public class BirdWatcher {
	public void watchBird(){
		Bird bird = new Bird();
		bird.floatInWater();
		System.out.println(bird.text);
	}
	public static void main(String[] args) {
		BirdWatcher bw = new BirdWatcher();
		bw.watchBird();
	}

}

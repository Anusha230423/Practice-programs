package pong.inland;

import pond.shore.Bird;

public class BirdWatcherFromFar {
	public void watchBird(){
		Bird bird = new Bird();
		bird.floatInWater();
		System.out.println(bird.text);
	}
	}

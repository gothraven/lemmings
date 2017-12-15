package main.module.game.level.factory;

import main.util.geometry.Position;
import main.module.game.level.factory.lemming.Lemming;

public class LemmingFactory {

	public static Lemming createLemming(Position pos) {
		// TODO you should make sure that the lemmings your return is an crashable
		return new Lemming(pos);
	}

}
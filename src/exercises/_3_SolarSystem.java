package exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _3_SolarSystem {

	private static void sortByDistanceFromSun(List<Planet> planets) {
		Collections.sort(planets, new Comparator<Planet>() {
			@Override
			public int compare(Planet p1, Planet p2) {
				return p1.getDistanceFromSun() - p2.getDistanceFromSun();
			}
		});
		planets.forEach((planet) -> {
			System.out.println(planet.getName() + " " + planet.getDistanceFromSun());
		});
		System.out.println("-------------------------------");
	}

	private static void sortInAlphabeticOrder(List<Planet> planets) {
		Collections.sort(planets, new Comparator<Planet>() {
			@Override
			public int compare(Planet p1, Planet p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		planets.forEach((planet) -> {
			System.out.println(planet.getName() + " ");
		});
		System.out.println("-------------------------------");

	}

	private static void sortBySize(List<Planet> planets) {
		Collections.sort(planets, new Comparator<Planet>() {
			@Override
			public int compare(Planet p1, Planet p2) {
				if (p1.getVolume() < p2.getVolume()) {
					return 1;
				} else if (p1.getVolume() > p2.getVolume()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		planets.forEach((planet) -> {
			System.out.println(planet.getName() + " " + planet.getVolume());
		});
		System.out.println("-------------------------------");
	}

	public static void main(String[] args) {
		List<Planet> planets = Arrays.asList(new Planet("Mercury", 57, 0.056, 0), new Planet("Venus", 108, 0.866, 0),
				new Planet("Jupiter", 779, 1321, 79), new Planet("Mars", 228, 0.151, 2), new Planet("Earth", 150, 1, 1),
				new Planet("Saturn", 1430, 763.59, 62));

		// 1: Sort the planets by distance from the sun
		sortByDistanceFromSun(planets);

		// 2. Sort the planets in alphabetical order
		sortInAlphabeticOrder(planets);

		// 3. Sort planets from largest to smallest
		sortBySize(planets);

	}

}

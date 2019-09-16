package examples;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoyfriendChooser {

	public static void main(String[] args) {

		Boy Jason = new Boy("Jason", true, false);
		Boy Frank = new Boy("Frank", false, true);
		Boy Brian = new Boy("Professor Brian Cox", true, true);
		
		List<Boy> boys = List.of(Jason, Frank, Brian);
		
		Stream<Boy> streamOfBoys = boys.stream();
		
		Predicate<Boy> predicate = boy -> boy.isFunny(); 	// this is a lambda expression	
		
		List<Boy> possibleBoyfriends = streamOfBoys
				.filter(predicate)
				.filter(boy -> boy.isEmotionallyAvailable())
				.collect(Collectors.toList());
		
		System.out.println(possibleBoyfriends);
		
	}

}

package b19Regular_Expressions;

import java.util.regex.Pattern;

/*
 * java
Only matches with java text, but won't match with Java

[Jj]ava
Matches with either Java or java

ye[sp]
Matches with either yes or yep

[sfk]it
Matches with sit or fit or kit

.ava
. for single character or anything

[0-9]am
Matches with 9am or 5am, but won't match with sam

[a-z]et
Matches with set or let, but won't match with 9et

[A-Z]et
Matches with Set or Let, but won't match set or let or 9et

[a-zA-Z0-9]et
Matches with Set, set and 9et

[^0-9]et
Matches with set or let, but not with 9et

se[a-z]
Matches with sez, sem, set etc, but not with seZ or se9

s[^aeiou]t
Matches with sft, but not with set or sat or sit or sot or sut

\d
matches a digit and is equal to specifying [0-9]

Example: abc\defg
Accepts abc9efg and Rejects abcdefg

\D
matches a non-digit and is equal to specifying [^0-9]
Example: abc\Defg
Accepts abcdefg and Rejects abc9efg 
\w
Matches a single word character and is equal to specifying [A-Za-z0-9_]
\W
Matches a single non-word character and is equal to specifying [^A-Za-z0-9_]
\s
Matches with any escape characters say \t \n \f \r 
Short form for [\t\n\x0B\f\r]
 */


public class aSample {

	public static void main(String[] args) {

		// boolean matchingStatus = Pattern.matches(".*Abdul.*", "My name is Shaik Abdul
		// Baji");
		// boolean matchingStatus = Pattern.matches("Abdul", "My name is Shaik Abdul
		// Baji");
		// boolean matchingStatus = Pattern.matches("java", "java");
		// boolean matchingStatus = Pattern.matches("java", "Java");
		// boolean matchingStatus = Pattern.matches("[Jj]ava", "Java");
		// boolean matchingStatus = Pattern.matches("[Jj]ava", "java");
		// boolean matchingStatus = Pattern.matches("[Jj]ava", "python");
		// boolean matchingStatus = Pattern.matches("ski[pr]", "skip");
		// boolean matchingStatus = Pattern.matches("ski[pr]", "skir");
		// boolean matchingStatus = Pattern.matches("[spi]it", "sit");
		// boolean matchingStatus = Pattern.matches("[spi]it", "pit");
		//boolean matchingStatus = Pattern.matches("[spi]it", "iit");
		//boolean matchingStatus = Pattern.matches(".ava", "java");
		//boolean matchingStatus = Pattern.matches(".ava", "9ava");
		//boolean matchingStatus = Pattern.matches(".ava", "99ava");
		//boolean matchingStatus = Pattern.matches("[0-9]am", "8am");
		//boolean matchingStatus = Pattern.matches("[0-9]am", "mam");
		//boolean matchingStatus = Pattern.matches("[a-z]et", "bet");
		//boolean matchingStatus = Pattern.matches("[a-z]et", "Aet");
		//boolean matchingStatus = Pattern.matches("[A-Z]et", "Bet");
		//boolean matchingStatus = Pattern.matches("[A-Z]et", "bet");
		//boolean matchingStatus = Pattern.matches("[a-zA-Z0-9]et", "Bet");
		//boolean matchingStatus = Pattern.matches("[a-zA-Z0-9]et", "6et");
		//boolean matchingStatus = Pattern.matches("[^0-9]et", "bet");     // ^->not
		boolean matchingStatus = Pattern.matches("[^0-9]et", "bet");     


		
		if (matchingStatus) {
			System.out.println("Matched");
		} else {
			System.out.println("Not Matched");
		}

	}

}

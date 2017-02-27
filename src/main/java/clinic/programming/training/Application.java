package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords(String words){
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null)? 0 : separateWords.length;
	}
    

    public void greet(){

	    List<String> greetings = new ArrayList<>();
	    greetings.add("Hello");

	    for (String greeting : greetings){
		System.out.println("Greeting: " + greeting);
	    }

    }

    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		int count = app.countWords("I have four words");
		System.out.println("Word Coutn: " + count);
    }
<<<<<<< HEAD

}
=======
}
<<<<<<< HEAD

=======
=======
<<<<<<< HEAD
}
=======
}
>>>>>>> bf60261e241886caaa1e2e36b8412f109e9c8d87
>>>>>>> 73aadd810eb1beeece688c709e5c1e8c7dae3b3d
>>>>>>> 4e0fc7d3c17857fad0e5893385f5d34bb05046c6
>>>>>>> 748c4aac6ec19ce06670da94a6296ef92326d0d2

package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    

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
    }
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
}
=======
}
>>>>>>> bf60261e241886caaa1e2e36b8412f109e9c8d87
>>>>>>> 73aadd810eb1beeece688c709e5c1e8c7dae3b3d

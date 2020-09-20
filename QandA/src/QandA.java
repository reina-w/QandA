
public class QandA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What is your name?");
		sleep(500);
		System.out.println("My name is Reina Wang, but my legal name is Peiyun Wang.");
		sleep(1000);
		
		
		System.out.println("Where are you from?");
		sleep(500);
		System.out.println("I am from Shanghai, China, which is a modern and international city.");
		sleep(1000);
		
		
		System.out.println("How many family members do you have?");
		sleep(500);
		System.out.println("There are three members in my family: my dad, my mom and I. I do not have any siblings,"
				+ " but I have a dog named Snoopy and I treat him as my younger brother.");
		sleep(1000);
		
		
		System.out.println("What do you like to do in your freetime?");
		sleep(500);
		System.out.println("I love listening to music, playing rubik's cube and dancing as well. "
				+ "I enjoy the rides in amusement parks, and I go skiing every winter.");
		sleep(1000);
		
		
		System.out.println("What is your favorite ice cream flavor?");
		sleep(500);
		System.out.println("I like orea ice cream the most. And vanilla, cookie dough, and lemon ice cream as well.");
		sleep(1000);
		
		
		System.out.println("What is the coolest place you have ever been to?");
		sleep(500);
		System.out.println("It is definitely the Emirates. The waterpark at the Atlantis Hotel in Dubai is so awesome "
				+ "that I really want to go again sometime. In Abu Dhabi, I went on the fastest rollar coaster in the "
				+ "world in an indoor theme park called Ferrari World. Also I was amazed that I was able to go indoor skiing "
				+ "in a shopping mall and the place was huge.");
		sleep(1000);
		
		
	}
	
	// makes the program pause for half a second.
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

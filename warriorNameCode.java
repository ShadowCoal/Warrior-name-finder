import javax.swing.JOptionPane;
public class warrior {
	public static void main(String[]args)
	{
		String name;
		String home;
		String warriorFirst;
		String warriorLast;
		name = JOptionPane.showInputDialog(null, "Enter your first name");
		home = JOptionPane.showInputDialog(null, "Enter the name of your hometown");
		warriorFirst=firstName(name);
		warriorLast=lastName(home);
		JOptionPane.showMessageDialog(null, "Your warrior name is " + warriorFirst + warriorLast);
	}
	public static String firstName(String name)
	{
		
		int x = name.length();
		char first;
		char last;
		String warriorFirst;
		String[] firstPart= {"Bramble", "Leaf", "Squirrel", "Dust", "Sand", "Bracken", "Sorrel", "Thorn", "Bright", 
			    "Spider", "Birch", "Hazel", "Mouse", "Cinder", "Honey", "Poppy", "Lion", "Holly", "Fox", "Ice", "Fern", "White", "Long", 
			    "Black", "Russet", "Little", "Oak", "Rowan", "Smoke", "Ivy", "Tear", "Toad", "Owl", "Dawn",
			    "Crow", "Olive", "Kink", "Rat", "Shrew", "Snake", "Scorch", "Red", "Tawny", "Snow", "Cedar", "Tall", "One",
			     "Ash", "Bark", "Torn", "Kestrel", "Night", "Gorse", "Hare", "Dew", "Thistle", "Sedge",  "Willow", "Tear",
			    "Swallow", "Tear", "Ant", "Ember", "Sun","Heather","Breeze","Morning","Web",
			    "Leopard","Misty","Moth","Vole", "Minnow","Reed", "Moss", "Peddle", "Ripple","Mallow","Gray",
			     "Dapple","Pounce","Otter", "Mint", "Pine", "Rain", "Dusk", "Copper","Tear", "Heavy",
			   "Robin","Stone","Beetle", "Petal", "Grass", "Ragged", "Dove", "Tiger","Mud", "Echo",
			    "Jay", "Tear", "Briar", "Rose", "Fuzzy", "Fallow", "Quail", "Stoat", "Buzzed",
			    "Tear", "Tansy", "Acorn", "Snail","Bird","Tear", "Starling", "Hawk", "Mole", "Swift","Milk", "Lark",
			    "Sloe", "Yellow", "Dark", "Golden", "Speckle", "Silver", "Badger", "Dead", "Fire",
			    "Loud", "Tangle","Scar", "Berry", "Timber", "Mumble", "Arch","Tear", "Thrush", "Moon", "Hail",
			   "Shimmer", "Lily", "Pike", "Lake"};
		first = name.charAt(0);
		last = name.charAt(x-1);
		x = AlpabetNumber(first);
		x = x * AlpabetNumber(last);
		warriorFirst = firstPart[x-1];
		return warriorFirst;
	}
	public static String lastName(String home)
	{
		int x = home.length();
		char first;
		char last;
		String warriorLast;
		String[] lastPart = {"Shine", "Whisker", "Tooth","Mist", "Claw", "Wing", "Tail", "Foot", "Cloud",
				    "Fur", "Pelt", "Pool", "Flight", "Flower", "Talon", "Spring", "Belly",
				     "Brook","Stripe", "Storm", "Frost","Feather","Light","Fang", "Leap", "Step", "Fall", "Snow"};
		first = home.charAt(0);
		last = home.charAt(x-1);
		x = AlpabetNumber(first);
		x = x + AlpabetNumber(last);
		warriorLast = lastPart[x-1];
		return warriorLast;
	}

public static int AlpabetNumber (char letter)
{
    
      letter = Character.toLowerCase(letter);
      int num = 0;
    switch (letter)
    {

case 'a':
case 'e':
    num = 1;
    break;
case 'i':
case 'l':
    num = 2;
    break;
case 'n':
case 'o':
    num = 3;
    break;
case 'r':
case 's':
    num = 4;
    break;
case 't':
case 'v':
    num = 5;
    break;
case 'u':
case 'd':
    num = 6;
    break;
case 'g':
case 'b':
    num = 7;
    break;
case 'c':
case 'm':
    num = 8;
    break;
case 'p':
case 'f':
    num = 9;
    break;
case 'h':
case 'w':
    num = 10;
    break;
case 'y':
case 'k':
    num = 10;
    break;
case 'j':
case 'x':
    num = 11;
    break;
case 'q':
case 'z':
    num=12;
    break;
}
    return num;
}}

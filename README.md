# Warriors Name finder project
#include <iostream>
#include <fstream>
#include <string>
using namespace std;
void firstName (string name);
void lastName (string name);
void firstPartList (int warriorNum);
void lastPartList (int warriorNum);
void AlpabetNumber (char letter, int& num);

int main()
{
    string name;
    string home;
    string warriorFirst;
    string warriorLast;
    cout << "enter your first name: ";
    cin >> name;
    cout << "enter the name of your hometown: ";
    cin >> home;

    cout << "Your Warrior name is: ";
    firstName(name);
    lastName(home);

    return 0;
}
void firstName (string name)
{
    char firstLetter;
    char lastLetter;
    int len =0;
    int num1 = 0;
    int num2 = 0;
    int warriorNum = 0;
    len = name.length();
    firstLetter=name[0];
    len = len-1;
    name.erase(0,len);
    lastLetter = name[0];
    AlpabetNumber(firstLetter, num1);
    AlpabetNumber(lastLetter, num2);
    warriorNum = num1 * num2;
    firstPartList(warriorNum);
}
void lastName (string name)
{
    char firstLetter;
    char lastLetter;
    int len = 0;
    int num1=0;
    int num2=0;
    int warriorNum=0;
    len = name.length();
    firstLetter = name[0];
    len = len-1;
    name.erase(0,len);
    lastLetter = name[0];
    AlpabetNumber(firstLetter, num1);
    AlpabetNumber(lastLetter, num2);
    warriorNum=num1+num2;
    lastPartList(warriorNum);
}
void firstPartList (int warriorNum)
{
    if (warriorNum == 1)
        cout<< "Bramble";
    else if (warriorNum == 2)
        cout<< "Leaf";
    else if (warriorNum == 3)
        cout<< "Squirrel";
    else if (warriorNum == 4)
        cout<< "Dust";
    else if (warriorNum == 5)
        cout<< "Sand";
    else if (warriorNum == 6)
        cout<< "Bracken";
    else if (warriorNum == 7)
        cout<< "Sorrel";
    else if (warriorNum == 8)
        cout<< "Thorn";
    else if (warriorNum == 9)
        cout << "Bright";
    else if (warriorNum == 10)
        cout<< "Spider";
    else if (warriorNum == 11)
        cout<< "Birch";
    else if (warriorNum == 12)
        cout<< "Hazel";
    else if (warriorNum == 13)
        cout<< "Mouse";
    else if (warriorNum == 14)
        cout<< "Cinder";
    else if (warriorNum == 15)
        cout<< "Honey";
    else if (warriorNum == 16)
        cout<< "Poppy";
    else if (warriorNum == 17)
        cout<< "Lion";
    else if (warriorNum == 18)
        cout<< "Holly";
    else if (warriorNum == 19)
        cout<< "Fox";
    else if (warriorNum == 20)
        cout<< "Ice";
    else if (warriorNum == 21)
        cout<<  "Fern";
    else if (warriorNum == 22)
        cout<< "White";
    else if (warriorNum == 23)
        cout<< "Long";
    else if (warriorNum == 24)
        cout<< "Black";
    else if (warriorNum == 25)
        cout<< "Russet";
    else if (warriorNum == 26)
        cout<< "Little";
    else if (warriorNum == 27)
        cout<< "Oak";
    else if (warriorNum == 28)
        cout<<  "Rowan";
    else if (warriorNum == 29)
        cout<<  "Smoke";
    else if (warriorNum == 30)
        cout<<  "Ivy";
    else if (warriorNum == 31)
       cout<<  "Toad";
    else if (warriorNum == 32)
        cout<<  "Owl";
    else if (warriorNum == 33)
        cout<<  "Dawn";
    else if (warriorNum == 34)
        cout<<  "Crow";
    else if (warriorNum == 35)
        cout<<  "Olive";
    else if (warriorNum == 36)
        cout<< "Kink";
    else if (warriorNum == 37)
        cout<<  "Rat";
    else if (warriorNum == 38)
        cout<<  "Shrew";
    else if (warriorNum == 39)
        cout<<  "Snake";
    else if (warriorNum == 40)
        cout<<  "Scorch";
    else if (warriorNum == 42)
        cout<<  "Red";
    else if (warriorNum == 43)
        cout<<  "Tawny";
    else if (warriorNum == 44)
        cout<<  "Snow";
    else if (warriorNum == 45)
        cout<<  "Cedar";
    else if (warriorNum == 46)
        cout<< "Tall";
    else if (warriorNum == 47)
        cout<< "One";
    else if (warriorNum == 48)
        cout<<  "Ash";
    else if (warriorNum == 49)
        cout<<  "Bark";
    else if (warriorNum == 50)
        cout<<  "Torn";
    else if (warriorNum == 51)
        cout<<  "Kestrel";
    else if (warriorNum == 52)
        cout<<  "Night";
    else if (warriorNum == 53)
        cout<<  "Gorse";
    else if (warriorNum == 54)
        cout<< "Hare";
    else if (warriorNum == 55)
        cout<< "Dew";
    else if (warriorNum == 56)
        cout<< "Thistle";
    else if (warriorNum == 57)
        cout << "Sedge";
    else if (warriorNum == 58)
        cout << "Willow";
    else if (warriorNum == 59)
        cout << "Swallow";
    else if (warriorNum == 60)
        cout << "Ant";
    else if (warriorNum == 61)
        cout << "Ember";
    else if (warriorNum == 62)
        cout << "Sun";
    else if (warriorNum == 63)
        cout << "Heather";
    else if (warriorNum == 64)
        cout << "Breeze";
    else if (warriorNum == 65)
        cout << "Morning";
    else if (warriorNum == 66)
        cout << "Web";
    else if (warriorNum == 67)
        cout << "Leopard";
    else if (warriorNum == 68)
        cout << "Misty";
    else if (warriorNum == 69)
        cout << "Moth";
    else if (warriorNum == 70)
        cout << "Vole";
    else if (warriorNum == 71)
        cout << "Minnow";
    else if (warriorNum == 72)
        cout << "Reed";
    else if (warriorNum == 73)
        cout << "Moss";
    else if (warriorNum == 74)
        cout << "Peddle";
    else if (warriorNum == 75)
        cout << "Ripple";
    else if (warriorNum == 76)
        cout << "Mallow";
    else if (warriorNum == 77)
        cout << "Gray";
    else if (warriorNum == 78)
        cout << "Dapple";
    else if (warriorNum == 79)
        cout << "Pounce";
    else if (warriorNum == 80)
        cout << "Otter";
    else if (warriorNum == 81)
        cout << "Mint";
    else if (warriorNum == 82)
        cout << "Pine";
    else if (warriorNum == 83)
        cout << "Rain";
    else if (warriorNum == 84)
        cout << "Dusk";
    else if (warriorNum == 85)
        cout << "Copper";
    else if (warriorNum == 86)
        cout << "Heavy";
    else if (warriorNum == 87)
        cout << "Robin";
    else if (warriorNum == 88)
        cout << "Stone";
    else if (warriorNum == 90)
        cout << "Beetle";
    else if (warriorNum == 91)
        cout << "Petal";
    else if (warriorNum == 92)
        cout << "Grass";
    else if (warriorNum == 93)
        cout << "Ragged";
    else if (warriorNum == 94)
        cout << "Dove";
    else if (warriorNum == 96)
        cout << "Tiger";
    else if (warriorNum == 98)
        cout << "Mud";
    else if (warriorNum == 99)
        cout << "Echo";
    else if (warriorNum == 100)
        cout << "Jay";
    else if (warriorNum == 102)
        cout << "Briar";
    else if (warriorNum == 103)
        cout << "Rose";
    else if (warriorNum == 104)
        cout << "Fuzzy";
    else if (warriorNum == 105)
        cout << "Fallow";
    else if (warriorNum == 106)
        cout << "Quail";
    else if (warriorNum == 107)
        cout << "Stoat";
    else if (warriorNum == 108)
        cout << "Buzzed";
    else if (warriorNum == 109)
        cout << "Tansy";
    else if (warriorNum == 110)
        cout << "Acorn";
    else if (warriorNum == 111)
        cout << "Snail";
    else if (warriorNum == 112)
        cout << "Bird";
    else if (warriorNum == 114)
        cout << "Starling";
    else if (warriorNum == 115)
        cout << "Hawk";
    else if (warriorNum == 116)
        cout << "Mole";
    else if (warriorNum == 117)
        cout << "Swift";
    else if (warriorNum == 118)
        cout << "Milk";
    else if (warriorNum == 119)
        cout << "Lark";
    else if (warriorNum == 120)
        cout << "Sloe";
    else if (warriorNum == 121)
        cout << "Yellow";
    else if (warriorNum == 122)
        cout << "Dark";
    else if (warriorNum == 123)
        cout << "Golden";
    else if (warriorNum == 124)
        cout << "Speckle";
    else if (warriorNum == 125)
        cout << "Silver";
    else if (warriorNum == 126)
        cout << "Badger";
    else if (warriorNum == 127)
        cout << "Dead";
    else if (warriorNum == 128)
        cout << "Fire";
    else if (warriorNum == 129)
        cout << "Loud";
    else if (warriorNum == 130)
        cout << "Tangle";
    else if (warriorNum == 131)
        cout << "Scar";
    else if (warriorNum == 132)
        cout << "Berry";
    else if (warriorNum == 133)
        cout << "Timber";
    else if (warriorNum == 134)
        cout << "Mumble";
    else if (warriorNum == 135)
        cout << "Arch";
    else if (warriorNum == 136)
        cout << "Thrush";
    else if (warriorNum == 138)
        cout << "Moon";
    else if (warriorNum == 140)
        cout << "Hail";
    else if (warriorNum == 141)
        cout << "Shimmer";
    else if (warriorNum == 142)
        cout << "Lily";
    else if (warriorNum == 143)
        cout << "Pike";
    else if (warriorNum == 144)
        cout << "Lake";
    else
        cout << "Tear";
}
void lastPartList (int warriorNum)
{
    if (warriorNum == 2)
        cout << "Shine";
    else if (warriorNum == 3)
        cout << "Whisker";
    else if (warriorNum == 4)
        cout << "Tooth";
    else if (warriorNum == 5)
        cout << "Mist";
    else if (warriorNum == 6)
        cout << "Claw";
    else if (warriorNum == 7)
        cout << "Wing";
    else if (warriorNum == 8)
        cout << "Tail";
    else if (warriorNum == 9)
        cout << "Foot";
    else if (warriorNum == 10)
        cout << "Cloud";
    else if (warriorNum == 11)
        cout << "Fur";
    else if (warriorNum == 12)
        cout << "Pelt";
    else if (warriorNum == 13)
        cout << "Pool";
    else if (warriorNum == 14)
        cout << "Flight";
    else if (warriorNum == 15)
        cout << "Flower";
    else if (warriorNum == 16)
        cout << "Talon";
    else if (warriorNum == 17)
        cout << "Spring";
    else if (warriorNum == 18)
        cout << "Belly";
    else if (warriorNum == 19)
        cout << "Brook";
    else if (warriorNum == 20)
        cout << "Stripe";
    else if (warriorNum == 21)
        cout << "Storm";
    else if (warriorNum == 22)
        cout << "Frost";
    else if (warriorNum == 23)
        cout << "Feather";
    else if (warriorNum == 24)
        cout << "Light";
    else if (warriorNum == 25)
        cout << "Fang";
    else if (warriorNum == 26)
        cout << "Leap";
    else if (warriorNum == 27)
        cout << "Step";
    else if (warriorNum == 28)
        cout << "Fall";
    else
        cout << "Snow";

}
void AlpabetNumber (char letter, int& num)
{
     using std::tolower;
        letter = tolower(letter);
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
}

//Implicit Conersion(Bilinçsiz Dönüşüm)

System.Console.WriteLine("***** Implicit Conversion ******");

byte a = 10;
sbyte b = 30;
short c = 10;

int d = a + b+ c;
System.Console.WriteLine("d: " + d);

long h= d;
System.Console.WriteLine("h: " + h);

float i = h;
System.Console.WriteLine("i: " + i);

string e = "meraba";
char f = 'k';
object g = e + f + d;
System.Console.WriteLine("g: " + g);

//Explicit Conersion(Bilinçli Dönüşüm)

System.Console.WriteLine("***** Explicit Conversion ******");

int x = 4;
byte y = (byte)x;
System.Console.WriteLine("y: " + y);

int z = 100;
byte t = (byte)z;
System.Console.WriteLine("z: " + z);

float w = 10.3f;
byte v = (byte)w;
System.Console.WriteLine("v: " + v);

//ToString Metodu

System.Console.WriteLine("***** ToString Metodu");
int xx = 6;
string yy = xx.ToString();
System.Console.WriteLine("yy: " + yy);

string zz = 12.5f.ToString();
System.Console.WriteLine("zz: " + zz);

//System.Convert
System.Console.WriteLine("****** System.Convert Sınıfı ******");
string s1 ="10", s2="20";
int number1, number2;
int sum;

number1=Convert.ToInt32(s1);
number2=Convert.ToInt32(s2);
sum = number1 + number2;
System.Console.WriteLine("sum: " + sum);

//Parse
System.Console.WriteLine("**** Parse *****");

ParseMethod();

static void ParseMethod()
{
    string text1 = "10";
    string text2 = "10,25";
    int num1;
    double double1;

    num1 = Int32.Parse(text1);
    double1 = Double.Parse(text2);

    System.Console.WriteLine("num1 :" + num1);
    System.Console.WriteLine("double1 :" + double1);

   Convert.ToDecimal(text1);
}
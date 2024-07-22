int value = 5;

string text = null;
string Text = null;

byte b = 5; //1 byte
sbyte c = 5; //1 byte

short s = 5; //2 byte
ushort us = 5; //2 byte

Int16 i16 = 2; //2 byte
int i = 2; //4 byte
Int32 i32 = 2; //4 byte
Int64 i64 = 2; //4 byte

uint ui = 2; //4 byte
long l = 4; //8 byte
ulong ul = 4; //8 byte

float f = 5; //4 byte
double d = 5; //8 byte
decimal de = 5; //16 byte

char ch = '2'; //2 byte
string name = "Ömer"; //sınırsız

bool b1 = true;
bool b2 = false;

DateTime dt = DateTime.Now;


System.Console.WriteLine(dt);

object o1 = "x";
object o2 = 'y';
object o3 = 4;
object o4 = 4.3;

//String

string str = string.Empty;
str = "Ali Veli";
string firstName = "Ali";
string lastName = "Veli";
string fullName = firstName + " " + lastName;

//integer tanımlama

int number1 = 5;
int number2 = 3;
int number3 = number1 + number2;

//boolean

bool bool1 = 10>2;

//Değişken Dönüşümleri

string str20 = "20";
int int20 = 20;
string newValue = str20 + int20.ToString();
System.Console.WriteLine(newValue); //Çıktısı 2020

int int21 = int20 + Convert.ToInt32(str20);
System.Console.WriteLine(int21); //Çıktısı 40

int  int22 = Int32.Parse(str20); //Çıktısı 40

//datetime

string dateTime = DateTime.Now.ToString("dd.MM.yyyy");
System.Console.WriteLine(dateTime);

string dateTime2 = DateTime.Now.ToString("dd/MM/yyyy");
System.Console.WriteLine(dateTime2);

string hour = DateTime.Now.ToString("HH:mm");
System.Console.WriteLine(hour);


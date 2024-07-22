System.Console.WriteLine("***** Atama ve İşlemli Atama Operatörleri *****");
//Atama ve İşlemli Atama
int x = 3;
int y = 3;
y = y + 2;

System.Console.WriteLine(y);
y += 2;
System.Console.WriteLine(y);
y /= 1;
System.Console.WriteLine(y);
x += 2;
System.Console.WriteLine(2);

System.Console.WriteLine("***** Mantıksal Operatörler ******");
//Mantıksal Operatörler
// ||, &&, !

bool isSusccess = true;
bool isCompleted = false;

if(isSusccess&&isCompleted)
    System.Console.WriteLine("Perfect!");

if(isSusccess || isCompleted)
    System.Console.WriteLine("Great!");

if(isSusccess && !isCompleted)
    System.Console.WriteLine("Fine!");

System.Console.WriteLine("***** İlişkisel Operatörler ******");
//İlişkisel Operatörler
// <, >, <=, >=, ==, !=

int a = 3;
int b = 4;
bool result = a<b;

System.Console.WriteLine(result);
result = a>b;
System.Console.WriteLine(result);
result = a>=b;
System.Console.WriteLine(result);
result = a<=b;
System.Console.WriteLine(result);
result = a==b;
System.Console.WriteLine(result);
result = a!=b;
System.Console.WriteLine(result);

System.Console.WriteLine("***** Aritmetik Operatörler ******");
//Aritmetik Operatörler
// /, *, +, -

int number1 = 10;
int number2 = 5;

int result2 = number1/number2;
System.Console.WriteLine(result2);
result2 = number1 * number2;
System.Console.WriteLine(result2);
result2 = number1 + number2;
System.Console.WriteLine(result2);
result2 = number1 - number2;
System.Console.WriteLine(result2);
result2 = number1++;
System.Console.WriteLine(result2);

// % : mod alır
int result3 = 20 % 3;
System.Console.WriteLine(result3);




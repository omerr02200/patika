internal class Program
{
    private static void Main(string[] args)
    {
        // try
        // {
        //     Console.Write("Bir sayı giriniz: ");
        //     int number = Convert.ToInt32(Console.ReadLine());
        //     Console.WriteLine("Girmiş olduğunuz sayı: " + number);
        // }
        // catch(Exception ex)
        // {
        //     System.Console.WriteLine("Hata: " + ex.Message.ToString());
        // }
        try
        {
           //int a = int.Parse(null);
           //int a = int.Parse("test");
           int a = int.Parse("-200000000000");
        }
        catch (ArgumentNullException ex)
        {
            Console.WriteLine("Boş değer girdiniz");
            Console.WriteLine(ex);
        }
        catch (FormatException ex)
        {
            Console.WriteLine("Veri tipi uygun değil");
            Console.WriteLine(ex);
        }
        catch (OverflowException ex)
        {
            Console.WriteLine("Çok büyük ya da çok küçük bir değer girdiniz");
            Console.WriteLine(ex);
        }
          finally
        {
            System.Console.WriteLine("İşlem tamamlandı");
        }
    }
}
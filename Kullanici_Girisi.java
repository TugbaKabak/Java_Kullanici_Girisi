import java.util.Scanner;

public class Kullanici_Girisi {
    public static void main(String[] args) {

        String userName, password, newPassword;
        int select;

        Scanner input= new Scanner(System.in);

        System.out.println("Kullanici adınız: ");
        userName= input.nextLine();

        System.out.println("Şifreniz: ");
        password= input.nextLine();

        //String ifadelerde eşitlik için aşağıdaki form kullanılır.
        if(userName.equals("AhmetYılmaz") && password.equals("123456")){
            System.out.println("Giriş yaptınız.");
        }
        else{
            if (!userName.equals("AhmetYılmaz")) {
                System.out.println("Kullanıcı adı hatalı girilmiştir.");
            }

            else if(!password.equals("123456")) {
                System.out.println("Şifre hatalı girilmiştir.\n");
                System.out.println("Şifre sıfırlama işlemi yapmak ister misiniz. Sıfırlamak için 1 giriniz. Programı sonlandırmak için 2 giriniz.");
                select=input.nextInt();
                input.nextLine();

                switch (select){
                    case 1:
                        System.out.println("Yeni şifrenizi giriniz: ");

                        newPassword = input.nextLine();

                        System.out.println(newPassword);

                        if(newPassword.equals("123456")){
                            System.out.println("Eski şifreniz ile aynıdır. Yeniden deneyiniz!");
                        }
                        else {
                            System.out.println("Şifre değiştirme işleminiz başarılı!");
                            password = newPassword;
                        }
                        break;

                    case 2:
                        System.out.println("Program sonlandırıldı!");
                        break;
                    default:
                        System.out.println("HATA!");

                }
            }

        }
    }
}

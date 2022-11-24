import java.io.IOException;
public class open_app {

        public static void main(String[]args) {

            Runtime rs = Runtime.getRuntime();


            try {

                rs.exec("calc");

            }

            catch (IOException e) {

                System.out.println(e);

            }

        }

}

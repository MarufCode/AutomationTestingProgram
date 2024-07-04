package src.oops_concept_04_07.encapsulation;

public class Lab151 {
    public static void main(String[] args) {

        // hidden
        vwoLogin vwoLogin =  new vwoLogin("admin", "admin");
        // Hidden


        boolean check = vwoLogin.isLoggedIn ("admin", "password");
        String u = vwoLogin.getUsername();
        System.out.println(u);
        System.out.println(check);



    }

    class vwoLoginFixed{

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        private String username;
        private String password;

        vwoLoginFixed(String u, String p){
            this.username= u;
            this.password= p;
        }

        boolean isLoggedIn(String username, String password) {


            if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
                System.out.println("Logged IN!!");
                return true;
            } else {
                System.out.println("Wrong");
                return false;
            }


        }


    }
}

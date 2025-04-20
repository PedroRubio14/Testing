package javaTesting.Resources;

public class AppParameters {

    public static final String DOMAIN = "127.0.0.1";
    public static final String PORT ="80";

    //public static final Object BD_CON = new ClasseConnecioBBDD();

    //public static Object_MESSAGES_TRANSLATIONS;

    private static AppParameters instance = new AppParameters();

    private AppParameters(){

    }

    private void initApp(){

    }

    public void resetApp(){

    }
    public static AppParameters getInstance(){
        //if(instance == null){
          //  instance = new AppParameters();
        // }
        return instance;
    }


    public static String deployedURL(){
        return "https://"+DOMAIN+":"+PORT;
    }
}

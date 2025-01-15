public class StarshipExplorer {

    private String alienLanguage = "Vrlnq*T xm!ow b*aF#nmpq*k^s jfy*e* *m&xlqw*e tT@br* lm*t oT%*ovnzr* oY#rwqs*y uo@L*oe^t aE!wqlm*u*r aD@rzxs* eB&vnyp Rlkzx*l W tnl@qp*e eXm*a#kyr*d aM^yplw o*e&mnbs*r eI!k*,srn* pC#txry*B cO@pb*elm Hlmpq*y P tn!*ojlwl rE#kxtm*n eF^l*cqrx tO&wtnq*e fC*!xtpm oK#xrnl nT@klpm cT@vrqp";
    private Alien[] aliens;
    private boolean equalAliens = false;

    public static void main(String[] args) {
        StarshipExplorer myCode = new StarshipExplorer();

    }

    public StarshipExplorer(){
        System.out.println("Hello World! Good luck on your exams!");
        aliens = new Alien[50];
        for(int i=0;i< aliens.length;i++){
            aliens[i] = new Alien((int)(Math.random()*75)+1, (int)(Math.random()*101));
        }
        displayAliens();
        System.out.println("It is " + checkEnergy()+ " that there are two aliens with equal energy levels.");

        System.out.println(decipher(alienLanguage));

    }
    public void displayAliens(){
        for(int i=0;i< aliens.length;i++){
           System.out.println("Alien " + i);
           aliens[i].printInfo();
           System.out.println();
        }

    }

    public boolean checkEnergy(){
        for(int i=0;i< aliens.length;i++){
           for(int k=0; k< aliens.length;k++){
               if(i!=k && aliens[i].getEnergyLevel()==aliens[k].getEnergyLevel()){
                   equalAliens=true;
                   //System.out.println( "i: " + i+ ", k: " + k);
               }
           }
        }
        return equalAliens;
    }

    public String decipher(String message){
        String decodedMessage = "";
        int starIndex = alienLanguage.indexOf("*");

        while(starIndex !=-1){
            decodedMessage += alienLanguage.substring(starIndex+1, starIndex+2);
            starIndex = alienLanguage.indexOf("*", starIndex +1);
        }

        return decodedMessage;
    }

}
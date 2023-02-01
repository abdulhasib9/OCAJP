package exceptiondemo;

public class CustomExceptions{
    public static void main(String[] args) {
        try {
            gotoOffice();
            System.out.println("Office is Open" );
        }
        //if the parent exception handled first the code does not compile
        catch (OfficeCloseForLunch ol){
            System.out.println("closed for lunch");
        }catch (OfficClose oc){
            System.out.println("office closed");

        }
    }
    public static void gotoOffice(){
        boolean b = Math.random()<0.6;
        if(b){
            throw new OfficClose();
        }
        throw new OfficeCloseForLunch();
    }
}
class OfficClose extends RuntimeException {}
class OfficeCloseForLunch extends OfficClose{}


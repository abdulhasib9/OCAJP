package exceptiondemo;

public class MethodsWithExceptions {
    public static void main(String[] args) {
        Bear bear = new Bear();
        try {
            bear.eatMeat(23);
            bear.eatPlants(2);
        } catch (NoMoreMeatException e) {
            System.out.println(e.getMessage());
        }catch (NoMorePlantsException noMorePlantsException){
            System.out.println("no more plants");

        }finally {
            System.out.println("finally handle functions with the exceptions");
        }
    }


}
class NoMoreMeatException extends Exception{}
class NoMorePlantsException extends RuntimeException{}
interface omnivore{
    void eatMeat(int amount) throws NoMoreMeatException;
    void eatPlants (int amount) throws NoMorePlantsException;
}
class Bear implements omnivore{
    @Override
    public void eatMeat(int amount) throws NoMoreMeatException {
        System.out.println("eating "+amount+ " amount of meat");
    }

    @Override
    public void eatPlants(int amount) throws NoMorePlantsException {
        System.out.println("Bear not eating plants ");
    }
}


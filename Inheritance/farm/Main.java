package farm;

public class Main {
    public static void main(String[] args) throws AreaException {


        Area area = new Area(100, "fruits", 150);
        Area area1 = new Area(100, "vegetables", 200);
        Worker worker = new Worker("Pera", 2, 30, 20);
        FocusedWorker focusedWorker = new FocusedWorker("Dasha", 3, 40, 50, "fruits");
        System.out.println(worker.doWork(area));
        System.out.println(worker.toString(area));
        System.out.println(focusedWorker.doWork(area1));
        System.out.println(focusedWorker.toString(area1));
        System.out.println(worker.doWork(area,false));
        System.out.println(worker.toString(area));
        System.out.println(worker.doWork(area,true));
        System.out.println(worker.toString(area));


    }
}

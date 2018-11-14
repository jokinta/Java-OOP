package farm;

public class FocusedWorker extends Worker {
    private String specializedType;
    public FocusedWorker(String name, int id, double fruitsPower, double vegetablePower,String specializedType) {
        super(name, id, fruitsPower, vegetablePower);
        this.specializedType=specializedType;

    }



    public double doWork(Area area) throws AreaException {
        if(specializedType.equals("fruits")){
            setFruitsPower(getFruitsPower()+getFruitsPower()*20/100);
            setVegetablePower(getVegetablePower()-(getVegetablePower()*15/100));
        }else if(specializedType.equals("vegetables")){
            setFruitsPower(getFruitsPower()-getFruitsPower()*15/100);
            setVegetablePower(getVegetablePower()+(getVegetablePower()*20/100));
        }
        setVegetablePower(getVegetablePower()+getVegetablePower()*90/100);
        setFruitsPower(getFruitsPower()+getFruitsPower()*90/100);
        if(!area.getType().equals("fruits") && !area.getType().equals("vegetables")){
            throw new AreaException("Wrong type");}
        if(area.getType().equals("fruits")){
            area.setAmount(area.getAmount()-getFruitsPower());
            return getFruitsPower();
        }else if(area.getType().equals("vegetables")) {
            area.setAmount(area.getAmount()-getVegetablePower());
            return getVegetablePower();
        }throw new AreaException("Ne");

    }

    public double doWork(Area area,boolean stickWithNet) throws AreaException {
        if(specializedType.equals("fruits")){
            setFruitsPower(getFruitsPower()+getFruitsPower()*20/100);
            setVegetablePower(getVegetablePower()-(getVegetablePower()*15/100));
        }else if(specializedType.equals("vegetables")){
            setFruitsPower(getFruitsPower()-getFruitsPower()*15/100);
            setVegetablePower(getVegetablePower()+(getVegetablePower()*20/100));
        }if(stickWithNet==true) {
            setVegetablePower(getVegetablePower() + getVegetablePower() * 90 / 100);
            setFruitsPower(getFruitsPower() + getFruitsPower() * 90 / 100);
        }
        if(!area.getType().equals("fruits") && !area.getType().equals("vegetables")){
            throw new AreaException("Wrong type");}
        if(area.getType().equals("fruits")){
            area.setAmount(area.getAmount()-getFruitsPower());
            return getFruitsPower();
        }else if(area.getType().equals("vegetables")) {
            area.setAmount(area.getAmount()-getVegetablePower());
            return getVegetablePower();
        }throw new AreaException("Ne");

    }

}

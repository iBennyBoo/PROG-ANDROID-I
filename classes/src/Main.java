public class Main {
    public void main(String[] args) {
        new employee("Evan", "8153384447", 2);
        new employee("Ben", "8153884777", 1);
        new employee("Anthony", "2247889008", 1);
        System.out.println("Hello world!");
    }
    public class employee(){
        String name;
        String number;
        int shift;
        public employee(String x, String y, Integer z){
            name = x;
            number = y;
            shift = z;
        }
        public String getName(){
            return name;
        }
        public String getNumber(){
            return number;
        }
        public Integer getShift(){
            return shift;
        }
        public void setName(String x){
            name = x;
        }

        public void setNumber(String x){
            number = x;
        }

        public void setShift(Integer x){
            shift = x;
        }

        public void displayInfo(){
            System.out.pritnln("Employee name: " + name);
            System.out.pritnln("Employee phone number: " + number);
            System.out.pritnln("Employee shift: " + shift);
        }

    }


}
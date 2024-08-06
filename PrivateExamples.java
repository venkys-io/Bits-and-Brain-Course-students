//example for private access specifier
public class PrivateExamples {
    class PrivateExample {
        private int number;
    
        // getter kedyword
        public int getNumber() {
            return number;
        }
    
        // setter keyword
        public void setNumber(int number) {
            this.number = number;
        }
    }
    
    public class PrivateExampels {
        public static void main(String[] args) {
            PrivateExample obj = new PrivateExample();
            obj.setNumber(20);
            System.out.println(obj.getNumber());
        }
    }
    
}

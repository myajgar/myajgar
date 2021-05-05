package design;

public class Year {
    private final Months months;

    public Year(Months months){
        this.months =months ;
    }
     public static void main (String[] args){
        Year year =new Year(Months.January) ;
        year.demo();
     }


    public void demo(){
        switch (months){
            case January :
                System.out.println("i will visit BD");
                break;
            case February:
                System.out.println("i will visit canada");
                break;
            case March:
                System.out.println("i will visit ca");
                break;
        }
    }
}

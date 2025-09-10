//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1 task
        int total =0;
        short month =0;
        while(total<2459000){
            total+=15000;
            month ++;
            System.out.println("Месяц " + month + " сумма накоплений равна "+total+" рублей");
        }
        System.out.println("Всего нужно "+ month+" месяцев.");
        System.out.println();
        //2 task
        int n=1;
        while(n<11){
            System.out.print(n+" ");
            n++;
        }
        System.out.println();
        for(int i =10; i>=1; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();
        //3 task
        int population = 12000000;
        short growth1000 =17-8;
        short year =0;
        int growthInYear=0;
        while(year<=10){
            growthInYear = population/1000 * growth1000;
            population +=growthInYear;
            year++;
            System.out.println("Год "+ year +" численность населения составляет "+ population);
        }
        System.out.println();
        //4 task
        n=0;
        double contribution =15000;
        while(contribution <12000000){
            n++;
            contribution += contribution*0.07;
            System.out.println("Месяц "+n+" сумма на счете: "+contribution);
        }
        System.out.println("Василию нужно копить "+n+" месяцев");
        System.out.println();
        //5 task
        n=0;
        contribution =15000;
        while(contribution <12000000){
            n++;
            contribution += contribution*0.07;
            if (n%6==0)
                System.out.println("Месяц "+n+" сумма на счете: "+contribution);
        }
        System.out.println("Василию нужно копить "+n+" месяцев");
        System.out.println();
        //6 task
        n=0;
        int year9=0;
        contribution =15000;
        while(year9<9){
            n++;
            contribution += contribution*0.07;
            if (n%6==0)
                System.out.println("Месяц "+n+" сумма на счете: "+contribution);
            if (n%12==0){
                year9+=1;
            }
        }
        System.out.println("Василий за 9 лет накопит "+contribution+" рублей.");
        System.out.println();
        //7 task
        int numFriday = 5;
        int nDay =1;
        System.out.println("Сегодня пятница, " +numFriday+"-е число. Необходимо подготовить отчет");
        while(nDay <31){
            if(nDay %7==0 && numFriday+7<31) {
                numFriday += 7;
                System.out.println("Сегодня пятница, " + numFriday + "-е число. Необходимо подготовить отчет");
            }
            nDay++;
        }
        System.out.println();
        //8 task
        int yearBefore =1817;
        int yearAfter = 2117;
        int cometa =0;
        while(yearBefore<yearAfter){
            if(cometa ==79){
                System.out.println("Пролетает комета, год "+ yearBefore);
                cometa=0;
            }
            yearBefore++;
            cometa++;
        }



    }
}
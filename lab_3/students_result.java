
public class students_result{
    public static void main(String[] args) {
        final int nstudents = 100;
        float[] marks = new float[nstudents];
        int i,roll;

        float average,rand_mark;

        float sum = 0;
        float max_mark = 0;
        float min_mark = 0;
        int above_avgn = 0;

        for (i = 0; i < nstudents ; i++ ){
            rand_mark = (float)(Math.random()*100);
            marks[i] = rand_mark;

            if(rand_mark > max_mark){
                max_mark = rand_mark;
            }
            if (rand_mark < min_mark) {
                min_mark = rand_mark;
            }
            sum += rand_mark;
        }
        average = sum / nstudents;
        for (i = 0;i < nstudents ;i++ ){
            // lets pretend as if array index are roll numbers
            roll = i + 1; // add one because we want rolls from 1 to 100
                          // not 0 to 99

            above_avgn += ((average > marks[i]) ? 1:0);
            // This statement if equalent to following code
            /*
             * if(average > marks[i]){
             *    above_avgn++;
             * }
             */

            if(marks[i] >= 90) {
                System.out.println("Student Roll: "+roll+" secured "+marks[i]+
                            " marks with grade A");

            } else if(marks[i] < 90 && marks[i] >= 80){
                System.out.println("Student Roll: "+roll+" secured "+marks[i]+
                            " marks with grade B");
            } else if(marks[i] < 80 && marks[i] >= 70){
                System.out.println("Student Roll: "+roll+" secured "+marks[i]+
                            " marks with grade C");
            }  else if(marks[i] < 70 && marks[i] >= 60){
                System.out.println("Student Roll: "+roll+" secured "+marks[i]+
                            " marks with grade D");
            } else if(marks[i] < 60){
                System.out.println("Student Roll: "+roll+" secured "+marks[i]+
                            " marks with grade E");
            }
            System.out.println("The diffrence b/w class average and student "+
             "marks is "+(marks[i] - average)+"\n");
        }

        System.out.println("Max : "+max_mark);
        System.out.println("Min : "+min_mark);
        System.out.println("Average : "+average);
        System.out.println("Number of above average students: "+above_avgn);
    }
}

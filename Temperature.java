import static java.lang.System.out;
public class Temperature
{
    public static void main (String[]args)   
    {   
        int [][] temp = new int [4][7];
        temp [0][0] = 68;
        temp [0][1] = 70; 
        temp [0][2] = 76; 
        temp [0][3] = 70; 
        temp [0][4] = 68; 
        temp [0][5] = 71; 
        temp [0][6] = 75; 
        temp [1][0] = 76; 
        temp [1][1] = 76;
        temp [1][2] = 87; 
        temp [1][3] = 84; 
        temp [1][4] = 82; 
        temp [1][5] = 75; 
        temp [1][6] = 83; 
        temp [2][0] = 73; 
        temp [2][1] = 72; 
        temp [2][2] = 81; 
        temp [2][3] = 78; 
        temp [2][4] = 76; 
        temp [2][5] = 73; 
        temp [2][6] = 77; 
        temp [3][0] = 64; 
        temp [3][1] = 65; 
        temp [3][2] = 69; 
        temp [3][3] = 68; 
        temp [3][4] = 70; 
        temp [3][5] = 74; 
        temp [3][6] = 72; 
        String time[] = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};
        out.println("Temperature Calculator \n"); 
        out.println("The data provided are:");

        for (int row = 0; row<4; row++)
        {
            out.print(time[row]); 

            for (int column = 0; column<7; column++) 
            {   

                out.print(" " + temp[row][column] + " "); 
            }
            out.println();
        }
        out.println("\nBased on that data, the following are the average temperatures for the week.\n");
        int sun =0;
        int mon=0;
        int tues=0; 
        int wed=0;
        int thu=0; 
        int fri=0;
        int sat=0;

        for(int row =0; row<4; row++) 
        {
            for(int column = 0; column<1; column++)
            {
                sun+= temp[row][column]; 

            }
            for(int column = 1; column<2; column++)
            {
                mon+= temp[row][column]; 

            }
            for(int column = 2; column<3; column++)
            {
                tues+= temp[row][column]; 

            }
            for(int column = 3; column<4; column++)
            {
                wed+= temp[row][column]; 

            }
            for(int column = 4; column<5; column++)
            {
                thu+= temp[row][column]; 

            }
            for(int column = 5; column<6; column++)
            {
                fri+= temp[row][column];

            }
            for(int column = 6; column<7; column++)
            {
                sat+= temp[row][column];

            }
        }
        int daySun = sun/4; 
        out.println("Sun: " + daySun);  
        int dayMon = mon/4; 
        out.println("Mon: " + dayMon);  
        int dayTues = tues/4; 
        out.println("Tue: " + dayTues); 
        int dayWed = wed/4; 
        out.println("Wed: " + dayWed);  
        int dayThu = thu/4; 
        out.println("Thu: " + dayThu);
        int dayFri = fri/4; 
        out.println("Fri: " + dayFri);  
        int daySat = sat/4; 
        out.println("Sat: " + daySat);

        int sevenAm =0; 
        int threePm = 0;
        int sevenPm = 0;
        int threeAm = 0; 
        for(int row =0; row<1; row++)
        {
            for (int column=0; column<7; column++)
            {
                sevenAm+= temp[row][column];  
            }
        }
        for(int row =1; row<2; row++)
        {
            for (int column=0; column<7; column++)
            {
                threePm+= temp[row][column];  
            }
        }
        for(int row =2; row<3; row++)
        {
            for (int column=0; column<7; column++)
            {
                sevenPm+= temp[row][column];  
            }
        }
        for(int row =3; row<4; row++)
        {
            for (int column=0; column<7; column++)
            {
                threeAm+= temp[row][column];  
            }
        }

        int timeSevenAm = sevenAm/7; 
        int timeThreePm = threePm/7; 
        int timeSevenPm = sevenPm/7;
        int timeThreeAm = threeAm/7; 

        out.println("\n7 AM: " + timeSevenAm); 
        out.println("3 PM: " + timeThreePm); 
        out.println("7 PM: " + timeSevenPm); 
        out.println("3 AM: " + timeThreeAm); 

        int week= 0; 
        for (int row =0; row<4; row++)
        {
            for (int column = 0; column<7; column++)
            {
               week+=temp[row][column]; 
            }
        }

        int averageWeek = week/28; 

        out.println("\nThe final average temperature for the week was: \n"); 
        out.println("Overall: " + averageWeek); 
    }
}  
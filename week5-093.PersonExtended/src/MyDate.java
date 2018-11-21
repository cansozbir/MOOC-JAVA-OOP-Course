
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */

    public int differenceInYears(MyDate comparedDate) {


        MyDate max , min;
        if (this.year < comparedDate.year){
            max = comparedDate;
            min = this;
        }
        else if (this.year > comparedDate.year) {
            max = this;
            min = comparedDate;
        }
        else {  /// yillar esit
            if (this.month< comparedDate.month) {
                max = comparedDate;
                min = this;
            }
            else if (this.month > comparedDate.month){
                max = this;
                min = comparedDate;
            }

            else { /// aylar esit
                if ( this.day < comparedDate.day) {
                    max = comparedDate;
                    min = this;
                }
                else {/// gunlerin esitliginde de buraya giriyor ancak bu islemi bozmayacaktir . sonucta birine max
                    max = this; /// birine min diyoruz ancak ikisi de ayni tarih
                    min = comparedDate;
                }

            }
        }

        int d=0 ;
        int m=0 ;
        int y=0 ;

        if (max.day >= min.day) {
            d = max.day - min.day;
        }
        else {
            if (max.month > 1) {
                max.month --;
                max.day += 30;
                d = max.day - min.day;
            }
            else {
                max.year --;
                max.month += 11;
                max.day += 30;
                d = max.day - min.day;
            }
        }

        if (max.month >= min.month) {
            m = max.month - min.month;
        }
        else {
            max.year--;
            max.month += 12;
            m = max.month - min.month;
        }

        y = max.year - min.year;

        int sum = d + m*30;

        return sum/365 + y;
    }

}

  


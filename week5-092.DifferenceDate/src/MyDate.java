public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }
    public MyDate () {}

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
    public void setAll (int d , int m , int y ) {
        this.day=d;
        this.month=m;
        this.year=y;
    }
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

        /*   setter , bos constructor ve earlier metodlari ile daha kisaltabilirsin.
        MyDate min = new MyDate ();
        MyDate max = new MyDate ();
        if (this.earlier (comparedDate)) {
            min.setAll (this.day , this.month, this.year);
            max.setAll (comparedDate.day , comparedDate.month, comparedDate.year);
        }
        else {
            max.setAll (this.day , this.month, this.year);
            min.setAll (comparedDate.day , comparedDate.month, comparedDate.year);
        }
        */
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

package model;

public class Date {
    // Default Values
    int day = 1, month = 1, year = 1900;
    String monthName = "Enero";
    int format = 0;

    // ============================
    // Constructors
    // ============================
    
    // No values
    public Date() {
        this(1, 1, 2026, 0);
    }

    // Receives 3 values except format
    public Date(int day, int month, int year) {
        this(day, month, year, 0);
    }

    // Receives all values
    public Date(int day, int month, int year, int format) {
        setDay(day);
        setMonth(month);
        setYear(year);
        setFormat(format);
    }


    // ============================
    // Setters
    // ============================

    public void setDay(int day) {
        int maxDay = switch(this.month) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;          // Since the default is January & January has 31 days
        };

        if (1 <= day && day <= maxDay) {
            this.day = day;
        }
    }

    
    public void setMonth(int month) {
        if (1 <= month && month <= 12) {
            this.month = month;

            // Update monthName
            this.monthName = switch(this.month) {
                case 2 -> "Febrero";
                case 3 -> "Marzo";
                case 4 -> "Abril";
                case 5 -> "Mayo";
                case 6 -> "Junio";
                case 7 -> "Julio";
                case 8 -> "Agosto";
                case 9 -> "Septiembre";
                case 10 -> "Octubre";
                case 11 -> "Noviembre";
                case 12 -> "Diciembre";
                default -> "Enero";
            };
        }
    }


    public void setYear(int year) {
        if (1900 <= year && year <= 3000) {
            this.year = year;
        }
    }


    public void setFormat(int format) {
        if (0 <= format && format <= 2) {
            this.format = format;
        }
    }

    // ============================
    // Getters
    // ============================

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public String getMonthName() {
        return this.monthName;
    }

    public int getFormat() {
        return this.format;
    }

    // ============================
    // Methods
    // ============================

    // String
    @Override
    public String toString() {

        return switch(format) {
            case 1 -> String.format("%d-%s-%d", day, monthName.substring(0, 3), year);
            case 2 -> String.format("%d de %s de %s", day, monthName.toLowerCase(), year);
            default -> String.format("%02d/%02d/%02d", day, month, year % 100);
        };
    } 

    // Equals
    @Override 
    public boolean equals(Object obj) {
        // En caso de que no pertenezca a la clase
        if (!(obj instanceof Date)) return false;
        
        // Parsear a Date
        Date d = (Date) obj;

        // Checar si es igual
        return 
        d.getDay() == this.day &&
        d.getMonth() == this.month &&
        d.getYear() == this.year;
    }

    // Clone
    public Date clone() {
        return new Date(this.day, this.month, this.year, this.format);
    }

    // Get Next Day
    public void next() {
        // Get maxDay for each month
        int maxDay = switch(this.month) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;          // Since the default is January & January has 31 days
        }; 

        // If current day is smaller than maxDay
        if (this.day < maxDay) {
            this.day++;
        } 
        else {
            // Current day IS maxDay
            this.day = 1;

            // Month is less than 12
            if (this.month < 12) {
                this.setMonth(this.month+1);
            }
            // Month IS 12
            else {
                this.setMonth(1);
                this.year++;
            }
        }
    }
}
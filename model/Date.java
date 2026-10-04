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
    // Methods
    // ============================
    public void print() {
        System.out.println(this.day + "-" + this.month + "-" + this.year + ". " +
                            this.monthName + ", " + this.format 
        );
    }

    // String
    @Override
    public String toString() {

        return switch(format) {
            case 1 -> String.format("%d-%s-%d", day, monthName.substring(0, 3), year);
            case 2 -> String.format("%d de %s de %s", day, monthName.toLowerCase(), year);
            default -> String.format("%02d/%02d/%02d", day, month, year % 100);
        };
        // return String.format("{red: %d, green: %d, blue: %d. Name: %s}", 
                                // this.red, this.green, this.blue, this.name);
    } 
}
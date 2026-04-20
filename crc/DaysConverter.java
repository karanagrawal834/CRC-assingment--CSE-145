class ps11 {
    public static void main(String[] args) {
        int days = 500;

        int years = days / 365;
        int weeks = (days % 365) / 7;
        int remDays = (days % 365) % 7;

        System.out.println(years + " years " + weeks + " weeks " + remDays + " days");
    }
}
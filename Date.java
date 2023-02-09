public class Date {
        private final int year;
        private final int mount;
        private final int day;
        public Date(int year, int mount, int day) {
            this.year = year;
            this.mount = mount;
            this.day = day;
        }
        public void showDate(){
            System.out.println(year + "/" + "0" + mount + "/" + "0" + day);
        }

}

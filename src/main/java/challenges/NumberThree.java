package challenges;

public class NumberThree {

    public String timeConversion(String s) {
        // Delete the line below and implement the method!
        //throw new UnsupportedOperationException();
        s.trim();
        int num = 0;
        String result = "";
        if (s.contains("12")){
            if(s.contains("PM")){
                result = s.substring(0,8);
            }
            else if(s.contains("AM")){
                result = "00" + s.substring(2,8);
            }
            return result;
        }
        if(s.substring(s.length()-2).equals("PM")) {
            num = Integer.parseInt(s.substring(0, 2)) + 12;
            result = Integer.toString(num) + s.substring(2,8);
        }
        else{
            result = s.substring(0,8);
        }
        return result;
    }
}

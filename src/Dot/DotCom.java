package Dot;
import javax.xml.transform.Result;
import java.util.ArrayList;
public class DotCom {
        private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
    public String checkYouself (String userInput) {
        String result="Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >=0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "Потопил";}
            else {result = "Попал";
            }
        }
        return result;
    }
}
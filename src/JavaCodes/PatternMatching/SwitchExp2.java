package JavaCodes.PatternMatching;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SwitchExp2 {
    public enum TimeOfDay{
        DAY, NIGHT
    }
    public static String recommendation(TimeOfDay timeOfDay){
        return switch(timeOfDay){
            case DAY -> "Optional to keep lights on";
            case NIGHT -> "Required to keep lights on";
            // in this case the switch exp is complete without adding the default
            // But we can still add default
        };
    }
    public static void main(String[] args) {
        System.out.println(recommendation(TimeOfDay.DAY));
        System.out.println(recommendation(TimeOfDay.NIGHT));

    }
}

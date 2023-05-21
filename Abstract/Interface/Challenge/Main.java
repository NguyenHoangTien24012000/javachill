package Abstract.Interface.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney OperaHouse", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));
        for (var mappable : mappables){
            Mappable.mapIt(mappable);
        }
    }
}

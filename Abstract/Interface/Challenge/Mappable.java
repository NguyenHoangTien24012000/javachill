package Abstract.Interface.Challenge;

public interface Mappable {
    String JSON_PROPERTY = """ 
            "properties: {%s}" """;
    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON(){
        return """
                "type": "%s", "label": "%s", "marker": "%s" """.formatted(getShape(), getLabel(), getMarker());
    }
    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}

enum Geometry {LINE, POINT, POLYGON}
enum Color{BLACK, GREEN, RED, ORANGE, BLUE}
enum PointMarker{CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}
enum LineMarker{LINE, DOTTED, SOLID}

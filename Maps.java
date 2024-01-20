package Design_Pattern_Behavioural_Strategy;

public class Maps {

    public Maps() {
    }

    public void getPath(String source, String destination, TransportationMode mode) {
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculatorStrategy.findPath(source, destination);
    }
}

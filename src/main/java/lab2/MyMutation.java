package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {

    private final double probs;
    public MyMutation(double probs) {
        this.probs = probs;
    }
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!

        // your implementation:
        for(double[] individual : population) {
            for(int i=0; i<individual.length; i++) {
                if(random.nextDouble() < probs) {
                    individual[i] = -5.0+random.nextDouble()*10.0;
                }
            }
        }
        //result population
        return population;
    }
}

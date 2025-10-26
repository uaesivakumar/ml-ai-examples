// Simple logistic regression example using WEKA library
import weka.classifiers.functions.Logistic;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class JavaExample {
    public static void main(String[] args) throws Exception {
        // Load dataset
        DataSource source = new DataSource("iris.arff");
        Instances data = source.getDataSet();
        if (data.classIndex() == -1)
            data.setClassIndex(data.numAttributes() - 1);

        // Build logistic model
        Logistic model = new Logistic();
        model.buildClassifier(data);

        // Output model
        System.out.println(model);
    }
}

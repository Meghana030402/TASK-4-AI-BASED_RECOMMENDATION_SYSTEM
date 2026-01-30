package Codtech_Task4;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class RecommendationSystem {

    public static void main(String[] args) {

        try {
            // Load data
            DataModel model = new FileDataModel(
                    new File("data/ratings.csv"));

            // Similarity
            UserSimilarity similarity =
                    new PearsonCorrelationSimilarity(model);

            // Neighborhood
            UserNeighborhood neighborhood =
                    new NearestNUserNeighborhood(2, similarity, model);

            // Recommender
            Recommender recommender =
                    new GenericUserBasedRecommender(
                            model, neighborhood, similarity);

            
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter User ID: ");
            long userId = sc.nextLong();

            System.out.print("How many recommendations you want? ");
            int howMany = sc.nextInt();

            // Get recommendations
            List<RecommendedItem> recommendations =
                    recommender.recommend(userId, howMany);

            System.out.println("\nRecommended items for User " + userId + ":");

            if (recommendations.isEmpty()) {
                System.out.println("No new recommendations available.");
            } else {
                for (RecommendedItem item : recommendations) {
                    System.out.println(
                            "Item ID: " + item.getItemID()
                                    + " | Preference Score: " + item.getValue()
                    );
                }
            }

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

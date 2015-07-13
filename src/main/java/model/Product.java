package model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;

/**
 * Created by gleb on 12.07.15.
 */
@Entity("products")
public class Product {

    @Id
    private ObjectId id;

    private final String title;

    private final double price;

    private final String description;

    private final List<String> listOfSize;

    private final List<String> listOfImageURLs;

    public Product(String title, double price, String description, List<String> listOfSize, List<String> listOfImageURLs) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.listOfSize = listOfSize;
        this.listOfImageURLs = listOfImageURLs;
    }

}

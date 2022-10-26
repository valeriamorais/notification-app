package service.lambda.subscribe;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.JsonObject;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class HandleSubscribeFunction implements RequestStreamHandler {

    private static final Logger logger = Logger.getLogger(HandleSubscribeFunction.class);

    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException{

        try {
            //TODO - implement Subscription and SubscriptionConfirmation (SNS)
            logger.info("Subscribed to Topic");

            JsonObject responseJson = new JsonObject();
            JsonObject responseBody = new JsonObject();
            JsonObject headerJson = new JsonObject();

            responseBody.addProperty("message", "subscription done successfully");

            headerJson.addProperty("x-custom-header", "");

            responseJson.addProperty("statusCode", 200);
            responseJson.add("headers", headerJson);
            responseJson.addProperty("body", responseBody.toString());

            OutputStreamWriter writer = new OutputStreamWriter(outputStream, "UTF-8");
            writer.write(responseJson.toString());
            writer.close();

        } catch (JsonProcessingException e){
            e.printStackTrace();
        }
    }

    public void handleUnsubscribeRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException{

        try {
            //TODO - implement UnSubscriptionConfirmation
            logger.info("Subscribed to Topic");

            JsonObject responseJson = new JsonObject();
            JsonObject responseBody = new JsonObject();
            JsonObject headerJson = new JsonObject();

            responseBody.addProperty("message", "subscription done successfully");

            headerJson.addProperty("x-custom-header", "");

            responseJson.addProperty("statusCode", 200);
            responseJson.add("headers", headerJson);
            responseJson.addProperty("body", responseBody.toString());

            OutputStreamWriter writer = new OutputStreamWriter(outputStream, "UTF-8");
            writer.write(responseJson.toString());
            writer.close();

        } catch (JsonProcessingException e){
            e.printStackTrace();
        }
    }

}
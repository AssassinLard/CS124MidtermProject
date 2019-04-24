package com.ajwcc.epinurse.basicinformation.gen;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;


public class BasicInformationJsonSerializer implements JsonSerializer<BasicInformation> {

    @Override
    public JsonElement serialize(BasicInformation model, Type type, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        
        object.add("uuid", context.serialize(model.getUuid()));
        object.add("ownerUuid", context.serialize(model.getOwnerUuid()));
        

		// Personal Information

		// Household Information

		// Socio-Economic Information
 
       
        return object;
    }
    
 
    

}
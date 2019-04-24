package com.ajwcc.epinurse.nurseregistration.gen;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;


public class NurseRegistrationJsonSerializer implements JsonSerializer<NurseRegistration> {

    @Override
    public JsonElement serialize(NurseRegistration model, Type type, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        
        object.add("uuid", context.serialize(model.getUuid()));
        object.add("ownerUuid", context.serialize(model.getOwnerUuid()));
        

		// Registration

		// Temporary Address

		// Permanent Address

		// Professional Information
 
       
        return object;
    }
    
 
    

}
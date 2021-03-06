package com.ajwcc.epinurse.studenthealthassessment.gen;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;


public class StudentHealthAssessmentJsonSerializer implements JsonSerializer<StudentHealthAssessment> {

    @Override
    public JsonElement serialize(StudentHealthAssessment model, Type type, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        
        object.add("uuid", context.serialize(model.getUuid()));
        object.add("ownerUuid", context.serialize(model.getOwnerUuid()));
        

		// Page1

		// Page2

		// Page3
 
       
        return object;
    }
    
 
    

}
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
        
		serializeShineId(model, object, context); // shine_id

		// Registration
		serializeNanNumber(model, object, context); // nan_number
		serializeFirstName(model, object, context); // first_name
		serializeMiddleName(model, object, context); // middle_name
		serializeLastName(model, object, context); // last_name
		serializeSex(model, object, context); // sex
		serializeCitizenshipNumber(model, object, context); // citizenship_number
		serializeDateOfBirthInAd(model, object, context); // date_of_birth_in_ad
		serializeDateOfBirthInBs(model, object, context); // date_of_birth_in_bs
		serializeAge(model, object, context); // age

		// Temporary Address
		serializeTempHouseNumber(model, object, context); // temp_house_number
		serializeTempWardNumber(model, object, context); // temp_ward_number
		serializeTempMunicipality(model, object, context); // temp_municipality
		serializeTempDistrict(model, object, context); // temp_district
		serializeTempCountry(model, object, context); // temp_country
		serializeTempZipcode(model, object, context); // temp_zipcode

		// Permanent Address
		serializePermanentHouseNumber(model, object, context); // permanent_house_number
		serializePermanentWardNumber(model, object, context); // permanent_ward_number
		serializePermanentMunicipality(model, object, context); // permanent_municipality
		serializePermanentDistrict(model, object, context); // permanent_district
		serializePermanentCountry(model, object, context); // permanent_country
		serializePermanentZipcode(model, object, context); // permanent_zipcode

		// Professional Information
		serializeProfessionalStatus(model, object, context); // professional_status
		serializeDesignation(model, object, context); // designation
		serializeOffice(model, object, context); // office
		serializeQualifications(model, object, context); // qualifications
		serializeTrainings(model, object, context); // trainings
 
       
        return object;
    }
    

    public void serializeShineId(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("shine_id", context.serialize(model.getShineId()));
    }

    public void serializeNanNumber(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("nan_number", context.serialize(model.getNanNumber()));
    }

    public void serializeFirstName(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("first_name", context.serialize(model.getFirstName()));
    }

    public void serializeMiddleName(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("middle_name", context.serialize(model.getMiddleName()));
    }

    public void serializeLastName(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("last_name", context.serialize(model.getLastName()));
    }

    public void serializeSex(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("sex", context.serialize(model.getSex()));
    }

    public void serializeCitizenshipNumber(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("citizenship_number", context.serialize(model.getCitizenshipNumber()));
    }

    public void serializeDateOfBirthInAd(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("date_of_birth_in_ad", context.serialize(model.getDateOfBirthInAd()));
    }

    public void serializeDateOfBirthInBs(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("date_of_birth_in_bs", context.serialize(model.getDateOfBirthInBs()));
    }

    public void serializeAge(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("age", context.serialize(model.getAge()));
    }

    public void serializeTempHouseNumber(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("temp_house_number", context.serialize(model.getTempHouseNumber()));
    }

    public void serializeTempWardNumber(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("temp_ward_number", context.serialize(model.getTempWardNumber()));
    }

    public void serializeTempMunicipality(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("temp_municipality", context.serialize(model.getTempMunicipality()));
    }

    public void serializeTempDistrict(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("temp_district", context.serialize(model.getTempDistrict()));
    }

    public void serializeTempCountry(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("temp_country", context.serialize(model.getTempCountry()));
    }

    public void serializeTempZipcode(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("temp_zipcode", context.serialize(model.getTempZipcode()));
    }

    public void serializePermanentHouseNumber(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("permanent_house_number", context.serialize(model.getPermanentHouseNumber()));
    }

    public void serializePermanentWardNumber(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("permanent_ward_number", context.serialize(model.getPermanentWardNumber()));
    }

    public void serializePermanentMunicipality(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("permanent_municipality", context.serialize(model.getPermanentMunicipality()));
    }

    public void serializePermanentDistrict(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("permanent_district", context.serialize(model.getPermanentDistrict()));
    }

    public void serializePermanentCountry(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("permanent_country", context.serialize(model.getPermanentCountry()));
    }

    public void serializePermanentZipcode(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("permanent_zipcode", context.serialize(model.getPermanentZipcode()));
    }

    public void serializeProfessionalStatus(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("professional_status", context.serialize(model.getProfessionalStatus()));
    }

    public void serializeDesignation(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("designation", context.serialize(model.getDesignation()));
    }

    public void serializeOffice(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("office", context.serialize(model.getOffice()));
    }

    public void serializeQualifications(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("qualifications", context.serialize(model.getQualifications()));
    }

    public void serializeTrainings(NurseRegistration model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trainings", context.serialize(model.getTrainings()));
    }
 
    

}
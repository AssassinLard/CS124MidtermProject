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
        
		serializePatientId(model, object, context); // patient_id

		// Personal Information
		serializeFirstName(model, object, context); // first_name
		serializeMiddleName(model, object, context); // middle_name
		serializeLastName(model, object, context); // last_name
		serializeSex(model, object, context); // sex
		serializeMaritalStatus(model, object, context); // marital_status
		serializeDateOfBirthInAd(model, object, context); // date_of_birth_in_ad
		serializeDateOfBirthInBs(model, object, context); // date_of_birth_in_bs
		serializeAge(model, object, context); // age

		// Household Information
		serializeFamilyID(model, object, context); // family_i_d
		serializeTypeOfFamily(model, object, context); // type_of_family
		serializeHouseNumber(model, object, context); // house_number
		serializeWardNumber(model, object, context); // ward_number
		serializeMunicipality(model, object, context); // municipality
		serializeDistrict(model, object, context); // district
		serializeCountry(model, object, context); // country
		serializeZipcode(model, object, context); // zipcode
		serializeFathersName(model, object, context); // fathers_name
		serializeFatherLate(model, object, context); // father_late
		serializeMothersName(model, object, context); // mothers_name
		serializeMotherLate(model, object, context); // mother_late
		serializeLocalGuardiansName(model, object, context); // local_guardians_name
		serializeContactOfParentGuardian(model, object, context); // contact_of_parent_guardian
		serializeNumberMale(model, object, context); // number_male
		serializeNumberFemale(model, object, context); // number_female
		serializeNumberOthers(model, object, context); // number_others
		serializeNumberMaleUnder5(model, object, context); // number_male_under5
		serializeNumberFemaleUnder5(model, object, context); // number_female_under5
		serializeNumberMaleAbove60(model, object, context); // number_male_above60
		serializeNumberFemaleAbove60(model, object, context); // number_female_above60
		serializeNumberDisabled(model, object, context); // number_disabled
		serializeNumberPregnant(model, object, context); // number_pregnant
		serializeNumberLactatingMothers(model, object, context); // number_lactating_mothers

		// Socio-Economic Information
		serializeEthnicity(model, object, context); // ethnicity
		serializeReligion(model, object, context); // religion
		serializeEducationalStatus(model, object, context); // educational_status
		serializeOccupation(model, object, context); // occupation
		serializeOccupationSpecify(model, object, context); // occupation_specify
		serializeIncomeAgriculture(model, object, context); // income_agriculture
		serializeIncomeBusiness(model, object, context); // income_business
		serializeIncomeService(model, object, context); // income_service
		serializeIncomeLabor(model, object, context); // income_labor
		serializeIncomeRemittance(model, object, context); // income_remittance
		serializeIncomeOthers(model, object, context); // income_others
		serializeIncomeSpecify(model, object, context); // income_specify
		serializeFoodSufficiency(model, object, context); // food_sufficiency
 
       
        return object;
    }
    

    public void serializePatientId(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("patient_id", context.serialize(model.getPatientId()));
    }

    public void serializeFirstName(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("first_name", context.serialize(model.getFirstName()));
    }

    public void serializeMiddleName(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("middle_name", context.serialize(model.getMiddleName()));
    }

    public void serializeLastName(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("last_name", context.serialize(model.getLastName()));
    }

    public void serializeSex(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("sex", context.serialize(model.getSex()));
    }

    public void serializeMaritalStatus(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("marital_status", context.serialize(model.getMaritalStatus()));
    }

    public void serializeDateOfBirthInAd(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("date_of_birth_in_ad", context.serialize(model.getDateOfBirthInAd()));
    }

    public void serializeDateOfBirthInBs(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("date_of_birth_in_bs", context.serialize(model.getDateOfBirthInBs()));
    }

    public void serializeAge(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("age", context.serialize(model.getAge()));
    }

    public void serializeFamilyID(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("family_i_d", context.serialize(model.getFamilyID()));
    }

    public void serializeTypeOfFamily(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("type_of_family", context.serialize(model.getTypeOfFamily()));
    }

    public void serializeHouseNumber(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("house_number", context.serialize(model.getHouseNumber()));
    }

    public void serializeWardNumber(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("ward_number", context.serialize(model.getWardNumber()));
    }

    public void serializeMunicipality(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("municipality", context.serialize(model.getMunicipality()));
    }

    public void serializeDistrict(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("district", context.serialize(model.getDistrict()));
    }

    public void serializeCountry(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("country", context.serialize(model.getCountry()));
    }

    public void serializeZipcode(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("zipcode", context.serialize(model.getZipcode()));
    }

    public void serializeFathersName(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("fathers_name", context.serialize(model.getFathersName()));
    }

    public void serializeFatherLate(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("father_late", context.serialize(model.getFatherLate()));
    }

    public void serializeMothersName(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("mothers_name", context.serialize(model.getMothersName()));
    }

    public void serializeMotherLate(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("mother_late", context.serialize(model.getMotherLate()));
    }

    public void serializeLocalGuardiansName(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("local_guardians_name", context.serialize(model.getLocalGuardiansName()));
    }

    public void serializeContactOfParentGuardian(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("contact_of_parent_guardian", context.serialize(model.getContactOfParentGuardian()));
    }

    public void serializeNumberMale(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("number_male", context.serialize(model.getNumberMale()));
    }

    public void serializeNumberFemale(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("number_female", context.serialize(model.getNumberFemale()));
    }

    public void serializeNumberOthers(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("number_others", context.serialize(model.getNumberOthers()));
    }

    public void serializeNumberMaleUnder5(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("number_male_under5", context.serialize(model.getNumberMaleUnder5()));
    }

    public void serializeNumberFemaleUnder5(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("number_female_under5", context.serialize(model.getNumberFemaleUnder5()));
    }

    public void serializeNumberMaleAbove60(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("number_male_above60", context.serialize(model.getNumberMaleAbove60()));
    }

    public void serializeNumberFemaleAbove60(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("number_female_above60", context.serialize(model.getNumberFemaleAbove60()));
    }

    public void serializeNumberDisabled(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("number_disabled", context.serialize(model.getNumberDisabled()));
    }

    public void serializeNumberPregnant(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("number_pregnant", context.serialize(model.getNumberPregnant()));
    }

    public void serializeNumberLactatingMothers(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("number_lactating_mothers", context.serialize(model.getNumberLactatingMothers()));
    }

    public void serializeEthnicity(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("ethnicity", context.serialize(model.getEthnicity()));
    }

    public void serializeReligion(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("religion", context.serialize(model.getReligion()));
    }

    public void serializeEducationalStatus(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("educational_status", context.serialize(model.getEducationalStatus()));
    }

    public void serializeOccupation(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("occupation", context.serialize(model.getOccupation()));
    }

    public void serializeOccupationSpecify(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("occupation_specify", context.serialize(model.getOccupationSpecify()));
    }

    public void serializeIncomeAgriculture(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("income_agriculture", context.serialize(model.getIncomeAgriculture()));
    }

    public void serializeIncomeBusiness(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("income_business", context.serialize(model.getIncomeBusiness()));
    }

    public void serializeIncomeService(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("income_service", context.serialize(model.getIncomeService()));
    }

    public void serializeIncomeLabor(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("income_labor", context.serialize(model.getIncomeLabor()));
    }

    public void serializeIncomeRemittance(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("income_remittance", context.serialize(model.getIncomeRemittance()));
    }

    public void serializeIncomeOthers(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("income_others", context.serialize(model.getIncomeOthers()));
    }

    public void serializeIncomeSpecify(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("income_specify", context.serialize(model.getIncomeSpecify()));
    }

    public void serializeFoodSufficiency(BasicInformation model, JsonObject object, JsonSerializationContext context)
    {
        object.add("food_sufficiency", context.serialize(model.getFoodSufficiency()));
    }
 
    

}
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
        
		serializeShineId(model, object, context); // shine_id

		// Page1
		serializeVaccinesBcg(model, object, context); // vaccines_bcg
		serializeVaccinesDpt(model, object, context); // vaccines_dpt
		serializeVaccinesOpv(model, object, context); // vaccines_opv
		serializeVaccinesPcv(model, object, context); // vaccines_pcv
		serializeVaccinesMr(model, object, context); // vaccines_mr
		serializeVaccinesJe(model, object, context); // vaccines_je
		serializeVaccinesTd(model, object, context); // vaccines_td
		serializeVaccinesOthers(model, object, context); // vaccines_others
		serializeVaccinesSpecify(model, object, context); // vaccines_specify
		serializeTemperature(model, object, context); // temperature
		serializeSystolic(model, object, context); // systolic
		serializeDiastolic(model, object, context); // diastolic
		serializeHeightCm(model, object, context); // height_cm
		serializeWeightKg(model, object, context); // weight_kg
		serializeBmi(model, object, context); // bmi
		serializeBmiComputed(model, object, context); // bmi_computed
		serializeAcuteRespiratoryInfection(model, object, context); // acute_respiratory_infection
		serializeAcuteWateryDiarrhea(model, object, context); // acute_watery_diarrhea
		serializeAcuteBloodyDiarrhea(model, object, context); // acute_bloody_diarrhea
		serializeAcuteJaundiceInfection(model, object, context); // acute_jaundice_infection
		serializeSuspectedMeningitis(model, object, context); // suspected_meningitis
		serializeSuspectedTetanus(model, object, context); // suspected_tetanus
		serializeAcuteFlaccidParalysis(model, object, context); // acute_flaccid_paralysis
		serializeAcuteHemorraphicFever(model, object, context); // acute_hemorraphic_fever
		serializeFever(model, object, context); // fever

		// Page2
		serializeTraumaMajorHead(model, object, context); // trauma_major_head
		serializeTraumaMajorHeadSpecify(model, object, context); // trauma_major_head_specify
		serializeTraumaMajorSpinal(model, object, context); // trauma_major_spinal
		serializeTraumaMajorSpinalSpecify(model, object, context); // trauma_major_spinal_specify
		serializeTraumaMajorTorso(model, object, context); // trauma_major_torso
		serializeTraumaMajorTorsoSpecify(model, object, context); // trauma_major_torso_specify
		serializeTraumaLeftLeg(model, object, context); // trauma_left_leg
		serializeTraumaLeftLegSpecify(model, object, context); // trauma_left_leg_specify
		serializeTraumaRightLeg(model, object, context); // trauma_right_leg
		serializeTraumaRightLegSpecify(model, object, context); // trauma_right_leg_specify
		serializeTraumaLeftArm(model, object, context); // trauma_left_arm
		serializeTraumaLeftArmSpecify(model, object, context); // trauma_left_arm_specify
		serializeTraumaRightArm(model, object, context); // trauma_right_arm
		serializeTraumaRightArmSpecify(model, object, context); // trauma_right_arm_specify
		serializeSkinDiseases(model, object, context); // skin_diseases
		serializeSkinDiseasesSpecify(model, object, context); // skin_diseases_specify
		serializeAllegies(model, object, context); // allegies
		serializeAllegiesSpecify(model, object, context); // allegies_specify
		serializeRespiratoryDisease(model, object, context); // respiratory_disease
		serializeRespiratoryDiseaseSpecify(model, object, context); // respiratory_disease_specify
		serializeCardiovascularDisease(model, object, context); // cardiovascular_disease
		serializeCardiovascularDiseaseSpecify(model, object, context); // cardiovascular_disease_specify
		serializeEndocrineDisease(model, object, context); // endocrine_disease
		serializeEndocrineDiseaseSpecify(model, object, context); // endocrine_disease_specify
		serializeUrinarySystemDisease(model, object, context); // urinary_system_disease
		serializeUrinarySystemDiseaseSpecify(model, object, context); // urinary_system_disease_specify
		serializeReproductivSystemDisease(model, object, context); // reproductiv_system_disease
		serializeReproductivSystemDiseaseSpecify(model, object, context); // reproductiv_system_disease_specify
		serializeCommunicationHearingProblem(model, object, context); // communication_hearing_problem
		serializeCommunicationHearingProblemSpecify(model, object, context); // communication_hearing_problem_specify
		serializeVisionProblem(model, object, context); // vision_problem
		serializeVisionProblemSpecify(model, object, context); // vision_problem_specify
		serializeOralDentalHealthProblem(model, object, context); // oral_dental_health_problem
		serializeOralDentalHealthProblemSpecify(model, object, context); // oral_dental_health_problem_specify
		serializePsychologicalProblem(model, object, context); // psychological_problem
		serializePsychologicalProblemSpecify(model, object, context); // psychological_problem_specify
		serializePhysicalStructuralProblems(model, object, context); // physical_structural_problems
		serializePhysicalStructuralProblemsSpecify(model, object, context); // physical_structural_problems_specify
		serializeCognativePatterns(model, object, context); // cognative_patterns
		serializeCognativePatternsSpecify(model, object, context); // cognative_patterns_specify
		serializeBowelHabit(model, object, context); // bowel_habit
		serializeBowelHabitSpecify(model, object, context); // bowel_habit_specify
		serializeBladderHabit(model, object, context); // bladder_habit
		serializeBladderHabitSpecify(model, object, context); // bladder_habit_specify
		serializeUnderMedication(model, object, context); // under_medication
		serializeUnderMedicationSpecify(model, object, context); // under_medication_specify
		serializeRecentTreatment(model, object, context); // recent_treatment
		serializeRecentTreatmentSpecify(model, object, context); // recent_treatment_specify
		serializeRecentProcedure(model, object, context); // recent_procedure
		serializeRecentProcedureSpecify(model, object, context); // recent_procedure_specify
		serializeRecentCounseling(model, object, context); // recent_counseling
		serializeRecentCounselingSpecify(model, object, context); // recent_counseling_specify

		// Page3
		serializeBhSuspension(model, object, context); // bh_suspension
		serializeBhSuspensionSpecify(model, object, context); // bh_suspension_specify
		serializeBhAntiSocialBehavior(model, object, context); // bh_anti_social_behavior
		serializeBhDelinquency(model, object, context); // bh_delinquency
		serializeBhViolence(model, object, context); // bh_violence
		serializeBhSmoking(model, object, context); // bh_smoking
		serializeBhAlcohol(model, object, context); // bh_alcohol
		serializeBhSubstanceAbuse(model, object, context); // bh_substance_abuse
		serializeBhSuicidalThoughts(model, object, context); // bh_suicidal_thoughts
		serializeBhSuicidalAttempts(model, object, context); // bh_suicidal_attempts
		serializeBreakfastPlace(model, object, context); // breakfast_place
		serializeBreakfastTime(model, object, context); // breakfast_time
		serializeBreakfastTypeOfFood(model, object, context); // breakfast_type_of_food
		serializeLunchPlace(model, object, context); // lunch_place
		serializeLunchTime(model, object, context); // lunch_time
		serializeLunchTypeOfFood(model, object, context); // lunch_type_of_food
		serializeSnackPlace(model, object, context); // snack_place
		serializeSnackTime(model, object, context); // snack_time
		serializeSnackTypeOfFood(model, object, context); // snack_type_of_food
		serializeDinnerPlace(model, object, context); // dinner_place
		serializeDinnerTime(model, object, context); // dinner_time
		serializeDinnerTypeOfFood(model, object, context); // dinner_type_of_food
		serializeMalnutrition(model, object, context); // malnutrition
		serializeMalnutritionSpecify(model, object, context); // malnutrition_specify
		serializeIdleHours(model, object, context); // idle_hours
		serializeActiveHours(model, object, context); // active_hours
		serializeAgeOfMenarche(model, object, context); // age_of_menarche
		serializeMenstruationMaterials(model, object, context); // menstruation_materials
		serializeFamilyInteraction(model, object, context); // family_interaction
		serializeFamilyInteractionSpecify(model, object, context); // family_interaction_specify
		serializeCommunityInvolvement(model, object, context); // community_involvement
		serializeCommunityInvolvementSpecify(model, object, context); // community_involvement_specify
		serializeChildDrrKnowledge(model, object, context); // child_drr_knowledge
		serializeChildComplaint(model, object, context); // child_complaint
 
       
        return object;
    }
    

    public void serializeShineId(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("shine_id", context.serialize(model.getShineId()));
    }

    public void serializeVaccinesBcg(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("vaccines_bcg", context.serialize(model.getVaccinesBcg()));
    }

    public void serializeVaccinesDpt(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("vaccines_dpt", context.serialize(model.getVaccinesDpt()));
    }

    public void serializeVaccinesOpv(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("vaccines_opv", context.serialize(model.getVaccinesOpv()));
    }

    public void serializeVaccinesPcv(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("vaccines_pcv", context.serialize(model.getVaccinesPcv()));
    }

    public void serializeVaccinesMr(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("vaccines_mr", context.serialize(model.getVaccinesMr()));
    }

    public void serializeVaccinesJe(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("vaccines_je", context.serialize(model.getVaccinesJe()));
    }

    public void serializeVaccinesTd(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("vaccines_td", context.serialize(model.getVaccinesTd()));
    }

    public void serializeVaccinesOthers(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("vaccines_others", context.serialize(model.getVaccinesOthers()));
    }

    public void serializeVaccinesSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("vaccines_specify", context.serialize(model.getVaccinesSpecify()));
    }

    public void serializeTemperature(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("temperature", context.serialize(model.getTemperature()));
    }

    public void serializeSystolic(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("systolic", context.serialize(model.getSystolic()));
    }

    public void serializeDiastolic(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("diastolic", context.serialize(model.getDiastolic()));
    }

    public void serializeHeightCm(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("height_cm", context.serialize(model.getHeightCm()));
    }

    public void serializeWeightKg(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("weight_kg", context.serialize(model.getWeightKg()));
    }

    public void serializeBmi(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bmi", context.serialize(model.getBmi()));
    }

    public void serializeBmiComputed(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bmi_computed", context.serialize(model.getBmiComputed()));
    }

    public void serializeAcuteRespiratoryInfection(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("acute_respiratory_infection", context.serialize(model.getAcuteRespiratoryInfection()));
    }

    public void serializeAcuteWateryDiarrhea(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("acute_watery_diarrhea", context.serialize(model.getAcuteWateryDiarrhea()));
    }

    public void serializeAcuteBloodyDiarrhea(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("acute_bloody_diarrhea", context.serialize(model.getAcuteBloodyDiarrhea()));
    }

    public void serializeAcuteJaundiceInfection(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("acute_jaundice_infection", context.serialize(model.getAcuteJaundiceInfection()));
    }

    public void serializeSuspectedMeningitis(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("suspected_meningitis", context.serialize(model.getSuspectedMeningitis()));
    }

    public void serializeSuspectedTetanus(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("suspected_tetanus", context.serialize(model.getSuspectedTetanus()));
    }

    public void serializeAcuteFlaccidParalysis(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("acute_flaccid_paralysis", context.serialize(model.getAcuteFlaccidParalysis()));
    }

    public void serializeAcuteHemorraphicFever(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("acute_hemorraphic_fever", context.serialize(model.getAcuteHemorraphicFever()));
    }

    public void serializeFever(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("fever", context.serialize(model.getFever()));
    }

    public void serializeTraumaMajorHead(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trauma_major_head", context.serialize(model.getTraumaMajorHead()));
    }

    public void serializeTraumaMajorHeadSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trauma_major_head_specify", context.serialize(model.getTraumaMajorHeadSpecify()));
    }

    public void serializeTraumaMajorSpinal(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trauma_major_spinal", context.serialize(model.getTraumaMajorSpinal()));
    }

    public void serializeTraumaMajorSpinalSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trauma_major_spinal_specify", context.serialize(model.getTraumaMajorSpinalSpecify()));
    }

    public void serializeTraumaMajorTorso(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trauma_major_torso", context.serialize(model.getTraumaMajorTorso()));
    }

    public void serializeTraumaMajorTorsoSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trauma_major_torso_specify", context.serialize(model.getTraumaMajorTorsoSpecify()));
    }

    public void serializeTraumaLeftLeg(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trauma_left_leg", context.serialize(model.getTraumaLeftLeg()));
    }

    public void serializeTraumaLeftLegSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trauma_left_leg_specify", context.serialize(model.getTraumaLeftLegSpecify()));
    }

    public void serializeTraumaRightLeg(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trauma_right_leg", context.serialize(model.getTraumaRightLeg()));
    }

    public void serializeTraumaRightLegSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trauma_right_leg_specify", context.serialize(model.getTraumaRightLegSpecify()));
    }

    public void serializeTraumaLeftArm(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trauma_left_arm", context.serialize(model.getTraumaLeftArm()));
    }

    public void serializeTraumaLeftArmSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trauma_left_arm_specify", context.serialize(model.getTraumaLeftArmSpecify()));
    }

    public void serializeTraumaRightArm(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trauma_right_arm", context.serialize(model.getTraumaRightArm()));
    }

    public void serializeTraumaRightArmSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("trauma_right_arm_specify", context.serialize(model.getTraumaRightArmSpecify()));
    }

    public void serializeSkinDiseases(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("skin_diseases", context.serialize(model.getSkinDiseases()));
    }

    public void serializeSkinDiseasesSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("skin_diseases_specify", context.serialize(model.getSkinDiseasesSpecify()));
    }

    public void serializeAllegies(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("allegies", context.serialize(model.getAllegies()));
    }

    public void serializeAllegiesSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("allegies_specify", context.serialize(model.getAllegiesSpecify()));
    }

    public void serializeRespiratoryDisease(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("respiratory_disease", context.serialize(model.getRespiratoryDisease()));
    }

    public void serializeRespiratoryDiseaseSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("respiratory_disease_specify", context.serialize(model.getRespiratoryDiseaseSpecify()));
    }

    public void serializeCardiovascularDisease(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("cardiovascular_disease", context.serialize(model.getCardiovascularDisease()));
    }

    public void serializeCardiovascularDiseaseSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("cardiovascular_disease_specify", context.serialize(model.getCardiovascularDiseaseSpecify()));
    }

    public void serializeEndocrineDisease(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("endocrine_disease", context.serialize(model.getEndocrineDisease()));
    }

    public void serializeEndocrineDiseaseSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("endocrine_disease_specify", context.serialize(model.getEndocrineDiseaseSpecify()));
    }

    public void serializeUrinarySystemDisease(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("urinary_system_disease", context.serialize(model.getUrinarySystemDisease()));
    }

    public void serializeUrinarySystemDiseaseSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("urinary_system_disease_specify", context.serialize(model.getUrinarySystemDiseaseSpecify()));
    }

    public void serializeReproductivSystemDisease(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("reproductiv_system_disease", context.serialize(model.getReproductivSystemDisease()));
    }

    public void serializeReproductivSystemDiseaseSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("reproductiv_system_disease_specify", context.serialize(model.getReproductivSystemDiseaseSpecify()));
    }

    public void serializeCommunicationHearingProblem(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("communication_hearing_problem", context.serialize(model.getCommunicationHearingProblem()));
    }

    public void serializeCommunicationHearingProblemSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("communication_hearing_problem_specify", context.serialize(model.getCommunicationHearingProblemSpecify()));
    }

    public void serializeVisionProblem(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("vision_problem", context.serialize(model.getVisionProblem()));
    }

    public void serializeVisionProblemSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("vision_problem_specify", context.serialize(model.getVisionProblemSpecify()));
    }

    public void serializeOralDentalHealthProblem(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("oral_dental_health_problem", context.serialize(model.getOralDentalHealthProblem()));
    }

    public void serializeOralDentalHealthProblemSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("oral_dental_health_problem_specify", context.serialize(model.getOralDentalHealthProblemSpecify()));
    }

    public void serializePsychologicalProblem(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("psychological_problem", context.serialize(model.getPsychologicalProblem()));
    }

    public void serializePsychologicalProblemSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("psychological_problem_specify", context.serialize(model.getPsychologicalProblemSpecify()));
    }

    public void serializePhysicalStructuralProblems(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("physical_structural_problems", context.serialize(model.getPhysicalStructuralProblems()));
    }

    public void serializePhysicalStructuralProblemsSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("physical_structural_problems_specify", context.serialize(model.getPhysicalStructuralProblemsSpecify()));
    }

    public void serializeCognativePatterns(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("cognative_patterns", context.serialize(model.getCognativePatterns()));
    }

    public void serializeCognativePatternsSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("cognative_patterns_specify", context.serialize(model.getCognativePatternsSpecify()));
    }

    public void serializeBowelHabit(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bowel_habit", context.serialize(model.getBowelHabit()));
    }

    public void serializeBowelHabitSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bowel_habit_specify", context.serialize(model.getBowelHabitSpecify()));
    }

    public void serializeBladderHabit(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bladder_habit", context.serialize(model.getBladderHabit()));
    }

    public void serializeBladderHabitSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bladder_habit_specify", context.serialize(model.getBladderHabitSpecify()));
    }

    public void serializeUnderMedication(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("under_medication", context.serialize(model.getUnderMedication()));
    }

    public void serializeUnderMedicationSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("under_medication_specify", context.serialize(model.getUnderMedicationSpecify()));
    }

    public void serializeRecentTreatment(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("recent_treatment", context.serialize(model.getRecentTreatment()));
    }

    public void serializeRecentTreatmentSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("recent_treatment_specify", context.serialize(model.getRecentTreatmentSpecify()));
    }

    public void serializeRecentProcedure(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("recent_procedure", context.serialize(model.getRecentProcedure()));
    }

    public void serializeRecentProcedureSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("recent_procedure_specify", context.serialize(model.getRecentProcedureSpecify()));
    }

    public void serializeRecentCounseling(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("recent_counseling", context.serialize(model.getRecentCounseling()));
    }

    public void serializeRecentCounselingSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("recent_counseling_specify", context.serialize(model.getRecentCounselingSpecify()));
    }

    public void serializeBhSuspension(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bh_suspension", context.serialize(model.getBhSuspension()));
    }

    public void serializeBhSuspensionSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bh_suspension_specify", context.serialize(model.getBhSuspensionSpecify()));
    }

    public void serializeBhAntiSocialBehavior(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bh_anti_social_behavior", context.serialize(model.getBhAntiSocialBehavior()));
    }

    public void serializeBhDelinquency(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bh_delinquency", context.serialize(model.getBhDelinquency()));
    }

    public void serializeBhViolence(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bh_violence", context.serialize(model.getBhViolence()));
    }

    public void serializeBhSmoking(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bh_smoking", context.serialize(model.getBhSmoking()));
    }

    public void serializeBhAlcohol(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bh_alcohol", context.serialize(model.getBhAlcohol()));
    }

    public void serializeBhSubstanceAbuse(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bh_substance_abuse", context.serialize(model.getBhSubstanceAbuse()));
    }

    public void serializeBhSuicidalThoughts(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bh_suicidal_thoughts", context.serialize(model.getBhSuicidalThoughts()));
    }

    public void serializeBhSuicidalAttempts(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("bh_suicidal_attempts", context.serialize(model.getBhSuicidalAttempts()));
    }

    public void serializeBreakfastPlace(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("breakfast_place", context.serialize(model.getBreakfastPlace()));
    }

    public void serializeBreakfastTime(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("breakfast_time", context.serialize(model.getBreakfastTime()));
    }

    public void serializeBreakfastTypeOfFood(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("breakfast_type_of_food", context.serialize(model.getBreakfastTypeOfFood()));
    }

    public void serializeLunchPlace(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("lunch_place", context.serialize(model.getLunchPlace()));
    }

    public void serializeLunchTime(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("lunch_time", context.serialize(model.getLunchTime()));
    }

    public void serializeLunchTypeOfFood(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("lunch_type_of_food", context.serialize(model.getLunchTypeOfFood()));
    }

    public void serializeSnackPlace(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("snack_place", context.serialize(model.getSnackPlace()));
    }

    public void serializeSnackTime(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("snack_time", context.serialize(model.getSnackTime()));
    }

    public void serializeSnackTypeOfFood(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("snack_type_of_food", context.serialize(model.getSnackTypeOfFood()));
    }

    public void serializeDinnerPlace(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("dinner_place", context.serialize(model.getDinnerPlace()));
    }

    public void serializeDinnerTime(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("dinner_time", context.serialize(model.getDinnerTime()));
    }

    public void serializeDinnerTypeOfFood(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("dinner_type_of_food", context.serialize(model.getDinnerTypeOfFood()));
    }

    public void serializeMalnutrition(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("malnutrition", context.serialize(model.getMalnutrition()));
    }

    public void serializeMalnutritionSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("malnutrition_specify", context.serialize(model.getMalnutritionSpecify()));
    }

    public void serializeIdleHours(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("idle_hours", context.serialize(model.getIdleHours()));
    }

    public void serializeActiveHours(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("active_hours", context.serialize(model.getActiveHours()));
    }

    public void serializeAgeOfMenarche(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("age_of_menarche", context.serialize(model.getAgeOfMenarche()));
    }

    public void serializeMenstruationMaterials(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("menstruation_materials", context.serialize(model.getMenstruationMaterials()));
    }

    public void serializeFamilyInteraction(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("family_interaction", context.serialize(model.getFamilyInteraction()));
    }

    public void serializeFamilyInteractionSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("family_interaction_specify", context.serialize(model.getFamilyInteractionSpecify()));
    }

    public void serializeCommunityInvolvement(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("community_involvement", context.serialize(model.getCommunityInvolvement()));
    }

    public void serializeCommunityInvolvementSpecify(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("community_involvement_specify", context.serialize(model.getCommunityInvolvementSpecify()));
    }

    public void serializeChildDrrKnowledge(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("child_drr_knowledge", context.serialize(model.getChildDrrKnowledge()));
    }

    public void serializeChildComplaint(StudentHealthAssessment model, JsonObject object, JsonSerializationContext context)
    {
        object.add("child_complaint", context.serialize(model.getChildComplaint()));
    }
 
    

}
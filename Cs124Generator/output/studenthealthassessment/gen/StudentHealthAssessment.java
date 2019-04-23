package com.ajwcc.epinurse.studenthealthassessment.gen;

import com.ajwcc.epinurse.common.utils.EpinurseModel;
import com.ajwcc.epinurse.common.utils.network.ExcludeFromJson;

import java.util.Date;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import com.zhuinden.realmautomigration.AutoMigration;

public class StudentHealthAssessment extends RealmObject implements EpinurseModel
{
    @PrimaryKey
    private String uuid;
    
    public void setUuid(String uuid)
	{
		this.uuid = uuid;
	}

	public String getUuid()
	{
		return uuid;
	}

	@ExcludeFromJson
	private boolean editing;

	@Override
	public boolean isEditing() {
		return editing;
	}

	@Override
	public void setEditing(boolean editing) {
		this.editing = editing;
	}


	@ExcludeFromJson
	private String ownerUuid;

	@Override
	public String getOwnerUuid() {
		return ownerUuid;
	}

	@Override
	public void setOwnerUuid(String ownerUuid) {
		this.ownerUuid = ownerUuid;
	}


    
	@ExcludeFromJson
	private boolean synced;

	@Override
	public boolean isSynced() {
		return synced;
	}

	@Override
	public void setSynced(boolean synced) {
		this.synced = synced;
	}


	@ExcludeFromJson
	private Date createdAt;

	@Override
	public Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public void setCreatedAt(Date date)
	{
		this.createdAt = date;
	}
    
	private String shineId;

	// Page1
	private Integer vaccinesBcg;
	private Integer vaccinesDpt;
	private Integer vaccinesOpv;
	private Integer vaccinesPcv;
	private Integer vaccinesMr;
	private Integer vaccinesJe;
	private Integer vaccinesTd;
	private Integer vaccinesOthers;
	private String vaccinesSpecify;
	private Double temperature;
	private Integer systolic;
	private Integer diastolic;
	private Double heightCm;
	private Double weightKg;
	private Integer bmi;
	private Double bmiComputed;
	private Integer acuteRespiratoryInfection;
	private Integer acuteWateryDiarrhea;
	private Integer acuteBloodyDiarrhea;
	private Integer acuteJaundiceInfection;
	private Integer suspectedMeningitis;
	private Integer suspectedTetanus;
	private Integer acuteFlaccidParalysis;
	private Integer acuteHemorraphicFever;
	private Integer fever;

	// Page2
	private Integer traumaMajorHead;
	private String traumaMajorHeadSpecify;
	private Integer traumaMajorSpinal;
	private String traumaMajorSpinalSpecify;
	private Integer traumaMajorTorso;
	private String traumaMajorTorsoSpecify;
	private Integer traumaLeftLeg;
	private String traumaLeftLegSpecify;
	private Integer traumaRightLeg;
	private String traumaRightLegSpecify;
	private Integer traumaLeftArm;
	private String traumaLeftArmSpecify;
	private Integer traumaRightArm;
	private String traumaRightArmSpecify;
	private Integer skinDiseases;
	private String skinDiseasesSpecify;
	private Integer allegies;
	private String allegiesSpecify;
	private Integer respiratoryDisease;
	private String respiratoryDiseaseSpecify;
	private Integer cardiovascularDisease;
	private String cardiovascularDiseaseSpecify;
	private Integer endocrineDisease;
	private String endocrineDiseaseSpecify;
	private Integer urinarySystemDisease;
	private String urinarySystemDiseaseSpecify;
	private Integer reproductivSystemDisease;
	private String reproductivSystemDiseaseSpecify;
	private Integer communicationHearingProblem;
	private String communicationHearingProblemSpecify;
	private Integer visionProblem;
	private String visionProblemSpecify;
	private Integer oralDentalHealthProblem;
	private String oralDentalHealthProblemSpecify;
	private Integer psychologicalProblem;
	private String psychologicalProblemSpecify;
	private Integer physicalStructuralProblems;
	private String physicalStructuralProblemsSpecify;
	private Integer cognativePatterns;
	private String cognativePatternsSpecify;
	private Integer bowelHabit;
	private String bowelHabitSpecify;
	private Integer bladderHabit;
	private String bladderHabitSpecify;
	private Integer underMedication;
	private String underMedicationSpecify;
	private Integer recentTreatment;
	private String recentTreatmentSpecify;
	private Integer recentProcedure;
	private String recentProcedureSpecify;
	private Integer recentCounseling;
	private String recentCounselingSpecify;

	// Page3
	private Integer bhSuspension;
	private String bhSuspensionSpecify;
	private Integer bhAntiSocialBehavior;
	private Integer bhDelinquency;
	private Integer bhViolence;
	private Integer bhSmoking;
	private Integer bhAlcohol;
	private Integer bhSubstanceAbuse;
	private Integer bhSuicidalThoughts;
	private Integer bhSuicidalAttempts;
	private String breakfastPlace;
	private String breakfastTime;
	private String breakfastTypeOfFood;
	private String lunchPlace;
	private String lunchTime;
	private String lunchTypeOfFood;
	private String snackPlace;
	private String snackTime;
	private String snackTypeOfFood;
	private String dinnerPlace;
	private String dinnerTime;
	private String dinnerTypeOfFood;
	private Integer malnutrition;
	private String malnutritionSpecify;
	private String idleHours;
	private String activeHours;
	private Integer ageOfMenarche;
	private String menstruationMaterials;
	private Integer familyInteraction;
	private String familyInteractionSpecify;
	private Integer communityInvolvement;
	private String communityInvolvementSpecify;
	private Integer childDrrKnowledge;
	private String childComplaint;
    
    

	public String getShineId() {
		return this.shineId;
	}

	public void setShineId(String shineId) {
	
		if (this.shineId==null || !this.shineId.equals(shineId))
		{
			editing = true;
			synced = false;
		}
	
		this.shineId = shineId;
	}

	public Integer getVaccinesBcg() {
		return this.vaccinesBcg;
	}

	public void setVaccinesBcg(Integer vaccinesBcg) {
	
		if (this.vaccinesBcg==null || !this.vaccinesBcg.equals(vaccinesBcg))
		{
			editing = true;
			synced = false;
		}
	
		this.vaccinesBcg = vaccinesBcg;
	}

	public Integer getVaccinesDpt() {
		return this.vaccinesDpt;
	}

	public void setVaccinesDpt(Integer vaccinesDpt) {
	
		if (this.vaccinesDpt==null || !this.vaccinesDpt.equals(vaccinesDpt))
		{
			editing = true;
			synced = false;
		}
	
		this.vaccinesDpt = vaccinesDpt;
	}

	public Integer getVaccinesOpv() {
		return this.vaccinesOpv;
	}

	public void setVaccinesOpv(Integer vaccinesOpv) {
	
		if (this.vaccinesOpv==null || !this.vaccinesOpv.equals(vaccinesOpv))
		{
			editing = true;
			synced = false;
		}
	
		this.vaccinesOpv = vaccinesOpv;
	}

	public Integer getVaccinesPcv() {
		return this.vaccinesPcv;
	}

	public void setVaccinesPcv(Integer vaccinesPcv) {
	
		if (this.vaccinesPcv==null || !this.vaccinesPcv.equals(vaccinesPcv))
		{
			editing = true;
			synced = false;
		}
	
		this.vaccinesPcv = vaccinesPcv;
	}

	public Integer getVaccinesMr() {
		return this.vaccinesMr;
	}

	public void setVaccinesMr(Integer vaccinesMr) {
	
		if (this.vaccinesMr==null || !this.vaccinesMr.equals(vaccinesMr))
		{
			editing = true;
			synced = false;
		}
	
		this.vaccinesMr = vaccinesMr;
	}

	public Integer getVaccinesJe() {
		return this.vaccinesJe;
	}

	public void setVaccinesJe(Integer vaccinesJe) {
	
		if (this.vaccinesJe==null || !this.vaccinesJe.equals(vaccinesJe))
		{
			editing = true;
			synced = false;
		}
	
		this.vaccinesJe = vaccinesJe;
	}

	public Integer getVaccinesTd() {
		return this.vaccinesTd;
	}

	public void setVaccinesTd(Integer vaccinesTd) {
	
		if (this.vaccinesTd==null || !this.vaccinesTd.equals(vaccinesTd))
		{
			editing = true;
			synced = false;
		}
	
		this.vaccinesTd = vaccinesTd;
	}

	public Integer getVaccinesOthers() {
		return this.vaccinesOthers;
	}

	public void setVaccinesOthers(Integer vaccinesOthers) {
	
		if (this.vaccinesOthers==null || !this.vaccinesOthers.equals(vaccinesOthers))
		{
			editing = true;
			synced = false;
		}
	
		this.vaccinesOthers = vaccinesOthers;
	}

	public String getVaccinesSpecify() {
		return this.vaccinesSpecify;
	}

	public void setVaccinesSpecify(String vaccinesSpecify) {
	
		if (this.vaccinesSpecify==null || !this.vaccinesSpecify.equals(vaccinesSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.vaccinesSpecify = vaccinesSpecify;
	}

	public Double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(Double temperature) {
	
		if (this.temperature==null || !this.temperature.equals(temperature))
		{
			editing = true;
			synced = false;
		}
	
		this.temperature = temperature;
	}

	public Integer getSystolic() {
		return this.systolic;
	}

	public void setSystolic(Integer systolic) {
	
		if (this.systolic==null || !this.systolic.equals(systolic))
		{
			editing = true;
			synced = false;
		}
	
		this.systolic = systolic;
	}

	public Integer getDiastolic() {
		return this.diastolic;
	}

	public void setDiastolic(Integer diastolic) {
	
		if (this.diastolic==null || !this.diastolic.equals(diastolic))
		{
			editing = true;
			synced = false;
		}
	
		this.diastolic = diastolic;
	}

	public Double getHeightCm() {
		return this.heightCm;
	}

	public void setHeightCm(Double heightCm) {
	
		if (this.heightCm==null || !this.heightCm.equals(heightCm))
		{
			editing = true;
			synced = false;
		}
	
		this.heightCm = heightCm;
	}

	public Double getWeightKg() {
		return this.weightKg;
	}

	public void setWeightKg(Double weightKg) {
	
		if (this.weightKg==null || !this.weightKg.equals(weightKg))
		{
			editing = true;
			synced = false;
		}
	
		this.weightKg = weightKg;
	}

	public Integer getBmi() {
		return this.bmi;
	}

	public void setBmi(Integer bmi) {
	
		if (this.bmi==null || !this.bmi.equals(bmi))
		{
			editing = true;
			synced = false;
		}
	
		this.bmi = bmi;
	}

	public Double getBmiComputed() {
		return this.bmiComputed;
	}

	public void setBmiComputed(Double bmiComputed) {
	
		if (this.bmiComputed==null || !this.bmiComputed.equals(bmiComputed))
		{
			editing = true;
			synced = false;
		}
	
		this.bmiComputed = bmiComputed;
	}

	public Integer getAcuteRespiratoryInfection() {
		return this.acuteRespiratoryInfection;
	}

	public void setAcuteRespiratoryInfection(Integer acuteRespiratoryInfection) {
	
		if (this.acuteRespiratoryInfection==null || !this.acuteRespiratoryInfection.equals(acuteRespiratoryInfection))
		{
			editing = true;
			synced = false;
		}
	
		this.acuteRespiratoryInfection = acuteRespiratoryInfection;
	}

	public Integer getAcuteWateryDiarrhea() {
		return this.acuteWateryDiarrhea;
	}

	public void setAcuteWateryDiarrhea(Integer acuteWateryDiarrhea) {
	
		if (this.acuteWateryDiarrhea==null || !this.acuteWateryDiarrhea.equals(acuteWateryDiarrhea))
		{
			editing = true;
			synced = false;
		}
	
		this.acuteWateryDiarrhea = acuteWateryDiarrhea;
	}

	public Integer getAcuteBloodyDiarrhea() {
		return this.acuteBloodyDiarrhea;
	}

	public void setAcuteBloodyDiarrhea(Integer acuteBloodyDiarrhea) {
	
		if (this.acuteBloodyDiarrhea==null || !this.acuteBloodyDiarrhea.equals(acuteBloodyDiarrhea))
		{
			editing = true;
			synced = false;
		}
	
		this.acuteBloodyDiarrhea = acuteBloodyDiarrhea;
	}

	public Integer getAcuteJaundiceInfection() {
		return this.acuteJaundiceInfection;
	}

	public void setAcuteJaundiceInfection(Integer acuteJaundiceInfection) {
	
		if (this.acuteJaundiceInfection==null || !this.acuteJaundiceInfection.equals(acuteJaundiceInfection))
		{
			editing = true;
			synced = false;
		}
	
		this.acuteJaundiceInfection = acuteJaundiceInfection;
	}

	public Integer getSuspectedMeningitis() {
		return this.suspectedMeningitis;
	}

	public void setSuspectedMeningitis(Integer suspectedMeningitis) {
	
		if (this.suspectedMeningitis==null || !this.suspectedMeningitis.equals(suspectedMeningitis))
		{
			editing = true;
			synced = false;
		}
	
		this.suspectedMeningitis = suspectedMeningitis;
	}

	public Integer getSuspectedTetanus() {
		return this.suspectedTetanus;
	}

	public void setSuspectedTetanus(Integer suspectedTetanus) {
	
		if (this.suspectedTetanus==null || !this.suspectedTetanus.equals(suspectedTetanus))
		{
			editing = true;
			synced = false;
		}
	
		this.suspectedTetanus = suspectedTetanus;
	}

	public Integer getAcuteFlaccidParalysis() {
		return this.acuteFlaccidParalysis;
	}

	public void setAcuteFlaccidParalysis(Integer acuteFlaccidParalysis) {
	
		if (this.acuteFlaccidParalysis==null || !this.acuteFlaccidParalysis.equals(acuteFlaccidParalysis))
		{
			editing = true;
			synced = false;
		}
	
		this.acuteFlaccidParalysis = acuteFlaccidParalysis;
	}

	public Integer getAcuteHemorraphicFever() {
		return this.acuteHemorraphicFever;
	}

	public void setAcuteHemorraphicFever(Integer acuteHemorraphicFever) {
	
		if (this.acuteHemorraphicFever==null || !this.acuteHemorraphicFever.equals(acuteHemorraphicFever))
		{
			editing = true;
			synced = false;
		}
	
		this.acuteHemorraphicFever = acuteHemorraphicFever;
	}

	public Integer getFever() {
		return this.fever;
	}

	public void setFever(Integer fever) {
	
		if (this.fever==null || !this.fever.equals(fever))
		{
			editing = true;
			synced = false;
		}
	
		this.fever = fever;
	}

	public Integer getTraumaMajorHead() {
		return this.traumaMajorHead;
	}

	public void setTraumaMajorHead(Integer traumaMajorHead) {
	
		if (this.traumaMajorHead==null || !this.traumaMajorHead.equals(traumaMajorHead))
		{
			editing = true;
			synced = false;
		}
	
		this.traumaMajorHead = traumaMajorHead;
	}

	public String getTraumaMajorHeadSpecify() {
		return this.traumaMajorHeadSpecify;
	}

	public void setTraumaMajorHeadSpecify(String traumaMajorHeadSpecify) {
	
		if (this.traumaMajorHeadSpecify==null || !this.traumaMajorHeadSpecify.equals(traumaMajorHeadSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.traumaMajorHeadSpecify = traumaMajorHeadSpecify;
	}

	public Integer getTraumaMajorSpinal() {
		return this.traumaMajorSpinal;
	}

	public void setTraumaMajorSpinal(Integer traumaMajorSpinal) {
	
		if (this.traumaMajorSpinal==null || !this.traumaMajorSpinal.equals(traumaMajorSpinal))
		{
			editing = true;
			synced = false;
		}
	
		this.traumaMajorSpinal = traumaMajorSpinal;
	}

	public String getTraumaMajorSpinalSpecify() {
		return this.traumaMajorSpinalSpecify;
	}

	public void setTraumaMajorSpinalSpecify(String traumaMajorSpinalSpecify) {
	
		if (this.traumaMajorSpinalSpecify==null || !this.traumaMajorSpinalSpecify.equals(traumaMajorSpinalSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.traumaMajorSpinalSpecify = traumaMajorSpinalSpecify;
	}

	public Integer getTraumaMajorTorso() {
		return this.traumaMajorTorso;
	}

	public void setTraumaMajorTorso(Integer traumaMajorTorso) {
	
		if (this.traumaMajorTorso==null || !this.traumaMajorTorso.equals(traumaMajorTorso))
		{
			editing = true;
			synced = false;
		}
	
		this.traumaMajorTorso = traumaMajorTorso;
	}

	public String getTraumaMajorTorsoSpecify() {
		return this.traumaMajorTorsoSpecify;
	}

	public void setTraumaMajorTorsoSpecify(String traumaMajorTorsoSpecify) {
	
		if (this.traumaMajorTorsoSpecify==null || !this.traumaMajorTorsoSpecify.equals(traumaMajorTorsoSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.traumaMajorTorsoSpecify = traumaMajorTorsoSpecify;
	}

	public Integer getTraumaLeftLeg() {
		return this.traumaLeftLeg;
	}

	public void setTraumaLeftLeg(Integer traumaLeftLeg) {
	
		if (this.traumaLeftLeg==null || !this.traumaLeftLeg.equals(traumaLeftLeg))
		{
			editing = true;
			synced = false;
		}
	
		this.traumaLeftLeg = traumaLeftLeg;
	}

	public String getTraumaLeftLegSpecify() {
		return this.traumaLeftLegSpecify;
	}

	public void setTraumaLeftLegSpecify(String traumaLeftLegSpecify) {
	
		if (this.traumaLeftLegSpecify==null || !this.traumaLeftLegSpecify.equals(traumaLeftLegSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.traumaLeftLegSpecify = traumaLeftLegSpecify;
	}

	public Integer getTraumaRightLeg() {
		return this.traumaRightLeg;
	}

	public void setTraumaRightLeg(Integer traumaRightLeg) {
	
		if (this.traumaRightLeg==null || !this.traumaRightLeg.equals(traumaRightLeg))
		{
			editing = true;
			synced = false;
		}
	
		this.traumaRightLeg = traumaRightLeg;
	}

	public String getTraumaRightLegSpecify() {
		return this.traumaRightLegSpecify;
	}

	public void setTraumaRightLegSpecify(String traumaRightLegSpecify) {
	
		if (this.traumaRightLegSpecify==null || !this.traumaRightLegSpecify.equals(traumaRightLegSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.traumaRightLegSpecify = traumaRightLegSpecify;
	}

	public Integer getTraumaLeftArm() {
		return this.traumaLeftArm;
	}

	public void setTraumaLeftArm(Integer traumaLeftArm) {
	
		if (this.traumaLeftArm==null || !this.traumaLeftArm.equals(traumaLeftArm))
		{
			editing = true;
			synced = false;
		}
	
		this.traumaLeftArm = traumaLeftArm;
	}

	public String getTraumaLeftArmSpecify() {
		return this.traumaLeftArmSpecify;
	}

	public void setTraumaLeftArmSpecify(String traumaLeftArmSpecify) {
	
		if (this.traumaLeftArmSpecify==null || !this.traumaLeftArmSpecify.equals(traumaLeftArmSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.traumaLeftArmSpecify = traumaLeftArmSpecify;
	}

	public Integer getTraumaRightArm() {
		return this.traumaRightArm;
	}

	public void setTraumaRightArm(Integer traumaRightArm) {
	
		if (this.traumaRightArm==null || !this.traumaRightArm.equals(traumaRightArm))
		{
			editing = true;
			synced = false;
		}
	
		this.traumaRightArm = traumaRightArm;
	}

	public String getTraumaRightArmSpecify() {
		return this.traumaRightArmSpecify;
	}

	public void setTraumaRightArmSpecify(String traumaRightArmSpecify) {
	
		if (this.traumaRightArmSpecify==null || !this.traumaRightArmSpecify.equals(traumaRightArmSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.traumaRightArmSpecify = traumaRightArmSpecify;
	}

	public Integer getSkinDiseases() {
		return this.skinDiseases;
	}

	public void setSkinDiseases(Integer skinDiseases) {
	
		if (this.skinDiseases==null || !this.skinDiseases.equals(skinDiseases))
		{
			editing = true;
			synced = false;
		}
	
		this.skinDiseases = skinDiseases;
	}

	public String getSkinDiseasesSpecify() {
		return this.skinDiseasesSpecify;
	}

	public void setSkinDiseasesSpecify(String skinDiseasesSpecify) {
	
		if (this.skinDiseasesSpecify==null || !this.skinDiseasesSpecify.equals(skinDiseasesSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.skinDiseasesSpecify = skinDiseasesSpecify;
	}

	public Integer getAllegies() {
		return this.allegies;
	}

	public void setAllegies(Integer allegies) {
	
		if (this.allegies==null || !this.allegies.equals(allegies))
		{
			editing = true;
			synced = false;
		}
	
		this.allegies = allegies;
	}

	public String getAllegiesSpecify() {
		return this.allegiesSpecify;
	}

	public void setAllegiesSpecify(String allegiesSpecify) {
	
		if (this.allegiesSpecify==null || !this.allegiesSpecify.equals(allegiesSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.allegiesSpecify = allegiesSpecify;
	}

	public Integer getRespiratoryDisease() {
		return this.respiratoryDisease;
	}

	public void setRespiratoryDisease(Integer respiratoryDisease) {
	
		if (this.respiratoryDisease==null || !this.respiratoryDisease.equals(respiratoryDisease))
		{
			editing = true;
			synced = false;
		}
	
		this.respiratoryDisease = respiratoryDisease;
	}

	public String getRespiratoryDiseaseSpecify() {
		return this.respiratoryDiseaseSpecify;
	}

	public void setRespiratoryDiseaseSpecify(String respiratoryDiseaseSpecify) {
	
		if (this.respiratoryDiseaseSpecify==null || !this.respiratoryDiseaseSpecify.equals(respiratoryDiseaseSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.respiratoryDiseaseSpecify = respiratoryDiseaseSpecify;
	}

	public Integer getCardiovascularDisease() {
		return this.cardiovascularDisease;
	}

	public void setCardiovascularDisease(Integer cardiovascularDisease) {
	
		if (this.cardiovascularDisease==null || !this.cardiovascularDisease.equals(cardiovascularDisease))
		{
			editing = true;
			synced = false;
		}
	
		this.cardiovascularDisease = cardiovascularDisease;
	}

	public String getCardiovascularDiseaseSpecify() {
		return this.cardiovascularDiseaseSpecify;
	}

	public void setCardiovascularDiseaseSpecify(String cardiovascularDiseaseSpecify) {
	
		if (this.cardiovascularDiseaseSpecify==null || !this.cardiovascularDiseaseSpecify.equals(cardiovascularDiseaseSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.cardiovascularDiseaseSpecify = cardiovascularDiseaseSpecify;
	}

	public Integer getEndocrineDisease() {
		return this.endocrineDisease;
	}

	public void setEndocrineDisease(Integer endocrineDisease) {
	
		if (this.endocrineDisease==null || !this.endocrineDisease.equals(endocrineDisease))
		{
			editing = true;
			synced = false;
		}
	
		this.endocrineDisease = endocrineDisease;
	}

	public String getEndocrineDiseaseSpecify() {
		return this.endocrineDiseaseSpecify;
	}

	public void setEndocrineDiseaseSpecify(String endocrineDiseaseSpecify) {
	
		if (this.endocrineDiseaseSpecify==null || !this.endocrineDiseaseSpecify.equals(endocrineDiseaseSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.endocrineDiseaseSpecify = endocrineDiseaseSpecify;
	}

	public Integer getUrinarySystemDisease() {
		return this.urinarySystemDisease;
	}

	public void setUrinarySystemDisease(Integer urinarySystemDisease) {
	
		if (this.urinarySystemDisease==null || !this.urinarySystemDisease.equals(urinarySystemDisease))
		{
			editing = true;
			synced = false;
		}
	
		this.urinarySystemDisease = urinarySystemDisease;
	}

	public String getUrinarySystemDiseaseSpecify() {
		return this.urinarySystemDiseaseSpecify;
	}

	public void setUrinarySystemDiseaseSpecify(String urinarySystemDiseaseSpecify) {
	
		if (this.urinarySystemDiseaseSpecify==null || !this.urinarySystemDiseaseSpecify.equals(urinarySystemDiseaseSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.urinarySystemDiseaseSpecify = urinarySystemDiseaseSpecify;
	}

	public Integer getReproductivSystemDisease() {
		return this.reproductivSystemDisease;
	}

	public void setReproductivSystemDisease(Integer reproductivSystemDisease) {
	
		if (this.reproductivSystemDisease==null || !this.reproductivSystemDisease.equals(reproductivSystemDisease))
		{
			editing = true;
			synced = false;
		}
	
		this.reproductivSystemDisease = reproductivSystemDisease;
	}

	public String getReproductivSystemDiseaseSpecify() {
		return this.reproductivSystemDiseaseSpecify;
	}

	public void setReproductivSystemDiseaseSpecify(String reproductivSystemDiseaseSpecify) {
	
		if (this.reproductivSystemDiseaseSpecify==null || !this.reproductivSystemDiseaseSpecify.equals(reproductivSystemDiseaseSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.reproductivSystemDiseaseSpecify = reproductivSystemDiseaseSpecify;
	}

	public Integer getCommunicationHearingProblem() {
		return this.communicationHearingProblem;
	}

	public void setCommunicationHearingProblem(Integer communicationHearingProblem) {
	
		if (this.communicationHearingProblem==null || !this.communicationHearingProblem.equals(communicationHearingProblem))
		{
			editing = true;
			synced = false;
		}
	
		this.communicationHearingProblem = communicationHearingProblem;
	}

	public String getCommunicationHearingProblemSpecify() {
		return this.communicationHearingProblemSpecify;
	}

	public void setCommunicationHearingProblemSpecify(String communicationHearingProblemSpecify) {
	
		if (this.communicationHearingProblemSpecify==null || !this.communicationHearingProblemSpecify.equals(communicationHearingProblemSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.communicationHearingProblemSpecify = communicationHearingProblemSpecify;
	}

	public Integer getVisionProblem() {
		return this.visionProblem;
	}

	public void setVisionProblem(Integer visionProblem) {
	
		if (this.visionProblem==null || !this.visionProblem.equals(visionProblem))
		{
			editing = true;
			synced = false;
		}
	
		this.visionProblem = visionProblem;
	}

	public String getVisionProblemSpecify() {
		return this.visionProblemSpecify;
	}

	public void setVisionProblemSpecify(String visionProblemSpecify) {
	
		if (this.visionProblemSpecify==null || !this.visionProblemSpecify.equals(visionProblemSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.visionProblemSpecify = visionProblemSpecify;
	}

	public Integer getOralDentalHealthProblem() {
		return this.oralDentalHealthProblem;
	}

	public void setOralDentalHealthProblem(Integer oralDentalHealthProblem) {
	
		if (this.oralDentalHealthProblem==null || !this.oralDentalHealthProblem.equals(oralDentalHealthProblem))
		{
			editing = true;
			synced = false;
		}
	
		this.oralDentalHealthProblem = oralDentalHealthProblem;
	}

	public String getOralDentalHealthProblemSpecify() {
		return this.oralDentalHealthProblemSpecify;
	}

	public void setOralDentalHealthProblemSpecify(String oralDentalHealthProblemSpecify) {
	
		if (this.oralDentalHealthProblemSpecify==null || !this.oralDentalHealthProblemSpecify.equals(oralDentalHealthProblemSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.oralDentalHealthProblemSpecify = oralDentalHealthProblemSpecify;
	}

	public Integer getPsychologicalProblem() {
		return this.psychologicalProblem;
	}

	public void setPsychologicalProblem(Integer psychologicalProblem) {
	
		if (this.psychologicalProblem==null || !this.psychologicalProblem.equals(psychologicalProblem))
		{
			editing = true;
			synced = false;
		}
	
		this.psychologicalProblem = psychologicalProblem;
	}

	public String getPsychologicalProblemSpecify() {
		return this.psychologicalProblemSpecify;
	}

	public void setPsychologicalProblemSpecify(String psychologicalProblemSpecify) {
	
		if (this.psychologicalProblemSpecify==null || !this.psychologicalProblemSpecify.equals(psychologicalProblemSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.psychologicalProblemSpecify = psychologicalProblemSpecify;
	}

	public Integer getPhysicalStructuralProblems() {
		return this.physicalStructuralProblems;
	}

	public void setPhysicalStructuralProblems(Integer physicalStructuralProblems) {
	
		if (this.physicalStructuralProblems==null || !this.physicalStructuralProblems.equals(physicalStructuralProblems))
		{
			editing = true;
			synced = false;
		}
	
		this.physicalStructuralProblems = physicalStructuralProblems;
	}

	public String getPhysicalStructuralProblemsSpecify() {
		return this.physicalStructuralProblemsSpecify;
	}

	public void setPhysicalStructuralProblemsSpecify(String physicalStructuralProblemsSpecify) {
	
		if (this.physicalStructuralProblemsSpecify==null || !this.physicalStructuralProblemsSpecify.equals(physicalStructuralProblemsSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.physicalStructuralProblemsSpecify = physicalStructuralProblemsSpecify;
	}

	public Integer getCognativePatterns() {
		return this.cognativePatterns;
	}

	public void setCognativePatterns(Integer cognativePatterns) {
	
		if (this.cognativePatterns==null || !this.cognativePatterns.equals(cognativePatterns))
		{
			editing = true;
			synced = false;
		}
	
		this.cognativePatterns = cognativePatterns;
	}

	public String getCognativePatternsSpecify() {
		return this.cognativePatternsSpecify;
	}

	public void setCognativePatternsSpecify(String cognativePatternsSpecify) {
	
		if (this.cognativePatternsSpecify==null || !this.cognativePatternsSpecify.equals(cognativePatternsSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.cognativePatternsSpecify = cognativePatternsSpecify;
	}

	public Integer getBowelHabit() {
		return this.bowelHabit;
	}

	public void setBowelHabit(Integer bowelHabit) {
	
		if (this.bowelHabit==null || !this.bowelHabit.equals(bowelHabit))
		{
			editing = true;
			synced = false;
		}
	
		this.bowelHabit = bowelHabit;
	}

	public String getBowelHabitSpecify() {
		return this.bowelHabitSpecify;
	}

	public void setBowelHabitSpecify(String bowelHabitSpecify) {
	
		if (this.bowelHabitSpecify==null || !this.bowelHabitSpecify.equals(bowelHabitSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.bowelHabitSpecify = bowelHabitSpecify;
	}

	public Integer getBladderHabit() {
		return this.bladderHabit;
	}

	public void setBladderHabit(Integer bladderHabit) {
	
		if (this.bladderHabit==null || !this.bladderHabit.equals(bladderHabit))
		{
			editing = true;
			synced = false;
		}
	
		this.bladderHabit = bladderHabit;
	}

	public String getBladderHabitSpecify() {
		return this.bladderHabitSpecify;
	}

	public void setBladderHabitSpecify(String bladderHabitSpecify) {
	
		if (this.bladderHabitSpecify==null || !this.bladderHabitSpecify.equals(bladderHabitSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.bladderHabitSpecify = bladderHabitSpecify;
	}

	public Integer getUnderMedication() {
		return this.underMedication;
	}

	public void setUnderMedication(Integer underMedication) {
	
		if (this.underMedication==null || !this.underMedication.equals(underMedication))
		{
			editing = true;
			synced = false;
		}
	
		this.underMedication = underMedication;
	}

	public String getUnderMedicationSpecify() {
		return this.underMedicationSpecify;
	}

	public void setUnderMedicationSpecify(String underMedicationSpecify) {
	
		if (this.underMedicationSpecify==null || !this.underMedicationSpecify.equals(underMedicationSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.underMedicationSpecify = underMedicationSpecify;
	}

	public Integer getRecentTreatment() {
		return this.recentTreatment;
	}

	public void setRecentTreatment(Integer recentTreatment) {
	
		if (this.recentTreatment==null || !this.recentTreatment.equals(recentTreatment))
		{
			editing = true;
			synced = false;
		}
	
		this.recentTreatment = recentTreatment;
	}

	public String getRecentTreatmentSpecify() {
		return this.recentTreatmentSpecify;
	}

	public void setRecentTreatmentSpecify(String recentTreatmentSpecify) {
	
		if (this.recentTreatmentSpecify==null || !this.recentTreatmentSpecify.equals(recentTreatmentSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.recentTreatmentSpecify = recentTreatmentSpecify;
	}

	public Integer getRecentProcedure() {
		return this.recentProcedure;
	}

	public void setRecentProcedure(Integer recentProcedure) {
	
		if (this.recentProcedure==null || !this.recentProcedure.equals(recentProcedure))
		{
			editing = true;
			synced = false;
		}
	
		this.recentProcedure = recentProcedure;
	}

	public String getRecentProcedureSpecify() {
		return this.recentProcedureSpecify;
	}

	public void setRecentProcedureSpecify(String recentProcedureSpecify) {
	
		if (this.recentProcedureSpecify==null || !this.recentProcedureSpecify.equals(recentProcedureSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.recentProcedureSpecify = recentProcedureSpecify;
	}

	public Integer getRecentCounseling() {
		return this.recentCounseling;
	}

	public void setRecentCounseling(Integer recentCounseling) {
	
		if (this.recentCounseling==null || !this.recentCounseling.equals(recentCounseling))
		{
			editing = true;
			synced = false;
		}
	
		this.recentCounseling = recentCounseling;
	}

	public String getRecentCounselingSpecify() {
		return this.recentCounselingSpecify;
	}

	public void setRecentCounselingSpecify(String recentCounselingSpecify) {
	
		if (this.recentCounselingSpecify==null || !this.recentCounselingSpecify.equals(recentCounselingSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.recentCounselingSpecify = recentCounselingSpecify;
	}

	public Integer getBhSuspension() {
		return this.bhSuspension;
	}

	public void setBhSuspension(Integer bhSuspension) {
	
		if (this.bhSuspension==null || !this.bhSuspension.equals(bhSuspension))
		{
			editing = true;
			synced = false;
		}
	
		this.bhSuspension = bhSuspension;
	}

	public String getBhSuspensionSpecify() {
		return this.bhSuspensionSpecify;
	}

	public void setBhSuspensionSpecify(String bhSuspensionSpecify) {
	
		if (this.bhSuspensionSpecify==null || !this.bhSuspensionSpecify.equals(bhSuspensionSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.bhSuspensionSpecify = bhSuspensionSpecify;
	}

	public Integer getBhAntiSocialBehavior() {
		return this.bhAntiSocialBehavior;
	}

	public void setBhAntiSocialBehavior(Integer bhAntiSocialBehavior) {
	
		if (this.bhAntiSocialBehavior==null || !this.bhAntiSocialBehavior.equals(bhAntiSocialBehavior))
		{
			editing = true;
			synced = false;
		}
	
		this.bhAntiSocialBehavior = bhAntiSocialBehavior;
	}

	public Integer getBhDelinquency() {
		return this.bhDelinquency;
	}

	public void setBhDelinquency(Integer bhDelinquency) {
	
		if (this.bhDelinquency==null || !this.bhDelinquency.equals(bhDelinquency))
		{
			editing = true;
			synced = false;
		}
	
		this.bhDelinquency = bhDelinquency;
	}

	public Integer getBhViolence() {
		return this.bhViolence;
	}

	public void setBhViolence(Integer bhViolence) {
	
		if (this.bhViolence==null || !this.bhViolence.equals(bhViolence))
		{
			editing = true;
			synced = false;
		}
	
		this.bhViolence = bhViolence;
	}

	public Integer getBhSmoking() {
		return this.bhSmoking;
	}

	public void setBhSmoking(Integer bhSmoking) {
	
		if (this.bhSmoking==null || !this.bhSmoking.equals(bhSmoking))
		{
			editing = true;
			synced = false;
		}
	
		this.bhSmoking = bhSmoking;
	}

	public Integer getBhAlcohol() {
		return this.bhAlcohol;
	}

	public void setBhAlcohol(Integer bhAlcohol) {
	
		if (this.bhAlcohol==null || !this.bhAlcohol.equals(bhAlcohol))
		{
			editing = true;
			synced = false;
		}
	
		this.bhAlcohol = bhAlcohol;
	}

	public Integer getBhSubstanceAbuse() {
		return this.bhSubstanceAbuse;
	}

	public void setBhSubstanceAbuse(Integer bhSubstanceAbuse) {
	
		if (this.bhSubstanceAbuse==null || !this.bhSubstanceAbuse.equals(bhSubstanceAbuse))
		{
			editing = true;
			synced = false;
		}
	
		this.bhSubstanceAbuse = bhSubstanceAbuse;
	}

	public Integer getBhSuicidalThoughts() {
		return this.bhSuicidalThoughts;
	}

	public void setBhSuicidalThoughts(Integer bhSuicidalThoughts) {
	
		if (this.bhSuicidalThoughts==null || !this.bhSuicidalThoughts.equals(bhSuicidalThoughts))
		{
			editing = true;
			synced = false;
		}
	
		this.bhSuicidalThoughts = bhSuicidalThoughts;
	}

	public Integer getBhSuicidalAttempts() {
		return this.bhSuicidalAttempts;
	}

	public void setBhSuicidalAttempts(Integer bhSuicidalAttempts) {
	
		if (this.bhSuicidalAttempts==null || !this.bhSuicidalAttempts.equals(bhSuicidalAttempts))
		{
			editing = true;
			synced = false;
		}
	
		this.bhSuicidalAttempts = bhSuicidalAttempts;
	}

	public String getBreakfastPlace() {
		return this.breakfastPlace;
	}

	public void setBreakfastPlace(String breakfastPlace) {
	
		if (this.breakfastPlace==null || !this.breakfastPlace.equals(breakfastPlace))
		{
			editing = true;
			synced = false;
		}
	
		this.breakfastPlace = breakfastPlace;
	}

	public String getBreakfastTime() {
		return this.breakfastTime;
	}

	public void setBreakfastTime(String breakfastTime) {
	
		if (this.breakfastTime==null || !this.breakfastTime.equals(breakfastTime))
		{
			editing = true;
			synced = false;
		}
	
		this.breakfastTime = breakfastTime;
	}

	public String getBreakfastTypeOfFood() {
		return this.breakfastTypeOfFood;
	}

	public void setBreakfastTypeOfFood(String breakfastTypeOfFood) {
	
		if (this.breakfastTypeOfFood==null || !this.breakfastTypeOfFood.equals(breakfastTypeOfFood))
		{
			editing = true;
			synced = false;
		}
	
		this.breakfastTypeOfFood = breakfastTypeOfFood;
	}

	public String getLunchPlace() {
		return this.lunchPlace;
	}

	public void setLunchPlace(String lunchPlace) {
	
		if (this.lunchPlace==null || !this.lunchPlace.equals(lunchPlace))
		{
			editing = true;
			synced = false;
		}
	
		this.lunchPlace = lunchPlace;
	}

	public String getLunchTime() {
		return this.lunchTime;
	}

	public void setLunchTime(String lunchTime) {
	
		if (this.lunchTime==null || !this.lunchTime.equals(lunchTime))
		{
			editing = true;
			synced = false;
		}
	
		this.lunchTime = lunchTime;
	}

	public String getLunchTypeOfFood() {
		return this.lunchTypeOfFood;
	}

	public void setLunchTypeOfFood(String lunchTypeOfFood) {
	
		if (this.lunchTypeOfFood==null || !this.lunchTypeOfFood.equals(lunchTypeOfFood))
		{
			editing = true;
			synced = false;
		}
	
		this.lunchTypeOfFood = lunchTypeOfFood;
	}

	public String getSnackPlace() {
		return this.snackPlace;
	}

	public void setSnackPlace(String snackPlace) {
	
		if (this.snackPlace==null || !this.snackPlace.equals(snackPlace))
		{
			editing = true;
			synced = false;
		}
	
		this.snackPlace = snackPlace;
	}

	public String getSnackTime() {
		return this.snackTime;
	}

	public void setSnackTime(String snackTime) {
	
		if (this.snackTime==null || !this.snackTime.equals(snackTime))
		{
			editing = true;
			synced = false;
		}
	
		this.snackTime = snackTime;
	}

	public String getSnackTypeOfFood() {
		return this.snackTypeOfFood;
	}

	public void setSnackTypeOfFood(String snackTypeOfFood) {
	
		if (this.snackTypeOfFood==null || !this.snackTypeOfFood.equals(snackTypeOfFood))
		{
			editing = true;
			synced = false;
		}
	
		this.snackTypeOfFood = snackTypeOfFood;
	}

	public String getDinnerPlace() {
		return this.dinnerPlace;
	}

	public void setDinnerPlace(String dinnerPlace) {
	
		if (this.dinnerPlace==null || !this.dinnerPlace.equals(dinnerPlace))
		{
			editing = true;
			synced = false;
		}
	
		this.dinnerPlace = dinnerPlace;
	}

	public String getDinnerTime() {
		return this.dinnerTime;
	}

	public void setDinnerTime(String dinnerTime) {
	
		if (this.dinnerTime==null || !this.dinnerTime.equals(dinnerTime))
		{
			editing = true;
			synced = false;
		}
	
		this.dinnerTime = dinnerTime;
	}

	public String getDinnerTypeOfFood() {
		return this.dinnerTypeOfFood;
	}

	public void setDinnerTypeOfFood(String dinnerTypeOfFood) {
	
		if (this.dinnerTypeOfFood==null || !this.dinnerTypeOfFood.equals(dinnerTypeOfFood))
		{
			editing = true;
			synced = false;
		}
	
		this.dinnerTypeOfFood = dinnerTypeOfFood;
	}

	public Integer getMalnutrition() {
		return this.malnutrition;
	}

	public void setMalnutrition(Integer malnutrition) {
	
		if (this.malnutrition==null || !this.malnutrition.equals(malnutrition))
		{
			editing = true;
			synced = false;
		}
	
		this.malnutrition = malnutrition;
	}

	public String getMalnutritionSpecify() {
		return this.malnutritionSpecify;
	}

	public void setMalnutritionSpecify(String malnutritionSpecify) {
	
		if (this.malnutritionSpecify==null || !this.malnutritionSpecify.equals(malnutritionSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.malnutritionSpecify = malnutritionSpecify;
	}

	public String getIdleHours() {
		return this.idleHours;
	}

	public void setIdleHours(String idleHours) {
	
		if (this.idleHours==null || !this.idleHours.equals(idleHours))
		{
			editing = true;
			synced = false;
		}
	
		this.idleHours = idleHours;
	}

	public String getActiveHours() {
		return this.activeHours;
	}

	public void setActiveHours(String activeHours) {
	
		if (this.activeHours==null || !this.activeHours.equals(activeHours))
		{
			editing = true;
			synced = false;
		}
	
		this.activeHours = activeHours;
	}

	public Integer getAgeOfMenarche() {
		return this.ageOfMenarche;
	}

	public void setAgeOfMenarche(Integer ageOfMenarche) {
	
		if (this.ageOfMenarche==null || !this.ageOfMenarche.equals(ageOfMenarche))
		{
			editing = true;
			synced = false;
		}
	
		this.ageOfMenarche = ageOfMenarche;
	}

	public String getMenstruationMaterials() {
		return this.menstruationMaterials;
	}

	public void setMenstruationMaterials(String menstruationMaterials) {
	
		if (this.menstruationMaterials==null || !this.menstruationMaterials.equals(menstruationMaterials))
		{
			editing = true;
			synced = false;
		}
	
		this.menstruationMaterials = menstruationMaterials;
	}

	public Integer getFamilyInteraction() {
		return this.familyInteraction;
	}

	public void setFamilyInteraction(Integer familyInteraction) {
	
		if (this.familyInteraction==null || !this.familyInteraction.equals(familyInteraction))
		{
			editing = true;
			synced = false;
		}
	
		this.familyInteraction = familyInteraction;
	}

	public String getFamilyInteractionSpecify() {
		return this.familyInteractionSpecify;
	}

	public void setFamilyInteractionSpecify(String familyInteractionSpecify) {
	
		if (this.familyInteractionSpecify==null || !this.familyInteractionSpecify.equals(familyInteractionSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.familyInteractionSpecify = familyInteractionSpecify;
	}

	public Integer getCommunityInvolvement() {
		return this.communityInvolvement;
	}

	public void setCommunityInvolvement(Integer communityInvolvement) {
	
		if (this.communityInvolvement==null || !this.communityInvolvement.equals(communityInvolvement))
		{
			editing = true;
			synced = false;
		}
	
		this.communityInvolvement = communityInvolvement;
	}

	public String getCommunityInvolvementSpecify() {
		return this.communityInvolvementSpecify;
	}

	public void setCommunityInvolvementSpecify(String communityInvolvementSpecify) {
	
		if (this.communityInvolvementSpecify==null || !this.communityInvolvementSpecify.equals(communityInvolvementSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.communityInvolvementSpecify = communityInvolvementSpecify;
	}

	public Integer getChildDrrKnowledge() {
		return this.childDrrKnowledge;
	}

	public void setChildDrrKnowledge(Integer childDrrKnowledge) {
	
		if (this.childDrrKnowledge==null || !this.childDrrKnowledge.equals(childDrrKnowledge))
		{
			editing = true;
			synced = false;
		}
	
		this.childDrrKnowledge = childDrrKnowledge;
	}

	public String getChildComplaint() {
		return this.childComplaint;
	}

	public void setChildComplaint(String childComplaint) {
	
		if (this.childComplaint==null || !this.childComplaint.equals(childComplaint))
		{
			editing = true;
			synced = false;
		}
	
		this.childComplaint = childComplaint;
	}

    
    
    @Override
	public String toString() {
		return "StudentHealthAssessment{" +
				"uuid='" + uuid + '\'' +
				", editing=" + editing +
				", synced=" + synced +
				", createdAt=" + createdAt +
				", shineId='" + shineId + '\'' +
				", vaccinesBcg='" + vaccinesBcg + '\'' +
				", vaccinesDpt='" + vaccinesDpt + '\'' +
				", vaccinesOpv='" + vaccinesOpv + '\'' +
				", vaccinesPcv='" + vaccinesPcv + '\'' +
				", vaccinesMr='" + vaccinesMr + '\'' +
				", vaccinesJe='" + vaccinesJe + '\'' +
				", vaccinesTd='" + vaccinesTd + '\'' +
				", vaccinesOthers='" + vaccinesOthers + '\'' +
				", vaccinesSpecify='" + vaccinesSpecify + '\'' +
				", temperature='" + temperature + '\'' +
				", systolic='" + systolic + '\'' +
				", diastolic='" + diastolic + '\'' +
				", heightCm='" + heightCm + '\'' +
				", weightKg='" + weightKg + '\'' +
				", bmi='" + bmi + '\'' +
				", bmiComputed='" + bmiComputed + '\'' +
				", acuteRespiratoryInfection='" + acuteRespiratoryInfection + '\'' +
				", acuteWateryDiarrhea='" + acuteWateryDiarrhea + '\'' +
				", acuteBloodyDiarrhea='" + acuteBloodyDiarrhea + '\'' +
				", acuteJaundiceInfection='" + acuteJaundiceInfection + '\'' +
				", suspectedMeningitis='" + suspectedMeningitis + '\'' +
				", suspectedTetanus='" + suspectedTetanus + '\'' +
				", acuteFlaccidParalysis='" + acuteFlaccidParalysis + '\'' +
				", acuteHemorraphicFever='" + acuteHemorraphicFever + '\'' +
				", fever='" + fever + '\'' +
				", traumaMajorHead='" + traumaMajorHead + '\'' +
				", traumaMajorHeadSpecify='" + traumaMajorHeadSpecify + '\'' +
				", traumaMajorSpinal='" + traumaMajorSpinal + '\'' +
				", traumaMajorSpinalSpecify='" + traumaMajorSpinalSpecify + '\'' +
				", traumaMajorTorso='" + traumaMajorTorso + '\'' +
				", traumaMajorTorsoSpecify='" + traumaMajorTorsoSpecify + '\'' +
				", traumaLeftLeg='" + traumaLeftLeg + '\'' +
				", traumaLeftLegSpecify='" + traumaLeftLegSpecify + '\'' +
				", traumaRightLeg='" + traumaRightLeg + '\'' +
				", traumaRightLegSpecify='" + traumaRightLegSpecify + '\'' +
				", traumaLeftArm='" + traumaLeftArm + '\'' +
				", traumaLeftArmSpecify='" + traumaLeftArmSpecify + '\'' +
				", traumaRightArm='" + traumaRightArm + '\'' +
				", traumaRightArmSpecify='" + traumaRightArmSpecify + '\'' +
				", skinDiseases='" + skinDiseases + '\'' +
				", skinDiseasesSpecify='" + skinDiseasesSpecify + '\'' +
				", allegies='" + allegies + '\'' +
				", allegiesSpecify='" + allegiesSpecify + '\'' +
				", respiratoryDisease='" + respiratoryDisease + '\'' +
				", respiratoryDiseaseSpecify='" + respiratoryDiseaseSpecify + '\'' +
				", cardiovascularDisease='" + cardiovascularDisease + '\'' +
				", cardiovascularDiseaseSpecify='" + cardiovascularDiseaseSpecify + '\'' +
				", endocrineDisease='" + endocrineDisease + '\'' +
				", endocrineDiseaseSpecify='" + endocrineDiseaseSpecify + '\'' +
				", urinarySystemDisease='" + urinarySystemDisease + '\'' +
				", urinarySystemDiseaseSpecify='" + urinarySystemDiseaseSpecify + '\'' +
				", reproductivSystemDisease='" + reproductivSystemDisease + '\'' +
				", reproductivSystemDiseaseSpecify='" + reproductivSystemDiseaseSpecify + '\'' +
				", communicationHearingProblem='" + communicationHearingProblem + '\'' +
				", communicationHearingProblemSpecify='" + communicationHearingProblemSpecify + '\'' +
				", visionProblem='" + visionProblem + '\'' +
				", visionProblemSpecify='" + visionProblemSpecify + '\'' +
				", oralDentalHealthProblem='" + oralDentalHealthProblem + '\'' +
				", oralDentalHealthProblemSpecify='" + oralDentalHealthProblemSpecify + '\'' +
				", psychologicalProblem='" + psychologicalProblem + '\'' +
				", psychologicalProblemSpecify='" + psychologicalProblemSpecify + '\'' +
				", physicalStructuralProblems='" + physicalStructuralProblems + '\'' +
				", physicalStructuralProblemsSpecify='" + physicalStructuralProblemsSpecify + '\'' +
				", cognativePatterns='" + cognativePatterns + '\'' +
				", cognativePatternsSpecify='" + cognativePatternsSpecify + '\'' +
				", bowelHabit='" + bowelHabit + '\'' +
				", bowelHabitSpecify='" + bowelHabitSpecify + '\'' +
				", bladderHabit='" + bladderHabit + '\'' +
				", bladderHabitSpecify='" + bladderHabitSpecify + '\'' +
				", underMedication='" + underMedication + '\'' +
				", underMedicationSpecify='" + underMedicationSpecify + '\'' +
				", recentTreatment='" + recentTreatment + '\'' +
				", recentTreatmentSpecify='" + recentTreatmentSpecify + '\'' +
				", recentProcedure='" + recentProcedure + '\'' +
				", recentProcedureSpecify='" + recentProcedureSpecify + '\'' +
				", recentCounseling='" + recentCounseling + '\'' +
				", recentCounselingSpecify='" + recentCounselingSpecify + '\'' +
				", bhSuspension='" + bhSuspension + '\'' +
				", bhSuspensionSpecify='" + bhSuspensionSpecify + '\'' +
				", bhAntiSocialBehavior='" + bhAntiSocialBehavior + '\'' +
				", bhDelinquency='" + bhDelinquency + '\'' +
				", bhViolence='" + bhViolence + '\'' +
				", bhSmoking='" + bhSmoking + '\'' +
				", bhAlcohol='" + bhAlcohol + '\'' +
				", bhSubstanceAbuse='" + bhSubstanceAbuse + '\'' +
				", bhSuicidalThoughts='" + bhSuicidalThoughts + '\'' +
				", bhSuicidalAttempts='" + bhSuicidalAttempts + '\'' +
				", breakfastPlace='" + breakfastPlace + '\'' +
				", breakfastTime='" + breakfastTime + '\'' +
				", breakfastTypeOfFood='" + breakfastTypeOfFood + '\'' +
				", lunchPlace='" + lunchPlace + '\'' +
				", lunchTime='" + lunchTime + '\'' +
				", lunchTypeOfFood='" + lunchTypeOfFood + '\'' +
				", snackPlace='" + snackPlace + '\'' +
				", snackTime='" + snackTime + '\'' +
				", snackTypeOfFood='" + snackTypeOfFood + '\'' +
				", dinnerPlace='" + dinnerPlace + '\'' +
				", dinnerTime='" + dinnerTime + '\'' +
				", dinnerTypeOfFood='" + dinnerTypeOfFood + '\'' +
				", malnutrition='" + malnutrition + '\'' +
				", malnutritionSpecify='" + malnutritionSpecify + '\'' +
				", idleHours='" + idleHours + '\'' +
				", activeHours='" + activeHours + '\'' +
				", ageOfMenarche='" + ageOfMenarche + '\'' +
				", menstruationMaterials='" + menstruationMaterials + '\'' +
				", familyInteraction='" + familyInteraction + '\'' +
				", familyInteractionSpecify='" + familyInteractionSpecify + '\'' +
				", communityInvolvement='" + communityInvolvement + '\'' +
				", communityInvolvementSpecify='" + communityInvolvementSpecify + '\'' +
				", childDrrKnowledge='" + childDrrKnowledge + '\'' +
				", childComplaint='" + childComplaint + '\'' +

				'}';
	}
}

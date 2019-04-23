package com.ajwcc.epinurse.basicinformation.gen;

import com.ajwcc.epinurse.common.utils.EpinurseModel;
import com.ajwcc.epinurse.common.utils.network.ExcludeFromJson;

import java.util.Date;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import com.zhuinden.realmautomigration.AutoMigration;

public class BasicInformation extends RealmObject implements EpinurseModel
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
    
	private String patientId;

	// Personal Information
	private String firstName;
	private String middleName;
	private String lastName;
	private Integer sex;
	private Integer maritalStatus;
	private String dateOfBirthInAd;
	private String dateOfBirthInBs;
	private Integer age;

	// Household Information
	private String familyID;
	private Integer typeOfFamily;
	private String houseNumber;
	private String wardNumber;
	private String municipality;
	private String district;
	private String country;
	private String zipcode;
	private String fathersName;
	private Integer fatherLate;
	private String mothersName;
	private Integer motherLate;
	private String localGuardiansName;
	private String contactOfParentGuardian;
	private Integer numberMale;
	private Integer numberFemale;
	private Integer numberOthers;
	private Integer numberMaleUnder5;
	private Integer numberFemaleUnder5;
	private Integer numberMaleAbove60;
	private Integer numberFemaleAbove60;
	private Integer numberDisabled;
	private Integer numberPregnant;
	private Integer numberLactatingMothers;

	// Socio-Economic Information
	private String ethnicity;
	private String religion;
	private Integer educationalStatus;
	private Integer occupation;
	private String occupationSpecify;
	private Integer incomeAgriculture;
	private Integer incomeBusiness;
	private Integer incomeService;
	private Integer incomeLabor;
	private Integer incomeRemittance;
	private Integer incomeOthers;
	private String incomeSpecify;
	private Integer foodSufficiency;
    
    

	public String getPatientId() {
		return this.patientId;
	}

	public void setPatientId(String patientId) {
	
		if (this.patientId==null || !this.patientId.equals(patientId))
		{
			editing = true;
			synced = false;
		}
	
		this.patientId = patientId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
	
		if (this.firstName==null || !this.firstName.equals(firstName))
		{
			editing = true;
			synced = false;
		}
	
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
	
		if (this.middleName==null || !this.middleName.equals(middleName))
		{
			editing = true;
			synced = false;
		}
	
		this.middleName = middleName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
	
		if (this.lastName==null || !this.lastName.equals(lastName))
		{
			editing = true;
			synced = false;
		}
	
		this.lastName = lastName;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
	
		if (this.sex==null || !this.sex.equals(sex))
		{
			editing = true;
			synced = false;
		}
	
		this.sex = sex;
	}

	public Integer getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(Integer maritalStatus) {
	
		if (this.maritalStatus==null || !this.maritalStatus.equals(maritalStatus))
		{
			editing = true;
			synced = false;
		}
	
		this.maritalStatus = maritalStatus;
	}

	public String getDateOfBirthInAd() {
		return this.dateOfBirthInAd;
	}

	public void setDateOfBirthInAd(String dateOfBirthInAd) {
	
		if (this.dateOfBirthInAd==null || !this.dateOfBirthInAd.equals(dateOfBirthInAd))
		{
			editing = true;
			synced = false;
		}
	
		this.dateOfBirthInAd = dateOfBirthInAd;
	}

	public String getDateOfBirthInBs() {
		return this.dateOfBirthInBs;
	}

	public void setDateOfBirthInBs(String dateOfBirthInBs) {
	
		if (this.dateOfBirthInBs==null || !this.dateOfBirthInBs.equals(dateOfBirthInBs))
		{
			editing = true;
			synced = false;
		}
	
		this.dateOfBirthInBs = dateOfBirthInBs;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
	
		if (this.age==null || !this.age.equals(age))
		{
			editing = true;
			synced = false;
		}
	
		this.age = age;
	}

	public String getFamilyID() {
		return this.familyID;
	}

	public void setFamilyID(String familyID) {
	
		if (this.familyID==null || !this.familyID.equals(familyID))
		{
			editing = true;
			synced = false;
		}
	
		this.familyID = familyID;
	}

	public Integer getTypeOfFamily() {
		return this.typeOfFamily;
	}

	public void setTypeOfFamily(Integer typeOfFamily) {
	
		if (this.typeOfFamily==null || !this.typeOfFamily.equals(typeOfFamily))
		{
			editing = true;
			synced = false;
		}
	
		this.typeOfFamily = typeOfFamily;
	}

	public String getHouseNumber() {
		return this.houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
	
		if (this.houseNumber==null || !this.houseNumber.equals(houseNumber))
		{
			editing = true;
			synced = false;
		}
	
		this.houseNumber = houseNumber;
	}

	public String getWardNumber() {
		return this.wardNumber;
	}

	public void setWardNumber(String wardNumber) {
	
		if (this.wardNumber==null || !this.wardNumber.equals(wardNumber))
		{
			editing = true;
			synced = false;
		}
	
		this.wardNumber = wardNumber;
	}

	public String getMunicipality() {
		return this.municipality;
	}

	public void setMunicipality(String municipality) {
	
		if (this.municipality==null || !this.municipality.equals(municipality))
		{
			editing = true;
			synced = false;
		}
	
		this.municipality = municipality;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
	
		if (this.district==null || !this.district.equals(district))
		{
			editing = true;
			synced = false;
		}
	
		this.district = district;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
	
		if (this.country==null || !this.country.equals(country))
		{
			editing = true;
			synced = false;
		}
	
		this.country = country;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
	
		if (this.zipcode==null || !this.zipcode.equals(zipcode))
		{
			editing = true;
			synced = false;
		}
	
		this.zipcode = zipcode;
	}

	public String getFathersName() {
		return this.fathersName;
	}

	public void setFathersName(String fathersName) {
	
		if (this.fathersName==null || !this.fathersName.equals(fathersName))
		{
			editing = true;
			synced = false;
		}
	
		this.fathersName = fathersName;
	}

	public Integer getFatherLate() {
		return this.fatherLate;
	}

	public void setFatherLate(Integer fatherLate) {
	
		if (this.fatherLate==null || !this.fatherLate.equals(fatherLate))
		{
			editing = true;
			synced = false;
		}
	
		this.fatherLate = fatherLate;
	}

	public String getMothersName() {
		return this.mothersName;
	}

	public void setMothersName(String mothersName) {
	
		if (this.mothersName==null || !this.mothersName.equals(mothersName))
		{
			editing = true;
			synced = false;
		}
	
		this.mothersName = mothersName;
	}

	public Integer getMotherLate() {
		return this.motherLate;
	}

	public void setMotherLate(Integer motherLate) {
	
		if (this.motherLate==null || !this.motherLate.equals(motherLate))
		{
			editing = true;
			synced = false;
		}
	
		this.motherLate = motherLate;
	}

	public String getLocalGuardiansName() {
		return this.localGuardiansName;
	}

	public void setLocalGuardiansName(String localGuardiansName) {
	
		if (this.localGuardiansName==null || !this.localGuardiansName.equals(localGuardiansName))
		{
			editing = true;
			synced = false;
		}
	
		this.localGuardiansName = localGuardiansName;
	}

	public String getContactOfParentGuardian() {
		return this.contactOfParentGuardian;
	}

	public void setContactOfParentGuardian(String contactOfParentGuardian) {
	
		if (this.contactOfParentGuardian==null || !this.contactOfParentGuardian.equals(contactOfParentGuardian))
		{
			editing = true;
			synced = false;
		}
	
		this.contactOfParentGuardian = contactOfParentGuardian;
	}

	public Integer getNumberMale() {
		return this.numberMale;
	}

	public void setNumberMale(Integer numberMale) {
	
		if (this.numberMale==null || !this.numberMale.equals(numberMale))
		{
			editing = true;
			synced = false;
		}
	
		this.numberMale = numberMale;
	}

	public Integer getNumberFemale() {
		return this.numberFemale;
	}

	public void setNumberFemale(Integer numberFemale) {
	
		if (this.numberFemale==null || !this.numberFemale.equals(numberFemale))
		{
			editing = true;
			synced = false;
		}
	
		this.numberFemale = numberFemale;
	}

	public Integer getNumberOthers() {
		return this.numberOthers;
	}

	public void setNumberOthers(Integer numberOthers) {
	
		if (this.numberOthers==null || !this.numberOthers.equals(numberOthers))
		{
			editing = true;
			synced = false;
		}
	
		this.numberOthers = numberOthers;
	}

	public Integer getNumberMaleUnder5() {
		return this.numberMaleUnder5;
	}

	public void setNumberMaleUnder5(Integer numberMaleUnder5) {
	
		if (this.numberMaleUnder5==null || !this.numberMaleUnder5.equals(numberMaleUnder5))
		{
			editing = true;
			synced = false;
		}
	
		this.numberMaleUnder5 = numberMaleUnder5;
	}

	public Integer getNumberFemaleUnder5() {
		return this.numberFemaleUnder5;
	}

	public void setNumberFemaleUnder5(Integer numberFemaleUnder5) {
	
		if (this.numberFemaleUnder5==null || !this.numberFemaleUnder5.equals(numberFemaleUnder5))
		{
			editing = true;
			synced = false;
		}
	
		this.numberFemaleUnder5 = numberFemaleUnder5;
	}

	public Integer getNumberMaleAbove60() {
		return this.numberMaleAbove60;
	}

	public void setNumberMaleAbove60(Integer numberMaleAbove60) {
	
		if (this.numberMaleAbove60==null || !this.numberMaleAbove60.equals(numberMaleAbove60))
		{
			editing = true;
			synced = false;
		}
	
		this.numberMaleAbove60 = numberMaleAbove60;
	}

	public Integer getNumberFemaleAbove60() {
		return this.numberFemaleAbove60;
	}

	public void setNumberFemaleAbove60(Integer numberFemaleAbove60) {
	
		if (this.numberFemaleAbove60==null || !this.numberFemaleAbove60.equals(numberFemaleAbove60))
		{
			editing = true;
			synced = false;
		}
	
		this.numberFemaleAbove60 = numberFemaleAbove60;
	}

	public Integer getNumberDisabled() {
		return this.numberDisabled;
	}

	public void setNumberDisabled(Integer numberDisabled) {
	
		if (this.numberDisabled==null || !this.numberDisabled.equals(numberDisabled))
		{
			editing = true;
			synced = false;
		}
	
		this.numberDisabled = numberDisabled;
	}

	public Integer getNumberPregnant() {
		return this.numberPregnant;
	}

	public void setNumberPregnant(Integer numberPregnant) {
	
		if (this.numberPregnant==null || !this.numberPregnant.equals(numberPregnant))
		{
			editing = true;
			synced = false;
		}
	
		this.numberPregnant = numberPregnant;
	}

	public Integer getNumberLactatingMothers() {
		return this.numberLactatingMothers;
	}

	public void setNumberLactatingMothers(Integer numberLactatingMothers) {
	
		if (this.numberLactatingMothers==null || !this.numberLactatingMothers.equals(numberLactatingMothers))
		{
			editing = true;
			synced = false;
		}
	
		this.numberLactatingMothers = numberLactatingMothers;
	}

	public String getEthnicity() {
		return this.ethnicity;
	}

	public void setEthnicity(String ethnicity) {
	
		if (this.ethnicity==null || !this.ethnicity.equals(ethnicity))
		{
			editing = true;
			synced = false;
		}
	
		this.ethnicity = ethnicity;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
	
		if (this.religion==null || !this.religion.equals(religion))
		{
			editing = true;
			synced = false;
		}
	
		this.religion = religion;
	}

	public Integer getEducationalStatus() {
		return this.educationalStatus;
	}

	public void setEducationalStatus(Integer educationalStatus) {
	
		if (this.educationalStatus==null || !this.educationalStatus.equals(educationalStatus))
		{
			editing = true;
			synced = false;
		}
	
		this.educationalStatus = educationalStatus;
	}

	public Integer getOccupation() {
		return this.occupation;
	}

	public void setOccupation(Integer occupation) {
	
		if (this.occupation==null || !this.occupation.equals(occupation))
		{
			editing = true;
			synced = false;
		}
	
		this.occupation = occupation;
	}

	public String getOccupationSpecify() {
		return this.occupationSpecify;
	}

	public void setOccupationSpecify(String occupationSpecify) {
	
		if (this.occupationSpecify==null || !this.occupationSpecify.equals(occupationSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.occupationSpecify = occupationSpecify;
	}

	public Integer getIncomeAgriculture() {
		return this.incomeAgriculture;
	}

	public void setIncomeAgriculture(Integer incomeAgriculture) {
	
		if (this.incomeAgriculture==null || !this.incomeAgriculture.equals(incomeAgriculture))
		{
			editing = true;
			synced = false;
		}
	
		this.incomeAgriculture = incomeAgriculture;
	}

	public Integer getIncomeBusiness() {
		return this.incomeBusiness;
	}

	public void setIncomeBusiness(Integer incomeBusiness) {
	
		if (this.incomeBusiness==null || !this.incomeBusiness.equals(incomeBusiness))
		{
			editing = true;
			synced = false;
		}
	
		this.incomeBusiness = incomeBusiness;
	}

	public Integer getIncomeService() {
		return this.incomeService;
	}

	public void setIncomeService(Integer incomeService) {
	
		if (this.incomeService==null || !this.incomeService.equals(incomeService))
		{
			editing = true;
			synced = false;
		}
	
		this.incomeService = incomeService;
	}

	public Integer getIncomeLabor() {
		return this.incomeLabor;
	}

	public void setIncomeLabor(Integer incomeLabor) {
	
		if (this.incomeLabor==null || !this.incomeLabor.equals(incomeLabor))
		{
			editing = true;
			synced = false;
		}
	
		this.incomeLabor = incomeLabor;
	}

	public Integer getIncomeRemittance() {
		return this.incomeRemittance;
	}

	public void setIncomeRemittance(Integer incomeRemittance) {
	
		if (this.incomeRemittance==null || !this.incomeRemittance.equals(incomeRemittance))
		{
			editing = true;
			synced = false;
		}
	
		this.incomeRemittance = incomeRemittance;
	}

	public Integer getIncomeOthers() {
		return this.incomeOthers;
	}

	public void setIncomeOthers(Integer incomeOthers) {
	
		if (this.incomeOthers==null || !this.incomeOthers.equals(incomeOthers))
		{
			editing = true;
			synced = false;
		}
	
		this.incomeOthers = incomeOthers;
	}

	public String getIncomeSpecify() {
		return this.incomeSpecify;
	}

	public void setIncomeSpecify(String incomeSpecify) {
	
		if (this.incomeSpecify==null || !this.incomeSpecify.equals(incomeSpecify))
		{
			editing = true;
			synced = false;
		}
	
		this.incomeSpecify = incomeSpecify;
	}

	public Integer getFoodSufficiency() {
		return this.foodSufficiency;
	}

	public void setFoodSufficiency(Integer foodSufficiency) {
	
		if (this.foodSufficiency==null || !this.foodSufficiency.equals(foodSufficiency))
		{
			editing = true;
			synced = false;
		}
	
		this.foodSufficiency = foodSufficiency;
	}

    
    
    @Override
	public String toString() {
		return "BasicInformation{" +
				"uuid='" + uuid + '\'' +
				", editing=" + editing +
				", synced=" + synced +
				", createdAt=" + createdAt +
				", patientId='" + patientId + '\'' +
				", firstName='" + firstName + '\'' +
				", middleName='" + middleName + '\'' +
				", lastName='" + lastName + '\'' +
				", sex='" + sex + '\'' +
				", maritalStatus='" + maritalStatus + '\'' +
				", dateOfBirthInAd='" + dateOfBirthInAd + '\'' +
				", dateOfBirthInBs='" + dateOfBirthInBs + '\'' +
				", age='" + age + '\'' +
				", familyID='" + familyID + '\'' +
				", typeOfFamily='" + typeOfFamily + '\'' +
				", houseNumber='" + houseNumber + '\'' +
				", wardNumber='" + wardNumber + '\'' +
				", municipality='" + municipality + '\'' +
				", district='" + district + '\'' +
				", country='" + country + '\'' +
				", zipcode='" + zipcode + '\'' +
				", fathersName='" + fathersName + '\'' +
				", fatherLate='" + fatherLate + '\'' +
				", mothersName='" + mothersName + '\'' +
				", motherLate='" + motherLate + '\'' +
				", localGuardiansName='" + localGuardiansName + '\'' +
				", contactOfParentGuardian='" + contactOfParentGuardian + '\'' +
				", numberMale='" + numberMale + '\'' +
				", numberFemale='" + numberFemale + '\'' +
				", numberOthers='" + numberOthers + '\'' +
				", numberMaleUnder5='" + numberMaleUnder5 + '\'' +
				", numberFemaleUnder5='" + numberFemaleUnder5 + '\'' +
				", numberMaleAbove60='" + numberMaleAbove60 + '\'' +
				", numberFemaleAbove60='" + numberFemaleAbove60 + '\'' +
				", numberDisabled='" + numberDisabled + '\'' +
				", numberPregnant='" + numberPregnant + '\'' +
				", numberLactatingMothers='" + numberLactatingMothers + '\'' +
				", ethnicity='" + ethnicity + '\'' +
				", religion='" + religion + '\'' +
				", educationalStatus='" + educationalStatus + '\'' +
				", occupation='" + occupation + '\'' +
				", occupationSpecify='" + occupationSpecify + '\'' +
				", incomeAgriculture='" + incomeAgriculture + '\'' +
				", incomeBusiness='" + incomeBusiness + '\'' +
				", incomeService='" + incomeService + '\'' +
				", incomeLabor='" + incomeLabor + '\'' +
				", incomeRemittance='" + incomeRemittance + '\'' +
				", incomeOthers='" + incomeOthers + '\'' +
				", incomeSpecify='" + incomeSpecify + '\'' +
				", foodSufficiency='" + foodSufficiency + '\'' +

				'}';
	}
}

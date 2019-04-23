package com.ajwcc.epinurse.nurseregistration.gen;

import com.ajwcc.epinurse.common.utils.EpinurseModel;
import com.ajwcc.epinurse.common.utils.network.ExcludeFromJson;

import java.util.Date;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import com.zhuinden.realmautomigration.AutoMigration;

public class NurseRegistration extends RealmObject implements EpinurseModel
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

	// Registration
	private String nanNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private Integer sex;
	private String citizenshipNumber;
	private String dateOfBirthInAd;
	private String dateOfBirthInBs;
	private Integer age;

	// Temporary Address
	private String tempHouseNumber;
	private String tempWardNumber;
	private String tempMunicipality;
	private String tempDistrict;
	private String tempCountry;
	private String tempZipcode;

	// Permanent Address
	private String permanentHouseNumber;
	private String permanentWardNumber;
	private String permanentMunicipality;
	private String permanentDistrict;
	private String permanentCountry;
	private String permanentZipcode;

	// Professional Information
	private String professionalStatus;
	private String designation;
	private String office;

	@AutoMigration.MigratedList(listType = com.ajwcc.epinurse.nurseregistration.ui.QualificationEntry.class)
	private io.realm.RealmList<com.ajwcc.epinurse.nurseregistration.ui.QualificationEntry> qualifications = new io.realm.RealmList<com.ajwcc.epinurse.nurseregistration.ui.QualificationEntry>();

	@AutoMigration.MigratedList(listType = com.ajwcc.epinurse.nurseregistration.ui.TrainingEntry.class)
	private io.realm.RealmList<com.ajwcc.epinurse.nurseregistration.ui.TrainingEntry> trainings = new io.realm.RealmList<com.ajwcc.epinurse.nurseregistration.ui.TrainingEntry>();
    
    

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

	public String getNanNumber() {
		return this.nanNumber;
	}

	public void setNanNumber(String nanNumber) {
	
		if (this.nanNumber==null || !this.nanNumber.equals(nanNumber))
		{
			editing = true;
			synced = false;
		}
	
		this.nanNumber = nanNumber;
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

	public String getCitizenshipNumber() {
		return this.citizenshipNumber;
	}

	public void setCitizenshipNumber(String citizenshipNumber) {
	
		if (this.citizenshipNumber==null || !this.citizenshipNumber.equals(citizenshipNumber))
		{
			editing = true;
			synced = false;
		}
	
		this.citizenshipNumber = citizenshipNumber;
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

	public String getTempHouseNumber() {
		return this.tempHouseNumber;
	}

	public void setTempHouseNumber(String tempHouseNumber) {
	
		if (this.tempHouseNumber==null || !this.tempHouseNumber.equals(tempHouseNumber))
		{
			editing = true;
			synced = false;
		}
	
		this.tempHouseNumber = tempHouseNumber;
	}

	public String getTempWardNumber() {
		return this.tempWardNumber;
	}

	public void setTempWardNumber(String tempWardNumber) {
	
		if (this.tempWardNumber==null || !this.tempWardNumber.equals(tempWardNumber))
		{
			editing = true;
			synced = false;
		}
	
		this.tempWardNumber = tempWardNumber;
	}

	public String getTempMunicipality() {
		return this.tempMunicipality;
	}

	public void setTempMunicipality(String tempMunicipality) {
	
		if (this.tempMunicipality==null || !this.tempMunicipality.equals(tempMunicipality))
		{
			editing = true;
			synced = false;
		}
	
		this.tempMunicipality = tempMunicipality;
	}

	public String getTempDistrict() {
		return this.tempDistrict;
	}

	public void setTempDistrict(String tempDistrict) {
	
		if (this.tempDistrict==null || !this.tempDistrict.equals(tempDistrict))
		{
			editing = true;
			synced = false;
		}
	
		this.tempDistrict = tempDistrict;
	}

	public String getTempCountry() {
		return this.tempCountry;
	}

	public void setTempCountry(String tempCountry) {
	
		if (this.tempCountry==null || !this.tempCountry.equals(tempCountry))
		{
			editing = true;
			synced = false;
		}
	
		this.tempCountry = tempCountry;
	}

	public String getTempZipcode() {
		return this.tempZipcode;
	}

	public void setTempZipcode(String tempZipcode) {
	
		if (this.tempZipcode==null || !this.tempZipcode.equals(tempZipcode))
		{
			editing = true;
			synced = false;
		}
	
		this.tempZipcode = tempZipcode;
	}

	public String getPermanentHouseNumber() {
		return this.permanentHouseNumber;
	}

	public void setPermanentHouseNumber(String permanentHouseNumber) {
	
		if (this.permanentHouseNumber==null || !this.permanentHouseNumber.equals(permanentHouseNumber))
		{
			editing = true;
			synced = false;
		}
	
		this.permanentHouseNumber = permanentHouseNumber;
	}

	public String getPermanentWardNumber() {
		return this.permanentWardNumber;
	}

	public void setPermanentWardNumber(String permanentWardNumber) {
	
		if (this.permanentWardNumber==null || !this.permanentWardNumber.equals(permanentWardNumber))
		{
			editing = true;
			synced = false;
		}
	
		this.permanentWardNumber = permanentWardNumber;
	}

	public String getPermanentMunicipality() {
		return this.permanentMunicipality;
	}

	public void setPermanentMunicipality(String permanentMunicipality) {
	
		if (this.permanentMunicipality==null || !this.permanentMunicipality.equals(permanentMunicipality))
		{
			editing = true;
			synced = false;
		}
	
		this.permanentMunicipality = permanentMunicipality;
	}

	public String getPermanentDistrict() {
		return this.permanentDistrict;
	}

	public void setPermanentDistrict(String permanentDistrict) {
	
		if (this.permanentDistrict==null || !this.permanentDistrict.equals(permanentDistrict))
		{
			editing = true;
			synced = false;
		}
	
		this.permanentDistrict = permanentDistrict;
	}

	public String getPermanentCountry() {
		return this.permanentCountry;
	}

	public void setPermanentCountry(String permanentCountry) {
	
		if (this.permanentCountry==null || !this.permanentCountry.equals(permanentCountry))
		{
			editing = true;
			synced = false;
		}
	
		this.permanentCountry = permanentCountry;
	}

	public String getPermanentZipcode() {
		return this.permanentZipcode;
	}

	public void setPermanentZipcode(String permanentZipcode) {
	
		if (this.permanentZipcode==null || !this.permanentZipcode.equals(permanentZipcode))
		{
			editing = true;
			synced = false;
		}
	
		this.permanentZipcode = permanentZipcode;
	}

	public String getProfessionalStatus() {
		return this.professionalStatus;
	}

	public void setProfessionalStatus(String professionalStatus) {
	
		if (this.professionalStatus==null || !this.professionalStatus.equals(professionalStatus))
		{
			editing = true;
			synced = false;
		}
	
		this.professionalStatus = professionalStatus;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
	
		if (this.designation==null || !this.designation.equals(designation))
		{
			editing = true;
			synced = false;
		}
	
		this.designation = designation;
	}

	public String getOffice() {
		return this.office;
	}

	public void setOffice(String office) {
	
		if (this.office==null || !this.office.equals(office))
		{
			editing = true;
			synced = false;
		}
	
		this.office = office;
	}

	public io.realm.RealmList<com.ajwcc.epinurse.nurseregistration.ui.QualificationEntry> getQualifications() {
		return this.qualifications;
	}

	public void setQualifications(io.realm.RealmList<com.ajwcc.epinurse.nurseregistration.ui.QualificationEntry> qualifications) {
	
		if (this.qualifications==null || !this.qualifications.equals(qualifications))
		{
			editing = true;
			synced = false;
		}
	
		this.qualifications = qualifications;
	}

	public io.realm.RealmList<com.ajwcc.epinurse.nurseregistration.ui.TrainingEntry> getTrainings() {
		return this.trainings;
	}

	public void setTrainings(io.realm.RealmList<com.ajwcc.epinurse.nurseregistration.ui.TrainingEntry> trainings) {
	
		if (this.trainings==null || !this.trainings.equals(trainings))
		{
			editing = true;
			synced = false;
		}
	
		this.trainings = trainings;
	}

    
    
    @Override
	public String toString() {
		return "NurseRegistration{" +
				"uuid='" + uuid + '\'' +
				", editing=" + editing +
				", synced=" + synced +
				", createdAt=" + createdAt +
				", shineId='" + shineId + '\'' +
				", nanNumber='" + nanNumber + '\'' +
				", firstName='" + firstName + '\'' +
				", middleName='" + middleName + '\'' +
				", lastName='" + lastName + '\'' +
				", sex='" + sex + '\'' +
				", citizenshipNumber='" + citizenshipNumber + '\'' +
				", dateOfBirthInAd='" + dateOfBirthInAd + '\'' +
				", dateOfBirthInBs='" + dateOfBirthInBs + '\'' +
				", age='" + age + '\'' +
				", tempHouseNumber='" + tempHouseNumber + '\'' +
				", tempWardNumber='" + tempWardNumber + '\'' +
				", tempMunicipality='" + tempMunicipality + '\'' +
				", tempDistrict='" + tempDistrict + '\'' +
				", tempCountry='" + tempCountry + '\'' +
				", tempZipcode='" + tempZipcode + '\'' +
				", permanentHouseNumber='" + permanentHouseNumber + '\'' +
				", permanentWardNumber='" + permanentWardNumber + '\'' +
				", permanentMunicipality='" + permanentMunicipality + '\'' +
				", permanentDistrict='" + permanentDistrict + '\'' +
				", permanentCountry='" + permanentCountry + '\'' +
				", permanentZipcode='" + permanentZipcode + '\'' +
				", professionalStatus='" + professionalStatus + '\'' +
				", designation='" + designation + '\'' +
				", office='" + office + '\'' +
				", qualifications='" + qualifications + '\'' +
				", trainings='" + trainings + '\'' +

				'}';
	}
}

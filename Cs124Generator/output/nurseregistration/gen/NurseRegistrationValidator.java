package com.ajwcc.epinurse.NurseRegistration.gen;

import com.ajwcc.epinurse.common.BaseValidator;
import com.ajwcc.util.ui.validation.ValidationHandler;
import com.ajwcc.epinurse.R;

public class NurseRegistrationValidator extends BaseValidator implements ValidationHandler<NurseRegistration>
{
    protected NurseRegistration model;
    protected NurseRegistrationActivity activity;


    public NurseRegistrationValidator(NurseRegistrationActivity a)
    {
    	super(a);
        activity = a;
    }

    @Override
    public void setModel(NurseRegistration model)
    {
        this.model = model;
    }

    @Override
    public void validateModel()
    {
		validateNanNumber();
		validateFirstName();
		//  middleName optional
		validateLastName();
		validateSex();
		validateCitizenshipNumber();
		validateDateOfBirthInAd();
		validateDateOfBirthInBs();
		validateAge();
		validateTempHouseNumber();
		validateTempWardNumber();
		validateTempMunicipality();
		validateTempDistrict();
		validateTempCountry();
		validateTempZipcode();
		validatePermanentHouseNumber();
		validatePermanentWardNumber();
		validatePermanentMunicipality();
		validatePermanentDistrict();
		validatePermanentCountry();
		validatePermanentZipcode();
		validateProfessionalStatus();
		validateDesignation();
		validateOffice();
		validateQualifications();
		validateTrainings();

    }


    public void validateNanNumber()
    {
    
        validateNonNullField(model.getNanNumber(), activity.getPage("Registration"), R.id.nanNumberContainer, context.getResources().getString(R.string.nurse_registration_nanNumber));
    }

    public void validateFirstName()
    {
    
        validateNonNullField(model.getFirstName(), activity.getPage("Registration"), R.id.firstNameContainer, context.getResources().getString(R.string.nurse_registration_firstName));
    }

    public void validateLastName()
    {
    
        validateNonNullField(model.getLastName(), activity.getPage("Registration"), R.id.lastNameContainer, context.getResources().getString(R.string.nurse_registration_lastName));
    }

    public void validateSex()
    {
    
        validateNonNullField(model.getSex(), activity.getPage("Registration"), R.id.sexContainer, context.getResources().getString(R.string.nurse_registration_sex));
    }

    public void validateCitizenshipNumber()
    {
    
        validateNonNullField(model.getCitizenshipNumber(), activity.getPage("Registration"), R.id.citizenshipNumberContainer, context.getResources().getString(R.string.nurse_registration_citizenshipNumber));
    }

    public void validateDateOfBirthInAd()
    {
    
        validateNonNullField(model.getDateOfBirthInAd(), activity.getPage("Registration"), R.id.dateOfBirthInAdContainer, context.getResources().getString(R.string.nurse_registration_dateOfBirthInAd));
    }

    public void validateDateOfBirthInBs()
    {
    
        validateNonNullField(model.getDateOfBirthInBs(), activity.getPage("Registration"), R.id.dateOfBirthInBsContainer, context.getResources().getString(R.string.nurse_registration_dateOfBirthInBs));
    }

    public void validateAge()
    {
    
        validateNonNullField(model.getAge(), activity.getPage("Registration"), R.id.ageContainer, context.getResources().getString(R.string.nurse_registration_age));
    }

    public void validateTempHouseNumber()
    {
    
        validateNonNullField(model.getTempHouseNumber(), activity.getPage("Temporary Address"), R.id.tempHouseNumberContainer, context.getResources().getString(R.string.nurse_registration_tempHouseNumber));
    }

    public void validateTempWardNumber()
    {
    
        validateNonNullField(model.getTempWardNumber(), activity.getPage("Temporary Address"), R.id.tempWardNumberContainer, context.getResources().getString(R.string.nurse_registration_tempWardNumber));
    }

    public void validateTempMunicipality()
    {
    
        validateNonNullField(model.getTempMunicipality(), activity.getPage("Temporary Address"), R.id.tempMunicipalityContainer, context.getResources().getString(R.string.nurse_registration_tempMunicipality));
    }

    public void validateTempDistrict()
    {
    
        validateNonNullField(model.getTempDistrict(), activity.getPage("Temporary Address"), R.id.tempDistrictContainer, context.getResources().getString(R.string.nurse_registration_tempDistrict));
    }

    public void validateTempCountry()
    {
    
        validateNonNullField(model.getTempCountry(), activity.getPage("Temporary Address"), R.id.tempCountryContainer, context.getResources().getString(R.string.nurse_registration_tempCountry));
    }

    public void validateTempZipcode()
    {
    
        validateNonNullField(model.getTempZipcode(), activity.getPage("Temporary Address"), R.id.tempZipcodeContainer, context.getResources().getString(R.string.nurse_registration_tempZipcode));
    }

    public void validatePermanentHouseNumber()
    {
    
        validateNonNullField(model.getPermanentHouseNumber(), activity.getPage("Permanent Address"), R.id.permanentHouseNumberContainer, context.getResources().getString(R.string.nurse_registration_permanentHouseNumber));
    }

    public void validatePermanentWardNumber()
    {
    
        validateNonNullField(model.getPermanentWardNumber(), activity.getPage("Permanent Address"), R.id.permanentWardNumberContainer, context.getResources().getString(R.string.nurse_registration_permanentWardNumber));
    }

    public void validatePermanentMunicipality()
    {
    
        validateNonNullField(model.getPermanentMunicipality(), activity.getPage("Permanent Address"), R.id.permanentMunicipalityContainer, context.getResources().getString(R.string.nurse_registration_permanentMunicipality));
    }

    public void validatePermanentDistrict()
    {
    
        validateNonNullField(model.getPermanentDistrict(), activity.getPage("Permanent Address"), R.id.permanentDistrictContainer, context.getResources().getString(R.string.nurse_registration_permanentDistrict));
    }

    public void validatePermanentCountry()
    {
    
        validateNonNullField(model.getPermanentCountry(), activity.getPage("Permanent Address"), R.id.permanentCountryContainer, context.getResources().getString(R.string.nurse_registration_permanentCountry));
    }

    public void validatePermanentZipcode()
    {
    
        validateNonNullField(model.getPermanentZipcode(), activity.getPage("Permanent Address"), R.id.permanentZipcodeContainer, context.getResources().getString(R.string.nurse_registration_permanentZipcode));
    }

    public void validateProfessionalStatus()
    {
    
        validateNonNullField(model.getProfessionalStatus(), activity.getPage("Professional Information"), R.id.professionalStatusContainer, context.getResources().getString(R.string.nurse_registration_professionalStatus));
    }

    public void validateDesignation()
    {
    
        validateNonNullField(model.getDesignation(), activity.getPage("Professional Information"), R.id.designationContainer, context.getResources().getString(R.string.nurse_registration_designation));
    }

    public void validateOffice()
    {
    
        validateNonNullField(model.getOffice(), activity.getPage("Professional Information"), R.id.officeContainer, context.getResources().getString(R.string.nurse_registration_office));
    }

    public void validateQualifications()
    {
    
        validateNonNullField(model.getQualifications(), activity.getPage("Professional Information"), R.id.qualificationsContainer, context.getResources().getString(R.string.nurse_registration_qualifications));
    }

    public void validateTrainings()
    {
    
        validateNonNullField(model.getTrainings(), activity.getPage("Professional Information"), R.id.trainingsContainer, context.getResources().getString(R.string.nurse_registration_trainings));
    }


}

package com.ajwcc.epinurse.BasicInformation.gen;

import com.ajwcc.epinurse.common.BaseValidator;
import com.ajwcc.util.ui.validation.ValidationHandler;
import com.ajwcc.epinurse.R;

public class BasicInformationValidator extends BaseValidator implements ValidationHandler<BasicInformation>
{
    protected BasicInformation model;
    protected BasicInformationActivity activity;


    public BasicInformationValidator(BasicInformationActivity a)
    {
    	super(a);
        activity = a;
    }

    @Override
    public void setModel(BasicInformation model)
    {
        this.model = model;
    }

    @Override
    public void validateModel()
    {
		validateFirstName();
		//  middleName optional
		validateLastName();
		validateSex();
		validateMaritalStatus();
		validateDateOfBirthInAd();
		validateDateOfBirthInBs();
		validateAge();
		validateFamilyID();
		validateTypeOfFamily();
		validateHouseNumber();
		validateWardNumber();
		validateMunicipality();
		validateDistrict();
		validateCountry();
		validateZipcode();
		//  fathersName optional
		validateFatherLate();
		//  mothersName optional
		validateMotherLate();
		//  localGuardiansName optional
		//  contactOfParentGuardian optional
		validateNumberMale();
		validateNumberFemale();
		validateNumberOthers();
		validateNumberMaleUnder5();
		validateNumberFemaleUnder5();
		validateNumberMaleAbove60();
		validateNumberFemaleAbove60();
		validateNumberDisabled();
		validateNumberPregnant();
		validateNumberLactatingMothers();
		validateEthnicity();
		validateReligion();
		validateEducationalStatus();
		validateOccupation();
		validateOccupationSpecify();
		validateIncomeAgriculture();
		validateIncomeBusiness();
		validateIncomeService();
		validateIncomeLabor();
		validateIncomeRemittance();
		validateIncomeOthers();
		validateIncomeSpecify();
		validateFoodSufficiency();

    }


    public void validateFirstName()
    {
    
        validateNonNullField(model.getFirstName(), activity.getPage("Personal Information"), R.id.firstNameContainer, context.getResources().getString(R.string.basic_information_firstName));
    }

    public void validateLastName()
    {
    
        validateNonNullField(model.getLastName(), activity.getPage("Personal Information"), R.id.lastNameContainer, context.getResources().getString(R.string.basic_information_lastName));
    }

    public void validateSex()
    {
    
        validateNonNullField(model.getSex(), activity.getPage("Personal Information"), R.id.sexContainer, context.getResources().getString(R.string.basic_information_sex));
    }

    public void validateMaritalStatus()
    {
    
        validateNonNullField(model.getMaritalStatus(), activity.getPage("Personal Information"), R.id.maritalStatusContainer, context.getResources().getString(R.string.basic_information_maritalStatus));
    }

    public void validateDateOfBirthInAd()
    {
    
        validateNonNullField(model.getDateOfBirthInAd(), activity.getPage("Personal Information"), R.id.dateOfBirthInAdContainer, context.getResources().getString(R.string.basic_information_dateOfBirthInAd));
    }

    public void validateDateOfBirthInBs()
    {
    
        validateNonNullField(model.getDateOfBirthInBs(), activity.getPage("Personal Information"), R.id.dateOfBirthInBsContainer, context.getResources().getString(R.string.basic_information_dateOfBirthInBs));
    }

    public void validateAge()
    {
    
        validateNonNullField(model.getAge(), activity.getPage("Personal Information"), R.id.ageContainer, context.getResources().getString(R.string.basic_information_age));
    }

    public void validateFamilyID()
    {
    
        validateNonNullField(model.getFamilyID(), activity.getPage("Household Information"), R.id.familyIDContainer, context.getResources().getString(R.string.basic_information_familyID));
    }

    public void validateTypeOfFamily()
    {
    
        validateNonNullField(model.getTypeOfFamily(), activity.getPage("Household Information"), R.id.typeOfFamilyContainer, context.getResources().getString(R.string.basic_information_typeOfFamily));
    }

    public void validateHouseNumber()
    {
    
        validateNonNullField(model.getHouseNumber(), activity.getPage("Household Information"), R.id.houseNumberContainer, context.getResources().getString(R.string.basic_information_houseNumber));
    }

    public void validateWardNumber()
    {
    
        validateNonNullField(model.getWardNumber(), activity.getPage("Household Information"), R.id.wardNumberContainer, context.getResources().getString(R.string.basic_information_wardNumber));
    }

    public void validateMunicipality()
    {
    
        validateNonNullField(model.getMunicipality(), activity.getPage("Household Information"), R.id.municipalityContainer, context.getResources().getString(R.string.basic_information_municipality));
    }

    public void validateDistrict()
    {
    
        validateNonNullField(model.getDistrict(), activity.getPage("Household Information"), R.id.districtContainer, context.getResources().getString(R.string.basic_information_district));
    }

    public void validateCountry()
    {
    
        validateNonNullField(model.getCountry(), activity.getPage("Household Information"), R.id.countryContainer, context.getResources().getString(R.string.basic_information_country));
    }

    public void validateZipcode()
    {
    
        validateNonNullField(model.getZipcode(), activity.getPage("Household Information"), R.id.zipcodeContainer, context.getResources().getString(R.string.basic_information_zipcode));
    }

    public void validateFatherLate()
    {
    
        validateNonNullField(model.getFatherLate(), activity.getPage("Household Information"), R.id.fatherLateContainer, context.getResources().getString(R.string.basic_information_fatherLate));
    }

    public void validateMotherLate()
    {
    
        validateNonNullField(model.getMotherLate(), activity.getPage("Household Information"), R.id.motherLateContainer, context.getResources().getString(R.string.basic_information_motherLate));
    }

    public void validateNumberMale()
    {
    
        validateNonNullField(model.getNumberMale(), activity.getPage("Household Information"), R.id.numberMaleContainer, context.getResources().getString(R.string.basic_information_numberMale));
    }

    public void validateNumberFemale()
    {
    
        validateNonNullField(model.getNumberFemale(), activity.getPage("Household Information"), R.id.numberFemaleContainer, context.getResources().getString(R.string.basic_information_numberFemale));
    }

    public void validateNumberOthers()
    {
    
        validateNonNullField(model.getNumberOthers(), activity.getPage("Household Information"), R.id.numberOthersContainer, context.getResources().getString(R.string.basic_information_numberOthers));
    }

    public void validateNumberMaleUnder5()
    {
    
        validateNonNullField(model.getNumberMaleUnder5(), activity.getPage("Household Information"), R.id.numberMaleUnder5Container, context.getResources().getString(R.string.basic_information_numberMaleUnder5));
    }

    public void validateNumberFemaleUnder5()
    {
    
        validateNonNullField(model.getNumberFemaleUnder5(), activity.getPage("Household Information"), R.id.numberFemaleUnder5Container, context.getResources().getString(R.string.basic_information_numberFemaleUnder5));
    }

    public void validateNumberMaleAbove60()
    {
    
        validateNonNullField(model.getNumberMaleAbove60(), activity.getPage("Household Information"), R.id.numberMaleAbove60Container, context.getResources().getString(R.string.basic_information_numberMaleAbove60));
    }

    public void validateNumberFemaleAbove60()
    {
    
        validateNonNullField(model.getNumberFemaleAbove60(), activity.getPage("Household Information"), R.id.numberFemaleAbove60Container, context.getResources().getString(R.string.basic_information_numberFemaleAbove60));
    }

    public void validateNumberDisabled()
    {
    
        validateNonNullField(model.getNumberDisabled(), activity.getPage("Household Information"), R.id.numberDisabledContainer, context.getResources().getString(R.string.basic_information_numberDisabled));
    }

    public void validateNumberPregnant()
    {
    
        validateNonNullField(model.getNumberPregnant(), activity.getPage("Household Information"), R.id.numberPregnantContainer, context.getResources().getString(R.string.basic_information_numberPregnant));
    }

    public void validateNumberLactatingMothers()
    {
    
        validateNonNullField(model.getNumberLactatingMothers(), activity.getPage("Household Information"), R.id.numberLactatingMothersContainer, context.getResources().getString(R.string.basic_information_numberLactatingMothers));
    }

    public void validateEthnicity()
    {
    
        validateNonNullField(model.getEthnicity(), activity.getPage("Socio-Economic Information"), R.id.ethnicityContainer, context.getResources().getString(R.string.basic_information_ethnicity));
    }

    public void validateReligion()
    {
    
        validateNonNullField(model.getReligion(), activity.getPage("Socio-Economic Information"), R.id.religionContainer, context.getResources().getString(R.string.basic_information_religion));
    }

    public void validateEducationalStatus()
    {
    
        validateNonNullField(model.getEducationalStatus(), activity.getPage("Socio-Economic Information"), R.id.educationalStatusContainer, context.getResources().getString(R.string.basic_information_educationalStatus));
    }

    public void validateOccupation()
    {
    
        validateNonNullField(model.getOccupation(), activity.getPage("Socio-Economic Information"), R.id.occupationContainer, context.getResources().getString(R.string.basic_information_occupation));
    }

    public void validateOccupationSpecify()
    {
  
        validateNonNullSpecifyField(model.getOccupation(),5,model.getOccupationSpecify(), activity.getPage("Socio-Economic Information"), R.id.occupationSpecifyContainer, context.getResources().getString(R.string.basic_information_occupationSpecify));   
    }

    public void validateIncomeAgriculture()
    {
    
        validateNonNullField(model.getIncomeAgriculture(), activity.getPage("Socio-Economic Information"), R.id.incomeAgricultureContainer, context.getResources().getString(R.string.basic_information_incomeAgriculture));
    }

    public void validateIncomeBusiness()
    {
    
        validateNonNullField(model.getIncomeBusiness(), activity.getPage("Socio-Economic Information"), R.id.incomeBusinessContainer, context.getResources().getString(R.string.basic_information_incomeBusiness));
    }

    public void validateIncomeService()
    {
    
        validateNonNullField(model.getIncomeService(), activity.getPage("Socio-Economic Information"), R.id.incomeServiceContainer, context.getResources().getString(R.string.basic_information_incomeService));
    }

    public void validateIncomeLabor()
    {
    
        validateNonNullField(model.getIncomeLabor(), activity.getPage("Socio-Economic Information"), R.id.incomeLaborContainer, context.getResources().getString(R.string.basic_information_incomeLabor));
    }

    public void validateIncomeRemittance()
    {
    
        validateNonNullField(model.getIncomeRemittance(), activity.getPage("Socio-Economic Information"), R.id.incomeRemittanceContainer, context.getResources().getString(R.string.basic_information_incomeRemittance));
    }

    public void validateIncomeOthers()
    {
    
        validateNonNullField(model.getIncomeOthers(), activity.getPage("Socio-Economic Information"), R.id.incomeOthersContainer, context.getResources().getString(R.string.basic_information_incomeOthers));
    }

    public void validateIncomeSpecify()
    {
  
        validateNonNullSpecifyField(model.getIncomeOthers(),1,model.getIncomeSpecify(), activity.getPage("Socio-Economic Information"), R.id.incomeSpecifyContainer, context.getResources().getString(R.string.basic_information_incomeSpecify));   
    }

    public void validateFoodSufficiency()
    {
    
        validateNonNullField(model.getFoodSufficiency(), activity.getPage("Socio-Economic Information"), R.id.foodSufficiencyContainer, context.getResources().getString(R.string.basic_information_foodSufficiency));
    }


}

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

    }



}

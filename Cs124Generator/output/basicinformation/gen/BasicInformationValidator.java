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

    }



}

package com.ajwcc.epinurse.StudentHealthAssessment.gen;

import com.ajwcc.epinurse.common.BaseValidator;
import com.ajwcc.util.ui.validation.ValidationHandler;
import com.ajwcc.epinurse.R;

public class StudentHealthAssessmentValidator extends BaseValidator implements ValidationHandler<StudentHealthAssessment>
{
    protected StudentHealthAssessment model;
    protected StudentHealthAssessmentActivity activity;


    public StudentHealthAssessmentValidator(StudentHealthAssessmentActivity a)
    {
    	super(a);
        activity = a;
    }

    @Override
    public void setModel(StudentHealthAssessment model)
    {
        this.model = model;
    }

    @Override
    public void validateModel()
    {

    }



}

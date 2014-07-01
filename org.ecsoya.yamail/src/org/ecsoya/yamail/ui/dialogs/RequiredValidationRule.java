package org.ecsoya.yamail.ui.dialogs;

import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.xwt.validation.AbstractValidationRule;

public class RequiredValidationRule extends AbstractValidationRule {

	/**
	 * Required validation
	 */
	public RequiredValidationRule() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xwt.IValueValidator#validateBack(java.lang.Object)
	 */
	public IStatus validateBack(Object value) {
		return ValidationStatus.ok();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.databinding.validation.IValidator#validate(java.lang
	 * .Object)
	 */
	public IStatus validate(Object value) {
		if (value == null || value.toString().length() == 0) {
			return ValidationStatus.error("Value is required");
		}

		return ValidationStatus.ok();
	}

}

package org.ecsoya.yamail.ui.dialogs;

import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.xwt.validation.AbstractValidationRule;

public class RequiredValidationRule extends AbstractValidationRule {

	private String message;

	/**
	 * Required validation
	 */
	public RequiredValidationRule() {
		super();
	}

	@Override
	public Phase getPhase() {
		return Phase.BeforeSet;
	}

	@Override
	public Direction getBindingMode() {
		return Direction.TargetToSource;
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
			if (message != null) {
				return ValidationStatus.error(message);
			}
			return ValidationStatus.error("Value is required");
		}

		return ValidationStatus.ok();
	}

	public IStatus validateBack(Object value) {
		return validate(value);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

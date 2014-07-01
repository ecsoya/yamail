package org.ecsoya.yamail.ui.dialogs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.xwt.validation.AbstractValidationRule;

public class EmailValidationRule extends AbstractValidationRule {

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	private Pattern pattern;
	private Matcher matcher;

	public EmailValidationRule() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}

	@Override
	public Phase getPhase() {
		return Phase.BeforeSet;
	}

	@Override
	public Direction getBindingMode() {
		return Direction.TargetToSource;
	}

	@Override
	public IStatus validate(Object value) {
		if (value == null || value.equals("")) {
			return ValidationStatus.error("Email can not be empty.");
		}
		matcher = pattern.matcher(value.toString());
		if (matcher.matches()) {
			return ValidationStatus.ok();
		}
		return ValidationStatus.error("'" + value.toString()
				+ "' is not a validate email.");
	}

	@Override
	public IStatus validateBack(Object value) {
		return validate(value);
	}

}

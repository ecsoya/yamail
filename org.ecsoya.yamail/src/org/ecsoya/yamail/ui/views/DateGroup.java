package org.ecsoya.yamail.ui.views;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class DateGroup {
	String name;
	int startDay;
	int endDay;

	public DateGroup(String name, int day) {
		this(name, day, day);
	}

	public DateGroup(String name, int startDay, int endDay) {
		this.name = name;
		this.startDay = startDay;
		this.endDay = endDay;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + endDay;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + startDay;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DateGroup other = (DateGroup) obj;
		if (endDay != other.endDay)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (startDay != other.startDay)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name + "(" + startDay + ", " + endDay + ")";
	}

	public static List<DateGroup> buildDateGroup() {
		List<DateGroup> dateGroups = new ArrayList<DateGroup>();
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_YEAR);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		DateGroup today = new DateGroup("Today", day);
		dateGroups.add(today);

		DateGroup yesterday = new DateGroup("Yesterday", day - 1);
		dateGroups.add(yesterday);

		int dayBeforeYesterday = day - 2;
		for (int i = week; i >= (week - 2); i--) {
			int newDay = dayBeforeYesterday--;
			calendar.set(Calendar.DAY_OF_YEAR, newDay);
			String displayName = calendar.getDisplayName(Calendar.DAY_OF_WEEK,
					Calendar.LONG_FORMAT, Locale.getDefault());
			dateGroups.add(new DateGroup(displayName, newDay));
		}

		DateGroup lastWeek = new DateGroup("Last Week", day - 5, day - 12);
		dateGroups.add(lastWeek);

		DateGroup twoWeeksAgo = new DateGroup("Two weeks ago", day - 13,
				day - 20);
		dateGroups.add(twoWeeksAgo);

		DateGroup threeWeeksAgo = new DateGroup("Three weeks ago", day - 21,
				day - 28);
		dateGroups.add(threeWeeksAgo);

		DateGroup lastMonth = new DateGroup("Last month", day - 29, day - 36);
		dateGroups.add(lastMonth);

		DateGroup older = new DateGroup("Older", day - 30, Integer.MIN_VALUE);
		dateGroups.add(older);

		return dateGroups;
	}
}
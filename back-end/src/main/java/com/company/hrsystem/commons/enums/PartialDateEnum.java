package com.company.hrsystem.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PartialDateEnum {

	ALL_DAY("ALL DAY"), HALF_DAY("HALF DAY"), HOURS("HOURS");

	private String value;

	public static boolean isExists(String value) {
		for (PartialDateEnum e : PartialDateEnum.values()) {
			if (value.equals(e.value))
				return true;
		}
		return false;
	}

}

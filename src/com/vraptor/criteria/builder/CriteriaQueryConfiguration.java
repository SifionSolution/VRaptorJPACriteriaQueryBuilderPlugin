package com.vraptor.criteria.builder;

import javax.persistence.criteria.CriteriaQuery;

public interface CriteriaQueryConfiguration {
	Class<?> forEntity();
	String aliasForEntity();

	default void applyCustomModificationsIn(CriteriaQuery<?> criteria) {
	}

	default String countByProperty() {
		return "";
	}
}
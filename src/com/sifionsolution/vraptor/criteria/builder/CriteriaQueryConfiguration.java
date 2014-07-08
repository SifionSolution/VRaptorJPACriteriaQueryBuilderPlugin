package com.sifionsolution.vraptor.criteria.builder;

import com.sifionsolution.vraptor.criteria.builder.data.source.CriteriaQueryDataSource;

public interface CriteriaQueryConfiguration {
	Class<?> forEntity();

	default void applySpecificModifications(CriteriaQueryDataSource source) {
	}

	default String countDistinctByProperty() {
		return "";
	}
}
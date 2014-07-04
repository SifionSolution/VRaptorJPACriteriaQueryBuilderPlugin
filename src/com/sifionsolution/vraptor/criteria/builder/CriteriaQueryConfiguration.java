package com.sifionsolution.vraptor.criteria.builder;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public interface CriteriaQueryConfiguration {
	Class<?> forEntity();

	default void applyCustomModifications(CriteriaBuilder builder, CriteriaQuery<?> criteria, Root<?> root) {
	}

	default String countByProperty() {
		return "";
	}
}
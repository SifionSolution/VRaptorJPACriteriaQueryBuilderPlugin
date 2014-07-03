package com.vraptor.criteria.builder;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

public class DefaultCriteriaQueryBuilder implements CriteriaQueryBuilder {

	@Override
	public CriteriaQuery<?> build(EntityManager manager,
			CriteriaQueryConfiguration configuration) {
		CriteriaQuery<?> query = manager.getCriteriaBuilder().createQuery(
				configuration.forEntity());

		configuration.applyCustomModificationsIn(query);

		return query;
	}
}
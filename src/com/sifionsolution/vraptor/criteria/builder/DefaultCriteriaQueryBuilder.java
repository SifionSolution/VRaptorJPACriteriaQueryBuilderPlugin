package com.sifionsolution.vraptor.criteria.builder;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class DefaultCriteriaQueryBuilder implements CriteriaQueryBuilder {

	@Inject
	private EntityManager manager;

	@Override
	public Root<?> build(CriteriaQueryConfiguration configuration) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();

		Class<?> entity = configuration.forEntity();
		CriteriaQuery<?> query = builder.createQuery(entity);
		Root<?> root = query.from(entity);

		configuration.applyCustomModifications(builder, query, root);

		return root;
	}
}
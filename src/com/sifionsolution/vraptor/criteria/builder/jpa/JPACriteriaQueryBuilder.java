package com.sifionsolution.vraptor.criteria.builder.jpa;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.sifionsolution.vraptor.criteria.builder.CriteriaQueryBuilder;
import com.sifionsolution.vraptor.criteria.builder.CriteriaQueryConfiguration;
import com.sifionsolution.vraptor.criteria.builder.data.source.CriteriaQueryDataSource;
import com.sifionsolution.vraptor.criteria.builder.jpa.data.source.DefaultJPACriteriaQueryDataSource;

public class JPACriteriaQueryBuilder implements CriteriaQueryBuilder {

	@Inject
	private EntityManager manager;

	@Override
	public CriteriaQueryDataSource build(CriteriaQueryConfiguration configuration) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();

		Class<?> entity = configuration.forEntity();
		CriteriaQuery<?> criteria = builder.createQuery(entity);
		Root<?> root = criteria.from(entity);

		CriteriaQueryDataSource source = new DefaultJPACriteriaQueryDataSource(configuration, criteria, root);

		configuration.applySpecificModifications(source);

		return source;
	}
}
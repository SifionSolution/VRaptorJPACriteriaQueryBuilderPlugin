package com.sifionsolution.vraptor.criteria.builder.jpa.data.source;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.sifionsolution.vraptor.criteria.builder.CriteriaQueryConfiguration;

public class DefaultJPACriteriaQueryDataSource implements JPACriteriaQueryDataSource {

	private final CriteriaQueryConfiguration configuration;
	private final CriteriaQuery<?> criteria;
	private final Root<?> root;

	public DefaultJPACriteriaQueryDataSource(CriteriaQueryConfiguration configuration, CriteriaQuery<?> criteria,
			Root<?> root) {
		this.configuration = configuration;
		this.criteria = criteria;
		this.root = root;
	}

	@Override
	public CriteriaQueryConfiguration getConfiguration() {
		return configuration;
	}

	@Override
	public CriteriaQuery<?> getCriteria() {
		return criteria;
	}

	@Override
	public Root<?> getRoot() {
		return root;
	}
}
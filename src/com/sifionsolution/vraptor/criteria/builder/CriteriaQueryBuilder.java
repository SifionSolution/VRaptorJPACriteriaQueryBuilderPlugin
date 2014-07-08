package com.sifionsolution.vraptor.criteria.builder;

import com.sifionsolution.vraptor.criteria.builder.data.source.CriteriaQueryDataSource;

public interface CriteriaQueryBuilder {
	CriteriaQueryDataSource build(CriteriaQueryConfiguration configuration);
}
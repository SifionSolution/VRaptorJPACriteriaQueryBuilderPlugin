package com.sifionsolution.vraptor.criteria.builder;

import javax.persistence.criteria.Root;

public interface CriteriaQueryBuilder {
	Root<?> build(CriteriaQueryConfiguration configuration);
}
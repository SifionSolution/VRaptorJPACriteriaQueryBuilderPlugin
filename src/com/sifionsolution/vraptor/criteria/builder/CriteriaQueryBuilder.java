package com.sifionsolution.vraptor.criteria.builder;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

public interface CriteriaQueryBuilder {
	CriteriaQuery<?> build(EntityManager manager, CriteriaQueryConfiguration configuration);
}
package com.sifionsolution.vraptor.criteria.builder.jpa.data.source;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.sifionsolution.vraptor.criteria.builder.data.source.CriteriaQueryDataSource;

public interface JPACriteriaQueryDataSource extends CriteriaQueryDataSource {
	CriteriaQuery<?> getCriteria();

	Root<?> getRoot();
}
package com.sifionsolution.vraptor.criteria.builder.converter;

import br.com.caelum.vraptor.Convert;
import br.com.caelum.vraptor.TwoWayConverter;

import com.sifionsolution.vraptor.criteria.builder.CriteriaQueryConfiguration;

@Convert(CriteriaQueryConfiguration.class)
public class CriteriaQueryConfigurationConverter implements TwoWayConverter<CriteriaQueryConfiguration> {

	@Override
	public CriteriaQueryConfiguration convert(String value, Class<? extends CriteriaQueryConfiguration> type) {
		return null;
	}

	@Override
	public String convert(CriteriaQueryConfiguration o) {
		return null;
	}
}
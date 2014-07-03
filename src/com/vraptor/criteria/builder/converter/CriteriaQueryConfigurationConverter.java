package com.vraptor.criteria.builder.converter;

import br.com.caelum.vraptor.Convert;
import br.com.caelum.vraptor.converter.Converter;

import com.vraptor.criteria.builder.CriteriaQueryConfiguration;

@Convert(CriteriaQueryConfiguration.class)
public class CriteriaQueryConfigurationConverter implements
		Converter<CriteriaQueryConfiguration> {

	@Override
	public CriteriaQueryConfiguration convert(String value,
			Class<? extends CriteriaQueryConfiguration> type) {
		return null;
	}
}
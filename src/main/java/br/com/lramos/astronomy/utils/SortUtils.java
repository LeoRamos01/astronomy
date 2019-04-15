package br.com.lramos.astronomy.utils;

import org.springframework.data.domain.Sort;

public class SortUtils {

	private static final Sort DEFAULT = Sort.by(Sort.Order.asc("planeta.distanceSun"), Sort.Order.desc("radius"));

	public static Sort padrao() {
		return DEFAULT;
	}

}

package com.vkakarla.springboot.exceptionhandling.junits.dto;

public class EntityNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EntityNotFoundException() {
        super();
    }

	/*
	 * static String generateMessage(String entity, Map<String, String>
	 * searchParams) { return StringUtils.capitalize(entity) +
	 * " was not found for parameters " + searchParams; }
	 * 
	 * private static <K, V> Map<K, V> toMap( Class<K> keyType, Class<V> valueType,
	 * Object... entries) { if (entries.length % 2 == 1) throw new
	 * IllegalArgumentException("Invalid entries"); return IntStream.range(0,
	 * entries.length / 2).map(i -> i * 2) .collect(HashMap::new, (m, i) ->
	 * m.put(keyType.cast(entries[i]), valueType.cast(entries[i + 1])),
	 * Map::putAll); }
	 */

}

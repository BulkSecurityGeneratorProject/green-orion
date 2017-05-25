package mx.infotec.dads.greenorion.service.util;

import mx.infotec.dads.greenorion.domain.Data;

/**
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class OrionNotificationMapper {

	private OrionNotificationMapper() {

	}

	public static String extractProperty(Data data, String propertyName) {
		if (data == null) {
			return null;
		}
		Object property = data.getAdditionalProperties().get(propertyName);
		if (property == null) {
			return null;
		} else {
			return property.toString();
		}

	}

	public static Integer extractIntegerProperty(Data data, String propertyName) {
		String property = extractProperty(data, propertyName);
		if (property == null) {
			return null;
		} else {
			Integer value = null;
			try {
				value = Integer.valueOf(property);
			} catch (Exception e) {
				// Add a logger
			}
			return value;
		}
	}
}

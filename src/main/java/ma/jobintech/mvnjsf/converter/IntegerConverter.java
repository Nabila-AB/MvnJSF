package ma.jobintech.mvnjsf.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("monNombreConvertisseurTricheur")
public class IntegerConverter implements Converter<Integer> {

	public Integer getAsObject(FacesContext context, UIComponent component, String value) {
		System.out.println("ToInteger :< !");
		return Integer.parseInt(value) * 2;
	}

	public String getAsString(FacesContext context, UIComponent component, Integer value) {
		System.out.println("ToString :< !");
		value = value * 2;
		return value.toString();
	}

}

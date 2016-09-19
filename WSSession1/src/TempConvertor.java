import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class TempConvertor {

	@WebMethod
	public double forenhiteToCalcus(double fahrenheit) {
        double celsius = (fahrenheit-32) * (5 / 9.0);
        return celsius;
	}
}

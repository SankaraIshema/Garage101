import java.util.ArrayList;
import java.util.List;

import com.sankara.garage.Garage;
import com.sankara.models.AlfaRomeo;
import com.sankara.models.Fiat500;
import com.sankara.models.KantakaNkunimdie;
import com.sankara.models.MitsubishiOutlander;
import com.sankara.models.NissanKicks;
import com.sankara.models.RenaultMegane;
import com.sankara.models.Vehicle;
import com.sankara.motors.DieselMotor;
import com.sankara.motors.ElectricMotor;
import com.sankara.motors.EssenceMotor;
import com.sankara.motors.HybrideMotor;
import com.sankara.options.Climatisation;
import com.sankara.options.Convertible;
import com.sankara.options.ElectricWindow;
import com.sankara.options.GPS;
import com.sankara.options.HeatedSeat;

public class Main {
	
	public static void main(String[] args) {
		

		Garage garage = new Garage();
		List<Vehicle> listOfCars = new ArrayList<Vehicle>();	

		Vehicle kanta = new KantakaNkunimdie();
		kanta.setMotor(new DieselMotor("200 Hdi", 25484.80d));
		kanta.addOptions(new GPS());
		kanta.addOptions(new Climatisation());
		listOfCars.add(kanta);
		//garage.addCar(kanta);
		
		Vehicle mitsu = new MitsubishiOutlander();
		mitsu.setMotor(new EssenceMotor("300 ch", 25138d));
		mitsu.addOptions(new GPS());
		mitsu.addOptions(new ElectricWindow());
		mitsu.addOptions(new Climatisation());	
		listOfCars.add(mitsu);
		//garage.addCar(mitsu);
		
		Vehicle renault = new RenaultMegane();
		renault.setMotor(new HybrideMotor("Don't know", 12345.58d));
		renault.addOptions(new GPS());
		renault.addOptions(new Climatisation());
		renault.addOptions(new ElectricWindow());
		renault.addOptions(new HeatedSeat());
		listOfCars.add(renault);
		//garage.addCar(renault);
		
		Vehicle niss = new NissanKicks();
		niss.setMotor(new ElectricMotor("1500 W", 17654.05d));
		niss.addOptions(new Convertible());
		niss.addOptions(new GPS());
		niss.addOptions(new HeatedSeat());
		listOfCars.add(niss);
		//garage.addCar(niss);
		
		
		garage.removeSomeCars(listOfCars);
		System.out.println(garage.toString());
		
	}
}

package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dep = new Department(1,"Books");
		Seller sel = new Seller(1,"Bob","Bob@",new Date(),3000.0,dep);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(sel);
	}

}

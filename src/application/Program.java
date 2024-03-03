package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller findById ===");
		Seller sel = sellerDao.findById(3);
		System.out.println(sel);
		
		System.out.println("=== TEST 2: Seller findByDepartment ===");
		Department dep = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {			
			System.out.println(obj);
		}
		
	 }

}
 
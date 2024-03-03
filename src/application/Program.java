package application;

import java.util.Date;
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
		
		System.out.println("=== TEST 3: Seller findAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {			
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 4: Seller Insert ===");
		Seller newSeller = new Seller(null, "Greg", "Greg@", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id = "+newSeller.getId());
		
		System.out.println("=== TEST 5: Seller Update ===");
		sel = sellerDao.findById(1);
		sel.setName("Martha Wayne");
		sellerDao.update(sel);
		System.out.println("Update completed");
		
		System.out.println("=== TEST 6: Seller Delete ===");
		sel = sellerDao.findById(9);
		sellerDao.deleteById(sel.getId());
		System.out.println("Delete completed");
		
		
	 }

}
 
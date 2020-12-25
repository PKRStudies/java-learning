package com.pkr.java.learning.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.pkr.java.learning.collections.vo.Product;

public class CollectionOperationList implements Iterable<Product>{

	private final List<Product> prodList = new ArrayList<>();
	
	public void doAdd(Product product) {
		prodList.add(product);
	}
	
	public void doRemove(Product product) {
		prodList.remove(product);
	}
	
	public boolean doReplace(Product oldProduct, Product newProduct) {
		int index = prodList.indexOf(oldProduct);
		if(index >= 0)
			prodList.set(index, newProduct);
		else
			return false;
		return true;
	}

	@Override
	public Iterator<Product> iterator() {
		return prodList.iterator();
	}

}

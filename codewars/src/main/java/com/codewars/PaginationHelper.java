package com.codewars;

import java.util.List;

//TODO: complete this object/class

public class PaginationHelper<I> {
	
	private List<I> collection;
	private int itemsPerPage;

	/**
	 * The constructor takes in an array of items and a integer indicating how
	 * many items fit within a single page
	 */
	public PaginationHelper(List<I> collection, int itemsPerPage) {
		this.collection = collection;
		this.itemsPerPage = itemsPerPage;
	}

	/**
	 * returns the number of items within the entire collection
	 */
	public int itemCount() {
		return collection.size();
	}

	/**
	 * returns the number of pages
	 */
	public int pageCount() {
		int pageCount = 0;
		
		int fullItemPages = collection.size() / itemsPerPage;
		int remainingItems = collection.size() % itemsPerPage;
		
		if (remainingItems > 0) {
			pageCount = fullItemPages + 1;
		}
		
		return pageCount;
	}

	/**
	 * returns the number of items on the current page. page_index is zero
	 * based. this method should return -1 for pageIndex values that are out of
	 * range
	 */
	public int pageItemCount(int pageIndex) {
		int pageItemCount = -1;
		
		if (pageIndex > pageCount() - 1) {
			return pageItemCount;
		}
		else if (pageIndex < pageCount() - 1) {
			pageItemCount =  itemsPerPage;
		}
		else if (pageIndex == pageCount() - 1) {
			int remainingItems = collection.size() % itemsPerPage;
			
			pageItemCount = remainingItems;
		}

		return pageItemCount;
	}

	/**
	 * determines what page an item is on. Zero based indexes this method should
	 * return -1 for itemIndex values that are out of range
	 */
	public int pageIndex(int itemIndex) {
		int pageIndex = -1;
		
		if (itemIndex > collection.size() - 1 || itemIndex < 0) {
			return pageIndex;
		}
		
		pageIndex = 0;
		int currrentPageIndex = 0;
		int pageStartIndex = 0;
		int pageEndIndex = itemsPerPage - 1;
		
		while (pageIndex < pageCount()) {
			
			if (itemIndex >= pageStartIndex && itemIndex <= pageEndIndex) {
				pageIndex = currrentPageIndex;
				
				break;
			}
			
			currrentPageIndex ++;
			pageStartIndex = pageStartIndex + itemsPerPage;
			pageEndIndex = pageEndIndex + itemsPerPage;
		}
		
		return pageIndex;
	}
}
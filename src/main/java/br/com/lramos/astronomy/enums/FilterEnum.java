package br.com.lramos.astronomy.enums;

public enum FilterEnum {
	
	SORT("fa fa-sort", "fa fa-sort-up"),
	SORT_UP("fa fa-sort-up", "fa fa-sort-down"),
	SORT_DOWN("fa fa-sort-down", "fa fa-sort");
	
	private String filter;
	private String next;
	
	private FilterEnum(String filter, String next) {
		this.filter = filter;
		this.next = next;
	}
	
	public String getNext() {
		return next;
	}
	
	public String getFilter() {
		return filter;
	}

}

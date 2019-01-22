package com.exceltodatabase.model;

public class Contract {
	String customerAccount;
	String productName;
	String listPrice;
	String entryStartDate;
	String entryEndDate;
	String source;
	String quoteNumber;
	String quantity;
	String updatedBy;

	public String getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(String customerAccount) {
		this.customerAccount = customerAccount;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getListPrice() {
		return listPrice;
	}

	public void setListPrice(String listPrice) {
		this.listPrice = listPrice;
	}

	public String getEntryStartDate() {
		return entryStartDate;
	}

	public void setEntryStartDate(String entryStartDate) {
		this.entryStartDate = entryStartDate;
	}

	public String getEntryEndDate() {
		return entryEndDate;
	}

	public void setEntryEndDate(String entryEndDate) {
		this.entryEndDate = entryEndDate;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getQuoteNumber() {
		return quoteNumber;
	}

	public void setQuoteNumber(String quoteNumber) {
		this.quoteNumber = quoteNumber;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contract(String customerAccount, String productName, String listPrice, String entryStartDate,
			String entryEndDate, String source, String quoteNumber, String quantity, String updatedBy) {
		super();
		this.customerAccount = customerAccount;
		this.productName = productName;
		this.listPrice = listPrice;
		this.entryStartDate = entryStartDate;
		this.entryEndDate = entryEndDate;
		this.source = source;
		this.quoteNumber = quoteNumber;
		this.quantity = quantity;
		this.updatedBy = updatedBy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerAccount == null) ? 0 : customerAccount.hashCode());
		result = prime * result + ((entryEndDate == null) ? 0 : entryEndDate.hashCode());
		result = prime * result + ((entryStartDate == null) ? 0 : entryStartDate.hashCode());
		result = prime * result + ((listPrice == null) ? 0 : listPrice.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((quoteNumber == null) ? 0 : quoteNumber.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((updatedBy == null) ? 0 : updatedBy.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contract other = (Contract) obj;
		if (customerAccount == null) {
			if (other.customerAccount != null)
				return false;
		} else if (!customerAccount.equals(other.customerAccount))
			return false;
		if (entryEndDate == null) {
			if (other.entryEndDate != null)
				return false;
		} else if (!entryEndDate.equals(other.entryEndDate))
			return false;
		if (entryStartDate == null) {
			if (other.entryStartDate != null)
				return false;
		} else if (!entryStartDate.equals(other.entryStartDate))
			return false;
		if (listPrice == null) {
			if (other.listPrice != null)
				return false;
		} else if (!listPrice.equals(other.listPrice))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (quoteNumber == null) {
			if (other.quoteNumber != null)
				return false;
		} else if (!quoteNumber.equals(other.quoteNumber))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (updatedBy == null) {
			if (other.updatedBy != null)
				return false;
		} else if (!updatedBy.equals(other.updatedBy))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  customerAccount + " | " + productName + " | "
				+ listPrice + " | " + entryStartDate + ", entryEndDate=" + entryEndDate + ", source="
				+ source + ", quoteNumber=" + quoteNumber + ", quantity=" + quantity + ", updatedBy=" + updatedBy + "]";
	}

}

package vo;

public class ProductVO {
	int P_id;          // NUMBER(2) PRIMARY KEY,
	String pname;     // VARCHAR2(40),
	String category;    // VARCHAR2(40),
	int price;           // NUMBER(8)
	String img;
	String userid;
	public ProductVO() {}
	public int getP_id() {
		return P_id;
	}
	public void setP_id(int p_id) {
		this.P_id = p_id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "ProductVO [pid=" + P_id + ", pname=" + pname + ", category=" + category + ", price=" + price + ", img="
				+ img + ", userid=" + userid + "]";
	}
	public ProductVO(int p_id, String pname, String category, int price, String img, String userid) {
		super();
		this.P_id = p_id;
		this.pname = pname;
		this.category = category;
		this.price = price;
		this.img = img;
		this.userid = userid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((img == null) ? 0 : img.hashCode());
		result = prime * result + P_id;
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		result = prime * result + price;
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
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
		ProductVO other = (ProductVO) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (img == null) {
			if (other.img != null)
				return false;
		} else if (!img.equals(other.img))
			return false;
		if (P_id != other.P_id)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		if (price != other.price)
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}
	
	
    
	
}

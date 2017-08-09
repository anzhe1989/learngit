package cn.itsource.spring.day2.k_aop_ann;

public class Emp {
	private Long id;
	private String name;
	private Integer password;
	private String des;
	private String des3;

	public Emp() {
	}

	public Emp(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(Integer password){
		this.password = password;
	}

	public Integer getPassword(){
		return password
	}
}

package br.edu.ifba.inf008.myproject;

class Contact {
	private String name;
	private String phone;
	private String email;

	public Contact(String name, String phone){
		setName(name);
		setPhone(phone);
	}

	public Contact(String name, String phone, String email){
		this(name, phone);  // chama o construtor anterior e passa os parametros
		setEmail(email);
	}

	public String getName(){ return name; }
	public void setName(String name){ this.name = name; }

	public String getPhone(){ return phone; }
        public void setPhone(String phone){ this.phone = phone; }

	public String getEmail(){ return email; }
        public void setEmail(String email){ this.email = email; }

	public void displayInfo(){
		System.out.println("Nome: " + name + " Telefone: " + phone + " E-mail: " + email);
	}

	public void updateContact(String name, String phone, String email){
		setPhone(phone);
		setEmail(email);
	}



}

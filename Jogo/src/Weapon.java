class Weapon
{
	private int bullets;
	private int cartridge;
	
	public Weapon() {
		this.bullets = 0;
		this.cartridge = 5;
	}
	
	/*
	public int getCartridge() {
		return cartridge;
	}*/
	
	public void gunOn(int shots, Player target) {
		if (bullets <= 0) {
			System.out.println("Sem azeitona!");
			System.out.println("Preciso recarregar!");
			recharge();
		} else {
			System.out.println("atira " + shots + " vezes em " + target.getName() + "!");
			bullets = bullets - shots;
		}

	}
	
	public void recharge () {
		this.bullets = 15;
		this.cartridge--;
		System.out.println("Agora posso meter bala nessa porra!");
	}
	
	
}

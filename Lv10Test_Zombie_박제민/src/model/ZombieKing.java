package model;

public class ZombieKing extends Unit{
	private int shield;
	public ZombieKing(String name, int hp, int attack, int def, int position, int shield ) {
		super(name, hp, attack, def, position);
		this.shield = shield;
	}
	public int getShield() {
		return this.shield;
	}
	public void setShield(int shield) {
		this.shield = shield;
	}
	
	public void attack(Unit target) {
		
		int damage = (this.getAttack() - target.getDef())*(rand.nextInt(150)+50)/100; 
		if(damage <= 0) {
			damage = 1;
		}
		else if(damage < 10 ) {
			damage*=2;
			System.out.println(this.getName()+"�� �ʻ��!");
			System.out.println(damage+"�� ������");
			System.out.println(target.getName()+"�� ����ü��: "+this.getHp());
			target.setHp(target.getHp()- damage);
			
		}
		else {
			damage = (this.getAttack() - target.getDef())*(rand.nextInt(150)+50)/100;
			if(damage <= 0) {
				damage = 1;
			}
			System.out.printf("%s�� ����!\n", this.getName());
			System.out.printf("%d�� ������!\n", damage);
			target.setHp(target.getHp()-damage);
			System.out.printf("%s�� ����ü��: %d\n",target.getName(), target.getHp());
			
		}
		
		
	}
}

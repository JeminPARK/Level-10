package model;

public class Zombie extends Unit {

	public Zombie(String name, int hp, int attack, int def, int position) {
		super(name, hp, attack, def, position);
	}
	public void attack(Unit target) {
		int damage = (this.getAttack() - target.getDef())*(rand.nextInt(150)+50)/100;
		if(damage <= 0) {
			damage = 1;
		}
		System.out.printf("%s�� ����!\n", this.getName());
		System.out.printf("%d�� ������!\n", damage);
		target.setHp(target.getHp()-damage);
		System.out.printf("%s�� ����ü��: %d\n",target.getName(), target.getHp());
	}
}

package com.lxj.bean;

import com.lxj.base.BaseElement;
import com.lxj.zhiwuvsani.DieListener;

public abstract class Bullet extends BaseElement {
	protected int attack = 10;// ������
	protected int speed = 60;// �ƶ��ٶ�
	public Bullet(String filepath) {
		super(filepath);
		// TODO Auto-generated constructor stub
	}
	public abstract void BaseAction();
	/**
	 * �ƶ�
	 */
	public abstract void move();

	public int getAttack() {
		return attack;
	}
	
}

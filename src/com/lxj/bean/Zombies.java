package com.lxj.bean;

import org.cocos2d.types.CGPoint;
import org.cocos2d.types.CGSize;

import com.lxj.base.BaseElement;
/**
 * ��ʬ�Ļ���
 * @author linxj
 *
 */
public abstract class Zombies extends BaseElement{
	
	protected int speed = 10;//�ٶ�
	protected int attack = 10;//��������
	protected int life = 50;//������

	protected CGPoint startPoint;// ���
	protected CGPoint endPoint;// �յ�

	public Zombies(String filepath) {
		
		super(filepath);
		
	}

	/**
	 * �ƶ�
	 */
	public abstract void move();

	/**
	 * ����
	 * 
	 * @param element:����ֲ�������ʬ
	 */
	public abstract void attack(BaseElement element);

	/**
	 * ������
	 */
	public abstract void attacked(int attack);
}

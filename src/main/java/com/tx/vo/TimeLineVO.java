package com.tx.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeLineVO {
	/**
	 * true:天亮了，false:天黑请闭眼
	 */
	private boolean day;
	
	/**
	 * 被杀者编号
	 */
	private int deadIndex;
	
	/**
	 * 被守护编号
	 */
	private int guardIndex;
	
	/**
	 * 被验身份编号
	 */
	private int identifyIndex;
	
	/**
	 * 发言人编号
	 */
	private int talkIndex;
	
	/**
	 * 1:天黑, 2:天亮结果, 3:遗言, 4:轮流发言, 5:投票, 6:投票结果, 7:平票PK, 8:狼人获胜, 9:平民获胜
	 */
	private int type;
	
	/**
	 * 投票行为
	 */
	private Map<Integer, Integer> voteOps = new HashMap<>();
	
	/**
	 * 天数
	 */
	private int dateCount;
	
	/**
	 * 平票待PK玩家
	 */
	private List<Integer> pk;
	
	/**
	 * 本轮倒计时时间 s
	 */
	private int times;
	
	/**
	 * 狼人杀人编号汇总，用以决定谁被杀
	 */
	private List<Integer> killIndex = new ArrayList<>();
	
	

	public TimeLineVO() {
		for(int i=1; i<7; i++) {
			voteOps.put(i, 0);
		}
	}

	public boolean getDay() {
		return day;
	}

	public void setDay(boolean day) {
		this.day = day;
	}

	public int getDeadIndex() {
		return deadIndex;
	}

	public void setDeadIndex(int deadIndex) {
		this.deadIndex = deadIndex;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Map<Integer, Integer> getVoteOps() {
		return voteOps;
	}

	public void setVoteOps(Map<Integer, Integer> voteOps) {
		this.voteOps = voteOps;
	}

	public int getDateCount() {
		return dateCount;
	}

	public void setDateCount(int dateCount) {
		this.dateCount = dateCount;
	}

	public List<Integer> getPk() {
		return pk;
	}

	public void setPk(List<Integer> pk) {
		this.pk = pk;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public int getTalkIndex() {
		return talkIndex;
	}

	public void setTalkIndex(int talkIndex) {
		this.talkIndex = talkIndex;
	}

	public int getGuardIndex() {
		return guardIndex;
	}

	public void setGuardIndex(int guardIndex) {
		this.guardIndex = guardIndex;
	}

	public int getIdentifyIndex() {
		return identifyIndex;
	}

	public void setIdentifyIndex(int identifyIndex) {
		this.identifyIndex = identifyIndex;
	}

	public List<Integer> getKillIndex() {
		return killIndex;
	}
}

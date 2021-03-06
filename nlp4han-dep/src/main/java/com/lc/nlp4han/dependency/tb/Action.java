package com.lc.nlp4han.dependency.tb;

/**
 * 转换动作类
 *
 */
public class Action
{
	// 是对输入产生的结果的分类
	private String relation;// 包括"EXTRAROOT"、"null"及其他所有训练集中的关系
	
	private String baseAction;// arcEager共四类基本操作RIGHTARC_SHIFT、LEFTARC_REDUCE、SHIFT、REDUCE
								// arcStandard共三类基本操作RIGHTARC_REDUCE、LEFTARC_REDUCE、SHIFT

	public Action(String relation, String baseAction)
	{
		this.relation = relation;
		this.baseAction = baseAction;
	}

	public Action()
	{
	}

	public String typeToString()
	{
		return relation + "/" + baseAction;
	}

	public static Action toType(String strInType)
	{
		String[] strs = strInType.split("/");
		Action type = new Action();
		if (strs.length == 2)
		{
			type.relation = strs[0];
			type.baseAction = strs[1];
			return type;
		}
		else
			return null;
	}

	public String getRelation()
	{
		return relation;
	}

	public void setRelation(String relation)
	{
		this.relation = relation;
	}

	public String getBaseAction()
	{
		return baseAction;
	}

	public void setBaseAction(String baseAction)
	{
		this.baseAction = baseAction;
	}

}

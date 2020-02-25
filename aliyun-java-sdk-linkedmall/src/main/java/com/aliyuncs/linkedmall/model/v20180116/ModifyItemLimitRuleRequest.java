/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyItemLimitRuleRequest extends RpcAcsRequest<ModifyItemLimitRuleResponse> {
	   

	private Integer upperNum;

	private Long lmActivityId;

	private Integer ruleType;

	private Long endTime;

	private String lmItemId;

	private Long beginTime;

	private String subBizCode;

	private Long itemId;

	private String bizId;

	private Long ruleId;
	public ModifyItemLimitRuleRequest() {
		super("linkedmall", "2018-01-16", "ModifyItemLimitRule");
		setMethod(MethodType.POST);
	}

	public Integer getUpperNum() {
		return this.upperNum;
	}

	public void setUpperNum(Integer upperNum) {
		this.upperNum = upperNum;
		if(upperNum != null){
			putQueryParameter("UpperNum", upperNum.toString());
		}
	}

	public Long getLmActivityId() {
		return this.lmActivityId;
	}

	public void setLmActivityId(Long lmActivityId) {
		this.lmActivityId = lmActivityId;
		if(lmActivityId != null){
			putQueryParameter("LmActivityId", lmActivityId.toString());
		}
	}

	public Integer getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(Integer ruleType) {
		this.ruleType = ruleType;
		if(ruleType != null){
			putQueryParameter("RuleType", ruleType.toString());
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getLmItemId() {
		return this.lmItemId;
	}

	public void setLmItemId(String lmItemId) {
		this.lmItemId = lmItemId;
		if(lmItemId != null){
			putQueryParameter("LmItemId", lmItemId);
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
		}
	}

	public String getSubBizCode() {
		return this.subBizCode;
	}

	public void setSubBizCode(String subBizCode) {
		this.subBizCode = subBizCode;
		if(subBizCode != null){
			putQueryParameter("SubBizCode", subBizCode);
		}
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putQueryParameter("ItemId", itemId.toString());
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId.toString());
		}
	}

	@Override
	public Class<ModifyItemLimitRuleResponse> getResponseClass() {
		return ModifyItemLimitRuleResponse.class;
	}

}

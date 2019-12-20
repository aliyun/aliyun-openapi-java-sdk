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
public class DeleteItemLimitRuleRequest extends RpcAcsRequest<DeleteItemLimitRuleResponse> {
	   

	private Long lmActivityId;

	private Long ltemId;

	private String bizId;

	private String lmItemId;

	private Long ruleId;

	private String subBizCode;
	public DeleteItemLimitRuleRequest() {
		super("linkedmall", "2018-01-16", "DeleteItemLimitRule", "linkedmall");
		setMethod(MethodType.POST);
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

	public Long getLtemId() {
		return this.ltemId;
	}

	public void setLtemId(Long ltemId) {
		this.ltemId = ltemId;
		if(ltemId != null){
			putQueryParameter("LtemId", ltemId.toString());
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

	public String getLmItemId() {
		return this.lmItemId;
	}

	public void setLmItemId(String lmItemId) {
		this.lmItemId = lmItemId;
		if(lmItemId != null){
			putQueryParameter("LmItemId", lmItemId);
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

	public String getSubBizCode() {
		return this.subBizCode;
	}

	public void setSubBizCode(String subBizCode) {
		this.subBizCode = subBizCode;
		if(subBizCode != null){
			putQueryParameter("SubBizCode", subBizCode);
		}
	}

	@Override
	public Class<DeleteItemLimitRuleResponse> getResponseClass() {
		return DeleteItemLimitRuleResponse.class;
	}

}

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

package com.aliyuncs.sales_leads.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateLeadRequest extends RpcAcsRequest<CreateLeadResponse> {
	   

	private String recommendScenario;

	private String recommendReason;

	private String recommendScript;

	private String discountInfo;

	private String contactNumber;

	private Long constructStrategyId;

	private String customerSource;

	private List<RuleFactor> ruleFactors;

	private String remark;

	private String industry;

	private String uuid;

	private String recommendProduct;

	private Long uid;

	private String contact;

	private String recommendFactor;

	private String region;

	private Long cid;
	public CreateLeadRequest() {
		super("sales-leads", "2020-09-07", "CreateLead");
		setMethod(MethodType.POST);
	}

	public String getRecommendScenario() {
		return this.recommendScenario;
	}

	public void setRecommendScenario(String recommendScenario) {
		this.recommendScenario = recommendScenario;
		if(recommendScenario != null){
			putQueryParameter("RecommendScenario", recommendScenario);
		}
	}

	public String getRecommendReason() {
		return this.recommendReason;
	}

	public void setRecommendReason(String recommendReason) {
		this.recommendReason = recommendReason;
		if(recommendReason != null){
			putQueryParameter("RecommendReason", recommendReason);
		}
	}

	public String getRecommendScript() {
		return this.recommendScript;
	}

	public void setRecommendScript(String recommendScript) {
		this.recommendScript = recommendScript;
		if(recommendScript != null){
			putQueryParameter("RecommendScript", recommendScript);
		}
	}

	public String getDiscountInfo() {
		return this.discountInfo;
	}

	public void setDiscountInfo(String discountInfo) {
		this.discountInfo = discountInfo;
		if(discountInfo != null){
			putQueryParameter("DiscountInfo", discountInfo);
		}
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
		if(contactNumber != null){
			putQueryParameter("ContactNumber", contactNumber);
		}
	}

	public Long getConstructStrategyId() {
		return this.constructStrategyId;
	}

	public void setConstructStrategyId(Long constructStrategyId) {
		this.constructStrategyId = constructStrategyId;
		if(constructStrategyId != null){
			putQueryParameter("ConstructStrategyId", constructStrategyId.toString());
		}
	}

	public String getCustomerSource() {
		return this.customerSource;
	}

	public void setCustomerSource(String customerSource) {
		this.customerSource = customerSource;
		if(customerSource != null){
			putQueryParameter("CustomerSource", customerSource);
		}
	}

	public List<RuleFactor> getRuleFactors() {
		return this.ruleFactors;
	}

	public void setRuleFactors(List<RuleFactor> ruleFactors) {
		this.ruleFactors = ruleFactors;	
		if (ruleFactors != null) {
			for (int depth1 = 0; depth1 < ruleFactors.size(); depth1++) {
				putQueryParameter("RuleFactor." + (depth1 + 1) + ".RuleCode" , ruleFactors.get(depth1).getRuleCode());
				putQueryParameter("RuleFactor." + (depth1 + 1) + ".Reason" , ruleFactors.get(depth1).getReason());
				putQueryParameter("RuleFactor." + (depth1 + 1) + ".ProductCodes" , ruleFactors.get(depth1).getProductCodes());
				putQueryParameter("RuleFactor." + (depth1 + 1) + ".FactorCode" , ruleFactors.get(depth1).getFactorCode());
				putQueryParameter("RuleFactor." + (depth1 + 1) + ".UserId" , ruleFactors.get(depth1).getUserId());
			}
		}	
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
		if(industry != null){
			putQueryParameter("Industry", industry);
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getRecommendProduct() {
		return this.recommendProduct;
	}

	public void setRecommendProduct(String recommendProduct) {
		this.recommendProduct = recommendProduct;
		if(recommendProduct != null){
			putQueryParameter("RecommendProduct", recommendProduct);
		}
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid.toString());
		}
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
		if(contact != null){
			putQueryParameter("Contact", contact);
		}
	}

	public String getRecommendFactor() {
		return this.recommendFactor;
	}

	public void setRecommendFactor(String recommendFactor) {
		this.recommendFactor = recommendFactor;
		if(recommendFactor != null){
			putQueryParameter("RecommendFactor", recommendFactor);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public Long getCid() {
		return this.cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
		if(cid != null){
			putQueryParameter("Cid", cid.toString());
		}
	}

	public static class RuleFactor {

		private String ruleCode;

		private String reason;

		private String productCodes;

		private String factorCode;

		private Long userId;

		public String getRuleCode() {
			return this.ruleCode;
		}

		public void setRuleCode(String ruleCode) {
			this.ruleCode = ruleCode;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getProductCodes() {
			return this.productCodes;
		}

		public void setProductCodes(String productCodes) {
			this.productCodes = productCodes;
		}

		public String getFactorCode() {
			return this.factorCode;
		}

		public void setFactorCode(String factorCode) {
			this.factorCode = factorCode;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}
	}

	@Override
	public Class<CreateLeadResponse> getResponseClass() {
		return CreateLeadResponse.class;
	}

}

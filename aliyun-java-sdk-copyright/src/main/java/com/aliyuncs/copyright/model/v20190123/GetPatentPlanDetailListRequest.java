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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetPatentPlanDetailListRequest extends RpcAcsRequest<GetPatentPlanDetailListResponse> {
	   

	private String discount;

	private String type;

	private String patentStatus;

	private String keyword;

	private Integer endYear;

	private Integer soldStatus;

	private Integer label;

	private Long startPayDate;

	private Long endPayDate;

	private Integer payStatus;

	private Integer startYear;

	private Long planId;

	private Boolean patentDiscard;
	public GetPatentPlanDetailListRequest() {
		super("Copyright", "2019-01-23", "GetPatentPlanDetailList");
		setMethod(MethodType.POST);
	}

	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
		if(discount != null){
			putQueryParameter("Discount", discount);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getPatentStatus() {
		return this.patentStatus;
	}

	public void setPatentStatus(String patentStatus) {
		this.patentStatus = patentStatus;
		if(patentStatus != null){
			putQueryParameter("PatentStatus", patentStatus);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public Integer getEndYear() {
		return this.endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
		if(endYear != null){
			putQueryParameter("EndYear", endYear.toString());
		}
	}

	public Integer getSoldStatus() {
		return this.soldStatus;
	}

	public void setSoldStatus(Integer soldStatus) {
		this.soldStatus = soldStatus;
		if(soldStatus != null){
			putQueryParameter("SoldStatus", soldStatus.toString());
		}
	}

	public Integer getLabel() {
		return this.label;
	}

	public void setLabel(Integer label) {
		this.label = label;
		if(label != null){
			putQueryParameter("Label", label.toString());
		}
	}

	public Long getStartPayDate() {
		return this.startPayDate;
	}

	public void setStartPayDate(Long startPayDate) {
		this.startPayDate = startPayDate;
		if(startPayDate != null){
			putQueryParameter("StartPayDate", startPayDate.toString());
		}
	}

	public Long getEndPayDate() {
		return this.endPayDate;
	}

	public void setEndPayDate(Long endPayDate) {
		this.endPayDate = endPayDate;
		if(endPayDate != null){
			putQueryParameter("EndPayDate", endPayDate.toString());
		}
	}

	public Integer getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
		if(payStatus != null){
			putQueryParameter("PayStatus", payStatus.toString());
		}
	}

	public Integer getStartYear() {
		return this.startYear;
	}

	public void setStartYear(Integer startYear) {
		this.startYear = startYear;
		if(startYear != null){
			putQueryParameter("StartYear", startYear.toString());
		}
	}

	public Long getPlanId() {
		return this.planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId.toString());
		}
	}

	public Boolean getPatentDiscard() {
		return this.patentDiscard;
	}

	public void setPatentDiscard(Boolean patentDiscard) {
		this.patentDiscard = patentDiscard;
		if(patentDiscard != null){
			putQueryParameter("PatentDiscard", patentDiscard.toString());
		}
	}

	@Override
	public Class<GetPatentPlanDetailListResponse> getResponseClass() {
		return GetPatentPlanDetailListResponse.class;
	}

}

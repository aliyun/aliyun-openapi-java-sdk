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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsPdsaRecommendSolutionRequest extends RpcAcsRequest<OpsPdsaRecommendSolutionResponse> {
	   

	private String beginDate;

	private Long ioOptimized;

	private String networkType;

	private Long uid;

	private String dmdType;

	private List<String> zoneIdss;

	private Long dmdAmount;

	private String dmdUnit;

	private String dmdMeta;

	private Integer expectAzCnt;

	private String bizType;

	private String payUnit;

	private String endDate;

	private String region;

	private String payType;

	private String auditParamStr;
	public OpsPdsaRecommendSolutionRequest() {
		super("Ecsops", "2016-04-01", "OpsPdsaRecommendSolution", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
		if(beginDate != null){
			putQueryParameter("BeginDate", beginDate);
		}
	}

	public Long getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Long ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized.toString());
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
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

	public String getDmdType() {
		return this.dmdType;
	}

	public void setDmdType(String dmdType) {
		this.dmdType = dmdType;
		if(dmdType != null){
			putQueryParameter("DmdType", dmdType);
		}
	}

	public List<String> getZoneIdss() {
		return this.zoneIdss;
	}

	public void setZoneIdss(List<String> zoneIdss) {
		this.zoneIdss = zoneIdss;	
		if (zoneIdss != null) {
			for (int i = 0; i < zoneIdss.size(); i++) {
				putQueryParameter("ZoneIds." + (i + 1) , zoneIdss.get(i));
			}
		}	
	}

	public Long getDmdAmount() {
		return this.dmdAmount;
	}

	public void setDmdAmount(Long dmdAmount) {
		this.dmdAmount = dmdAmount;
		if(dmdAmount != null){
			putQueryParameter("DmdAmount", dmdAmount.toString());
		}
	}

	public String getDmdUnit() {
		return this.dmdUnit;
	}

	public void setDmdUnit(String dmdUnit) {
		this.dmdUnit = dmdUnit;
		if(dmdUnit != null){
			putQueryParameter("DmdUnit", dmdUnit);
		}
	}

	public String getDmdMeta() {
		return this.dmdMeta;
	}

	public void setDmdMeta(String dmdMeta) {
		this.dmdMeta = dmdMeta;
		if(dmdMeta != null){
			putQueryParameter("DmdMeta", dmdMeta);
		}
	}

	public Integer getExpectAzCnt() {
		return this.expectAzCnt;
	}

	public void setExpectAzCnt(Integer expectAzCnt) {
		this.expectAzCnt = expectAzCnt;
		if(expectAzCnt != null){
			putQueryParameter("ExpectAzCnt", expectAzCnt.toString());
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getPayUnit() {
		return this.payUnit;
	}

	public void setPayUnit(String payUnit) {
		this.payUnit = payUnit;
		if(payUnit != null){
			putQueryParameter("PayUnit", payUnit);
		}
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate);
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

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsPdsaRecommendSolutionResponse> getResponseClass() {
		return OpsPdsaRecommendSolutionResponse.class;
	}

}

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

package com.aliyuncs.sddp.model.v20190103;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sddp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesRequest extends RpcAcsRequest<DescribeInstancesResponse> {
	   

	private String productCode;

	private Long productId;

	private Long riskLevelId;

	private String source;

	private Long startTime;

	private Long userId;

	private String nameAccurate;

	private String sensLevelName;

	private Long lastFinishTimeStart;

	private Integer pageSize;

	private Integer checkStatus;

	private String lang;

	private String serviceRegionId;

	private Integer featureType;

	private Integer userType;

	private Long endTime;

	private Integer currentPage;

	private String name;

	private Long ruleId;

	private Long lastFinishTimeEnd;
	public DescribeInstancesRequest() {
		super("Sddp", "2019-01-03", "DescribeInstances");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
		if(productId != null){
			putQueryParameter("ProductId", productId.toString());
		}
	}

	public Long getRiskLevelId() {
		return this.riskLevelId;
	}

	public void setRiskLevelId(Long riskLevelId) {
		this.riskLevelId = riskLevelId;
		if(riskLevelId != null){
			putQueryParameter("RiskLevelId", riskLevelId.toString());
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
		}
	}

	public String getNameAccurate() {
		return this.nameAccurate;
	}

	public void setNameAccurate(String nameAccurate) {
		this.nameAccurate = nameAccurate;
		if(nameAccurate != null){
			putQueryParameter("NameAccurate", nameAccurate);
		}
	}

	public String getSensLevelName() {
		return this.sensLevelName;
	}

	public void setSensLevelName(String sensLevelName) {
		this.sensLevelName = sensLevelName;
		if(sensLevelName != null){
			putQueryParameter("SensLevelName", sensLevelName);
		}
	}

	public Long getLastFinishTimeStart() {
		return this.lastFinishTimeStart;
	}

	public void setLastFinishTimeStart(Long lastFinishTimeStart) {
		this.lastFinishTimeStart = lastFinishTimeStart;
		if(lastFinishTimeStart != null){
			putQueryParameter("LastFinishTimeStart", lastFinishTimeStart.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
		if(checkStatus != null){
			putQueryParameter("CheckStatus", checkStatus.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getServiceRegionId() {
		return this.serviceRegionId;
	}

	public void setServiceRegionId(String serviceRegionId) {
		this.serviceRegionId = serviceRegionId;
		if(serviceRegionId != null){
			putQueryParameter("ServiceRegionId", serviceRegionId);
		}
	}

	public Integer getFeatureType() {
		return this.featureType;
	}

	public void setFeatureType(Integer featureType) {
		this.featureType = featureType;
		if(featureType != null){
			putQueryParameter("FeatureType", featureType.toString());
		}
	}

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
		if(userType != null){
			putQueryParameter("UserType", userType.toString());
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public Long getLastFinishTimeEnd() {
		return this.lastFinishTimeEnd;
	}

	public void setLastFinishTimeEnd(Long lastFinishTimeEnd) {
		this.lastFinishTimeEnd = lastFinishTimeEnd;
		if(lastFinishTimeEnd != null){
			putQueryParameter("LastFinishTimeEnd", lastFinishTimeEnd.toString());
		}
	}

	@Override
	public Class<DescribeInstancesResponse> getResponseClass() {
		return DescribeInstancesResponse.class;
	}

}

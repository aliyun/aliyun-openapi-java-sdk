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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCloudDriveServiceRequest extends RpcAcsRequest<CreateCloudDriveServiceResponse> {
	   

	private String officeSiteId;

	private String cdsChargeType;

	private String cenId;

	private String officeSiteType;

	private Long userCount;

	private List<String> endUserIds;

	private String solutionId;

	private Long userMaxSize;

	private Long period;

	private Boolean autoPay;

	private String domainName;

	private Integer bizType;

	private String periodUnit;

	private Boolean autoRenew;

	private String name;

	private Long maxSize;
	public CreateCloudDriveServiceRequest() {
		super("ecd", "2020-09-30", "CreateCloudDriveService", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOfficeSiteId() {
		return this.officeSiteId;
	}

	public void setOfficeSiteId(String officeSiteId) {
		this.officeSiteId = officeSiteId;
		if(officeSiteId != null){
			putQueryParameter("OfficeSiteId", officeSiteId);
		}
	}

	public String getCdsChargeType() {
		return this.cdsChargeType;
	}

	public void setCdsChargeType(String cdsChargeType) {
		this.cdsChargeType = cdsChargeType;
		if(cdsChargeType != null){
			putQueryParameter("CdsChargeType", cdsChargeType);
		}
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
		}
	}

	public String getOfficeSiteType() {
		return this.officeSiteType;
	}

	public void setOfficeSiteType(String officeSiteType) {
		this.officeSiteType = officeSiteType;
		if(officeSiteType != null){
			putQueryParameter("OfficeSiteType", officeSiteType);
		}
	}

	public Long getUserCount() {
		return this.userCount;
	}

	public void setUserCount(Long userCount) {
		this.userCount = userCount;
		if(userCount != null){
			putQueryParameter("UserCount", userCount.toString());
		}
	}

	public List<String> getEndUserIds() {
		return this.endUserIds;
	}

	public void setEndUserIds(List<String> endUserIds) {
		this.endUserIds = endUserIds;	
		if (endUserIds != null) {
			for (int i = 0; i < endUserIds.size(); i++) {
				putQueryParameter("EndUserId." + (i + 1) , endUserIds.get(i));
			}
		}	
	}

	public String getSolutionId() {
		return this.solutionId;
	}

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
		if(solutionId != null){
			putQueryParameter("SolutionId", solutionId);
		}
	}

	public Long getUserMaxSize() {
		return this.userMaxSize;
	}

	public void setUserMaxSize(Long userMaxSize) {
		this.userMaxSize = userMaxSize;
		if(userMaxSize != null){
			putQueryParameter("UserMaxSize", userMaxSize.toString());
		}
	}

	public Long getPeriod() {
		return this.period;
	}

	public void setPeriod(Long period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Integer getBizType() {
		return this.bizType;
	}

	public void setBizType(Integer bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType.toString());
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew.toString());
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

	public Long getMaxSize() {
		return this.maxSize;
	}

	public void setMaxSize(Long maxSize) {
		this.maxSize = maxSize;
		if(maxSize != null){
			putQueryParameter("MaxSize", maxSize.toString());
		}
	}

	@Override
	public Class<CreateCloudDriveServiceResponse> getResponseClass() {
		return CreateCloudDriveServiceResponse.class;
	}

}

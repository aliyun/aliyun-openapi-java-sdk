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
public class DescribeDesktopGroupsRequest extends RpcAcsRequest<DescribeDesktopGroupsResponse> {
	   

	private String officeSiteId;

	private List<String> endUserIdss;

	private String desktopGroupName;

	private String desktopGroupId;

	private String nextToken;

	private Integer period;

	private Long ownType;

	private List<String> excludedEndUserIdss;

	private String periodUnit;

	private Integer maxResults;

	private String policyGroupId;

	private Integer status;
	public DescribeDesktopGroupsRequest() {
		super("ecd", "2020-09-30", "DescribeDesktopGroups");
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

	public List<String> getEndUserIdss() {
		return this.endUserIdss;
	}

	public void setEndUserIdss(List<String> endUserIdss) {
		this.endUserIdss = endUserIdss;	
		if (endUserIdss != null) {
			for (int i = 0; i < endUserIdss.size(); i++) {
				putQueryParameter("EndUserIds." + (i + 1) , endUserIdss.get(i));
			}
		}	
	}

	public String getDesktopGroupName() {
		return this.desktopGroupName;
	}

	public void setDesktopGroupName(String desktopGroupName) {
		this.desktopGroupName = desktopGroupName;
		if(desktopGroupName != null){
			putQueryParameter("DesktopGroupName", desktopGroupName);
		}
	}

	public String getDesktopGroupId() {
		return this.desktopGroupId;
	}

	public void setDesktopGroupId(String desktopGroupId) {
		this.desktopGroupId = desktopGroupId;
		if(desktopGroupId != null){
			putQueryParameter("DesktopGroupId", desktopGroupId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Long getOwnType() {
		return this.ownType;
	}

	public void setOwnType(Long ownType) {
		this.ownType = ownType;
		if(ownType != null){
			putQueryParameter("OwnType", ownType.toString());
		}
	}

	public List<String> getExcludedEndUserIdss() {
		return this.excludedEndUserIdss;
	}

	public void setExcludedEndUserIdss(List<String> excludedEndUserIdss) {
		this.excludedEndUserIdss = excludedEndUserIdss;	
		if (excludedEndUserIdss != null) {
			for (int i = 0; i < excludedEndUserIdss.size(); i++) {
				putQueryParameter("ExcludedEndUserIds." + (i + 1) , excludedEndUserIdss.get(i));
			}
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getPolicyGroupId() {
		return this.policyGroupId;
	}

	public void setPolicyGroupId(String policyGroupId) {
		this.policyGroupId = policyGroupId;
		if(policyGroupId != null){
			putQueryParameter("PolicyGroupId", policyGroupId);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<DescribeDesktopGroupsResponse> getResponseClass() {
		return DescribeDesktopGroupsResponse.class;
	}

}

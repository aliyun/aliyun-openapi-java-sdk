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
public class CreateDesktopsLiteRequest extends RpcAcsRequest<CreateDesktopsLiteResponse> {
	   

	private Integer amount;

	private Integer period;

	private Integer bandwidth;

	private String bundleId;

	private Boolean enableInternetAccess;

	private String userAssignMode;

	private String periodUnit;

	private List<String> endUserIds;
	public CreateDesktopsLiteRequest() {
		super("ecd", "2020-09-30", "CreateDesktopsLite");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
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

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
		}
	}

	public String getBundleId() {
		return this.bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
		if(bundleId != null){
			putQueryParameter("BundleId", bundleId);
		}
	}

	public Boolean getEnableInternetAccess() {
		return this.enableInternetAccess;
	}

	public void setEnableInternetAccess(Boolean enableInternetAccess) {
		this.enableInternetAccess = enableInternetAccess;
		if(enableInternetAccess != null){
			putQueryParameter("EnableInternetAccess", enableInternetAccess.toString());
		}
	}

	public String getUserAssignMode() {
		return this.userAssignMode;
	}

	public void setUserAssignMode(String userAssignMode) {
		this.userAssignMode = userAssignMode;
		if(userAssignMode != null){
			putQueryParameter("UserAssignMode", userAssignMode);
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

	@Override
	public Class<CreateDesktopsLiteResponse> getResponseClass() {
		return CreateDesktopsLiteResponse.class;
	}

}

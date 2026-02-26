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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceForRenewDesktopOversoldGroupRequest extends RpcAcsRequest<DescribePriceForRenewDesktopOversoldGroupResponse> {
	   

	private Integer period;

	private String oversoldGroupId;

	private String periodUnit;
	public DescribePriceForRenewDesktopOversoldGroupRequest() {
		super("ecd", "2020-09-30", "DescribePriceForRenewDesktopOversoldGroup", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getOversoldGroupId() {
		return this.oversoldGroupId;
	}

	public void setOversoldGroupId(String oversoldGroupId) {
		this.oversoldGroupId = oversoldGroupId;
		if(oversoldGroupId != null){
			putQueryParameter("OversoldGroupId", oversoldGroupId);
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

	@Override
	public Class<DescribePriceForRenewDesktopOversoldGroupResponse> getResponseClass() {
		return DescribePriceForRenewDesktopOversoldGroupResponse.class;
	}

}

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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RenewAndroidInstanceGroupsRequest extends RpcAcsRequest<RenewAndroidInstanceGroupsResponse> {
	   

	private Integer period;

	private Boolean autoPay;

	private List<String> instanceGroupIdss;

	private String periodUnit;
	public RenewAndroidInstanceGroupsRequest() {
		super("eds-aic", "2023-09-30", "RenewAndroidInstanceGroups");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public List<String> getInstanceGroupIdss() {
		return this.instanceGroupIdss;
	}

	public void setInstanceGroupIdss(List<String> instanceGroupIdss) {
		this.instanceGroupIdss = instanceGroupIdss;	
		if (instanceGroupIdss != null) {
			for (int i = 0; i < instanceGroupIdss.size(); i++) {
				putQueryParameter("InstanceGroupIds." + (i + 1) , instanceGroupIdss.get(i));
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

	@Override
	public Class<RenewAndroidInstanceGroupsResponse> getResponseClass() {
		return RenewAndroidInstanceGroupsResponse.class;
	}

}

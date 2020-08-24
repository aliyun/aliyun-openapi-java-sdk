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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BindAIPlanWithDevicesRequest extends RpcAcsRequest<BindAIPlanWithDevicesResponse> {
	   

	private List<String> iotIdLists;

	private String planId;
	public BindAIPlanWithDevicesRequest() {
		super("Linkvisual", "2018-01-20", "BindAIPlanWithDevices", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getIotIdLists() {
		return this.iotIdLists;
	}

	public void setIotIdLists(List<String> iotIdLists) {
		this.iotIdLists = iotIdLists;	
		if (iotIdLists != null) {
			for (int i = 0; i < iotIdLists.size(); i++) {
				putQueryParameter("IotIdList." + (i + 1) , iotIdLists.get(i));
			}
		}	
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId);
		}
	}

	@Override
	public Class<BindAIPlanWithDevicesResponse> getResponseClass() {
		return BindAIPlanWithDevicesResponse.class;
	}

}

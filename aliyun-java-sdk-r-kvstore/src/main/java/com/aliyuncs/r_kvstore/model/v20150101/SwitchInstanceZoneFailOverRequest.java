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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.r_kvstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SwitchInstanceZoneFailOverRequest extends RpcAcsRequest<SwitchInstanceZoneFailOverResponse> {
	   

	private String siteFaultTime;

	private String targetZoneId;

	private String instanceId;
	public SwitchInstanceZoneFailOverRequest() {
		super("R-kvstore", "2015-01-01", "SwitchInstanceZoneFailOver", "redisa");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSiteFaultTime() {
		return this.siteFaultTime;
	}

	public void setSiteFaultTime(String siteFaultTime) {
		this.siteFaultTime = siteFaultTime;
		if(siteFaultTime != null){
			putQueryParameter("SiteFaultTime", siteFaultTime);
		}
	}

	public String getTargetZoneId() {
		return this.targetZoneId;
	}

	public void setTargetZoneId(String targetZoneId) {
		this.targetZoneId = targetZoneId;
		if(targetZoneId != null){
			putQueryParameter("TargetZoneId", targetZoneId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<SwitchInstanceZoneFailOverResponse> getResponseClass() {
		return SwitchInstanceZoneFailOverResponse.class;
	}

}

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

package com.aliyuncs.csb.model.v20171118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.csb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class FindServiceCredentialStatisticalDataRequest extends RpcAcsRequest<FindServiceCredentialStatisticalDataResponse> {
	   

	private Long csbId;

	private Long endTime;

	private Long startTime;

	private String credentialName;

	private String serviceNameVersion;
	public FindServiceCredentialStatisticalDataRequest() {
		super("CSB", "2017-11-18", "FindServiceCredentialStatisticalData");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getCsbId() {
		return this.csbId;
	}

	public void setCsbId(Long csbId) {
		this.csbId = csbId;
		if(csbId != null){
			putQueryParameter("CsbId", csbId.toString());
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

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public String getCredentialName() {
		return this.credentialName;
	}

	public void setCredentialName(String credentialName) {
		this.credentialName = credentialName;
		if(credentialName != null){
			putQueryParameter("CredentialName", credentialName);
		}
	}

	public String getServiceNameVersion() {
		return this.serviceNameVersion;
	}

	public void setServiceNameVersion(String serviceNameVersion) {
		this.serviceNameVersion = serviceNameVersion;
		if(serviceNameVersion != null){
			putQueryParameter("ServiceNameVersion", serviceNameVersion);
		}
	}

	@Override
	public Class<FindServiceCredentialStatisticalDataResponse> getResponseClass() {
		return FindServiceCredentialStatisticalDataResponse.class;
	}

}

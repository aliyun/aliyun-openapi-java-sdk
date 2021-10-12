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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InitDtsRdsInstanceRequest extends RpcAcsRequest<InitDtsRdsInstanceResponse> {
	   

	private String endpointInstanceId;

	private String endpointRegion;

	private String endpointCenId;

	private String endpointInstanceType;

	private String dtsInstanceId;
	public InitDtsRdsInstanceRequest() {
		super("Dts", "2020-01-01", "InitDtsRdsInstance", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEndpointInstanceId() {
		return this.endpointInstanceId;
	}

	public void setEndpointInstanceId(String endpointInstanceId) {
		this.endpointInstanceId = endpointInstanceId;
		if(endpointInstanceId != null){
			putQueryParameter("EndpointInstanceId", endpointInstanceId);
		}
	}

	public String getEndpointRegion() {
		return this.endpointRegion;
	}

	public void setEndpointRegion(String endpointRegion) {
		this.endpointRegion = endpointRegion;
		if(endpointRegion != null){
			putQueryParameter("EndpointRegion", endpointRegion);
		}
	}

	public String getEndpointCenId() {
		return this.endpointCenId;
	}

	public void setEndpointCenId(String endpointCenId) {
		this.endpointCenId = endpointCenId;
		if(endpointCenId != null){
			putQueryParameter("EndpointCenId", endpointCenId);
		}
	}

	public String getEndpointInstanceType() {
		return this.endpointInstanceType;
	}

	public void setEndpointInstanceType(String endpointInstanceType) {
		this.endpointInstanceType = endpointInstanceType;
		if(endpointInstanceType != null){
			putQueryParameter("EndpointInstanceType", endpointInstanceType);
		}
	}

	public String getDtsInstanceId() {
		return this.dtsInstanceId;
	}

	public void setDtsInstanceId(String dtsInstanceId) {
		this.dtsInstanceId = dtsInstanceId;
		if(dtsInstanceId != null){
			putQueryParameter("DtsInstanceId", dtsInstanceId);
		}
	}

	@Override
	public Class<InitDtsRdsInstanceResponse> getResponseClass() {
		return InitDtsRdsInstanceResponse.class;
	}

}

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
public class DescribeHardwareTerminalsRequest extends RpcAcsRequest<DescribeHardwareTerminalsResponse> {
	   

	private String hardwareVersion;

	private String hardwareType;
	public DescribeHardwareTerminalsRequest() {
		super("ecd", "2020-09-30", "DescribeHardwareTerminals");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHardwareVersion() {
		return this.hardwareVersion;
	}

	public void setHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
		if(hardwareVersion != null){
			putQueryParameter("HardwareVersion", hardwareVersion);
		}
	}

	public String getHardwareType() {
		return this.hardwareType;
	}

	public void setHardwareType(String hardwareType) {
		this.hardwareType = hardwareType;
		if(hardwareType != null){
			putQueryParameter("HardwareType", hardwareType);
		}
	}

	@Override
	public Class<DescribeHardwareTerminalsResponse> getResponseClass() {
		return DescribeHardwareTerminalsResponse.class;
	}

}

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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SwitchDBInstanceHARequest extends RpcAcsRequest<SwitchDBInstanceHAResponse> {
	   

	private String dBInstanceName;

	private String switchTimeMode;

	private String switchTime;

	private String targetPrimaryRegionId;

	private String targetPrimaryAzoneId;
	public SwitchDBInstanceHARequest() {
		super("polardbx", "2020-02-02", "SwitchDBInstanceHA", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
		}
	}

	public String getSwitchTimeMode() {
		return this.switchTimeMode;
	}

	public void setSwitchTimeMode(String switchTimeMode) {
		this.switchTimeMode = switchTimeMode;
		if(switchTimeMode != null){
			putQueryParameter("SwitchTimeMode", switchTimeMode);
		}
	}

	public String getSwitchTime() {
		return this.switchTime;
	}

	public void setSwitchTime(String switchTime) {
		this.switchTime = switchTime;
		if(switchTime != null){
			putQueryParameter("SwitchTime", switchTime);
		}
	}

	public String getTargetPrimaryRegionId() {
		return this.targetPrimaryRegionId;
	}

	public void setTargetPrimaryRegionId(String targetPrimaryRegionId) {
		this.targetPrimaryRegionId = targetPrimaryRegionId;
		if(targetPrimaryRegionId != null){
			putQueryParameter("TargetPrimaryRegionId", targetPrimaryRegionId);
		}
	}

	public String getTargetPrimaryAzoneId() {
		return this.targetPrimaryAzoneId;
	}

	public void setTargetPrimaryAzoneId(String targetPrimaryAzoneId) {
		this.targetPrimaryAzoneId = targetPrimaryAzoneId;
		if(targetPrimaryAzoneId != null){
			putQueryParameter("TargetPrimaryAzoneId", targetPrimaryAzoneId);
		}
	}

	@Override
	public Class<SwitchDBInstanceHAResponse> getResponseClass() {
		return SwitchDBInstanceHAResponse.class;
	}

}

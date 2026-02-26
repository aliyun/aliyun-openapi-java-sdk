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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpgradeDBVersionRequest extends RpcAcsRequest<UpgradeDBVersionResponse> {
	   

	private String switchTimeMode;

	private String dBInstanceId;

	private String switchTime;

	private String majorVersion;

	private String minorVersion;

	private Long ownerId;
	public UpgradeDBVersionRequest() {
		super("gpdb", "2016-05-03", "UpgradeDBVersion", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
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

	public String getMajorVersion() {
		return this.majorVersion;
	}

	public void setMajorVersion(String majorVersion) {
		this.majorVersion = majorVersion;
		if(majorVersion != null){
			putQueryParameter("MajorVersion", majorVersion);
		}
	}

	public String getMinorVersion() {
		return this.minorVersion;
	}

	public void setMinorVersion(String minorVersion) {
		this.minorVersion = minorVersion;
		if(minorVersion != null){
			putQueryParameter("MinorVersion", minorVersion);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<UpgradeDBVersionResponse> getResponseClass() {
		return UpgradeDBVersionResponse.class;
	}

}

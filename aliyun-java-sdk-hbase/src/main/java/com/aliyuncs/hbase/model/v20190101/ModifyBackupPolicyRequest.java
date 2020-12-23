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

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbase.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyBackupPolicyRequest extends RpcAcsRequest<ModifyBackupPolicyResponse> {
	   

	private String preferredBackupEndTimeUTC;

	private String preferredBackupStartTimeUTC;

	private String preferredBackupPeriod;

	private String clusterId;

	private String preferredBackupTime;
	public ModifyBackupPolicyRequest() {
		super("HBase", "2019-01-01", "ModifyBackupPolicy", "hbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPreferredBackupEndTimeUTC() {
		return this.preferredBackupEndTimeUTC;
	}

	public void setPreferredBackupEndTimeUTC(String preferredBackupEndTimeUTC) {
		this.preferredBackupEndTimeUTC = preferredBackupEndTimeUTC;
		if(preferredBackupEndTimeUTC != null){
			putQueryParameter("PreferredBackupEndTimeUTC", preferredBackupEndTimeUTC);
		}
	}

	public String getPreferredBackupStartTimeUTC() {
		return this.preferredBackupStartTimeUTC;
	}

	public void setPreferredBackupStartTimeUTC(String preferredBackupStartTimeUTC) {
		this.preferredBackupStartTimeUTC = preferredBackupStartTimeUTC;
		if(preferredBackupStartTimeUTC != null){
			putQueryParameter("PreferredBackupStartTimeUTC", preferredBackupStartTimeUTC);
		}
	}

	public String getPreferredBackupPeriod() {
		return this.preferredBackupPeriod;
	}

	public void setPreferredBackupPeriod(String preferredBackupPeriod) {
		this.preferredBackupPeriod = preferredBackupPeriod;
		if(preferredBackupPeriod != null){
			putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getPreferredBackupTime() {
		return this.preferredBackupTime;
	}

	public void setPreferredBackupTime(String preferredBackupTime) {
		this.preferredBackupTime = preferredBackupTime;
		if(preferredBackupTime != null){
			putQueryParameter("PreferredBackupTime", preferredBackupTime);
		}
	}

	@Override
	public Class<ModifyBackupPolicyResponse> getResponseClass() {
		return ModifyBackupPolicyResponse.class;
	}

}

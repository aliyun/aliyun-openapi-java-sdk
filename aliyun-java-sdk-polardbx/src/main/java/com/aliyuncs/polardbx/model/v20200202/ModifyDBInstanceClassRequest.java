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
public class ModifyDBInstanceClassRequest extends RpcAcsRequest<ModifyDBInstanceClassResponse> {
	   

	private String specifiedDNSpecMapJson;

	private String cnClass;

	private String targetDBInstanceClass;

	private Boolean specifiedDNScale;

	private String dBInstanceName;

	private String clientToken;

	private String switchTimeMode;

	private String switchTime;

	private String dnClass;
	public ModifyDBInstanceClassRequest() {
		super("polardbx", "2020-02-02", "ModifyDBInstanceClass", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSpecifiedDNSpecMapJson() {
		return this.specifiedDNSpecMapJson;
	}

	public void setSpecifiedDNSpecMapJson(String specifiedDNSpecMapJson) {
		this.specifiedDNSpecMapJson = specifiedDNSpecMapJson;
		if(specifiedDNSpecMapJson != null){
			putQueryParameter("SpecifiedDNSpecMapJson", specifiedDNSpecMapJson);
		}
	}

	public String getCnClass() {
		return this.cnClass;
	}

	public void setCnClass(String cnClass) {
		this.cnClass = cnClass;
		if(cnClass != null){
			putQueryParameter("CnClass", cnClass);
		}
	}

	public String getTargetDBInstanceClass() {
		return this.targetDBInstanceClass;
	}

	public void setTargetDBInstanceClass(String targetDBInstanceClass) {
		this.targetDBInstanceClass = targetDBInstanceClass;
		if(targetDBInstanceClass != null){
			putQueryParameter("TargetDBInstanceClass", targetDBInstanceClass);
		}
	}

	public Boolean getSpecifiedDNScale() {
		return this.specifiedDNScale;
	}

	public void setSpecifiedDNScale(Boolean specifiedDNScale) {
		this.specifiedDNScale = specifiedDNScale;
		if(specifiedDNScale != null){
			putQueryParameter("SpecifiedDNScale", specifiedDNScale.toString());
		}
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public String getDnClass() {
		return this.dnClass;
	}

	public void setDnClass(String dnClass) {
		this.dnClass = dnClass;
		if(dnClass != null){
			putQueryParameter("DnClass", dnClass);
		}
	}

	@Override
	public Class<ModifyDBInstanceClassResponse> getResponseClass() {
		return ModifyDBInstanceClassResponse.class;
	}

}

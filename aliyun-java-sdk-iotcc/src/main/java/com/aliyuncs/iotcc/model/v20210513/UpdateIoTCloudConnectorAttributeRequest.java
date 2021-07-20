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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateIoTCloudConnectorAttributeRequest extends RpcAcsRequest<UpdateIoTCloudConnectorAttributeResponse> {
	   

	private String clientToken;

	private String ioTCloudConnectorDescription;

	private Boolean wildcardDomainEnabled;

	private Boolean dryRun;

	private String ioTCloudConnectorId;

	private String ioTCloudConnectorName;
	public UpdateIoTCloudConnectorAttributeRequest() {
		super("IoTCC", "2021-05-13", "UpdateIoTCloudConnectorAttribute", "cciot");
		setMethod(MethodType.POST);
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

	public String getIoTCloudConnectorDescription() {
		return this.ioTCloudConnectorDescription;
	}

	public void setIoTCloudConnectorDescription(String ioTCloudConnectorDescription) {
		this.ioTCloudConnectorDescription = ioTCloudConnectorDescription;
		if(ioTCloudConnectorDescription != null){
			putQueryParameter("IoTCloudConnectorDescription", ioTCloudConnectorDescription);
		}
	}

	public Boolean getWildcardDomainEnabled() {
		return this.wildcardDomainEnabled;
	}

	public void setWildcardDomainEnabled(Boolean wildcardDomainEnabled) {
		this.wildcardDomainEnabled = wildcardDomainEnabled;
		if(wildcardDomainEnabled != null){
			putQueryParameter("WildcardDomainEnabled", wildcardDomainEnabled.toString());
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getIoTCloudConnectorId() {
		return this.ioTCloudConnectorId;
	}

	public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
		this.ioTCloudConnectorId = ioTCloudConnectorId;
		if(ioTCloudConnectorId != null){
			putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
		}
	}

	public String getIoTCloudConnectorName() {
		return this.ioTCloudConnectorName;
	}

	public void setIoTCloudConnectorName(String ioTCloudConnectorName) {
		this.ioTCloudConnectorName = ioTCloudConnectorName;
		if(ioTCloudConnectorName != null){
			putQueryParameter("IoTCloudConnectorName", ioTCloudConnectorName);
		}
	}

	@Override
	public Class<UpdateIoTCloudConnectorAttributeResponse> getResponseClass() {
		return UpdateIoTCloudConnectorAttributeResponse.class;
	}

}

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
public class CreateIoTCloudConnectorRequest extends RpcAcsRequest<CreateIoTCloudConnectorResponse> {
	   

	private String clientToken;

	private String iSP;

	private String ioTCloudConnectorDescription;

	private Boolean wildcardDomainEnabled;

	private String aPN;

	private Boolean dryRun;

	private String ioTCloudConnectorName;
	public CreateIoTCloudConnectorRequest() {
		super("IoTCC", "2021-05-13", "CreateIoTCloudConnector", "cciot");
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

	public String getISP() {
		return this.iSP;
	}

	public void setISP(String iSP) {
		this.iSP = iSP;
		if(iSP != null){
			putQueryParameter("ISP", iSP);
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

	public String getAPN() {
		return this.aPN;
	}

	public void setAPN(String aPN) {
		this.aPN = aPN;
		if(aPN != null){
			putQueryParameter("APN", aPN);
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
	public Class<CreateIoTCloudConnectorResponse> getResponseClass() {
		return CreateIoTCloudConnectorResponse.class;
	}

}

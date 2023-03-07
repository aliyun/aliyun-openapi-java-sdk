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
public class CreateIpMappingRuleRequest extends RpcAcsRequest<CreateIpMappingRuleResponse> {
	   

	private String clientToken;

	private String ipMappingRuleName;

	private Boolean dryRun;

	private String ipMappingRuleDescription;

	private String destinationIp;

	private String ioTCloudConnectorId;

	private String mappingIp;
	public CreateIpMappingRuleRequest() {
		super("IoTCC", "2021-05-13", "CreateIpMappingRule", "IoTCC");
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

	public String getIpMappingRuleName() {
		return this.ipMappingRuleName;
	}

	public void setIpMappingRuleName(String ipMappingRuleName) {
		this.ipMappingRuleName = ipMappingRuleName;
		if(ipMappingRuleName != null){
			putQueryParameter("IpMappingRuleName", ipMappingRuleName);
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

	public String getIpMappingRuleDescription() {
		return this.ipMappingRuleDescription;
	}

	public void setIpMappingRuleDescription(String ipMappingRuleDescription) {
		this.ipMappingRuleDescription = ipMappingRuleDescription;
		if(ipMappingRuleDescription != null){
			putQueryParameter("IpMappingRuleDescription", ipMappingRuleDescription);
		}
	}

	public String getDestinationIp() {
		return this.destinationIp;
	}

	public void setDestinationIp(String destinationIp) {
		this.destinationIp = destinationIp;
		if(destinationIp != null){
			putQueryParameter("DestinationIp", destinationIp);
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

	public String getMappingIp() {
		return this.mappingIp;
	}

	public void setMappingIp(String mappingIp) {
		this.mappingIp = mappingIp;
		if(mappingIp != null){
			putQueryParameter("MappingIp", mappingIp);
		}
	}

	@Override
	public Class<CreateIpMappingRuleResponse> getResponseClass() {
		return CreateIpMappingRuleResponse.class;
	}

}

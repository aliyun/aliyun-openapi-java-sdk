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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateNetworkInsightsPathRequest extends RpcAcsRequest<CreateNetworkInsightsPathResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String destination;

	private String destinationType;

	private String source;

	private String networkInsightsPathName;

	private String protocol;

	private String sourceType;

	private Boolean dryRun;

	private Integer aPIVersion;

	private Boolean needDiagnoseGuest;

	private String destinationPort;
	public CreateNetworkInsightsPathRequest() {
		super("Ecs", "2016-03-14", "CreateNetworkInsightsPath", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
		if(destination != null){
			putQueryParameter("Destination", destination);
		}
	}

	public String getDestinationType() {
		return this.destinationType;
	}

	public void setDestinationType(String destinationType) {
		this.destinationType = destinationType;
		if(destinationType != null){
			putQueryParameter("DestinationType", destinationType);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getNetworkInsightsPathName() {
		return this.networkInsightsPathName;
	}

	public void setNetworkInsightsPathName(String networkInsightsPathName) {
		this.networkInsightsPathName = networkInsightsPathName;
		if(networkInsightsPathName != null){
			putQueryParameter("NetworkInsightsPathName", networkInsightsPathName);
		}
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
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

	public Integer getAPIVersion() {
		return this.aPIVersion;
	}

	public void setAPIVersion(Integer aPIVersion) {
		this.aPIVersion = aPIVersion;
		if(aPIVersion != null){
			putQueryParameter("APIVersion", aPIVersion.toString());
		}
	}

	public Boolean getNeedDiagnoseGuest() {
		return this.needDiagnoseGuest;
	}

	public void setNeedDiagnoseGuest(Boolean needDiagnoseGuest) {
		this.needDiagnoseGuest = needDiagnoseGuest;
		if(needDiagnoseGuest != null){
			putQueryParameter("NeedDiagnoseGuest", needDiagnoseGuest.toString());
		}
	}

	public String getDestinationPort() {
		return this.destinationPort;
	}

	public void setDestinationPort(String destinationPort) {
		this.destinationPort = destinationPort;
		if(destinationPort != null){
			putQueryParameter("DestinationPort", destinationPort);
		}
	}

	@Override
	public Class<CreateNetworkInsightsPathResponse> getResponseClass() {
		return CreateNetworkInsightsPathResponse.class;
	}

}

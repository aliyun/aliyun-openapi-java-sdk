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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.baas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitFabricChaincodeDefinitionRequest extends RpcAcsRequest<SubmitFabricChaincodeDefinitionResponse> {
	   

	private String chaincodeVersion;

	private String chaincodePackageId;

	private String endorsePolicy;

	private String organizationId;

	private String collectionConfig;

	private String name;

	private String location;

	private Boolean initRequired;

	private String channelId;
	public SubmitFabricChaincodeDefinitionRequest() {
		super("Baas", "2018-12-21", "SubmitFabricChaincodeDefinition", "baas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getChaincodeVersion() {
		return this.chaincodeVersion;
	}

	public void setChaincodeVersion(String chaincodeVersion) {
		this.chaincodeVersion = chaincodeVersion;
		if(chaincodeVersion != null){
			putBodyParameter("ChaincodeVersion", chaincodeVersion);
		}
	}

	public String getChaincodePackageId() {
		return this.chaincodePackageId;
	}

	public void setChaincodePackageId(String chaincodePackageId) {
		this.chaincodePackageId = chaincodePackageId;
		if(chaincodePackageId != null){
			putBodyParameter("ChaincodePackageId", chaincodePackageId);
		}
	}

	public String getEndorsePolicy() {
		return this.endorsePolicy;
	}

	public void setEndorsePolicy(String endorsePolicy) {
		this.endorsePolicy = endorsePolicy;
		if(endorsePolicy != null){
			putBodyParameter("EndorsePolicy", endorsePolicy);
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putBodyParameter("OrganizationId", organizationId);
		}
	}

	public String getCollectionConfig() {
		return this.collectionConfig;
	}

	public void setCollectionConfig(String collectionConfig) {
		this.collectionConfig = collectionConfig;
		if(collectionConfig != null){
			putBodyParameter("CollectionConfig", collectionConfig);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putBodyParameter("Location", location);
		}
	}

	public Boolean getInitRequired() {
		return this.initRequired;
	}

	public void setInitRequired(Boolean initRequired) {
		this.initRequired = initRequired;
		if(initRequired != null){
			putBodyParameter("InitRequired", initRequired.toString());
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putBodyParameter("ChannelId", channelId);
		}
	}

	@Override
	public Class<SubmitFabricChaincodeDefinitionResponse> getResponseClass() {
		return SubmitFabricChaincodeDefinitionResponse.class;
	}

}

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

package com.aliyuncs.baas.model.v20180731;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateEcosphereRequest extends RpcAcsRequest<CreateEcosphereResponse> {
	
	public CreateEcosphereRequest() {
		super("Baas", "2018-07-31", "CreateEcosphere");
	}

	private Integer orderersCount;

	private String consortiumName;

	private String specName;

	private List<Organization> organizations;

	private String zoneId;

	private String ordererType;

	private String description;

	private String ordererDomain;

	private String location;

	private Integer peersCount;

	private String channelPolicy;

	public Integer getOrderersCount() {
		return this.orderersCount;
	}

	public void setOrderersCount(Integer orderersCount) {
		this.orderersCount = orderersCount;
		if(orderersCount != null){
			putBodyParameter("OrderersCount", orderersCount.toString());
		}
	}

	public String getConsortiumName() {
		return this.consortiumName;
	}

	public void setConsortiumName(String consortiumName) {
		this.consortiumName = consortiumName;
		if(consortiumName != null){
			putBodyParameter("ConsortiumName", consortiumName);
		}
	}

	public String getSpecName() {
		return this.specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
		if(specName != null){
			putBodyParameter("SpecName", specName);
		}
	}

	public List<Organization> getOrganizations() {
		return this.organizations;
	}

	public void setOrganizations(List<Organization> organizations) {
		this.organizations = organizations;	
		if (organizations != null) {
			for (int depth1 = 0; depth1 < organizations.size(); depth1++) {
				putBodyParameter("Organization." + (depth1 + 1) + ".Domain" , organizations.get(depth1).getDomain());
				putBodyParameter("Organization." + (depth1 + 1) + ".Name" , organizations.get(depth1).getName());
				putBodyParameter("Organization." + (depth1 + 1) + ".Description" , organizations.get(depth1).getDescription());
			}
		}	
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putBodyParameter("ZoneId", zoneId);
		}
	}

	public String getOrdererType() {
		return this.ordererType;
	}

	public void setOrdererType(String ordererType) {
		this.ordererType = ordererType;
		if(ordererType != null){
			putBodyParameter("OrdererType", ordererType);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getOrdererDomain() {
		return this.ordererDomain;
	}

	public void setOrdererDomain(String ordererDomain) {
		this.ordererDomain = ordererDomain;
		if(ordererDomain != null){
			putBodyParameter("OrdererDomain", ordererDomain);
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

	public Integer getPeersCount() {
		return this.peersCount;
	}

	public void setPeersCount(Integer peersCount) {
		this.peersCount = peersCount;
		if(peersCount != null){
			putBodyParameter("PeersCount", peersCount.toString());
		}
	}

	public String getChannelPolicy() {
		return this.channelPolicy;
	}

	public void setChannelPolicy(String channelPolicy) {
		this.channelPolicy = channelPolicy;
		if(channelPolicy != null){
			putBodyParameter("ChannelPolicy", channelPolicy);
		}
	}

	public static class Organization {

		private String domain;

		private String name;

		private String description;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public Class<CreateEcosphereResponse> getResponseClass() {
		return CreateEcosphereResponse.class;
	}

}

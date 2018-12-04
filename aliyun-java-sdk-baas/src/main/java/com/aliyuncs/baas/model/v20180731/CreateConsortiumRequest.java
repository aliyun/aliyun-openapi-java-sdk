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
public class CreateConsortiumRequest extends RpcAcsRequest<CreateConsortiumResponse> {
	
	public CreateConsortiumRequest() {
		super("Baas", "2018-07-31", "CreateConsortium");
	}

	private Integer orderersCount;

	private String domain;

	private String specName;

	private List<Organization> organizations;

	private String name;

	private String ordererType;

	private String zoneId;

	private String description;

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

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putBodyParameter("Domain", domain);
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
				putBodyParameter("Organization." + (depth1 + 1) + ".Id" , organizations.get(depth1).getId());
			}
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

	public String getOrdererType() {
		return this.ordererType;
	}

	public void setOrdererType(String ordererType) {
		this.ordererType = ordererType;
		if(ordererType != null){
			putBodyParameter("OrdererType", ordererType);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
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

		private String id;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public Class<CreateConsortiumResponse> getResponseClass() {
		return CreateConsortiumResponse.class;
	}

}

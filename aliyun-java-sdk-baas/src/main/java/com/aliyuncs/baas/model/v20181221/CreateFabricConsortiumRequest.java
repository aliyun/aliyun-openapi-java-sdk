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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateFabricConsortiumRequest extends RpcAcsRequest<CreateFabricConsortiumResponse> {
	   

	private Integer orderersCount;

	private String consortiumName;

	private String specName;

	private String channelPolicy;

	private Integer paymentDuration;

	private String domain;

	private String consortiumDescription;

	private List<Organization> organizations;

	private String ordererType;

	private String zoneId;

	private String location;

	private String paymentDurationUnit;

	private Integer peersCount;
	public CreateFabricConsortiumRequest() {
		super("Baas", "2018-12-21", "CreateFabricConsortium", "baas");
		setMethod(MethodType.PUT);
	}

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

	public String getChannelPolicy() {
		return this.channelPolicy;
	}

	public void setChannelPolicy(String channelPolicy) {
		this.channelPolicy = channelPolicy;
		if(channelPolicy != null){
			putBodyParameter("ChannelPolicy", channelPolicy);
		}
	}

	public Integer getPaymentDuration() {
		return this.paymentDuration;
	}

	public void setPaymentDuration(Integer paymentDuration) {
		this.paymentDuration = paymentDuration;
		if(paymentDuration != null){
			putBodyParameter("PaymentDuration", paymentDuration.toString());
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

	public String getConsortiumDescription() {
		return this.consortiumDescription;
	}

	public void setConsortiumDescription(String consortiumDescription) {
		this.consortiumDescription = consortiumDescription;
		if(consortiumDescription != null){
			putBodyParameter("ConsortiumDescription", consortiumDescription);
		}
	}

	public List<Organization> getOrganizations() {
		return this.organizations;
	}

	public void setOrganizations(List<Organization> organizations) {
		this.organizations = organizations;	
		if (organizations != null) {
			for (int depth1 = 0; depth1 < organizations.size(); depth1++) {
				putBodyParameter("Organization." + (depth1 + 1) + ".OrganizationId" , organizations.get(depth1).getOrganizationId());
			}
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

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putBodyParameter("Location", location);
		}
	}

	public String getPaymentDurationUnit() {
		return this.paymentDurationUnit;
	}

	public void setPaymentDurationUnit(String paymentDurationUnit) {
		this.paymentDurationUnit = paymentDurationUnit;
		if(paymentDurationUnit != null){
			putBodyParameter("PaymentDurationUnit", paymentDurationUnit);
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

	public static class Organization {

		private String organizationId;

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}
	}

	@Override
	public Class<CreateFabricConsortiumResponse> getResponseClass() {
		return CreateFabricConsortiumResponse.class;
	}

}

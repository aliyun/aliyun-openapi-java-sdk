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

/**
 * @author auto create
 * @version 
 */
public class CreateFabricOrganizationRequest extends RpcAcsRequest<CreateFabricOrganizationResponse> {
	   

	private String description;

	private String specName;

	private Integer paymentDuration;

	private String organizationName;

	private String domain;

	private String location;

	private String paymentDurationUnit;

	private Integer peersCount;
	public CreateFabricOrganizationRequest() {
		super("Baas", "2018-12-21", "CreateFabricOrganization", "baas");
		setMethod(MethodType.PUT);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getSpecName() {
		return this.specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
		if(specName != null){
			putQueryParameter("SpecName", specName);
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

	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
		if(organizationName != null){
			putQueryParameter("OrganizationName", organizationName);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putQueryParameter("Location", location);
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

	@Override
	public Class<CreateFabricOrganizationResponse> getResponseClass() {
		return CreateFabricOrganizationResponse.class;
	}

}

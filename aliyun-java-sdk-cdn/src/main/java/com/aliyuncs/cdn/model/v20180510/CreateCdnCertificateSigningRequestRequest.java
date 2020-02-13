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

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCdnCertificateSigningRequestRequest extends RpcAcsRequest<CreateCdnCertificateSigningRequestResponse> {
	   

	private String country;

	private String city;

	private String commonName;

	private String state;

	private String email;

	private String sANs;

	private Long ownerId;

	private String organization;

	private String organizationUnit;
	public CreateCdnCertificateSigningRequestRequest() {
		super("Cdn", "2018-05-10", "CreateCdnCertificateSigningRequest");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putQueryParameter("Country", country);
		}
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
		if(city != null){
			putQueryParameter("City", city);
		}
	}

	public String getCommonName() {
		return this.commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
		if(commonName != null){
			putQueryParameter("CommonName", commonName);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	public String getSANs() {
		return this.sANs;
	}

	public void setSANs(String sANs) {
		this.sANs = sANs;
		if(sANs != null){
			putQueryParameter("SANs", sANs);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
		if(organization != null){
			putQueryParameter("Organization", organization);
		}
	}

	public String getOrganizationUnit() {
		return this.organizationUnit;
	}

	public void setOrganizationUnit(String organizationUnit) {
		this.organizationUnit = organizationUnit;
		if(organizationUnit != null){
			putQueryParameter("OrganizationUnit", organizationUnit);
		}
	}

	@Override
	public Class<CreateCdnCertificateSigningRequestResponse> getResponseClass() {
		return CreateCdnCertificateSigningRequestResponse.class;
	}

}

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

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RequestBdTrialRequest extends RpcAcsRequest<RequestBdTrialResponse> {
	
	public RequestBdTrialRequest() {
		super("hdr", "2017-09-25", "RequestBdTrial", "hdr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String contact;

	private String company;

	private String telephone;

	private Long dataSize;

	private String detail;

	private String distribution;

	private String version;

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
		if(contact != null){
			putQueryParameter("Contact", contact);
		}
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
		if(company != null){
			putQueryParameter("Company", company);
		}
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
		if(telephone != null){
			putQueryParameter("Telephone", telephone);
		}
	}

	public Long getDataSize() {
		return this.dataSize;
	}

	public void setDataSize(Long dataSize) {
		this.dataSize = dataSize;
		if(dataSize != null){
			putQueryParameter("DataSize", dataSize.toString());
		}
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
		if(detail != null){
			putQueryParameter("Detail", detail);
		}
	}

	public String getDistribution() {
		return this.distribution;
	}

	public void setDistribution(String distribution) {
		this.distribution = distribution;
		if(distribution != null){
			putQueryParameter("Distribution", distribution);
		}
	}

	public String getBizVersion() {
		return this.version;
	}

	public void setBizVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	/**
	 * @deprecated use getBizVersion instead of this.
	 */
	@Deprecated
	public String getVersion() {
		return this.version;
	}

	/**
	 * @deprecated use setBizVersion instead of this.
	 */
	@Deprecated
	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	@Override
	public Class<RequestBdTrialResponse> getResponseClass() {
		return RequestBdTrialResponse.class;
	}

}

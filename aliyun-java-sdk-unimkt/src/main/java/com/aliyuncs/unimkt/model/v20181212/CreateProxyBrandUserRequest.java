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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateProxyBrandUserRequest extends RpcAcsRequest<CreateProxyBrandUserResponse> {
	   

	private String contactName;

	private String clientToken;

	private String company;

	private String industry;

	private String brandUserNick;

	private String contactPhone;

	private Long proxyUserId;

	private String channelId;
	public CreateProxyBrandUserRequest() {
		super("UniMkt", "2018-12-12", "CreateProxyBrandUser", "uniMkt");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putQueryParameter("ContactName", contactName);
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

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
		if(company != null){
			putQueryParameter("Company", company);
		}
	}

	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
		if(industry != null){
			putQueryParameter("Industry", industry);
		}
	}

	public String getBrandUserNick() {
		return this.brandUserNick;
	}

	public void setBrandUserNick(String brandUserNick) {
		this.brandUserNick = brandUserNick;
		if(brandUserNick != null){
			putQueryParameter("BrandUserNick", brandUserNick);
		}
	}

	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
		if(contactPhone != null){
			putQueryParameter("ContactPhone", contactPhone);
		}
	}

	public Long getProxyUserId() {
		return this.proxyUserId;
	}

	public void setProxyUserId(Long proxyUserId) {
		this.proxyUserId = proxyUserId;
		if(proxyUserId != null){
			putQueryParameter("ProxyUserId", proxyUserId.toString());
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId);
		}
	}

	@Override
	public Class<CreateProxyBrandUserResponse> getResponseClass() {
		return CreateProxyBrandUserResponse.class;
	}

}

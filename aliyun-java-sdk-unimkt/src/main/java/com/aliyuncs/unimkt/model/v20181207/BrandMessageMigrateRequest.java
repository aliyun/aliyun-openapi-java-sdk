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

package com.aliyuncs.unimkt.model.v20181207;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BrandMessageMigrateRequest extends RpcAcsRequest<BrandMessageMigrateResponse> {
	   

	private String brandUserId;

	private String brandUserNick;

	private String industry;

	private String proxyUserId;

	private String userId;

	private String contactName;

	private String accountNo;

	private String company;

	private String proxyUserNick;

	private String contactPhone;
	public BrandMessageMigrateRequest() {
		super("UniMkt", "2018-12-07", "BrandMessageMigrate", "1.0.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBrandUserId() {
		return this.brandUserId;
	}

	public void setBrandUserId(String brandUserId) {
		this.brandUserId = brandUserId;
		if(brandUserId != null){
			putBodyParameter("BrandUserId", brandUserId);
		}
	}

	public String getBrandUserNick() {
		return this.brandUserNick;
	}

	public void setBrandUserNick(String brandUserNick) {
		this.brandUserNick = brandUserNick;
		if(brandUserNick != null){
			putBodyParameter("BrandUserNick", brandUserNick);
		}
	}

	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
		if(industry != null){
			putBodyParameter("Industry", industry);
		}
	}

	public String getProxyUserId() {
		return this.proxyUserId;
	}

	public void setProxyUserId(String proxyUserId) {
		this.proxyUserId = proxyUserId;
		if(proxyUserId != null){
			putBodyParameter("ProxyUserId", proxyUserId);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putBodyParameter("ContactName", contactName);
		}
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
		if(accountNo != null){
			putBodyParameter("AccountNo", accountNo);
		}
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
		if(company != null){
			putBodyParameter("Company", company);
		}
	}

	public String getProxyUserNick() {
		return this.proxyUserNick;
	}

	public void setProxyUserNick(String proxyUserNick) {
		this.proxyUserNick = proxyUserNick;
		if(proxyUserNick != null){
			putBodyParameter("ProxyUserNick", proxyUserNick);
		}
	}

	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
		if(contactPhone != null){
			putBodyParameter("ContactPhone", contactPhone);
		}
	}

	@Override
	public Class<BrandMessageMigrateResponse> getResponseClass() {
		return BrandMessageMigrateResponse.class;
	}

}

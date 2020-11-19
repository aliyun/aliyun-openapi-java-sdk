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

package com.aliyuncs.ipam.model.v20201023;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetIpLocationRequest extends RoaAcsRequest<GetIpLocationResponse> {
	   

	private String country;

	private String xHmacAuthNonce;

	private String city;

	private String xHmacAuthTimestamp;

	private String prefix;

	private Integer pageSize;

	private String resourcePoolName;

	private Integer page;

	private String xHmacAuthSecretId;

	private String xHmacAuthSignature;
	public GetIpLocationRequest() {
		super("ipam", "2020-10-23", "GetIpLocation");
		setUriPattern("/ip/api/ipLocation.json");
		setMethod(MethodType.POST);
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putQueryParameter("country", country);
		}
	}

	public String getXHmacAuthNonce() {
		return this.xHmacAuthNonce;
	}

	public void setXHmacAuthNonce(String xHmacAuthNonce) {
		this.xHmacAuthNonce = xHmacAuthNonce;
		if(xHmacAuthNonce != null){
			putHeaderParameter("X-Hmac-Auth-Nonce", xHmacAuthNonce);
		}
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
		if(city != null){
			putQueryParameter("city", city);
		}
	}

	public String getXHmacAuthTimestamp() {
		return this.xHmacAuthTimestamp;
	}

	public void setXHmacAuthTimestamp(String xHmacAuthTimestamp) {
		this.xHmacAuthTimestamp = xHmacAuthTimestamp;
		if(xHmacAuthTimestamp != null){
			putHeaderParameter("X-Hmac-Auth-Timestamp", xHmacAuthTimestamp);
		}
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
		if(prefix != null){
			putQueryParameter("prefix", prefix);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("pageSize", pageSize.toString());
		}
	}

	public String getResourcePoolName() {
		return this.resourcePoolName;
	}

	public void setResourcePoolName(String resourcePoolName) {
		this.resourcePoolName = resourcePoolName;
		if(resourcePoolName != null){
			putQueryParameter("resourcePoolName", resourcePoolName);
		}
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putQueryParameter("page", page.toString());
		}
	}

	public String getXHmacAuthSecretId() {
		return this.xHmacAuthSecretId;
	}

	public void setXHmacAuthSecretId(String xHmacAuthSecretId) {
		this.xHmacAuthSecretId = xHmacAuthSecretId;
		if(xHmacAuthSecretId != null){
			putHeaderParameter("X-Hmac-Auth-Secret-Id", xHmacAuthSecretId);
		}
	}

	public String getXHmacAuthSignature() {
		return this.xHmacAuthSignature;
	}

	public void setXHmacAuthSignature(String xHmacAuthSignature) {
		this.xHmacAuthSignature = xHmacAuthSignature;
		if(xHmacAuthSignature != null){
			putHeaderParameter("X-Hmac-Auth-Signature", xHmacAuthSignature);
		}
	}

	@Override
	public Class<GetIpLocationResponse> getResponseClass() {
		return GetIpLocationResponse.class;
	}

}

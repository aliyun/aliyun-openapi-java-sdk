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

package com.aliyuncs.address_purification.model.v20191118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.address_purification.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAddressSearchRequest extends RpcAcsRequest<GetAddressSearchResponse> {
	   

	private String defaultProvince;

	private String serviceCode;

	private String defaultCity;

	private String defaultDistrict;

	private String appKey;

	private String text;
	public GetAddressSearchRequest() {
		super("address-purification", "2019-11-18", "GetAddressSearch", "addrp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDefaultProvince() {
		return this.defaultProvince;
	}

	public void setDefaultProvince(String defaultProvince) {
		this.defaultProvince = defaultProvince;
		if(defaultProvince != null){
			putBodyParameter("DefaultProvince", defaultProvince);
		}
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		if(serviceCode != null){
			putBodyParameter("ServiceCode", serviceCode);
		}
	}

	public String getDefaultCity() {
		return this.defaultCity;
	}

	public void setDefaultCity(String defaultCity) {
		this.defaultCity = defaultCity;
		if(defaultCity != null){
			putBodyParameter("DefaultCity", defaultCity);
		}
	}

	public String getDefaultDistrict() {
		return this.defaultDistrict;
	}

	public void setDefaultDistrict(String defaultDistrict) {
		this.defaultDistrict = defaultDistrict;
		if(defaultDistrict != null){
			putBodyParameter("DefaultDistrict", defaultDistrict);
		}
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putBodyParameter("AppKey", appKey);
		}
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putBodyParameter("Text", text);
		}
	}

	@Override
	public Class<GetAddressSearchResponse> getResponseClass() {
		return GetAddressSearchResponse.class;
	}

}

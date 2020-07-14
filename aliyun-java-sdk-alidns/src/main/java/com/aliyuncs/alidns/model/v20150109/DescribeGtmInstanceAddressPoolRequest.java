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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alidns.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeGtmInstanceAddressPoolRequest extends RpcAcsRequest<DescribeGtmInstanceAddressPoolResponse> {
	   

	private String addrPoolId;

	private String lang;
	public DescribeGtmInstanceAddressPoolRequest() {
		super("Alidns", "2015-01-09", "DescribeGtmInstanceAddressPool", "alidns");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAddrPoolId() {
		return this.addrPoolId;
	}

	public void setAddrPoolId(String addrPoolId) {
		this.addrPoolId = addrPoolId;
		if(addrPoolId != null){
			putQueryParameter("AddrPoolId", addrPoolId);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<DescribeGtmInstanceAddressPoolResponse> getResponseClass() {
		return DescribeGtmInstanceAddressPoolResponse.class;
	}

}

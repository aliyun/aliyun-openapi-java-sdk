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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dcdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnSecFuncInfoRequest extends RpcAcsRequest<DescribeDcdnSecFuncInfoResponse> {
	   

	private String lang;

	private Long ownerId;

	private String secFuncType;
	public DescribeDcdnSecFuncInfoRequest() {
		super("dcdn", "2018-01-15", "DescribeDcdnSecFuncInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getSecFuncType() {
		return this.secFuncType;
	}

	public void setSecFuncType(String secFuncType) {
		this.secFuncType = secFuncType;
		if(secFuncType != null){
			putQueryParameter("SecFuncType", secFuncType);
		}
	}

	@Override
	public Class<DescribeDcdnSecFuncInfoResponse> getResponseClass() {
		return DescribeDcdnSecFuncInfoResponse.class;
	}

}

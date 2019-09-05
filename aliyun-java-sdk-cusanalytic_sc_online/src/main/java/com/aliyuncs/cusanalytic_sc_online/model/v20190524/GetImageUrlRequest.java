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

package com.aliyuncs.cusanalytic_sc_online.model.v20190524;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cusanalytic_sc_online.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetImageUrlRequest extends RpcAcsRequest<GetImageUrlResponse> {
	
	public GetImageUrlRequest() {
		super("cusanalytic_sc_online", "2019-05-24", "GetImageUrl");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String originUrls;

	private String storeId;

	private String objectKeys;

	public String getOriginUrls() {
		return this.originUrls;
	}

	public void setOriginUrls(String originUrls) {
		this.originUrls = originUrls;
		if(originUrls != null){
			putBodyParameter("OriginUrls", originUrls);
		}
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId);
		}
	}

	public String getObjectKeys() {
		return this.objectKeys;
	}

	public void setObjectKeys(String objectKeys) {
		this.objectKeys = objectKeys;
		if(objectKeys != null){
			putBodyParameter("ObjectKeys", objectKeys);
		}
	}

	@Override
	public Class<GetImageUrlResponse> getResponseClass() {
		return GetImageUrlResponse.class;
	}

}

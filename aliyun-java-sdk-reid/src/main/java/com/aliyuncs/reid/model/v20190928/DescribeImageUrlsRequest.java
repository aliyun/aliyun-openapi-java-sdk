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

package com.aliyuncs.reid.model.v20190928;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.reid.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageUrlsRequest extends RpcAcsRequest<DescribeImageUrlsResponse> {
	   

	private String originUrls;

	private Long storeId;

	private String objectKeys;
	public DescribeImageUrlsRequest() {
		super("reid", "2019-09-28", "DescribeImageUrls");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOriginUrls() {
		return this.originUrls;
	}

	public void setOriginUrls(String originUrls) {
		this.originUrls = originUrls;
		if(originUrls != null){
			putBodyParameter("OriginUrls", originUrls);
		}
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId.toString());
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
	public Class<DescribeImageUrlsResponse> getResponseClass() {
		return DescribeImageUrlsResponse.class;
	}

}

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
import com.aliyuncs.cusanalytic_sc_online.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchPersonByImgRequest extends RpcAcsRequest<SearchPersonByImgResponse> {
	
	public SearchPersonByImgRequest() {
		super("cusanalytic_sc_online", "2019-05-24", "SearchPersonByImg");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String imgUrl;

	private Long storeId;

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
		if(imgUrl != null){
			putBodyParameter("ImgUrl", imgUrl);
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

	@Override
	public Class<SearchPersonByImgResponse> getResponseClass() {
		return SearchPersonByImgResponse.class;
	}

}

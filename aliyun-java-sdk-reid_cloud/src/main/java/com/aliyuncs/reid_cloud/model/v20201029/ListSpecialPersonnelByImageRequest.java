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

package com.aliyuncs.reid_cloud.model.v20201029;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.reid_cloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSpecialPersonnelByImageRequest extends RpcAcsRequest<ListSpecialPersonnelByImageResponse> {
	   

	private Long source;

	private Long storeId;

	private String personType;

	private String imageUrl;
	public ListSpecialPersonnelByImageRequest() {
		super("reid_cloud", "2020-10-29", "ListSpecialPersonnelByImage", "1.2.2");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getSource() {
		return this.source;
	}

	public void setSource(Long source) {
		this.source = source;
		if(source != null){
			putBodyParameter("Source", source.toString());
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

	public String getPersonType() {
		return this.personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
		if(personType != null){
			putBodyParameter("PersonType", personType);
		}
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putBodyParameter("ImageUrl", imageUrl);
		}
	}

	@Override
	public Class<ListSpecialPersonnelByImageResponse> getResponseClass() {
		return ListSpecialPersonnelByImageResponse.class;
	}

}

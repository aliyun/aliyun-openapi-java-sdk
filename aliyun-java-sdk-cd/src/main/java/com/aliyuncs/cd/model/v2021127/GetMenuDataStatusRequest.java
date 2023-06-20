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

package com.aliyuncs.cd.model.v2021127;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetMenuDataStatusRequest extends RoaAcsRequest<GetMenuDataStatusResponse> {
	   

	private String country;

	private String productContainerId;

	private String batchId;
	public GetMenuDataStatusRequest() {
		super("cd", "2021-12-7", "GetMenuDataStatus");
		setUriPattern("/GetMenuDataStatus");
		setMethod(MethodType.POST);
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putBodyParameter("Country", country);
		}
	}

	public String getProductContainerId() {
		return this.productContainerId;
	}

	public void setProductContainerId(String productContainerId) {
		this.productContainerId = productContainerId;
		if(productContainerId != null){
			putBodyParameter("ProductContainerId", productContainerId);
		}
	}

	public String getBatchId() {
		return this.batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
		if(batchId != null){
			putBodyParameter("BatchId", batchId);
		}
	}

	@Override
	public Class<GetMenuDataStatusResponse> getResponseClass() {
		return GetMenuDataStatusResponse.class;
	}

}

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

package com.aliyuncs.digitalstore.model.v20200107;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.digitalstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CheckTagsRequest extends RpcAcsRequest<CheckTagsResponse> {
	   

	private String orderStatusList;

	private String tags;

	private String orderIdList;

	private String orderType;
	public CheckTagsRequest() {
		super("digitalstore", "2020-01-07", "CheckTags", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOrderStatusList() {
		return this.orderStatusList;
	}

	public void setOrderStatusList(String orderStatusList) {
		this.orderStatusList = orderStatusList;
		if(orderStatusList != null){
			putBodyParameter("OrderStatusList", orderStatusList);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putBodyParameter("Tags", tags);
		}
	}

	public String getOrderIdList() {
		return this.orderIdList;
	}

	public void setOrderIdList(String orderIdList) {
		this.orderIdList = orderIdList;
		if(orderIdList != null){
			putBodyParameter("OrderIdList", orderIdList);
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putBodyParameter("OrderType", orderType);
		}
	}

	@Override
	public Class<CheckTagsResponse> getResponseClass() {
		return CheckTagsResponse.class;
	}

}

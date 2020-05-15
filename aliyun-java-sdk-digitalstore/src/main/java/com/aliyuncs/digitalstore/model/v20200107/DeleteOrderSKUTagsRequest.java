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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.digitalstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteOrderSKUTagsRequest extends RpcAcsRequest<DeleteOrderSKUTagsResponse> {
	   

	private String orderId;

	private List<String> tagss;

	private String orderType;
	public DeleteOrderSKUTagsRequest() {
		super("digitalstore", "2020-01-07", "DeleteOrderSKUTags", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putBodyParameter("OrderId", orderId);
		}
	}

	public List<String> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<String> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int i = 0; i < tagss.size(); i++) {
				putBodyParameter("Tags." + (i + 1) , tagss.get(i));
			}
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
	public Class<DeleteOrderSKUTagsResponse> getResponseClass() {
		return DeleteOrderSKUTagsResponse.class;
	}

}

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
public class GetProduceOrderByTagRequest extends RpcAcsRequest<GetProduceOrderByTagResponse> {
	   

	private List<String> orderStatuss;

	private String tag;
	public GetProduceOrderByTagRequest() {
		super("digitalstore", "2020-01-07", "GetProduceOrderByTag", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getOrderStatuss() {
		return this.orderStatuss;
	}

	public void setOrderStatuss(List<String> orderStatuss) {
		this.orderStatuss = orderStatuss;	
		if (orderStatuss != null) {
			for (int i = 0; i < orderStatuss.size(); i++) {
				putBodyParameter("OrderStatus." + (i + 1) , orderStatuss.get(i));
			}
		}	
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putBodyParameter("Tag", tag);
		}
	}

	@Override
	public Class<GetProduceOrderByTagResponse> getResponseClass() {
		return GetProduceOrderByTagResponse.class;
	}

}

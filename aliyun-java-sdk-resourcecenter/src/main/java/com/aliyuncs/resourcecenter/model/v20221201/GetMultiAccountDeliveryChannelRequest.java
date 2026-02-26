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

package com.aliyuncs.resourcecenter.model.v20221201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetMultiAccountDeliveryChannelRequest extends RpcAcsRequest<GetMultiAccountDeliveryChannelResponse> {
	   

	private String deliveryChannelId;
	public GetMultiAccountDeliveryChannelRequest() {
		super("ResourceCenter", "2022-12-01", "GetMultiAccountDeliveryChannel");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getDeliveryChannelId() {
		return this.deliveryChannelId;
	}

	public void setDeliveryChannelId(String deliveryChannelId) {
		this.deliveryChannelId = deliveryChannelId;
		if(deliveryChannelId != null){
			putQueryParameter("DeliveryChannelId", deliveryChannelId);
		}
	}

	@Override
	public Class<GetMultiAccountDeliveryChannelResponse> getResponseClass() {
		return GetMultiAccountDeliveryChannelResponse.class;
	}

}

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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ApplyNotaryPostRequest extends RpcAcsRequest<ApplyNotaryPostResponse> {
	   

	private String receiverName;

	private String receiverPhone;

	private Long notaryOrderId;

	private String receiverAddress;
	public ApplyNotaryPostRequest() {
		super("Trademark", "2018-07-24", "ApplyNotaryPost");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
		if(receiverName != null){
			putQueryParameter("ReceiverName", receiverName);
		}
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
		if(receiverPhone != null){
			putQueryParameter("ReceiverPhone", receiverPhone);
		}
	}

	public Long getNotaryOrderId() {
		return this.notaryOrderId;
	}

	public void setNotaryOrderId(Long notaryOrderId) {
		this.notaryOrderId = notaryOrderId;
		if(notaryOrderId != null){
			putQueryParameter("NotaryOrderId", notaryOrderId.toString());
		}
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
		if(receiverAddress != null){
			putQueryParameter("ReceiverAddress", receiverAddress);
		}
	}

	@Override
	public Class<ApplyNotaryPostResponse> getResponseClass() {
		return ApplyNotaryPostResponse.class;
	}

}

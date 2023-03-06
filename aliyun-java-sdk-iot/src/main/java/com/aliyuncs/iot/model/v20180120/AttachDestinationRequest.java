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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AttachDestinationRequest extends RpcAcsRequest<AttachDestinationResponse> {
	   

	private String iotInstanceId;

	private Long destinationId;

	private Long parserId;

	private Boolean isFailover;
	public AttachDestinationRequest() {
		super("Iot", "2018-01-20", "AttachDestination");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public Long getDestinationId() {
		return this.destinationId;
	}

	public void setDestinationId(Long destinationId) {
		this.destinationId = destinationId;
		if(destinationId != null){
			putQueryParameter("DestinationId", destinationId.toString());
		}
	}

	public Long getParserId() {
		return this.parserId;
	}

	public void setParserId(Long parserId) {
		this.parserId = parserId;
		if(parserId != null){
			putQueryParameter("ParserId", parserId.toString());
		}
	}

	public Boolean getIsFailover() {
		return this.isFailover;
	}

	public void setIsFailover(Boolean isFailover) {
		this.isFailover = isFailover;
		if(isFailover != null){
			putQueryParameter("IsFailover", isFailover.toString());
		}
	}

	@Override
	public Class<AttachDestinationResponse> getResponseClass() {
		return AttachDestinationResponse.class;
	}

}

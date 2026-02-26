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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateEventStreamingBusinessOptionRequest extends RpcAcsRequest<UpdateEventStreamingBusinessOptionResponse> {
	   

	private Long maxCapacityUnitCount;

	private String businessMode;

	private String eventStreamingName;

	private Long minCapacityUnitCount;
	public UpdateEventStreamingBusinessOptionRequest() {
		super("eventbridge", "2020-04-01", "UpdateEventStreamingBusinessOption");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getMaxCapacityUnitCount() {
		return this.maxCapacityUnitCount;
	}

	public void setMaxCapacityUnitCount(Long maxCapacityUnitCount) {
		this.maxCapacityUnitCount = maxCapacityUnitCount;
		if(maxCapacityUnitCount != null){
			putBodyParameter("MaxCapacityUnitCount", maxCapacityUnitCount.toString());
		}
	}

	public String getBusinessMode() {
		return this.businessMode;
	}

	public void setBusinessMode(String businessMode) {
		this.businessMode = businessMode;
		if(businessMode != null){
			putBodyParameter("BusinessMode", businessMode);
		}
	}

	public String getEventStreamingName() {
		return this.eventStreamingName;
	}

	public void setEventStreamingName(String eventStreamingName) {
		this.eventStreamingName = eventStreamingName;
		if(eventStreamingName != null){
			putBodyParameter("EventStreamingName", eventStreamingName);
		}
	}

	public Long getMinCapacityUnitCount() {
		return this.minCapacityUnitCount;
	}

	public void setMinCapacityUnitCount(Long minCapacityUnitCount) {
		this.minCapacityUnitCount = minCapacityUnitCount;
		if(minCapacityUnitCount != null){
			putBodyParameter("MinCapacityUnitCount", minCapacityUnitCount.toString());
		}
	}

	@Override
	public Class<UpdateEventStreamingBusinessOptionResponse> getResponseClass() {
		return UpdateEventStreamingBusinessOptionResponse.class;
	}

}

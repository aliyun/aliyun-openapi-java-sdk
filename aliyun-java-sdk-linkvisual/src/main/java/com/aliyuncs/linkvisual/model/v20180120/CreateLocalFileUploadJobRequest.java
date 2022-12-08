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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLocalFileUploadJobRequest extends RpcAcsRequest<CreateLocalFileUploadJobResponse> {
	   

	private String iotInstanceId;

	private List<TimeSlot> timeSlots;
	public CreateLocalFileUploadJobRequest() {
		super("Linkvisual", "2018-01-20", "CreateLocalFileUploadJob", "Linkvisual");
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

	public List<TimeSlot> getTimeSlots() {
		return this.timeSlots;
	}

	public void setTimeSlots(List<TimeSlot> timeSlots) {
		this.timeSlots = timeSlots;	
		if (timeSlots != null) {
			for (int depth1 = 0; depth1 < timeSlots.size(); depth1++) {
				putQueryParameter("TimeSlot." + (depth1 + 1) + ".EndTime" , timeSlots.get(depth1).getEndTime());
				putQueryParameter("TimeSlot." + (depth1 + 1) + ".StartTime" , timeSlots.get(depth1).getStartTime());
				putQueryParameter("TimeSlot." + (depth1 + 1) + ".ProductKey" , timeSlots.get(depth1).getProductKey());
				putQueryParameter("TimeSlot." + (depth1 + 1) + ".DeviceName" , timeSlots.get(depth1).getDeviceName());
				putQueryParameter("TimeSlot." + (depth1 + 1) + ".IotId" , timeSlots.get(depth1).getIotId());
			}
		}	
	}

	public static class TimeSlot {

		private Integer endTime;

		private Integer startTime;

		private String productKey;

		private String deviceName;

		private String iotId;

		public Integer getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Integer endTime) {
			this.endTime = endTime;
		}

		public Integer getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Integer startTime) {
			this.startTime = startTime;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getIotId() {
			return this.iotId;
		}

		public void setIotId(String iotId) {
			this.iotId = iotId;
		}
	}

	@Override
	public Class<CreateLocalFileUploadJobResponse> getResponseClass() {
		return CreateLocalFileUploadJobResponse.class;
	}

}

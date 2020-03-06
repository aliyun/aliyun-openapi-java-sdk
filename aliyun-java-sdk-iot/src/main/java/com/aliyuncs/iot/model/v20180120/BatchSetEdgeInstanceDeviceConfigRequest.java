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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchSetEdgeInstanceDeviceConfigRequest extends RpcAcsRequest<BatchSetEdgeInstanceDeviceConfigResponse> {
	   

	private List<DeviceConfigs> deviceConfigss;

	private String iotInstanceId;

	private String instanceId;
	public BatchSetEdgeInstanceDeviceConfigRequest() {
		super("Iot", "2018-01-20", "BatchSetEdgeInstanceDeviceConfig", "Iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<DeviceConfigs> getDeviceConfigss() {
		return this.deviceConfigss;
	}

	public void setDeviceConfigss(List<DeviceConfigs> deviceConfigss) {
		this.deviceConfigss = deviceConfigss;	
		if (deviceConfigss != null) {
			for (int depth1 = 0; depth1 < deviceConfigss.size(); depth1++) {
				putQueryParameter("DeviceConfigs." + (depth1 + 1) + ".IotId" , deviceConfigss.get(depth1).getIotId());
				putQueryParameter("DeviceConfigs." + (depth1 + 1) + ".Content" , deviceConfigss.get(depth1).getContent());
			}
		}	
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public static class DeviceConfigs {

		private String iotId;

		private String content;

		public String getIotId() {
			return this.iotId;
		}

		public void setIotId(String iotId) {
			this.iotId = iotId;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public Class<BatchSetEdgeInstanceDeviceConfigResponse> getResponseClass() {
		return BatchSetEdgeInstanceDeviceConfigResponse.class;
	}

}

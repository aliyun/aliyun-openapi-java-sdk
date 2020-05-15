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
public class SetEdgeInstanceDriverConfigsRequest extends RpcAcsRequest<SetEdgeInstanceDriverConfigsResponse> {
	   

	private List<Configs> configss;

	private String driverId;

	private String iotInstanceId;

	private String instanceId;
	public SetEdgeInstanceDriverConfigsRequest() {
		super("Iot", "2018-01-20", "SetEdgeInstanceDriverConfigs", "Iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Configs> getConfigss() {
		return this.configss;
	}

	public void setConfigss(List<Configs> configss) {
		this.configss = configss;	
		if (configss != null) {
			for (int depth1 = 0; depth1 < configss.size(); depth1++) {
				putQueryParameter("Configs." + (depth1 + 1) + ".Format" , configss.get(depth1).getFormat());
				putQueryParameter("Configs." + (depth1 + 1) + ".Content" , configss.get(depth1).getContent());
				putQueryParameter("Configs." + (depth1 + 1) + ".Key" , configss.get(depth1).getKey());
			}
		}	
	}

	public String getDriverId() {
		return this.driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
		if(driverId != null){
			putQueryParameter("DriverId", driverId);
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

	public static class Configs {

		private String format;

		private String content;

		private String key;

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<SetEdgeInstanceDriverConfigsResponse> getResponseClass() {
		return SetEdgeInstanceDriverConfigsResponse.class;
	}

}

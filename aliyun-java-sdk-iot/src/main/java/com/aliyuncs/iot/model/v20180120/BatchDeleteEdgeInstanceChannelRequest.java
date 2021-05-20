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
public class BatchDeleteEdgeInstanceChannelRequest extends RpcAcsRequest<BatchDeleteEdgeInstanceChannelResponse> {
	   

	private String driverId;

	private String iotInstanceId;

	private String instanceId;

	private List<String> channelIdss;
	public BatchDeleteEdgeInstanceChannelRequest() {
		super("Iot", "2018-01-20", "BatchDeleteEdgeInstanceChannel", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getChannelIdss() {
		return this.channelIdss;
	}

	public void setChannelIdss(List<String> channelIdss) {
		this.channelIdss = channelIdss;	
		if (channelIdss != null) {
			for (int i = 0; i < channelIdss.size(); i++) {
				putQueryParameter("ChannelIds." + (i + 1) , channelIdss.get(i));
			}
		}	
	}

	@Override
	public Class<BatchDeleteEdgeInstanceChannelResponse> getResponseClass() {
		return BatchDeleteEdgeInstanceChannelResponse.class;
	}

}

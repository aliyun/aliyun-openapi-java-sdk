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

package com.aliyuncs.alikafka.model.v20190916;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alikafka.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateConsumerOffsetRequest extends RpcAcsRequest<UpdateConsumerOffsetResponse> {
	   

	private String consumerId;

	private String resetType;

	private String instanceId;

	@SerializedName("offsets")
	private List<Offsets> offsets;

	private String topic;

	private String time;
	public UpdateConsumerOffsetRequest() {
		super("alikafka", "2019-09-16", "UpdateConsumerOffset");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConsumerId() {
		return this.consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
		if(consumerId != null){
			putQueryParameter("ConsumerId", consumerId);
		}
	}

	public String getResetType() {
		return this.resetType;
	}

	public void setResetType(String resetType) {
		this.resetType = resetType;
		if(resetType != null){
			putQueryParameter("ResetType", resetType);
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

	public List<Offsets> getOffsets() {
		return this.offsets;
	}

	public void setOffsets(List<Offsets> offsets) {
		this.offsets = offsets;	
		if (offsets != null) {
			putQueryParameter("Offsets" , new Gson().toJson(offsets));
		}	
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putQueryParameter("Topic", topic);
		}
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
		if(time != null){
			putQueryParameter("Time", time);
		}
	}

	public static class Offsets {

		@SerializedName("Partition")
		private Integer partition;

		@SerializedName("Offset")
		private Long offset;

		public Integer getPartition() {
			return this.partition;
		}

		public void setPartition(Integer partition) {
			this.partition = partition;
		}

		public Long getOffset() {
			return this.offset;
		}

		public void setOffset(Long offset) {
			this.offset = offset;
		}
	}

	@Override
	public Class<UpdateConsumerOffsetResponse> getResponseClass() {
		return UpdateConsumerOffsetResponse.class;
	}

}

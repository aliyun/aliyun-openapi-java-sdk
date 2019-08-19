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

package com.aliyuncs.alikafka.model.v20181015;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alikafka.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTopicRequest extends RpcAcsRequest<CreateTopicResponse> {
	
	public CreateTopicRequest() {
		super("alikafka", "2018-10-15", "CreateTopic", "alikafka");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String instanceId;

	private String topic;

	private String remark;

	private Boolean compactTopic;

	private String partitionNum;

	private Boolean localTopic;

	private Integer orderType;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public Boolean getCompactTopic() {
		return this.compactTopic;
	}

	public void setCompactTopic(Boolean compactTopic) {
		this.compactTopic = compactTopic;
		if(compactTopic != null){
			putQueryParameter("CompactTopic", compactTopic.toString());
		}
	}

	public String getPartitionNum() {
		return this.partitionNum;
	}

	public void setPartitionNum(String partitionNum) {
		this.partitionNum = partitionNum;
		if(partitionNum != null){
			putQueryParameter("PartitionNum", partitionNum);
		}
	}

	public Boolean getLocalTopic() {
		return this.localTopic;
	}

	public void setLocalTopic(Boolean localTopic) {
		this.localTopic = localTopic;
		if(localTopic != null){
			putQueryParameter("LocalTopic", localTopic.toString());
		}
	}

	public Integer getOrderType() {
		return this.orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType.toString());
		}
	}

	@Override
	public Class<CreateTopicResponse> getResponseClass() {
		return CreateTopicResponse.class;
	}

}

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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ResetMqSofamqConsumerOffsetRequest extends RpcAcsRequest<ResetMqSofamqConsumerOffsetResponse> {
	   

	private String cell;

	private Long type;

	private String groupId;

	private Long resetTimestamp;

	private String instanceId;

	private String topic;
	public ResetMqSofamqConsumerOffsetRequest() {
		super("SOFA", "2019-08-15", "ResetMqSofamqConsumerOffset", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCell() {
		return this.cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
		if(cell != null){
			putBodyParameter("Cell", cell);
		}
	}

	public Long getType() {
		return this.type;
	}

	public void setType(Long type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type.toString());
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putBodyParameter("GroupId", groupId);
		}
	}

	public Long getResetTimestamp() {
		return this.resetTimestamp;
	}

	public void setResetTimestamp(Long resetTimestamp) {
		this.resetTimestamp = resetTimestamp;
		if(resetTimestamp != null){
			putBodyParameter("ResetTimestamp", resetTimestamp.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putBodyParameter("Topic", topic);
		}
	}

	@Override
	public Class<ResetMqSofamqConsumerOffsetResponse> getResponseClass() {
		return ResetMqSofamqConsumerOffsetResponse.class;
	}

}

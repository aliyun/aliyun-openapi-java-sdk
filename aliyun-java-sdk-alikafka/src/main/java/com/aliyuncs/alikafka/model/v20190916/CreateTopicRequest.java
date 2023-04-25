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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alikafka.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTopicRequest extends RpcAcsRequest<CreateTopicResponse> {
	   

	private String remark;

	private Long replicationFactor;

	private Long minInsyncReplicas;

	private String instanceId;

	private String topic;

	private Boolean compactTopic;

	private List<Tag> tags;

	private String partitionNum;

	private String config;

	private Boolean localTopic;
	public CreateTopicRequest() {
		super("alikafka", "2019-09-16", "CreateTopic");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getReplicationFactor() {
		return this.replicationFactor;
	}

	public void setReplicationFactor(Long replicationFactor) {
		this.replicationFactor = replicationFactor;
		if(replicationFactor != null){
			putQueryParameter("ReplicationFactor", replicationFactor.toString());
		}
	}

	public Long getMinInsyncReplicas() {
		return this.minInsyncReplicas;
	}

	public void setMinInsyncReplicas(Long minInsyncReplicas) {
		this.minInsyncReplicas = minInsyncReplicas;
		if(minInsyncReplicas != null){
			putQueryParameter("MinInsyncReplicas", minInsyncReplicas.toString());
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

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putQueryParameter("Topic", topic);
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
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

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
		if(config != null){
			putQueryParameter("Config", config);
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

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateTopicResponse> getResponseClass() {
		return CreateTopicResponse.class;
	}

}

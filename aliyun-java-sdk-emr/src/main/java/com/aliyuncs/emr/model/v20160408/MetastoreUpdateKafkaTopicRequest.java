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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class MetastoreUpdateKafkaTopicRequest extends RpcAcsRequest<MetastoreUpdateKafkaTopicResponse> {
	
	public MetastoreUpdateKafkaTopicRequest() {
		super("Emr", "2016-04-08", "MetastoreUpdateKafkaTopic");
	}

	private Long resourceOwnerId;

	private String topicId;

	private String topicName;

	private String advancedConfig;

	private Integer numPartitions;

	private Integer replicationFactor;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getTopicId() {
		return this.topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
		if(topicId != null){
			putQueryParameter("TopicId", topicId);
		}
	}

	public String getTopicName() {
		return this.topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
		if(topicName != null){
			putQueryParameter("TopicName", topicName);
		}
	}

	public String getAdvancedConfig() {
		return this.advancedConfig;
	}

	public void setAdvancedConfig(String advancedConfig) {
		this.advancedConfig = advancedConfig;
		if(advancedConfig != null){
			putQueryParameter("AdvancedConfig", advancedConfig);
		}
	}

	public Integer getNumPartitions() {
		return this.numPartitions;
	}

	public void setNumPartitions(Integer numPartitions) {
		this.numPartitions = numPartitions;
		if(numPartitions != null){
			putQueryParameter("NumPartitions", numPartitions.toString());
		}
	}

	public Integer getReplicationFactor() {
		return this.replicationFactor;
	}

	public void setReplicationFactor(Integer replicationFactor) {
		this.replicationFactor = replicationFactor;
		if(replicationFactor != null){
			putQueryParameter("ReplicationFactor", replicationFactor.toString());
		}
	}

	@Override
	public Class<MetastoreUpdateKafkaTopicResponse> getResponseClass() {
		return MetastoreUpdateKafkaTopicResponse.class;
	}

}

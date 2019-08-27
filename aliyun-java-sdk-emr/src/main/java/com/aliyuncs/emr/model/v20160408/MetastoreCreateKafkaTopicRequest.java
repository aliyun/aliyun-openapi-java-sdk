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
import java.util.List;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MetastoreCreateKafkaTopicRequest extends RpcAcsRequest<MetastoreCreateKafkaTopicResponse> {
	
	public MetastoreCreateKafkaTopicRequest() {
		super("Emr", "2016-04-08", "MetastoreCreateKafkaTopic", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String dataSourceId;

	private String topicName;

	private List<AdvancedConfig> advancedConfigs;

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

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putQueryParameter("DataSourceId", dataSourceId);
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

	public List<AdvancedConfig> getAdvancedConfigs() {
		return this.advancedConfigs;
	}

	public void setAdvancedConfigs(List<AdvancedConfig> advancedConfigs) {
		this.advancedConfigs = advancedConfigs;	
		if (advancedConfigs != null) {
			for (int depth1 = 0; depth1 < advancedConfigs.size(); depth1++) {
				putQueryParameter("AdvancedConfig." + (depth1 + 1) + ".Value" , advancedConfigs.get(depth1).getValue());
				putQueryParameter("AdvancedConfig." + (depth1 + 1) + ".Key" , advancedConfigs.get(depth1).getKey());
			}
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

	public static class AdvancedConfig {

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
	public Class<MetastoreCreateKafkaTopicResponse> getResponseClass() {
		return MetastoreCreateKafkaTopicResponse.class;
	}

}

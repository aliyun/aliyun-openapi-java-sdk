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
public class MetastoreUpdateKafkaTopicRequest extends RpcAcsRequest<MetastoreUpdateKafkaTopicResponse> {
	
	public MetastoreUpdateKafkaTopicRequest() {
		super("Emr", "2016-04-08", "MetastoreUpdateKafkaTopic", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String topicId;

	private List<AdvancedConfig> advancedConfigs;

	private Integer numPartitions;

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
	public Class<MetastoreUpdateKafkaTopicResponse> getResponseClass() {
		return MetastoreUpdateKafkaTopicResponse.class;
	}

}

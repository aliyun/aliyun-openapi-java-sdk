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
public class MetastoreUpdateKafkaTopicBatchRequest extends RpcAcsRequest<MetastoreUpdateKafkaTopicBatchResponse> {
	
	public MetastoreUpdateKafkaTopicBatchRequest() {
		super("Emr", "2016-04-08", "MetastoreUpdateKafkaTopicBatch", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private List<TopicParam> topicParams;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<TopicParam> getTopicParams() {
		return this.topicParams;
	}

	public void setTopicParams(List<TopicParam> topicParams) {
		this.topicParams = topicParams;	
		if (topicParams != null) {
			for (int depth1 = 0; depth1 < topicParams.size(); depth1++) {
				putQueryParameter("TopicParam." + (depth1 + 1) + ".TopicId" , topicParams.get(depth1).getTopicId());
				putQueryParameter("TopicParam." + (depth1 + 1) + ".NumPartitions" , topicParams.get(depth1).getNumPartitions());
			}
		}	
	}

	public static class TopicParam {

		private String topicId;

		private Integer numPartitions;

		public String getTopicId() {
			return this.topicId;
		}

		public void setTopicId(String topicId) {
			this.topicId = topicId;
		}

		public Integer getNumPartitions() {
			return this.numPartitions;
		}

		public void setNumPartitions(Integer numPartitions) {
			this.numPartitions = numPartitions;
		}
	}

	@Override
	public Class<MetastoreUpdateKafkaTopicBatchResponse> getResponseClass() {
		return MetastoreUpdateKafkaTopicBatchResponse.class;
	}

}

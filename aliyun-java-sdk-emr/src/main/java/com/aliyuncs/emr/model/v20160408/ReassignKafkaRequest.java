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
public class ReassignKafkaRequest extends RpcAcsRequest<ReassignKafkaResponse> {
	
	public ReassignKafkaRequest() {
		super("Emr", "2016-04-08", "ReassignKafka", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long throttle;

	private Long resourceOwnerId;

	private String topicId;

	private List<Integer> brokerIds;

	public Long getThrottle() {
		return this.throttle;
	}

	public void setThrottle(Long throttle) {
		this.throttle = throttle;
		if(throttle != null){
			putQueryParameter("Throttle", throttle.toString());
		}
	}

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

	public List<Integer> getBrokerIds() {
		return this.brokerIds;
	}

	public void setBrokerIds(List<Integer> brokerIds) {
		this.brokerIds = brokerIds;	
		if (brokerIds != null) {
			for (int i = 0; i < brokerIds.size(); i++) {
				putQueryParameter("BrokerId." + (i + 1) , brokerIds.get(i));
			}
		}	
	}

	@Override
	public Class<ReassignKafkaResponse> getResponseClass() {
		return ReassignKafkaResponse.class;
	}

}

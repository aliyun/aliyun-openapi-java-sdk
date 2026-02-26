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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alikafka.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryMessageRequest extends RpcAcsRequest<QueryMessageResponse> {
	   

	private String partition;

	private String queryType;

	private String offset;

	private Long beginTime;

	private String instanceId;

	private String topic;
	public QueryMessageRequest() {
		super("alikafka", "2019-09-16", "QueryMessage", "alikafka");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPartition() {
		return this.partition;
	}

	public void setPartition(String partition) {
		this.partition = partition;
		if(partition != null){
			putQueryParameter("Partition", partition);
		}
	}

	public String getQueryType() {
		return this.queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
		if(queryType != null){
			putQueryParameter("QueryType", queryType);
		}
	}

	public String getOffset() {
		return this.offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset);
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
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

	@Override
	public Class<QueryMessageResponse> getResponseClass() {
		return QueryMessageResponse.class;
	}

}

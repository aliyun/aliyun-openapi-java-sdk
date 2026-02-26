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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateEdgeInstanceMessageRoutingRequest extends RpcAcsRequest<CreateEdgeInstanceMessageRoutingResponse> {
	   

	private String sourceData;

	private String targetType;

	private String iotInstanceId;

	private String sourceType;

	private String topicFilter;

	private String instanceId;

	private String targetData;

	private String name;

	private Integer targetIotHubQos;
	public CreateEdgeInstanceMessageRoutingRequest() {
		super("Iot", "2018-01-20", "CreateEdgeInstanceMessageRouting", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceData() {
		return this.sourceData;
	}

	public void setSourceData(String sourceData) {
		this.sourceData = sourceData;
		if(sourceData != null){
			putQueryParameter("SourceData", sourceData);
		}
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putQueryParameter("TargetType", targetType);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public String getTopicFilter() {
		return this.topicFilter;
	}

	public void setTopicFilter(String topicFilter) {
		this.topicFilter = topicFilter;
		if(topicFilter != null){
			putQueryParameter("TopicFilter", topicFilter);
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

	public String getTargetData() {
		return this.targetData;
	}

	public void setTargetData(String targetData) {
		this.targetData = targetData;
		if(targetData != null){
			putQueryParameter("TargetData", targetData);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getTargetIotHubQos() {
		return this.targetIotHubQos;
	}

	public void setTargetIotHubQos(Integer targetIotHubQos) {
		this.targetIotHubQos = targetIotHubQos;
		if(targetIotHubQos != null){
			putQueryParameter("TargetIotHubQos", targetIotHubQos.toString());
		}
	}

	@Override
	public Class<CreateEdgeInstanceMessageRoutingResponse> getResponseClass() {
		return CreateEdgeInstanceMessageRoutingResponse.class;
	}

}

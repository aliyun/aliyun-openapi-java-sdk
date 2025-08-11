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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCResourcesModificationRequest extends RpcAcsRequest<DescribeRCResourcesModificationResponse> {
	   

	private Float memory;

	private Integer cores;

	private String instanceType;

	private String operationType;

	private String destinationResource;

	private String instanceId;

	private String zoneId;

	@SerializedName("conditionss")
	private List<String> conditionss;
	public DescribeRCResourcesModificationRequest() {
		super("Rds", "2014-08-15", "DescribeRCResourcesModification", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Float getMemory() {
		return this.memory;
	}

	public void setMemory(Float memory) {
		this.memory = memory;
		if(memory != null){
			putQueryParameter("Memory", memory.toString());
		}
	}

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
		if(cores != null){
			putQueryParameter("Cores", cores.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getOperationType() {
		return this.operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
		if(operationType != null){
			putQueryParameter("OperationType", operationType);
		}
	}

	public String getDestinationResource() {
		return this.destinationResource;
	}

	public void setDestinationResource(String destinationResource) {
		this.destinationResource = destinationResource;
		if(destinationResource != null){
			putQueryParameter("DestinationResource", destinationResource);
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public List<String> getConditionss() {
		return this.conditionss;
	}

	public void setConditionss(List<String> conditionss) {
		this.conditionss = conditionss;	
		if (conditionss != null) {
			putQueryParameter("Conditionss" , new Gson().toJson(conditionss));
		}	
	}

	@Override
	public Class<DescribeRCResourcesModificationResponse> getResponseClass() {
		return DescribeRCResourcesModificationResponse.class;
	}

}

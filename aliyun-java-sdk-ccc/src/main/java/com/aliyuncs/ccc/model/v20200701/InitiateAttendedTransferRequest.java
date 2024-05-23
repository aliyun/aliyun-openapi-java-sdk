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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InitiateAttendedTransferRequest extends RpcAcsRequest<InitiateAttendedTransferResponse> {
	   

	private String transferee;

	private String transferor;

	private String routingType;

	private Long queuingOverflowThreshold;

	private String userId;

	private Integer timeoutSeconds;

	private String jobId;

	private String strategyParams;

	private String deviceId;

	private String transfereeType;

	private String tags;

	private String strategyName;

	private String instanceId;

	private Long queuingTimeoutSeconds;

	private Integer callPriority;
	public InitiateAttendedTransferRequest() {
		super("CCC", "2020-07-01", "InitiateAttendedTransfer", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTransferee() {
		return this.transferee;
	}

	public void setTransferee(String transferee) {
		this.transferee = transferee;
		if(transferee != null){
			putQueryParameter("Transferee", transferee);
		}
	}

	public String getTransferor() {
		return this.transferor;
	}

	public void setTransferor(String transferor) {
		this.transferor = transferor;
		if(transferor != null){
			putQueryParameter("Transferor", transferor);
		}
	}

	public String getRoutingType() {
		return this.routingType;
	}

	public void setRoutingType(String routingType) {
		this.routingType = routingType;
		if(routingType != null){
			putQueryParameter("RoutingType", routingType);
		}
	}

	public Long getQueuingOverflowThreshold() {
		return this.queuingOverflowThreshold;
	}

	public void setQueuingOverflowThreshold(Long queuingOverflowThreshold) {
		this.queuingOverflowThreshold = queuingOverflowThreshold;
		if(queuingOverflowThreshold != null){
			putQueryParameter("QueuingOverflowThreshold", queuingOverflowThreshold.toString());
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public Integer getTimeoutSeconds() {
		return this.timeoutSeconds;
	}

	public void setTimeoutSeconds(Integer timeoutSeconds) {
		this.timeoutSeconds = timeoutSeconds;
		if(timeoutSeconds != null){
			putQueryParameter("TimeoutSeconds", timeoutSeconds.toString());
		}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
		}
	}

	public String getStrategyParams() {
		return this.strategyParams;
	}

	public void setStrategyParams(String strategyParams) {
		this.strategyParams = strategyParams;
		if(strategyParams != null){
			putQueryParameter("StrategyParams", strategyParams);
		}
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putQueryParameter("DeviceId", deviceId);
		}
	}

	public String getTransfereeType() {
		return this.transfereeType;
	}

	public void setTransfereeType(String transfereeType) {
		this.transfereeType = transfereeType;
		if(transfereeType != null){
			putQueryParameter("TransfereeType", transfereeType);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public String getStrategyName() {
		return this.strategyName;
	}

	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
		if(strategyName != null){
			putQueryParameter("StrategyName", strategyName);
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

	public Long getQueuingTimeoutSeconds() {
		return this.queuingTimeoutSeconds;
	}

	public void setQueuingTimeoutSeconds(Long queuingTimeoutSeconds) {
		this.queuingTimeoutSeconds = queuingTimeoutSeconds;
		if(queuingTimeoutSeconds != null){
			putQueryParameter("QueuingTimeoutSeconds", queuingTimeoutSeconds.toString());
		}
	}

	public Integer getCallPriority() {
		return this.callPriority;
	}

	public void setCallPriority(Integer callPriority) {
		this.callPriority = callPriority;
		if(callPriority != null){
			putQueryParameter("CallPriority", callPriority.toString());
		}
	}

	@Override
	public Class<InitiateAttendedTransferResponse> getResponseClass() {
		return InitiateAttendedTransferResponse.class;
	}

}

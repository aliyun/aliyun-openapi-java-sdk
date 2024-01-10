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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateUnionTaskRequest extends RpcAcsRequest<UpdateUnionTaskResponse> {
	   

	private String endTime;

	private Integer chargePloy;

	private String startTime;

	private Integer optimizationSwitch;

	private Long proxyUserId;

	private Integer quota;

	private Integer quotaDay;

	private Long taskId;

	private String channelId;
	public UpdateUnionTaskRequest() {
		super("UniMkt", "2018-12-12", "UpdateUnionTask");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public Integer getChargePloy() {
		return this.chargePloy;
	}

	public void setChargePloy(Integer chargePloy) {
		this.chargePloy = chargePloy;
		if(chargePloy != null){
			putQueryParameter("ChargePloy", chargePloy.toString());
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public Integer getOptimizationSwitch() {
		return this.optimizationSwitch;
	}

	public void setOptimizationSwitch(Integer optimizationSwitch) {
		this.optimizationSwitch = optimizationSwitch;
		if(optimizationSwitch != null){
			putQueryParameter("OptimizationSwitch", optimizationSwitch.toString());
		}
	}

	public Long getProxyUserId() {
		return this.proxyUserId;
	}

	public void setProxyUserId(Long proxyUserId) {
		this.proxyUserId = proxyUserId;
		if(proxyUserId != null){
			putQueryParameter("ProxyUserId", proxyUserId.toString());
		}
	}

	public Integer getQuota() {
		return this.quota;
	}

	public void setQuota(Integer quota) {
		this.quota = quota;
		if(quota != null){
			putQueryParameter("Quota", quota.toString());
		}
	}

	public Integer getQuotaDay() {
		return this.quotaDay;
	}

	public void setQuotaDay(Integer quotaDay) {
		this.quotaDay = quotaDay;
		if(quotaDay != null){
			putQueryParameter("QuotaDay", quotaDay.toString());
		}
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId.toString());
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId);
		}
	}

	@Override
	public Class<UpdateUnionTaskResponse> getResponseClass() {
		return UpdateUnionTaskResponse.class;
	}

}

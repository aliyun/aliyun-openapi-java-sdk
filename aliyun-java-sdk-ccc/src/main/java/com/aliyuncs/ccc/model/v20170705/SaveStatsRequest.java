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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveStatsRequest extends RpcAcsRequest<SaveStatsResponse> {
	   

	private String callId;

	private Long recordTime;

	private Long callStartTime;

	private String uid;

	private String instanceId;

	private String stats;

	private String tenantId;

	private String calleeNumber;

	private String callerNumber;
	public SaveStatsRequest() {
		super("CCC", "2017-07-05", "SaveStats", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCallId() {
		return this.callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
		if(callId != null){
			putQueryParameter("CallId", callId);
		}
	}

	public Long getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(Long recordTime) {
		this.recordTime = recordTime;
		if(recordTime != null){
			putQueryParameter("RecordTime", recordTime.toString());
		}
	}

	public Long getCallStartTime() {
		return this.callStartTime;
	}

	public void setCallStartTime(Long callStartTime) {
		this.callStartTime = callStartTime;
		if(callStartTime != null){
			putQueryParameter("CallStartTime", callStartTime.toString());
		}
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid);
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

	public String getStats() {
		return this.stats;
	}

	public void setStats(String stats) {
		this.stats = stats;
		if(stats != null){
			putQueryParameter("Stats", stats);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	public String getCalleeNumber() {
		return this.calleeNumber;
	}

	public void setCalleeNumber(String calleeNumber) {
		this.calleeNumber = calleeNumber;
		if(calleeNumber != null){
			putQueryParameter("CalleeNumber", calleeNumber);
		}
	}

	public String getCallerNumber() {
		return this.callerNumber;
	}

	public void setCallerNumber(String callerNumber) {
		this.callerNumber = callerNumber;
		if(callerNumber != null){
			putQueryParameter("CallerNumber", callerNumber);
		}
	}

	@Override
	public Class<SaveStatsResponse> getResponseClass() {
		return SaveStatsResponse.class;
	}

}

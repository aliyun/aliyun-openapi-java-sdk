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

package com.aliyuncs.airec.model.v20201126;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.airec.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDataDiagnoseSampleDetailsRequest extends RoaAcsRequest<ListDataDiagnoseSampleDetailsResponse> {
	   

	private String instanceId;

	private String taskSource;

	private Long endTime;

	private Long startTime;

	private Long taskCreateTime;

	private String key;
	public ListDataDiagnoseSampleDetailsRequest() {
		super("Airec", "2020-11-26", "ListDataDiagnoseSampleDetails", "airec");
		setUriPattern("/v2/openapi/instances/[instanceId]/data-diagnose-reports/sample-details");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("instanceId", instanceId);
		}
	}

	public String getTaskSource() {
		return this.taskSource;
	}

	public void setTaskSource(String taskSource) {
		this.taskSource = taskSource;
		if(taskSource != null){
			putQueryParameter("taskSource", taskSource);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("endTime", endTime.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("startTime", startTime.toString());
		}
	}

	public Long getTaskCreateTime() {
		return this.taskCreateTime;
	}

	public void setTaskCreateTime(Long taskCreateTime) {
		this.taskCreateTime = taskCreateTime;
		if(taskCreateTime != null){
			putQueryParameter("taskCreateTime", taskCreateTime.toString());
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("key", key);
		}
	}

	@Override
	public Class<ListDataDiagnoseSampleDetailsResponse> getResponseClass() {
		return ListDataDiagnoseSampleDetailsResponse.class;
	}

}

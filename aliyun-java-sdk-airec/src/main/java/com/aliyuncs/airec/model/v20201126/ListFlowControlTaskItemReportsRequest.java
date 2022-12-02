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
public class ListFlowControlTaskItemReportsRequest extends RoaAcsRequest<ListFlowControlTaskItemReportsResponse> {
	   

	private String instanceId;

	private String selectTimeType;

	private String count;

	private String selectType;

	private String taskId;
	public ListFlowControlTaskItemReportsRequest() {
		super("Airec", "2020-11-26", "ListFlowControlTaskItemReports", "airec");
		setUriPattern("/v2/openapi/instances/[instanceId]/flowControlTasks/[taskId]/itemReports");
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

	public String getSelectTimeType() {
		return this.selectTimeType;
	}

	public void setSelectTimeType(String selectTimeType) {
		this.selectTimeType = selectTimeType;
		if(selectTimeType != null){
			putQueryParameter("selectTimeType", selectTimeType);
		}
	}

	public String getCount() {
		return this.count;
	}

	public void setCount(String count) {
		this.count = count;
		if(count != null){
			putQueryParameter("count", count);
		}
	}

	public String getSelectType() {
		return this.selectType;
	}

	public void setSelectType(String selectType) {
		this.selectType = selectType;
		if(selectType != null){
			putQueryParameter("selectType", selectType);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putPathParameter("taskId", taskId);
		}
	}

	@Override
	public Class<ListFlowControlTaskItemReportsResponse> getResponseClass() {
		return ListFlowControlTaskItemReportsResponse.class;
	}

}

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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListExperimentGroupsRequest extends RoaAcsRequest<ListExperimentGroupsResponse> {
	   

	private String timeRangeEnd;

	private String layerId;

	private String instanceId;

	private String timeRangeStart;

	private String status;
	public ListExperimentGroupsRequest() {
		super("PaiRecService", "2022-12-13", "ListExperimentGroups");
		setUriPattern("/api/v1/experimentgroups");
		setMethod(MethodType.GET);
	}

	public String getTimeRangeEnd() {
		return this.timeRangeEnd;
	}

	public void setTimeRangeEnd(String timeRangeEnd) {
		this.timeRangeEnd = timeRangeEnd;
		if(timeRangeEnd != null){
			putQueryParameter("TimeRangeEnd", timeRangeEnd);
		}
	}

	public String getLayerId() {
		return this.layerId;
	}

	public void setLayerId(String layerId) {
		this.layerId = layerId;
		if(layerId != null){
			putQueryParameter("LayerId", layerId);
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

	public String getTimeRangeStart() {
		return this.timeRangeStart;
	}

	public void setTimeRangeStart(String timeRangeStart) {
		this.timeRangeStart = timeRangeStart;
		if(timeRangeStart != null){
			putQueryParameter("TimeRangeStart", timeRangeStart);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ListExperimentGroupsResponse> getResponseClass() {
		return ListExperimentGroupsResponse.class;
	}

}

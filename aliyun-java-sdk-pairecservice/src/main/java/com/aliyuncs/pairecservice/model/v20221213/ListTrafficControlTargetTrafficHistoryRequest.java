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
public class ListTrafficControlTargetTrafficHistoryRequest extends RoaAcsRequest<ListTrafficControlTargetTrafficHistoryResponse> {
	   

	private String threshold;

	private String trafficControlTargetId;

	private String startTime;

	private String itemId;

	private String experimentGroupId;

	private String endTime;

	private String environment;

	private String instanceId;

	private String experimentId;
	public ListTrafficControlTargetTrafficHistoryRequest() {
		super("PaiRecService", "2022-12-13", "ListTrafficControlTargetTrafficHistory");
		setUriPattern("/api/v1/trafficcontroltargets/[TrafficControlTargetId]/traffichistories");
		setMethod(MethodType.GET);
	}

	public String getThreshold() {
		return this.threshold;
	}

	public void setThreshold(String threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putQueryParameter("Threshold", threshold);
		}
	}

	public String getTrafficControlTargetId() {
		return this.trafficControlTargetId;
	}

	public void setTrafficControlTargetId(String trafficControlTargetId) {
		this.trafficControlTargetId = trafficControlTargetId;
		if(trafficControlTargetId != null){
			putPathParameter("TrafficControlTargetId", trafficControlTargetId);
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

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putQueryParameter("ItemId", itemId);
		}
	}

	public String getExperimentGroupId() {
		return this.experimentGroupId;
	}

	public void setExperimentGroupId(String experimentGroupId) {
		this.experimentGroupId = experimentGroupId;
		if(experimentGroupId != null){
			putQueryParameter("ExperimentGroupId", experimentGroupId);
		}
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

	public String getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
		if(environment != null){
			putQueryParameter("Environment", environment);
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

	public String getExperimentId() {
		return this.experimentId;
	}

	public void setExperimentId(String experimentId) {
		this.experimentId = experimentId;
		if(experimentId != null){
			putQueryParameter("ExperimentId", experimentId);
		}
	}

	@Override
	public Class<ListTrafficControlTargetTrafficHistoryResponse> getResponseClass() {
		return ListTrafficControlTargetTrafficHistoryResponse.class;
	}

}

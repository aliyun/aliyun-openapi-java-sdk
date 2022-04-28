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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAIInstanceRequest extends RpcAcsRequest<CreateAIInstanceResponse> {
	   

	private String scheduleType;

	@SerializedName("scheduleCycleDates")
	private List<Long> scheduleCycleDates;

	private String computeType;

	private String dataType;

	private String instanceType;

	private String projectId;

	private String algorithmId;

	@SerializedName("dataSourceTimes")
	private List<DataSourceTimes> dataSourceTimes;

	private Long spf;

	@SerializedName("scheduleTimes")
	private List<ScheduleTimes> scheduleTimes;

	private String instanceName;

	private String dataSource;

	private String algorithmName;
	public CreateAIInstanceRequest() {
		super("Vcs", "2020-05-15", "CreateAIInstance");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScheduleType() {
		return this.scheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
		if(scheduleType != null){
			putBodyParameter("ScheduleType", scheduleType);
		}
	}

	public List<Long> getScheduleCycleDates() {
		return this.scheduleCycleDates;
	}

	public void setScheduleCycleDates(List<Long> scheduleCycleDates) {
		this.scheduleCycleDates = scheduleCycleDates;	
		if (scheduleCycleDates != null) {
			putBodyParameter("ScheduleCycleDates" , new Gson().toJson(scheduleCycleDates));
		}	
	}

	public String getComputeType() {
		return this.computeType;
	}

	public void setComputeType(String computeType) {
		this.computeType = computeType;
		if(computeType != null){
			putBodyParameter("ComputeType", computeType);
		}
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
		if(dataType != null){
			putBodyParameter("DataType", dataType);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putBodyParameter("InstanceType", instanceType);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getAlgorithmId() {
		return this.algorithmId;
	}

	public void setAlgorithmId(String algorithmId) {
		this.algorithmId = algorithmId;
		if(algorithmId != null){
			putBodyParameter("AlgorithmId", algorithmId);
		}
	}

	public List<DataSourceTimes> getDataSourceTimes() {
		return this.dataSourceTimes;
	}

	public void setDataSourceTimes(List<DataSourceTimes> dataSourceTimes) {
		this.dataSourceTimes = dataSourceTimes;	
		if (dataSourceTimes != null) {
			putBodyParameter("DataSourceTimes" , new Gson().toJson(dataSourceTimes));
		}	
	}

	public Long getSpf() {
		return this.spf;
	}

	public void setSpf(Long spf) {
		this.spf = spf;
		if(spf != null){
			putBodyParameter("Spf", spf.toString());
		}
	}

	public List<ScheduleTimes> getScheduleTimes() {
		return this.scheduleTimes;
	}

	public void setScheduleTimes(List<ScheduleTimes> scheduleTimes) {
		this.scheduleTimes = scheduleTimes;	
		if (scheduleTimes != null) {
			putBodyParameter("ScheduleTimes" , new Gson().toJson(scheduleTimes));
		}	
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putBodyParameter("InstanceName", instanceName);
		}
	}

	public String getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
		if(dataSource != null){
			putBodyParameter("DataSource", dataSource);
		}
	}

	public String getAlgorithmName() {
		return this.algorithmName;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
		if(algorithmName != null){
			putBodyParameter("AlgorithmName", algorithmName);
		}
	}

	public static class DataSourceTimes {

		@SerializedName("EndTime")
		private String endTime;

		@SerializedName("StartTime")
		private String startTime;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
	}

	public static class ScheduleTimes {

		@SerializedName("EndTime")
		private String endTime;

		@SerializedName("StartTime")
		private String startTime;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
	}

	@Override
	public Class<CreateAIInstanceResponse> getResponseClass() {
		return CreateAIInstanceResponse.class;
	}

}

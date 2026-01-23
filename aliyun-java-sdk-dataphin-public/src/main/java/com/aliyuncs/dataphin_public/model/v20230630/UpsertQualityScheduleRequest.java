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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpsertQualityScheduleRequest extends RpcAcsRequest<UpsertQualityScheduleResponse> {
	   

	private Long opTenantId;

	@SerializedName("upsertCommand")
	private UpsertCommand upsertCommand;
	public UpsertQualityScheduleRequest() {
		super("dataphin-public", "2023-06-30", "UpsertQualitySchedule");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public UpsertCommand getUpsertCommand() {
		return this.upsertCommand;
	}

	public void setUpsertCommand(UpsertCommand upsertCommand) {
		this.upsertCommand = upsertCommand;	
		if (upsertCommand != null) {
			putBodyParameter("UpsertCommand" , new Gson().toJson(upsertCommand));
		}	
	}

	public static class UpsertCommand {

		@SerializedName("ValidatePartitionType")
		private String validatePartitionType;

		@SerializedName("TriggerNodeList")
		private List<String> triggerNodeList;

		@SerializedName("CronExpression")
		private String cronExpression;

		@SerializedName("TriggerType")
		private String triggerType;

		@SerializedName("Type")
		private String type;

		@SerializedName("StaticTaskTriggerType")
		private String staticTaskTriggerType;

		@SerializedName("PeriodScheduleParamList")
		private List<String> periodScheduleParamList;

		@SerializedName("PartitionExpression")
		private String partitionExpression;

		@SerializedName("WatchId")
		private Long watchId;

		@SerializedName("Name")
		private String name;

		@SerializedName("Id")
		private Long id;

		@SerializedName("PartitionType")
		private String partitionType;

		@SerializedName("PeriodScheduleIntervalType")
		private String periodScheduleIntervalType;

		public String getValidatePartitionType() {
			return this.validatePartitionType;
		}

		public void setValidatePartitionType(String validatePartitionType) {
			this.validatePartitionType = validatePartitionType;
		}

		public List<String> getTriggerNodeList() {
			return this.triggerNodeList;
		}

		public void setTriggerNodeList(List<String> triggerNodeList) {
			this.triggerNodeList = triggerNodeList;
		}

		public String getCronExpression() {
			return this.cronExpression;
		}

		public void setCronExpression(String cronExpression) {
			this.cronExpression = cronExpression;
		}

		public String getTriggerType() {
			return this.triggerType;
		}

		public void setTriggerType(String triggerType) {
			this.triggerType = triggerType;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStaticTaskTriggerType() {
			return this.staticTaskTriggerType;
		}

		public void setStaticTaskTriggerType(String staticTaskTriggerType) {
			this.staticTaskTriggerType = staticTaskTriggerType;
		}

		public List<String> getPeriodScheduleParamList() {
			return this.periodScheduleParamList;
		}

		public void setPeriodScheduleParamList(List<String> periodScheduleParamList) {
			this.periodScheduleParamList = periodScheduleParamList;
		}

		public String getPartitionExpression() {
			return this.partitionExpression;
		}

		public void setPartitionExpression(String partitionExpression) {
			this.partitionExpression = partitionExpression;
		}

		public Long getWatchId() {
			return this.watchId;
		}

		public void setWatchId(Long watchId) {
			this.watchId = watchId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPartitionType() {
			return this.partitionType;
		}

		public void setPartitionType(String partitionType) {
			this.partitionType = partitionType;
		}

		public String getPeriodScheduleIntervalType() {
			return this.periodScheduleIntervalType;
		}

		public void setPeriodScheduleIntervalType(String periodScheduleIntervalType) {
			this.periodScheduleIntervalType = periodScheduleIntervalType;
		}
	}

	@Override
	public Class<UpsertQualityScheduleResponse> getResponseClass() {
		return UpsertQualityScheduleResponse.class;
	}

}

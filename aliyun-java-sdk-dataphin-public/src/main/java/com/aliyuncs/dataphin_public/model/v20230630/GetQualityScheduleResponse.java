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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetQualityScheduleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQualityScheduleResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private QualityScheduleInfo qualityScheduleInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public QualityScheduleInfo getQualityScheduleInfo() {
		return this.qualityScheduleInfo;
	}

	public void setQualityScheduleInfo(QualityScheduleInfo qualityScheduleInfo) {
		this.qualityScheduleInfo = qualityScheduleInfo;
	}

	public static class QualityScheduleInfo {

		private Long watchId;

		private Long id;

		private String name;

		private Boolean isRefByRule;

		private String type;

		private String partitionType;

		private String partitionExpression;

		private String triggerType;

		private String staticTaskTriggerType;

		private String periodScheduleIntervalType;

		private String cronExpression;

		private String validatePartitionType;

		private String creator;

		private String modifier;

		private String createTime;

		private String modifyTime;

		private List<String> triggerNodeList;

		private List<String> periodScheduleParamList;

		public Long getWatchId() {
			return this.watchId;
		}

		public void setWatchId(Long watchId) {
			this.watchId = watchId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getIsRefByRule() {
			return this.isRefByRule;
		}

		public void setIsRefByRule(Boolean isRefByRule) {
			this.isRefByRule = isRefByRule;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getPartitionType() {
			return this.partitionType;
		}

		public void setPartitionType(String partitionType) {
			this.partitionType = partitionType;
		}

		public String getPartitionExpression() {
			return this.partitionExpression;
		}

		public void setPartitionExpression(String partitionExpression) {
			this.partitionExpression = partitionExpression;
		}

		public String getTriggerType() {
			return this.triggerType;
		}

		public void setTriggerType(String triggerType) {
			this.triggerType = triggerType;
		}

		public String getStaticTaskTriggerType() {
			return this.staticTaskTriggerType;
		}

		public void setStaticTaskTriggerType(String staticTaskTriggerType) {
			this.staticTaskTriggerType = staticTaskTriggerType;
		}

		public String getPeriodScheduleIntervalType() {
			return this.periodScheduleIntervalType;
		}

		public void setPeriodScheduleIntervalType(String periodScheduleIntervalType) {
			this.periodScheduleIntervalType = periodScheduleIntervalType;
		}

		public String getCronExpression() {
			return this.cronExpression;
		}

		public void setCronExpression(String cronExpression) {
			this.cronExpression = cronExpression;
		}

		public String getValidatePartitionType() {
			return this.validatePartitionType;
		}

		public void setValidatePartitionType(String validatePartitionType) {
			this.validatePartitionType = validatePartitionType;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public List<String> getTriggerNodeList() {
			return this.triggerNodeList;
		}

		public void setTriggerNodeList(List<String> triggerNodeList) {
			this.triggerNodeList = triggerNodeList;
		}

		public List<String> getPeriodScheduleParamList() {
			return this.periodScheduleParamList;
		}

		public void setPeriodScheduleParamList(List<String> periodScheduleParamList) {
			this.periodScheduleParamList = periodScheduleParamList;
		}
	}

	@Override
	public GetQualityScheduleResponse getInstance(UnmarshallerContext context) {
		return	GetQualityScheduleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

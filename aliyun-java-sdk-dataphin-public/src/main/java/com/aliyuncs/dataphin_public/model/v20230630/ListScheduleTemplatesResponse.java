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
import com.aliyuncs.dataphin_public.transform.v20230630.ListScheduleTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListScheduleTemplatesResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private ListScheduleTemplatesResponse1 listScheduleTemplatesResponse1;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public ListScheduleTemplatesResponse1 getListScheduleTemplatesResponse1() {
		return this.listScheduleTemplatesResponse1;
	}

	public void setListScheduleTemplatesResponse1(ListScheduleTemplatesResponse1 listScheduleTemplatesResponse1) {
		this.listScheduleTemplatesResponse1 = listScheduleTemplatesResponse1;
	}

	public static class ListScheduleTemplatesResponse1 {

		private Integer count;

		private List<ScheduleTemplate> resultData;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public List<ScheduleTemplate> getResultData() {
			return this.resultData;
		}

		public void setResultData(List<ScheduleTemplate> resultData) {
			this.resultData = resultData;
		}

		public static class ScheduleTemplate {

			private Long scheduleTemplateId;

			private Integer scheduleType;

			private String validStartDate;

			private String scheduleTemplateType;

			private String scheduleTemplateDesc;

			private String userName;

			private String modifierName;

			private String customIntervalConfigType;

			private String validEndDate;

			private Long tenantId;

			private Long gmtCreate;

			private Boolean customCronExpression;

			private String scheduleIntervalType;

			private String userId;

			private Long gmtModify;

			private Boolean hasReference;

			private String scheduleTemplateName;

			private String cronExpression;

			private String modifierId;

			private List<ConditionScheduleParam> conditionScheduleParamList;

			private List<CustomIntervalConfig> customIntervalConfigs;

			private CustomIntervalConfig2 customIntervalConfig2;

			public Long getScheduleTemplateId() {
				return this.scheduleTemplateId;
			}

			public void setScheduleTemplateId(Long scheduleTemplateId) {
				this.scheduleTemplateId = scheduleTemplateId;
			}

			public Integer getScheduleType() {
				return this.scheduleType;
			}

			public void setScheduleType(Integer scheduleType) {
				this.scheduleType = scheduleType;
			}

			public String getValidStartDate() {
				return this.validStartDate;
			}

			public void setValidStartDate(String validStartDate) {
				this.validStartDate = validStartDate;
			}

			public String getScheduleTemplateType() {
				return this.scheduleTemplateType;
			}

			public void setScheduleTemplateType(String scheduleTemplateType) {
				this.scheduleTemplateType = scheduleTemplateType;
			}

			public String getScheduleTemplateDesc() {
				return this.scheduleTemplateDesc;
			}

			public void setScheduleTemplateDesc(String scheduleTemplateDesc) {
				this.scheduleTemplateDesc = scheduleTemplateDesc;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getModifierName() {
				return this.modifierName;
			}

			public void setModifierName(String modifierName) {
				this.modifierName = modifierName;
			}

			public String getCustomIntervalConfigType() {
				return this.customIntervalConfigType;
			}

			public void setCustomIntervalConfigType(String customIntervalConfigType) {
				this.customIntervalConfigType = customIntervalConfigType;
			}

			public String getValidEndDate() {
				return this.validEndDate;
			}

			public void setValidEndDate(String validEndDate) {
				this.validEndDate = validEndDate;
			}

			public Long getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(Long tenantId) {
				this.tenantId = tenantId;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Boolean getCustomCronExpression() {
				return this.customCronExpression;
			}

			public void setCustomCronExpression(Boolean customCronExpression) {
				this.customCronExpression = customCronExpression;
			}

			public String getScheduleIntervalType() {
				return this.scheduleIntervalType;
			}

			public void setScheduleIntervalType(String scheduleIntervalType) {
				this.scheduleIntervalType = scheduleIntervalType;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public Long getGmtModify() {
				return this.gmtModify;
			}

			public void setGmtModify(Long gmtModify) {
				this.gmtModify = gmtModify;
			}

			public Boolean getHasReference() {
				return this.hasReference;
			}

			public void setHasReference(Boolean hasReference) {
				this.hasReference = hasReference;
			}

			public String getScheduleTemplateName() {
				return this.scheduleTemplateName;
			}

			public void setScheduleTemplateName(String scheduleTemplateName) {
				this.scheduleTemplateName = scheduleTemplateName;
			}

			public String getCronExpression() {
				return this.cronExpression;
			}

			public void setCronExpression(String cronExpression) {
				this.cronExpression = cronExpression;
			}

			public String getModifierId() {
				return this.modifierId;
			}

			public void setModifierId(String modifierId) {
				this.modifierId = modifierId;
			}

			public List<ConditionScheduleParam> getConditionScheduleParamList() {
				return this.conditionScheduleParamList;
			}

			public void setConditionScheduleParamList(List<ConditionScheduleParam> conditionScheduleParamList) {
				this.conditionScheduleParamList = conditionScheduleParamList;
			}

			public List<CustomIntervalConfig> getCustomIntervalConfigs() {
				return this.customIntervalConfigs;
			}

			public void setCustomIntervalConfigs(List<CustomIntervalConfig> customIntervalConfigs) {
				this.customIntervalConfigs = customIntervalConfigs;
			}

			public CustomIntervalConfig2 getCustomIntervalConfig2() {
				return this.customIntervalConfig2;
			}

			public void setCustomIntervalConfig2(CustomIntervalConfig2 customIntervalConfig2) {
				this.customIntervalConfig2 = customIntervalConfig2;
			}

			public static class ConditionScheduleParam {

				private String scheduleTime;

				private Boolean enable;

				private String cronExpression;

				private String conditionName;

				private Boolean followScheduleParam;

				private Integer nodeStatus;

				private String scheduleConditionJson;

				public String getScheduleTime() {
					return this.scheduleTime;
				}

				public void setScheduleTime(String scheduleTime) {
					this.scheduleTime = scheduleTime;
				}

				public Boolean getEnable() {
					return this.enable;
				}

				public void setEnable(Boolean enable) {
					this.enable = enable;
				}

				public String getCronExpression() {
					return this.cronExpression;
				}

				public void setCronExpression(String cronExpression) {
					this.cronExpression = cronExpression;
				}

				public String getConditionName() {
					return this.conditionName;
				}

				public void setConditionName(String conditionName) {
					this.conditionName = conditionName;
				}

				public Boolean getFollowScheduleParam() {
					return this.followScheduleParam;
				}

				public void setFollowScheduleParam(Boolean followScheduleParam) {
					this.followScheduleParam = followScheduleParam;
				}

				public Integer getNodeStatus() {
					return this.nodeStatus;
				}

				public void setNodeStatus(Integer nodeStatus) {
					this.nodeStatus = nodeStatus;
				}

				public String getScheduleConditionJson() {
					return this.scheduleConditionJson;
				}

				public void setScheduleConditionJson(String scheduleConditionJson) {
					this.scheduleConditionJson = scheduleConditionJson;
				}
			}

			public static class CustomIntervalConfig {

				private String intervalUnit;

				private String endTime;

				private String schedulePeriod;

				private String startTime;

				private Integer interval;

				public String getIntervalUnit() {
					return this.intervalUnit;
				}

				public void setIntervalUnit(String intervalUnit) {
					this.intervalUnit = intervalUnit;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}

				public String getSchedulePeriod() {
					return this.schedulePeriod;
				}

				public void setSchedulePeriod(String schedulePeriod) {
					this.schedulePeriod = schedulePeriod;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public Integer getInterval() {
					return this.interval;
				}

				public void setInterval(Integer interval) {
					this.interval = interval;
				}
			}

			public static class CustomIntervalConfig2 {

				private String intervalUnit;

				private String endTime;

				private String schedulePeriod;

				private String startTime;

				private Integer interval;

				public String getIntervalUnit() {
					return this.intervalUnit;
				}

				public void setIntervalUnit(String intervalUnit) {
					this.intervalUnit = intervalUnit;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}

				public String getSchedulePeriod() {
					return this.schedulePeriod;
				}

				public void setSchedulePeriod(String schedulePeriod) {
					this.schedulePeriod = schedulePeriod;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public Integer getInterval() {
					return this.interval;
				}

				public void setInterval(Integer interval) {
					this.interval = interval;
				}
			}
		}
	}

	@Override
	public ListScheduleTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListScheduleTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

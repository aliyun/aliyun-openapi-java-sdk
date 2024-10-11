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
import com.aliyuncs.dataphin_public.transform.v20230630.GetDevObjectDependencyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDevObjectDependencyResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<DevObjectDependency> devObjectDependencyList;

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

	public List<DevObjectDependency> getDevObjectDependencyList() {
		return this.devObjectDependencyList;
	}

	public void setDevObjectDependencyList(List<DevObjectDependency> devObjectDependencyList) {
		this.devObjectDependencyList = devObjectDependencyList;
	}

	public static class DevObjectDependency {

		private String scheduleType;

		private String nodeName;

		private String projectName;

		private String nodeOutputTableName;

		private String nodeOutputName;

		private Boolean manuallyAdd;

		private String bizUnitId;

		private Boolean customCronExpression;

		private String dependencyStrategy;

		private String bizUnitName;

		private String cronExpression;

		private String subBizType;

		private Boolean dimMidNode;

		private Long projectId;

		private String bizType;

		private Boolean selfDepend;

		private String externalBizInfo;

		private Integer periodDiff;

		private Boolean valid;

		private String nodeType;

		private String nodeId;

		private Boolean autoParse;

		private List<User> ownerList;

		private List<ContextParam> outputContextParamList;

		private List<String> effectFieldList;

		private List<String> dependFieldList;

		private DependencyPeriod dependencyPeriod;

		public String getScheduleType() {
			return this.scheduleType;
		}

		public void setScheduleType(String scheduleType) {
			this.scheduleType = scheduleType;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getNodeOutputTableName() {
			return this.nodeOutputTableName;
		}

		public void setNodeOutputTableName(String nodeOutputTableName) {
			this.nodeOutputTableName = nodeOutputTableName;
		}

		public String getNodeOutputName() {
			return this.nodeOutputName;
		}

		public void setNodeOutputName(String nodeOutputName) {
			this.nodeOutputName = nodeOutputName;
		}

		public Boolean getManuallyAdd() {
			return this.manuallyAdd;
		}

		public void setManuallyAdd(Boolean manuallyAdd) {
			this.manuallyAdd = manuallyAdd;
		}

		public String getBizUnitId() {
			return this.bizUnitId;
		}

		public void setBizUnitId(String bizUnitId) {
			this.bizUnitId = bizUnitId;
		}

		public Boolean getCustomCronExpression() {
			return this.customCronExpression;
		}

		public void setCustomCronExpression(Boolean customCronExpression) {
			this.customCronExpression = customCronExpression;
		}

		public String getDependencyStrategy() {
			return this.dependencyStrategy;
		}

		public void setDependencyStrategy(String dependencyStrategy) {
			this.dependencyStrategy = dependencyStrategy;
		}

		public String getBizUnitName() {
			return this.bizUnitName;
		}

		public void setBizUnitName(String bizUnitName) {
			this.bizUnitName = bizUnitName;
		}

		public String getCronExpression() {
			return this.cronExpression;
		}

		public void setCronExpression(String cronExpression) {
			this.cronExpression = cronExpression;
		}

		public String getSubBizType() {
			return this.subBizType;
		}

		public void setSubBizType(String subBizType) {
			this.subBizType = subBizType;
		}

		public Boolean getDimMidNode() {
			return this.dimMidNode;
		}

		public void setDimMidNode(Boolean dimMidNode) {
			this.dimMidNode = dimMidNode;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public Boolean getSelfDepend() {
			return this.selfDepend;
		}

		public void setSelfDepend(Boolean selfDepend) {
			this.selfDepend = selfDepend;
		}

		public String getExternalBizInfo() {
			return this.externalBizInfo;
		}

		public void setExternalBizInfo(String externalBizInfo) {
			this.externalBizInfo = externalBizInfo;
		}

		public Integer getPeriodDiff() {
			return this.periodDiff;
		}

		public void setPeriodDiff(Integer periodDiff) {
			this.periodDiff = periodDiff;
		}

		public Boolean getValid() {
			return this.valid;
		}

		public void setValid(Boolean valid) {
			this.valid = valid;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public Boolean getAutoParse() {
			return this.autoParse;
		}

		public void setAutoParse(Boolean autoParse) {
			this.autoParse = autoParse;
		}

		public List<User> getOwnerList() {
			return this.ownerList;
		}

		public void setOwnerList(List<User> ownerList) {
			this.ownerList = ownerList;
		}

		public List<ContextParam> getOutputContextParamList() {
			return this.outputContextParamList;
		}

		public void setOutputContextParamList(List<ContextParam> outputContextParamList) {
			this.outputContextParamList = outputContextParamList;
		}

		public List<String> getEffectFieldList() {
			return this.effectFieldList;
		}

		public void setEffectFieldList(List<String> effectFieldList) {
			this.effectFieldList = effectFieldList;
		}

		public List<String> getDependFieldList() {
			return this.dependFieldList;
		}

		public void setDependFieldList(List<String> dependFieldList) {
			this.dependFieldList = dependFieldList;
		}

		public DependencyPeriod getDependencyPeriod() {
			return this.dependencyPeriod;
		}

		public void setDependencyPeriod(DependencyPeriod dependencyPeriod) {
			this.dependencyPeriod = dependencyPeriod;
		}

		public static class User {

			private String id;

			private String name;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class ContextParam {

			private String key;

			private String description;

			private String defaultValue;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDefaultValue() {
				return this.defaultValue;
			}

			public void setDefaultValue(String defaultValue) {
				this.defaultValue = defaultValue;
			}
		}

		public static class DependencyPeriod {

			private String periodType;

			private Integer periodOffset;

			public String getPeriodType() {
				return this.periodType;
			}

			public void setPeriodType(String periodType) {
				this.periodType = periodType;
			}

			public Integer getPeriodOffset() {
				return this.periodOffset;
			}

			public void setPeriodOffset(Integer periodOffset) {
				this.periodOffset = periodOffset;
			}
		}
	}

	@Override
	public GetDevObjectDependencyResponse getInstance(UnmarshallerContext context) {
		return	GetDevObjectDependencyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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
import com.aliyuncs.dataphin_public.transform.v20230630.GetPhysicalNodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPhysicalNodeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private NodeInfo nodeInfo;

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

	public NodeInfo getNodeInfo() {
		return this.nodeInfo;
	}

	public void setNodeInfo(NodeInfo nodeInfo) {
		this.nodeInfo = nodeInfo;
	}

	public static class NodeInfo {

		private String id;

		private String name;

		private String description;

		private String operatorType;

		private String scheduleType;

		private String priority;

		private Long createTime;

		private Long lastModifiedTime;

		private String status;

		private String triggerConfig;

		private String from;

		private String cronExpression;

		private Long dataSourceId;

		private String dataSourceSchema;

		private List<String> outputNameList;

		private ProjectInfo projectInfo;

		private Creator creator;

		private Owner owner;

		private Modifier modifier;

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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOperatorType() {
			return this.operatorType;
		}

		public void setOperatorType(String operatorType) {
			this.operatorType = operatorType;
		}

		public String getScheduleType() {
			return this.scheduleType;
		}

		public void setScheduleType(String scheduleType) {
			this.scheduleType = scheduleType;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getLastModifiedTime() {
			return this.lastModifiedTime;
		}

		public void setLastModifiedTime(Long lastModifiedTime) {
			this.lastModifiedTime = lastModifiedTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTriggerConfig() {
			return this.triggerConfig;
		}

		public void setTriggerConfig(String triggerConfig) {
			this.triggerConfig = triggerConfig;
		}

		public String getFrom() {
			return this.from;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public String getCronExpression() {
			return this.cronExpression;
		}

		public void setCronExpression(String cronExpression) {
			this.cronExpression = cronExpression;
		}

		public Long getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(Long dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getDataSourceSchema() {
			return this.dataSourceSchema;
		}

		public void setDataSourceSchema(String dataSourceSchema) {
			this.dataSourceSchema = dataSourceSchema;
		}

		public List<String> getOutputNameList() {
			return this.outputNameList;
		}

		public void setOutputNameList(List<String> outputNameList) {
			this.outputNameList = outputNameList;
		}

		public ProjectInfo getProjectInfo() {
			return this.projectInfo;
		}

		public void setProjectInfo(ProjectInfo projectInfo) {
			this.projectInfo = projectInfo;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public Owner getOwner() {
			return this.owner;
		}

		public void setOwner(Owner owner) {
			this.owner = owner;
		}

		public Modifier getModifier() {
			return this.modifier;
		}

		public void setModifier(Modifier modifier) {
			this.modifier = modifier;
		}

		public static class ProjectInfo {

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

		public static class Creator {

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

		public static class Owner {

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

		public static class Modifier {

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
	}

	@Override
	public GetPhysicalNodeResponse getInstance(UnmarshallerContext context) {
		return	GetPhysicalNodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

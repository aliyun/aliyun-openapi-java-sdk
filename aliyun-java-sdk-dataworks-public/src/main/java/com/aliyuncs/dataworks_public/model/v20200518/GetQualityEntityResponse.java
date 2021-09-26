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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetQualityEntityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQualityEntityResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private List<EntityDto> data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<EntityDto> getData() {
		return this.data;
	}

	public void setData(List<EntityDto> data) {
		this.data = data;
	}

	public static class EntityDto {

		private String relativeNode;

		private String onDutyAccountName;

		private Integer task;

		private String tableName;

		private String followers;

		private String onDuty;

		private String matchExpression;

		private Long createTime;

		private String projectName;

		private Boolean hasRelativeNode;

		private String envType;

		private Integer entityLevel;

		private String modifyUser;

		private Integer sql;

		private Long id;

		private Long modifyTime;

		public String getRelativeNode() {
			return this.relativeNode;
		}

		public void setRelativeNode(String relativeNode) {
			this.relativeNode = relativeNode;
		}

		public String getOnDutyAccountName() {
			return this.onDutyAccountName;
		}

		public void setOnDutyAccountName(String onDutyAccountName) {
			this.onDutyAccountName = onDutyAccountName;
		}

		public Integer getTask() {
			return this.task;
		}

		public void setTask(Integer task) {
			this.task = task;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getFollowers() {
			return this.followers;
		}

		public void setFollowers(String followers) {
			this.followers = followers;
		}

		public String getOnDuty() {
			return this.onDuty;
		}

		public void setOnDuty(String onDuty) {
			this.onDuty = onDuty;
		}

		public String getMatchExpression() {
			return this.matchExpression;
		}

		public void setMatchExpression(String matchExpression) {
			this.matchExpression = matchExpression;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public Boolean getHasRelativeNode() {
			return this.hasRelativeNode;
		}

		public void setHasRelativeNode(Boolean hasRelativeNode) {
			this.hasRelativeNode = hasRelativeNode;
		}

		public String getEnvType() {
			return this.envType;
		}

		public void setEnvType(String envType) {
			this.envType = envType;
		}

		public Integer getEntityLevel() {
			return this.entityLevel;
		}

		public void setEntityLevel(Integer entityLevel) {
			this.entityLevel = entityLevel;
		}

		public String getModifyUser() {
			return this.modifyUser;
		}

		public void setModifyUser(String modifyUser) {
			this.modifyUser = modifyUser;
		}

		public Integer getSql() {
			return this.sql;
		}

		public void setSql(Integer sql) {
			this.sql = sql;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public GetQualityEntityResponse getInstance(UnmarshallerContext context) {
		return	GetQualityEntityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

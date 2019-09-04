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

package com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424.PubGetDQCEntityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PubGetDQCEntityResponse extends AcsResponse {

	private String returnCode;

	private List<Entity> returnValue;

	public String getReturnCode() {
		return this.returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public List<Entity> getReturnValue() {
		return this.returnValue;
	}

	public void setReturnValue(List<Entity> returnValue) {
		this.returnValue = returnValue;
	}

	public static class Entity {

		private Long id;

		private String projectName;

		private String tableName;

		private String envType;

		private String matchExpression;

		private Integer entityLevel;

		private String onDuty;

		private String modifyUser;

		private String gmtCreate;

		private String gmtModify;

		private Integer sql;

		private Integer task;

		private String followers;

		private Boolean hasRelativeNode;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getEnvType() {
			return this.envType;
		}

		public void setEnvType(String envType) {
			this.envType = envType;
		}

		public String getMatchExpression() {
			return this.matchExpression;
		}

		public void setMatchExpression(String matchExpression) {
			this.matchExpression = matchExpression;
		}

		public Integer getEntityLevel() {
			return this.entityLevel;
		}

		public void setEntityLevel(Integer entityLevel) {
			this.entityLevel = entityLevel;
		}

		public String getOnDuty() {
			return this.onDuty;
		}

		public void setOnDuty(String onDuty) {
			this.onDuty = onDuty;
		}

		public String getModifyUser() {
			return this.modifyUser;
		}

		public void setModifyUser(String modifyUser) {
			this.modifyUser = modifyUser;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModify() {
			return this.gmtModify;
		}

		public void setGmtModify(String gmtModify) {
			this.gmtModify = gmtModify;
		}

		public Integer getSql() {
			return this.sql;
		}

		public void setSql(Integer sql) {
			this.sql = sql;
		}

		public Integer getTask() {
			return this.task;
		}

		public void setTask(Integer task) {
			this.task = task;
		}

		public String getFollowers() {
			return this.followers;
		}

		public void setFollowers(String followers) {
			this.followers = followers;
		}

		public Boolean getHasRelativeNode() {
			return this.hasRelativeNode;
		}

		public void setHasRelativeNode(Boolean hasRelativeNode) {
			this.hasRelativeNode = hasRelativeNode;
		}
	}

	@Override
	public PubGetDQCEntityResponse getInstance(UnmarshallerContext context) {
		return	PubGetDQCEntityResponseUnmarshaller.unmarshall(this, context);
	}
}

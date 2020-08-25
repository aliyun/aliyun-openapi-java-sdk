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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetClriskDataNodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClriskDataNodeResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String description;

	private String id;

	private String name;

	private String odpsProject;

	private String tableAuthDescription;

	private String tableName;

	private String updateTime;

	private String updateUser;

	private List<RelatedEntranceListItem> relatedEntranceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

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

	public String getOdpsProject() {
		return this.odpsProject;
	}

	public void setOdpsProject(String odpsProject) {
		this.odpsProject = odpsProject;
	}

	public String getTableAuthDescription() {
		return this.tableAuthDescription;
	}

	public void setTableAuthDescription(String tableAuthDescription) {
		this.tableAuthDescription = tableAuthDescription;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public List<RelatedEntranceListItem> getRelatedEntranceList() {
		return this.relatedEntranceList;
	}

	public void setRelatedEntranceList(List<RelatedEntranceListItem> relatedEntranceList) {
		this.relatedEntranceList = relatedEntranceList;
	}

	public static class RelatedEntranceListItem {

		private String id;

		private String modelCode;

		private String name;

		private String url;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getModelCode() {
			return this.modelCode;
		}

		public void setModelCode(String modelCode) {
			this.modelCode = modelCode;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	@Override
	public GetClriskDataNodeResponse getInstance(UnmarshallerContext context) {
		return	GetClriskDataNodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

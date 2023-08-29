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

package com.aliyuncs.paifeaturestore.model.v20230621;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.paifeaturestore.transform.v20230621.GetProjectFeatureViewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProjectFeatureViewResponse extends AcsResponse {

	private String requestId;

	private String featureViewId;

	private String projectId;

	private String projectName;

	private String featureEntityId;

	private String featureEntityName;

	private String joinId;

	private String name;

	private String owner;

	private String type;

	private String writeMethod;

	private String registerTable;

	private String registerDatasourceId;

	private Boolean syncOnlineTable;

	private Integer tTL;

	private String config;

	private String gmtSyncTime;

	private String lastSyncConfig;

	private List<FieldsItem> fields;

	private List<String> tags;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getFeatureViewId() {
		return this.featureViewId;
	}

	public void setFeatureViewId(String featureViewId) {
		this.featureViewId = featureViewId;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getFeatureEntityId() {
		return this.featureEntityId;
	}

	public void setFeatureEntityId(String featureEntityId) {
		this.featureEntityId = featureEntityId;
	}

	public String getFeatureEntityName() {
		return this.featureEntityName;
	}

	public void setFeatureEntityName(String featureEntityName) {
		this.featureEntityName = featureEntityName;
	}

	public String getJoinId() {
		return this.joinId;
	}

	public void setJoinId(String joinId) {
		this.joinId = joinId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWriteMethod() {
		return this.writeMethod;
	}

	public void setWriteMethod(String writeMethod) {
		this.writeMethod = writeMethod;
	}

	public String getRegisterTable() {
		return this.registerTable;
	}

	public void setRegisterTable(String registerTable) {
		this.registerTable = registerTable;
	}

	public String getRegisterDatasourceId() {
		return this.registerDatasourceId;
	}

	public void setRegisterDatasourceId(String registerDatasourceId) {
		this.registerDatasourceId = registerDatasourceId;
	}

	public Boolean getSyncOnlineTable() {
		return this.syncOnlineTable;
	}

	public void setSyncOnlineTable(Boolean syncOnlineTable) {
		this.syncOnlineTable = syncOnlineTable;
	}

	public Integer getTTL() {
		return this.tTL;
	}

	public void setTTL(Integer tTL) {
		this.tTL = tTL;
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getGmtSyncTime() {
		return this.gmtSyncTime;
	}

	public void setGmtSyncTime(String gmtSyncTime) {
		this.gmtSyncTime = gmtSyncTime;
	}

	public String getLastSyncConfig() {
		return this.lastSyncConfig;
	}

	public void setLastSyncConfig(String lastSyncConfig) {
		this.lastSyncConfig = lastSyncConfig;
	}

	public List<FieldsItem> getFields() {
		return this.fields;
	}

	public void setFields(List<FieldsItem> fields) {
		this.fields = fields;
	}

	public List<String> getTags() {
		return this.tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public static class FieldsItem {

		private String name;

		private String type;

		private List<String> attributes;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<String> getAttributes() {
			return this.attributes;
		}

		public void setAttributes(List<String> attributes) {
			this.attributes = attributes;
		}
	}

	@Override
	public GetProjectFeatureViewResponse getInstance(UnmarshallerContext context) {
		return	GetProjectFeatureViewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

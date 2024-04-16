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

package com.aliyuncs.miniapplcdp.model.v20200113;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.miniapplcdp.transform.v20200113.GetLatestCommitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLatestCommitResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String appId;

		private String commitId;

		private String createTime;

		private String commitLog;

		private String mainModuleCommitId;

		private String mainModuleId;

		private String modelDataPath;

		private String modifiedTime;

		private String moduleId;

		private String resourceDataPath;

		private Map<Object,Object> resourceDigest;

		private String rollbackToCommitId;

		private String rollbackType;

		private String schemaVersion;

		private String commitType;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getCommitId() {
			return this.commitId;
		}

		public void setCommitId(String commitId) {
			this.commitId = commitId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCommitLog() {
			return this.commitLog;
		}

		public void setCommitLog(String commitLog) {
			this.commitLog = commitLog;
		}

		public String getMainModuleCommitId() {
			return this.mainModuleCommitId;
		}

		public void setMainModuleCommitId(String mainModuleCommitId) {
			this.mainModuleCommitId = mainModuleCommitId;
		}

		public String getMainModuleId() {
			return this.mainModuleId;
		}

		public void setMainModuleId(String mainModuleId) {
			this.mainModuleId = mainModuleId;
		}

		public String getModelDataPath() {
			return this.modelDataPath;
		}

		public void setModelDataPath(String modelDataPath) {
			this.modelDataPath = modelDataPath;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getModuleId() {
			return this.moduleId;
		}

		public void setModuleId(String moduleId) {
			this.moduleId = moduleId;
		}

		public String getResourceDataPath() {
			return this.resourceDataPath;
		}

		public void setResourceDataPath(String resourceDataPath) {
			this.resourceDataPath = resourceDataPath;
		}

		public Map<Object,Object> getResourceDigest() {
			return this.resourceDigest;
		}

		public void setResourceDigest(Map<Object,Object> resourceDigest) {
			this.resourceDigest = resourceDigest;
		}

		public String getRollbackToCommitId() {
			return this.rollbackToCommitId;
		}

		public void setRollbackToCommitId(String rollbackToCommitId) {
			this.rollbackToCommitId = rollbackToCommitId;
		}

		public String getRollbackType() {
			return this.rollbackType;
		}

		public void setRollbackType(String rollbackType) {
			this.rollbackType = rollbackType;
		}

		public String getSchemaVersion() {
			return this.schemaVersion;
		}

		public void setSchemaVersion(String schemaVersion) {
			this.schemaVersion = schemaVersion;
		}

		public String getCommitType() {
			return this.commitType;
		}

		public void setCommitType(String commitType) {
			this.commitType = commitType;
		}
	}

	@Override
	public GetLatestCommitResponse getInstance(UnmarshallerContext context) {
		return	GetLatestCommitResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

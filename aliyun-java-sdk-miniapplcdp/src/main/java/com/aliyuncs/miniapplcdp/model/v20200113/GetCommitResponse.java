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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.miniapplcdp.transform.v20200113.GetCommitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCommitResponse extends AcsResponse {

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

		private String commitType;

		private String modifiedTime;

		private String commitId;

		private String appId;

		private String createTime;

		private String rollbackToCommitId;

		private Map<Object,Object> appModel;

		private String commitLog;

		private List<Map<Object,Object>> logicModels;

		private List<Map<Object,Object>> pageModels;

		private List<Map<Object,Object>> dataModels;

		public String getCommitType() {
			return this.commitType;
		}

		public void setCommitType(String commitType) {
			this.commitType = commitType;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getCommitId() {
			return this.commitId;
		}

		public void setCommitId(String commitId) {
			this.commitId = commitId;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getRollbackToCommitId() {
			return this.rollbackToCommitId;
		}

		public void setRollbackToCommitId(String rollbackToCommitId) {
			this.rollbackToCommitId = rollbackToCommitId;
		}

		public Map<Object,Object> getAppModel() {
			return this.appModel;
		}

		public void setAppModel(Map<Object,Object> appModel) {
			this.appModel = appModel;
		}

		public String getCommitLog() {
			return this.commitLog;
		}

		public void setCommitLog(String commitLog) {
			this.commitLog = commitLog;
		}

		public List<Map<Object,Object>> getLogicModels() {
			return this.logicModels;
		}

		public void setLogicModels(List<Map<Object,Object>> logicModels) {
			this.logicModels = logicModels;
		}

		public List<Map<Object,Object>> getPageModels() {
			return this.pageModels;
		}

		public void setPageModels(List<Map<Object,Object>> pageModels) {
			this.pageModels = pageModels;
		}

		public List<Map<Object,Object>> getDataModels() {
			return this.dataModels;
		}

		public void setDataModels(List<Map<Object,Object>> dataModels) {
			this.dataModels = dataModels;
		}
	}

	@Override
	public GetCommitResponse getInstance(UnmarshallerContext context) {
		return	GetCommitResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

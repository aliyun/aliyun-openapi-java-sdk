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
import com.aliyuncs.miniapplcdp.transform.v20200113.GetPublishResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPublishResponse extends AcsResponse {

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

		private String completionTime;

		private String description;

		private String envId;

		private String createTime;

		private String modifiedTime;

		private String publishId;

		private String reason;

		private String startTime;

		private String publishStatus;

		private String publishType;

		private String versionNumber;

		private List<Map<Object,Object>> subTasks;

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

		public String getCompletionTime() {
			return this.completionTime;
		}

		public void setCompletionTime(String completionTime) {
			this.completionTime = completionTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEnvId() {
			return this.envId;
		}

		public void setEnvId(String envId) {
			this.envId = envId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getPublishId() {
			return this.publishId;
		}

		public void setPublishId(String publishId) {
			this.publishId = publishId;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getPublishStatus() {
			return this.publishStatus;
		}

		public void setPublishStatus(String publishStatus) {
			this.publishStatus = publishStatus;
		}

		public String getPublishType() {
			return this.publishType;
		}

		public void setPublishType(String publishType) {
			this.publishType = publishType;
		}

		public String getVersionNumber() {
			return this.versionNumber;
		}

		public void setVersionNumber(String versionNumber) {
			this.versionNumber = versionNumber;
		}

		public List<Map<Object,Object>> getSubTasks() {
			return this.subTasks;
		}

		public void setSubTasks(List<Map<Object,Object>> subTasks) {
			this.subTasks = subTasks;
		}
	}

	@Override
	public GetPublishResponse getInstance(UnmarshallerContext context) {
		return	GetPublishResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

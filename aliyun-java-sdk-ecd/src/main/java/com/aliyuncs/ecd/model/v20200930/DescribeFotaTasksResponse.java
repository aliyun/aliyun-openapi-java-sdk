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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeFotaTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFotaTasksResponse extends AcsResponse {

	private String requestId;

	private List<FotaTask> fotaTasks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FotaTask> getFotaTasks() {
		return this.fotaTasks;
	}

	public void setFotaTasks(List<FotaTask> fotaTasks) {
		this.fotaTasks = fotaTasks;
	}

	public static class FotaTask {

		private String taskUid;

		private String fotaProject;

		private String appVersion;

		private String status;

		private String publishTime;

		private Integer pendingDesktopCount;

		private String releaseNote;

		private Integer size;

		public String getTaskUid() {
			return this.taskUid;
		}

		public void setTaskUid(String taskUid) {
			this.taskUid = taskUid;
		}

		public String getFotaProject() {
			return this.fotaProject;
		}

		public void setFotaProject(String fotaProject) {
			this.fotaProject = fotaProject;
		}

		public String getAppVersion() {
			return this.appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(String publishTime) {
			this.publishTime = publishTime;
		}

		public Integer getPendingDesktopCount() {
			return this.pendingDesktopCount;
		}

		public void setPendingDesktopCount(Integer pendingDesktopCount) {
			this.pendingDesktopCount = pendingDesktopCount;
		}

		public String getReleaseNote() {
			return this.releaseNote;
		}

		public void setReleaseNote(String releaseNote) {
			this.releaseNote = releaseNote;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}
	}

	@Override
	public DescribeFotaTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeFotaTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

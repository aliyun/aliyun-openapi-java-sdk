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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.PublicSyncAndCreateImageScanTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PublicSyncAndCreateImageScanTaskResponse extends AcsResponse {

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

		private String taskId;

		private Integer totalCount;

		private Integer finishCount;

		private Long collectTime;

		private Long execTime;

		private String status;

		private Integer progress;

		private String result;

		private Boolean canCreate;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getFinishCount() {
			return this.finishCount;
		}

		public void setFinishCount(Integer finishCount) {
			this.finishCount = finishCount;
		}

		public Long getCollectTime() {
			return this.collectTime;
		}

		public void setCollectTime(Long collectTime) {
			this.collectTime = collectTime;
		}

		public Long getExecTime() {
			return this.execTime;
		}

		public void setExecTime(Long execTime) {
			this.execTime = execTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public Boolean getCanCreate() {
			return this.canCreate;
		}

		public void setCanCreate(Boolean canCreate) {
			this.canCreate = canCreate;
		}
	}

	@Override
	public PublicSyncAndCreateImageScanTaskResponse getInstance(UnmarshallerContext context) {
		return	PublicSyncAndCreateImageScanTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

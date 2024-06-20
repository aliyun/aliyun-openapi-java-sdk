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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.GetWmEmbedTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWmEmbedTaskResponse extends AcsResponse {

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

		private String taskStatus;

		private String fileUrl;

		private String fileUrlExp;

		private String filename;

		private String outFileHashMd5;

		private Long outFileSize;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getFileUrl() {
			return this.fileUrl;
		}

		public void setFileUrl(String fileUrl) {
			this.fileUrl = fileUrl;
		}

		public String getFileUrlExp() {
			return this.fileUrlExp;
		}

		public void setFileUrlExp(String fileUrlExp) {
			this.fileUrlExp = fileUrlExp;
		}

		public String getFilename() {
			return this.filename;
		}

		public void setFilename(String filename) {
			this.filename = filename;
		}

		public String getOutFileHashMd5() {
			return this.outFileHashMd5;
		}

		public void setOutFileHashMd5(String outFileHashMd5) {
			this.outFileHashMd5 = outFileHashMd5;
		}

		public Long getOutFileSize() {
			return this.outFileSize;
		}

		public void setOutFileSize(Long outFileSize) {
			this.outFileSize = outFileSize;
		}
	}

	@Override
	public GetWmEmbedTaskResponse getInstance(UnmarshallerContext context) {
		return	GetWmEmbedTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

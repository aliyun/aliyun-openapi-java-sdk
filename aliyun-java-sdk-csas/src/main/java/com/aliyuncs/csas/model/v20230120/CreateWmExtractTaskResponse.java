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
import com.aliyuncs.csas.transform.v20230120.CreateWmExtractTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateWmExtractTaskResponse extends AcsResponse {

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

		private String fileHashMd5;

		private String fileSize;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getFileHashMd5() {
			return this.fileHashMd5;
		}

		public void setFileHashMd5(String fileHashMd5) {
			this.fileHashMd5 = fileHashMd5;
		}

		public String getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(String fileSize) {
			this.fileSize = fileSize;
		}
	}

	@Override
	public CreateWmExtractTaskResponse getInstance(UnmarshallerContext context) {
		return	CreateWmExtractTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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
import com.aliyuncs.csas.transform.v20230120.GetWmExtractTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWmExtractTaskResponse extends AcsResponse {

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

		private String createTime;

		private String taskId;

		private String status;

		private String filename;

		private String wmType;

		private Long wmInfoSize;

		private Long wmInfoUint;

		private String wmInfoBytesB64;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFilename() {
			return this.filename;
		}

		public void setFilename(String filename) {
			this.filename = filename;
		}

		public String getWmType() {
			return this.wmType;
		}

		public void setWmType(String wmType) {
			this.wmType = wmType;
		}

		public Long getWmInfoSize() {
			return this.wmInfoSize;
		}

		public void setWmInfoSize(Long wmInfoSize) {
			this.wmInfoSize = wmInfoSize;
		}

		public Long getWmInfoUint() {
			return this.wmInfoUint;
		}

		public void setWmInfoUint(Long wmInfoUint) {
			this.wmInfoUint = wmInfoUint;
		}

		public String getWmInfoBytesB64() {
			return this.wmInfoBytesB64;
		}

		public void setWmInfoBytesB64(String wmInfoBytesB64) {
			this.wmInfoBytesB64 = wmInfoBytesB64;
		}
	}

	@Override
	public GetWmExtractTaskResponse getInstance(UnmarshallerContext context) {
		return	GetWmExtractTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

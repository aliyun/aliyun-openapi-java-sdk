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

package com.aliyuncs.mpaas.model.v20190821;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20190821.QueryMpaasMrtcArtvcRecordfileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMpaasMrtcArtvcRecordfileResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private MrtcApiRecordFileQueryWrapResp mrtcApiRecordFileQueryWrapResp;

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

	public MrtcApiRecordFileQueryWrapResp getMrtcApiRecordFileQueryWrapResp() {
		return this.mrtcApiRecordFileQueryWrapResp;
	}

	public void setMrtcApiRecordFileQueryWrapResp(MrtcApiRecordFileQueryWrapResp mrtcApiRecordFileQueryWrapResp) {
		this.mrtcApiRecordFileQueryWrapResp = mrtcApiRecordFileQueryWrapResp;
	}

	public static class MrtcApiRecordFileQueryWrapResp {

		private String code;

		private String msg;

		private Data data;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public Data getData() {
			return this.data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {

			private String bizRequestId;

			private String filePath;

			private String fileType;

			private String recordStartTime;

			private String status;

			public String getBizRequestId() {
				return this.bizRequestId;
			}

			public void setBizRequestId(String bizRequestId) {
				this.bizRequestId = bizRequestId;
			}

			public String getFilePath() {
				return this.filePath;
			}

			public void setFilePath(String filePath) {
				this.filePath = filePath;
			}

			public String getFileType() {
				return this.fileType;
			}

			public void setFileType(String fileType) {
				this.fileType = fileType;
			}

			public String getRecordStartTime() {
				return this.recordStartTime;
			}

			public void setRecordStartTime(String recordStartTime) {
				this.recordStartTime = recordStartTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public QueryMpaasMrtcArtvcRecordfileResponse getInstance(UnmarshallerContext context) {
		return	QueryMpaasMrtcArtvcRecordfileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

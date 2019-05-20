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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRecordsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private RecordFileList recordFileList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public RecordFileList getRecordFileList() {
		return this.recordFileList;
	}

	public void setRecordFileList(RecordFileList recordFileList) {
		this.recordFileList = recordFileList;
	}

	public static class RecordFileList {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<RecordFile> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<RecordFile> getList() {
			return this.list;
		}

		public void setList(List<RecordFile> list) {
			this.list = list;
		}

		public static class RecordFile {

			private String fileName;

			private String displayFileName;

			private String filePath;

			private String connectId;

			private String userPhone;

			private String startPhoneTime;

			private String agent;

			private String displayName;

			private String duration;

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getDisplayFileName() {
				return this.displayFileName;
			}

			public void setDisplayFileName(String displayFileName) {
				this.displayFileName = displayFileName;
			}

			public String getFilePath() {
				return this.filePath;
			}

			public void setFilePath(String filePath) {
				this.filePath = filePath;
			}

			public String getConnectId() {
				return this.connectId;
			}

			public void setConnectId(String connectId) {
				this.connectId = connectId;
			}

			public String getUserPhone() {
				return this.userPhone;
			}

			public void setUserPhone(String userPhone) {
				this.userPhone = userPhone;
			}

			public String getStartPhoneTime() {
				return this.startPhoneTime;
			}

			public void setStartPhoneTime(String startPhoneTime) {
				this.startPhoneTime = startPhoneTime;
			}

			public String getAgent() {
				return this.agent;
			}

			public void setAgent(String agent) {
				this.agent = agent;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getDuration() {
				return this.duration;
			}

			public void setDuration(String duration) {
				this.duration = duration;
			}
		}
	}

	@Override
	public ListRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListRecordsResponseUnmarshaller.unmarshall(this, context);
	}
}

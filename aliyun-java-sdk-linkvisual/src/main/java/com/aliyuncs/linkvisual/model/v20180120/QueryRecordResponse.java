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

package com.aliyuncs.linkvisual.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.QueryRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRecordResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String code;

	private Data data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageSize;

		private Integer page;

		private List<ListItem> list;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String beginTime;

			private String endTime;

			private Integer recordType;

			private Integer streamType;

			private String fileName;

			private Integer fileSize;

			public String getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(String beginTime) {
				this.beginTime = beginTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public Integer getRecordType() {
				return this.recordType;
			}

			public void setRecordType(Integer recordType) {
				this.recordType = recordType;
			}

			public Integer getStreamType() {
				return this.streamType;
			}

			public void setStreamType(Integer streamType) {
				this.streamType = streamType;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public Integer getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(Integer fileSize) {
				this.fileSize = fileSize;
			}
		}
	}

	@Override
	public QueryRecordResponse getInstance(UnmarshallerContext context) {
		return	QueryRecordResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

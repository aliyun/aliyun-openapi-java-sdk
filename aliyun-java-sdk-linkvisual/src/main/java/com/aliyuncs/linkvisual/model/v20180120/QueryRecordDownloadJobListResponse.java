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
import com.aliyuncs.linkvisual.transform.v20180120.QueryRecordDownloadJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRecordDownloadJobListResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer total;

		private List<Job> jobList;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<Job> getJobList() {
			return this.jobList;
		}

		public void setJobList(List<Job> jobList) {
			this.jobList = jobList;
		}

		public static class Job {

			private Integer status;

			private Integer type;

			private Integer progress;

			private Integer recordType;

			private Integer beginTime;

			private String url;

			private String fileName;

			private Integer endTime;

			private Integer streamType;

			private String jobId;

			private Integer jobErrorCode;

			private String iotId;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public Integer getProgress() {
				return this.progress;
			}

			public void setProgress(Integer progress) {
				this.progress = progress;
			}

			public Integer getRecordType() {
				return this.recordType;
			}

			public void setRecordType(Integer recordType) {
				this.recordType = recordType;
			}

			public Integer getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(Integer beginTime) {
				this.beginTime = beginTime;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public Integer getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Integer endTime) {
				this.endTime = endTime;
			}

			public Integer getStreamType() {
				return this.streamType;
			}

			public void setStreamType(Integer streamType) {
				this.streamType = streamType;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public Integer getJobErrorCode() {
				return this.jobErrorCode;
			}

			public void setJobErrorCode(Integer jobErrorCode) {
				this.jobErrorCode = jobErrorCode;
			}

			public String getIotId() {
				return this.iotId;
			}

			public void setIotId(String iotId) {
				this.iotId = iotId;
			}
		}
	}

	@Override
	public QueryRecordDownloadJobListResponse getInstance(UnmarshallerContext context) {
		return	QueryRecordDownloadJobListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

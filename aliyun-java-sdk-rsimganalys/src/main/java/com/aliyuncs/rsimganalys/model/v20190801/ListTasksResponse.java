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

package com.aliyuncs.rsimganalys.model.v20190801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rsimganalys.transform.v20190801.ListTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTasksResponse extends AcsResponse {

	private String requestId;

	private Integer resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNo;

		private Integer pageSize;

		private Integer total;

		private Integer pages;

		private List<Contents> content;

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPages() {
			return this.pages;
		}

		public void setPages(Integer pages) {
			this.pages = pages;
		}

		public List<Contents> getContent() {
			return this.content;
		}

		public void setContent(List<Contents> content) {
			this.content = content;
		}

		public static class Contents {

			private String appkey;

			private Long createTime;

			private Integer enableZoneIdentification;

			private String jobId;

			private Long lastUpdateTime;

			private String namespace;

			private Integer progress;

			private Integer publishStatus;

			private String request;

			private String response;

			private String status;

			private Integer statusCode;

			private String statusMessage;

			private String userId;

			private String version;

			private String jobType;

			private String jobMessage;

			private String jobName;

			public String getAppkey() {
				return this.appkey;
			}

			public void setAppkey(String appkey) {
				this.appkey = appkey;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Integer getEnableZoneIdentification() {
				return this.enableZoneIdentification;
			}

			public void setEnableZoneIdentification(Integer enableZoneIdentification) {
				this.enableZoneIdentification = enableZoneIdentification;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public Long getLastUpdateTime() {
				return this.lastUpdateTime;
			}

			public void setLastUpdateTime(Long lastUpdateTime) {
				this.lastUpdateTime = lastUpdateTime;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public Integer getProgress() {
				return this.progress;
			}

			public void setProgress(Integer progress) {
				this.progress = progress;
			}

			public Integer getPublishStatus() {
				return this.publishStatus;
			}

			public void setPublishStatus(Integer publishStatus) {
				this.publishStatus = publishStatus;
			}

			public String getRequest() {
				return this.request;
			}

			public void setRequest(String request) {
				this.request = request;
			}

			public String getResponse() {
				return this.response;
			}

			public void setResponse(String response) {
				this.response = response;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getStatusCode() {
				return this.statusCode;
			}

			public void setStatusCode(Integer statusCode) {
				this.statusCode = statusCode;
			}

			public String getStatusMessage() {
				return this.statusMessage;
			}

			public void setStatusMessage(String statusMessage) {
				this.statusMessage = statusMessage;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getJobType() {
				return this.jobType;
			}

			public void setJobType(String jobType) {
				this.jobType = jobType;
			}

			public String getJobMessage() {
				return this.jobMessage;
			}

			public void setJobMessage(String jobMessage) {
				this.jobMessage = jobMessage;
			}

			public String getJobName() {
				return this.jobName;
			}

			public void setJobName(String jobName) {
				this.jobName = jobName;
			}
		}
	}

	@Override
	public ListTasksResponse getInstance(UnmarshallerContext context) {
		return	ListTasksResponseUnmarshaller.unmarshall(this, context);
	}
}

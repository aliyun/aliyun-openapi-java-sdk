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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribePreloadDetailByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePreloadDetailByIdResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private List<UrlDetail> urlDetails;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UrlDetail> getUrlDetails() {
		return this.urlDetails;
	}

	public void setUrlDetails(List<UrlDetail> urlDetails) {
		this.urlDetails = urlDetails;
	}

	public static class UrlDetail {

		private String taskId;

		private String domain;

		private String creationTime;

		private String endTime;

		private String retCode;

		private String process;

		private String status;

		private List<Url> urls;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getRetCode() {
			return this.retCode;
		}

		public void setRetCode(String retCode) {
			this.retCode = retCode;
		}

		public String getProcess() {
			return this.process;
		}

		public void setProcess(String process) {
			this.process = process;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<Url> getUrls() {
			return this.urls;
		}

		public void setUrls(List<Url> urls) {
			this.urls = urls;
		}

		public static class Url {

			private String url;

			private String success;

			private String description;

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getSuccess() {
				return this.success;
			}

			public void setSuccess(String success) {
				this.success = success;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public DescribePreloadDetailByIdResponse getInstance(UnmarshallerContext context) {
		return	DescribePreloadDetailByIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

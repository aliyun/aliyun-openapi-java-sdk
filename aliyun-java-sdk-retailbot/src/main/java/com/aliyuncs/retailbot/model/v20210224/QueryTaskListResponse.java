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

package com.aliyuncs.retailbot.model.v20210224;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailbot.transform.v20210224.QueryTaskListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTaskListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private PageData pageData;

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

	public PageData getPageData() {
		return this.pageData;
	}

	public void setPageData(PageData pageData) {
		this.pageData = pageData;
	}

	public static class PageData {

		private Long maxResults;

		private String nextToken;

		private List<DigTaskConfigDTO> data;

		public Long getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Long maxResults) {
			this.maxResults = maxResults;
		}

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public List<DigTaskConfigDTO> getData() {
			return this.data;
		}

		public void setData(List<DigTaskConfigDTO> data) {
			this.data = data;
		}

		public static class DigTaskConfigDTO {

			private String robotCode;

			private Long taskId;

			private String operateDate;

			private String type;

			private Long status;

			private String paramConfig;

			public String getRobotCode() {
				return this.robotCode;
			}

			public void setRobotCode(String robotCode) {
				this.robotCode = robotCode;
			}

			public Long getTaskId() {
				return this.taskId;
			}

			public void setTaskId(Long taskId) {
				this.taskId = taskId;
			}

			public String getOperateDate() {
				return this.operateDate;
			}

			public void setOperateDate(String operateDate) {
				this.operateDate = operateDate;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}

			public String getParamConfig() {
				return this.paramConfig;
			}

			public void setParamConfig(String paramConfig) {
				this.paramConfig = paramConfig;
			}
		}
	}

	@Override
	public QueryTaskListResponse getInstance(UnmarshallerContext context) {
		return	QueryTaskListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

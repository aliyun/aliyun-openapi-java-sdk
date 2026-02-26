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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.ListApiDatasourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApiDatasourceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalNum;

		private List<DataItem> data;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Integer totalNum) {
			this.totalNum = totalNum;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String apiId;

			private String body;

			private Float dataSize;

			private String dateUpdateTime;

			private String gmtCreate;

			private String gmtModified;

			private String jobId;

			private String parameters;

			private String showName;

			private Integer statusType;

			public String getApiId() {
				return this.apiId;
			}

			public void setApiId(String apiId) {
				this.apiId = apiId;
			}

			public String getBody() {
				return this.body;
			}

			public void setBody(String body) {
				this.body = body;
			}

			public Float getDataSize() {
				return this.dataSize;
			}

			public void setDataSize(Float dataSize) {
				this.dataSize = dataSize;
			}

			public String getDateUpdateTime() {
				return this.dateUpdateTime;
			}

			public void setDateUpdateTime(String dateUpdateTime) {
				this.dateUpdateTime = dateUpdateTime;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getParameters() {
				return this.parameters;
			}

			public void setParameters(String parameters) {
				this.parameters = parameters;
			}

			public String getShowName() {
				return this.showName;
			}

			public void setShowName(String showName) {
				this.showName = showName;
			}

			public Integer getStatusType() {
				return this.statusType;
			}

			public void setStatusType(Integer statusType) {
				this.statusType = statusType;
			}
		}
	}

	@Override
	public ListApiDatasourceResponse getInstance(UnmarshallerContext context) {
		return	ListApiDatasourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

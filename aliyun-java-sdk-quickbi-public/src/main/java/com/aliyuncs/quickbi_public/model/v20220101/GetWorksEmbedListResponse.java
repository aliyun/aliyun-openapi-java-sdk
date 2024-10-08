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
import com.aliyuncs.quickbi_public.transform.v20220101.GetWorksEmbedListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWorksEmbedListResponse extends AcsResponse {

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

		private Long pageNo;

		private Long pageSize;

		private Long totalNum;

		private Long totalPages;

		private List<DataItem> data;

		public Long getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Long pageNo) {
			this.pageNo = pageNo;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Long totalNum) {
			this.totalNum = totalNum;
		}

		public Long getTotalPages() {
			return this.totalPages;
		}

		public void setTotalPages(Long totalPages) {
			this.totalPages = totalPages;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String embedTime;

			private String worksId;

			private String worksName;

			private String worksType;

			private String workspaceId;

			public String getEmbedTime() {
				return this.embedTime;
			}

			public void setEmbedTime(String embedTime) {
				this.embedTime = embedTime;
			}

			public String getWorksId() {
				return this.worksId;
			}

			public void setWorksId(String worksId) {
				this.worksId = worksId;
			}

			public String getWorksName() {
				return this.worksName;
			}

			public void setWorksName(String worksName) {
				this.worksName = worksName;
			}

			public String getWorksType() {
				return this.worksType;
			}

			public void setWorksType(String worksType) {
				this.worksType = worksType;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}
		}
	}

	@Override
	public GetWorksEmbedListResponse getInstance(UnmarshallerContext context) {
		return	GetWorksEmbedListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

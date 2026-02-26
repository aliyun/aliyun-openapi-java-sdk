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
import com.aliyuncs.quickbi_public.transform.v20220101.GetMailTaskListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMailTaskListResponse extends AcsResponse {

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

		private Integer totalPages;

		private Integer pre;

		private Integer next;

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

		public Integer getTotalPages() {
			return this.totalPages;
		}

		public void setTotalPages(Integer totalPages) {
			this.totalPages = totalPages;
		}

		public Integer getPre() {
			return this.pre;
		}

		public void setPre(Integer pre) {
			this.pre = pre;
		}

		public Integer getNext() {
			return this.next;
		}

		public void setNext(Integer next) {
			this.next = next;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String mailId;

			private Boolean paused;

			private String bizOwnerUserId;

			private String bizOwnerName;

			private String subscribeName;

			public String getMailId() {
				return this.mailId;
			}

			public void setMailId(String mailId) {
				this.mailId = mailId;
			}

			public Boolean getPaused() {
				return this.paused;
			}

			public void setPaused(Boolean paused) {
				this.paused = paused;
			}

			public String getBizOwnerUserId() {
				return this.bizOwnerUserId;
			}

			public void setBizOwnerUserId(String bizOwnerUserId) {
				this.bizOwnerUserId = bizOwnerUserId;
			}

			public String getBizOwnerName() {
				return this.bizOwnerName;
			}

			public void setBizOwnerName(String bizOwnerName) {
				this.bizOwnerName = bizOwnerName;
			}

			public String getSubscribeName() {
				return this.subscribeName;
			}

			public void setSubscribeName(String subscribeName) {
				this.subscribeName = subscribeName;
			}
		}
	}

	@Override
	public GetMailTaskListResponse getInstance(UnmarshallerContext context) {
		return	GetMailTaskListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

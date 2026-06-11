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

package com.aliyuncs.airegistry.model.v20260317;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airegistry.transform.v20260317.ListPromptVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPromptVersionsResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pagesAvailable;

		private List<Item> pageItems;

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

		public Integer getPagesAvailable() {
			return this.pagesAvailable;
		}

		public void setPagesAvailable(Integer pagesAvailable) {
			this.pagesAvailable = pagesAvailable;
		}

		public List<Item> getPageItems() {
			return this.pageItems;
		}

		public void setPageItems(List<Item> pageItems) {
			this.pageItems = pageItems;
		}

		public static class Item {

			private String promptKey;

			private String version;

			private String status;

			private String commitMsg;

			private String srcUser;

			private Long gmtModified;

			public String getPromptKey() {
				return this.promptKey;
			}

			public void setPromptKey(String promptKey) {
				this.promptKey = promptKey;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCommitMsg() {
				return this.commitMsg;
			}

			public void setCommitMsg(String commitMsg) {
				this.commitMsg = commitMsg;
			}

			public String getSrcUser() {
				return this.srcUser;
			}

			public void setSrcUser(String srcUser) {
				this.srcUser = srcUser;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}
		}
	}

	@Override
	public ListPromptVersionsResponse getInstance(UnmarshallerContext context) {
		return	ListPromptVersionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

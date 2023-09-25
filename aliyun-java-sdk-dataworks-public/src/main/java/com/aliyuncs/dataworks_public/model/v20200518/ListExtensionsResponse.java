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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListExtensionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListExtensionsResponse extends AcsResponse {

	private String requestId;

	private PagingInfo pagingInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PagingInfo getPagingInfo() {
		return this.pagingInfo;
	}

	public void setPagingInfo(PagingInfo pagingInfo) {
		this.pagingInfo = pagingInfo;
	}

	public static class PagingInfo {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<ExtensionsItem> extensions;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<ExtensionsItem> getExtensions() {
			return this.extensions;
		}

		public void setExtensions(List<ExtensionsItem> extensions) {
			this.extensions = extensions;
		}

		public static class ExtensionsItem {

			private Integer status;

			private String extensionDesc;

			private String extensionName;

			private String owner;

			private String extensionCode;

			private List<BindEventListItem> bindEventList;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getExtensionDesc() {
				return this.extensionDesc;
			}

			public void setExtensionDesc(String extensionDesc) {
				this.extensionDesc = extensionDesc;
			}

			public String getExtensionName() {
				return this.extensionName;
			}

			public void setExtensionName(String extensionName) {
				this.extensionName = extensionName;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getExtensionCode() {
				return this.extensionCode;
			}

			public void setExtensionCode(String extensionCode) {
				this.extensionCode = extensionCode;
			}

			public List<BindEventListItem> getBindEventList() {
				return this.bindEventList;
			}

			public void setBindEventList(List<BindEventListItem> bindEventList) {
				this.bindEventList = bindEventList;
			}

			public static class BindEventListItem {

				private String eventName;

				private String eventCode;

				public String getEventName() {
					return this.eventName;
				}

				public void setEventName(String eventName) {
					this.eventName = eventName;
				}

				public String getEventCode() {
					return this.eventCode;
				}

				public void setEventCode(String eventCode) {
					this.eventCode = eventCode;
				}
			}
		}
	}

	@Override
	public ListExtensionsResponse getInstance(UnmarshallerContext context) {
		return	ListExtensionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

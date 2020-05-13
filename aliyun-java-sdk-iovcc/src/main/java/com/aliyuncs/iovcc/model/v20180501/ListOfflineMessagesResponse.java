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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.ListOfflineMessagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOfflineMessagesResponse extends AcsResponse {

	private String requestId;

	private OfflineMessages offlineMessages;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OfflineMessages getOfflineMessages() {
		return this.offlineMessages;
	}

	public void setOfflineMessages(OfflineMessages offlineMessages) {
		this.offlineMessages = offlineMessages;
	}

	public static class OfflineMessages {

		private List<分页查询列表数据> list;

		private Pagination pagination;

		public List<分页查询列表数据> getList() {
			return this.list;
		}

		public void setList(List<分页查询列表数据> list) {
			this.list = list;
		}

		public Pagination getPagination() {
			return this.pagination;
		}

		public void setPagination(Pagination pagination) {
			this.pagination = pagination;
		}

		public static class 分页查询列表数据 {

			private Long mid;

			private Long gmtCreate;

			private Long expiredTime;

			public Long getMid() {
				return this.mid;
			}

			public void setMid(Long mid) {
				this.mid = mid;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getExpiredTime() {
				return this.expiredTime;
			}

			public void setExpiredTime(Long expiredTime) {
				this.expiredTime = expiredTime;
			}
		}

		public static class Pagination {

			private Integer totalCount;

			private Integer totalPageCount;

			private Integer pageIndex;

			private Integer pageSize;

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}

			public Integer getTotalPageCount() {
				return this.totalPageCount;
			}

			public void setTotalPageCount(Integer totalPageCount) {
				this.totalPageCount = totalPageCount;
			}

			public Integer getPageIndex() {
				return this.pageIndex;
			}

			public void setPageIndex(Integer pageIndex) {
				this.pageIndex = pageIndex;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}
		}
	}

	@Override
	public ListOfflineMessagesResponse getInstance(UnmarshallerContext context) {
		return	ListOfflineMessagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

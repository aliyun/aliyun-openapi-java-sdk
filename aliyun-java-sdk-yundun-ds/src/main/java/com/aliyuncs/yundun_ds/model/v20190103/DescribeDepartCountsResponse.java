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

package com.aliyuncs.yundun_ds.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun_ds.transform.v20190103.DescribeDepartCountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDepartCountsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<DepartCount> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<DepartCount> getItems() {
		return this.items;
	}

	public void setItems(List<DepartCount> items) {
		this.items = items;
	}

	public static class DepartCount {

		private String departName;

		private Long departCount;

		private Long count;

		private Long userCount;

		private Long dtCount;

		private Long subCount;

		private Long sensitiveCount;

		private Long eventTotalCount;

		private Long confirmCount;

		private Long userConfirmCount;

		private Long lastEventCount;

		private Long topSubTypeName;

		private Long topDisplayName;

		public String getDepartName() {
			return this.departName;
		}

		public void setDepartName(String departName) {
			this.departName = departName;
		}

		public Long getDepartCount() {
			return this.departCount;
		}

		public void setDepartCount(Long departCount) {
			this.departCount = departCount;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Long getUserCount() {
			return this.userCount;
		}

		public void setUserCount(Long userCount) {
			this.userCount = userCount;
		}

		public Long getDtCount() {
			return this.dtCount;
		}

		public void setDtCount(Long dtCount) {
			this.dtCount = dtCount;
		}

		public Long getSubCount() {
			return this.subCount;
		}

		public void setSubCount(Long subCount) {
			this.subCount = subCount;
		}

		public Long getSensitiveCount() {
			return this.sensitiveCount;
		}

		public void setSensitiveCount(Long sensitiveCount) {
			this.sensitiveCount = sensitiveCount;
		}

		public Long getEventTotalCount() {
			return this.eventTotalCount;
		}

		public void setEventTotalCount(Long eventTotalCount) {
			this.eventTotalCount = eventTotalCount;
		}

		public Long getConfirmCount() {
			return this.confirmCount;
		}

		public void setConfirmCount(Long confirmCount) {
			this.confirmCount = confirmCount;
		}

		public Long getUserConfirmCount() {
			return this.userConfirmCount;
		}

		public void setUserConfirmCount(Long userConfirmCount) {
			this.userConfirmCount = userConfirmCount;
		}

		public Long getLastEventCount() {
			return this.lastEventCount;
		}

		public void setLastEventCount(Long lastEventCount) {
			this.lastEventCount = lastEventCount;
		}

		public Long getTopSubTypeName() {
			return this.topSubTypeName;
		}

		public void setTopSubTypeName(Long topSubTypeName) {
			this.topSubTypeName = topSubTypeName;
		}

		public Long getTopDisplayName() {
			return this.topDisplayName;
		}

		public void setTopDisplayName(Long topDisplayName) {
			this.topDisplayName = topDisplayName;
		}
	}

	@Override
	public DescribeDepartCountsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDepartCountsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

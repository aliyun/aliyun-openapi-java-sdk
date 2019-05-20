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
import com.aliyuncs.yundun_ds.transform.v20190103.DescribeEventCountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventCountsResponse extends AcsResponse {

	private String requestId;

	private List<EventCount> eventCountList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EventCount> getEventCountList() {
		return this.eventCountList;
	}

	public void setEventCountList(List<EventCount> eventCountList) {
		this.eventCountList = eventCountList;
	}

	public static class EventCount {

		private String typeCode;

		private String typeName;

		private Long date;

		private Total total;

		private LastDay lastDay;

		private LastWeek lastWeek;

		private LastMonth lastMonth;

		public String getTypeCode() {
			return this.typeCode;
		}

		public void setTypeCode(String typeCode) {
			this.typeCode = typeCode;
		}

		public String getTypeName() {
			return this.typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}

		public Long getDate() {
			return this.date;
		}

		public void setDate(Long date) {
			this.date = date;
		}

		public Total getTotal() {
			return this.total;
		}

		public void setTotal(Total total) {
			this.total = total;
		}

		public LastDay getLastDay() {
			return this.lastDay;
		}

		public void setLastDay(LastDay lastDay) {
			this.lastDay = lastDay;
		}

		public LastWeek getLastWeek() {
			return this.lastWeek;
		}

		public void setLastWeek(LastWeek lastWeek) {
			this.lastWeek = lastWeek;
		}

		public LastMonth getLastMonth() {
			return this.lastMonth;
		}

		public void setLastMonth(LastMonth lastMonth) {
			this.lastMonth = lastMonth;
		}

		public static class Total {

			private Long totalCount;

			private Long undealCount;

			private Long confirmCount;

			private Long excludeCount;

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}

			public Long getUndealCount() {
				return this.undealCount;
			}

			public void setUndealCount(Long undealCount) {
				this.undealCount = undealCount;
			}

			public Long getConfirmCount() {
				return this.confirmCount;
			}

			public void setConfirmCount(Long confirmCount) {
				this.confirmCount = confirmCount;
			}

			public Long getExcludeCount() {
				return this.excludeCount;
			}

			public void setExcludeCount(Long excludeCount) {
				this.excludeCount = excludeCount;
			}
		}

		public static class LastDay {

			private Long totalCount;

			private Long undealCount;

			private Long confirmCount;

			private Long excludeCount;

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}

			public Long getUndealCount() {
				return this.undealCount;
			}

			public void setUndealCount(Long undealCount) {
				this.undealCount = undealCount;
			}

			public Long getConfirmCount() {
				return this.confirmCount;
			}

			public void setConfirmCount(Long confirmCount) {
				this.confirmCount = confirmCount;
			}

			public Long getExcludeCount() {
				return this.excludeCount;
			}

			public void setExcludeCount(Long excludeCount) {
				this.excludeCount = excludeCount;
			}
		}

		public static class LastWeek {

			private Long totalCount;

			private Long undealCount;

			private Long confirmCount;

			private Long excludeCount;

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}

			public Long getUndealCount() {
				return this.undealCount;
			}

			public void setUndealCount(Long undealCount) {
				this.undealCount = undealCount;
			}

			public Long getConfirmCount() {
				return this.confirmCount;
			}

			public void setConfirmCount(Long confirmCount) {
				this.confirmCount = confirmCount;
			}

			public Long getExcludeCount() {
				return this.excludeCount;
			}

			public void setExcludeCount(Long excludeCount) {
				this.excludeCount = excludeCount;
			}
		}

		public static class LastMonth {

			private Long totalCount;

			private Long undealCount;

			private Long confirmCount;

			private Long excludeCount;

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}

			public Long getUndealCount() {
				return this.undealCount;
			}

			public void setUndealCount(Long undealCount) {
				this.undealCount = undealCount;
			}

			public Long getConfirmCount() {
				return this.confirmCount;
			}

			public void setConfirmCount(Long confirmCount) {
				this.confirmCount = confirmCount;
			}

			public Long getExcludeCount() {
				return this.excludeCount;
			}

			public void setExcludeCount(Long excludeCount) {
				this.excludeCount = excludeCount;
			}
		}
	}

	@Override
	public DescribeEventCountsResponse getInstance(UnmarshallerContext context) {
		return	DescribeEventCountsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

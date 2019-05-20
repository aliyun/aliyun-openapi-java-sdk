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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun_ds.transform.v20190103.DescribeTotalCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTotalCountResponse extends AcsResponse {

	private String requestId;

	private DataCount dataCount;

	private EventCount eventCount;

	private DepartCount departCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DataCount getDataCount() {
		return this.dataCount;
	}

	public void setDataCount(DataCount dataCount) {
		this.dataCount = dataCount;
	}

	public EventCount getEventCount() {
		return this.eventCount;
	}

	public void setEventCount(EventCount eventCount) {
		this.eventCount = eventCount;
	}

	public DepartCount getDepartCount() {
		return this.departCount;
	}

	public void setDepartCount(DepartCount departCount) {
		this.departCount = departCount;
	}

	public static class DataCount {

		private Instance instance;

		private Table table;

		private Oss oss;

		public Instance getInstance() {
			return this.instance;
		}

		public void setInstance(Instance instance) {
			this.instance = instance;
		}

		public Table getTable() {
			return this.table;
		}

		public void setTable(Table table) {
			this.table = table;
		}

		public Oss getOss() {
			return this.oss;
		}

		public void setOss(Oss oss) {
			this.oss = oss;
		}

		public static class Instance {

			private Long totalCount;

			private Long count;

			private Long sensitiveCount;

			private Long lastCount;

			private Long lastSensitiveCount;

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}

			public Long getSensitiveCount() {
				return this.sensitiveCount;
			}

			public void setSensitiveCount(Long sensitiveCount) {
				this.sensitiveCount = sensitiveCount;
			}

			public Long getLastCount() {
				return this.lastCount;
			}

			public void setLastCount(Long lastCount) {
				this.lastCount = lastCount;
			}

			public Long getLastSensitiveCount() {
				return this.lastSensitiveCount;
			}

			public void setLastSensitiveCount(Long lastSensitiveCount) {
				this.lastSensitiveCount = lastSensitiveCount;
			}
		}

		public static class Table {

			private Long totalCount;

			private Long count;

			private Long sensitiveCount;

			private Long lastCount;

			private Long lastSensitiveCount;

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}

			public Long getSensitiveCount() {
				return this.sensitiveCount;
			}

			public void setSensitiveCount(Long sensitiveCount) {
				this.sensitiveCount = sensitiveCount;
			}

			public Long getLastCount() {
				return this.lastCount;
			}

			public void setLastCount(Long lastCount) {
				this.lastCount = lastCount;
			}

			public Long getLastSensitiveCount() {
				return this.lastSensitiveCount;
			}

			public void setLastSensitiveCount(Long lastSensitiveCount) {
				this.lastSensitiveCount = lastSensitiveCount;
			}
		}

		public static class Oss {

			private Long totalCount;

			private Long count;

			private Long sensitiveCount;

			private Long lastCount;

			private Long lastSensitiveCount;

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}

			public Long getSensitiveCount() {
				return this.sensitiveCount;
			}

			public void setSensitiveCount(Long sensitiveCount) {
				this.sensitiveCount = sensitiveCount;
			}

			public Long getLastCount() {
				return this.lastCount;
			}

			public void setLastCount(Long lastCount) {
				this.lastCount = lastCount;
			}

			public Long getLastSensitiveCount() {
				return this.lastSensitiveCount;
			}

			public void setLastSensitiveCount(Long lastSensitiveCount) {
				this.lastSensitiveCount = lastSensitiveCount;
			}
		}
	}

	public static class EventCount {

		private Total total;

		public Total getTotal() {
			return this.total;
		}

		public void setTotal(Total total) {
			this.total = total;
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
	}

	public static class DepartCount {

		private Long departCount;

		private Long count;

		private Long userCount;

		private Long dtCount;

		private Long subCount;

		private Long sensitiveCount;

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
	}

	@Override
	public DescribeTotalCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeTotalCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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
import com.aliyuncs.yundun_ds.transform.v20190103.DescribeDataCountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataCountsResponse extends AcsResponse {

	private String requestId;

	private List<DataCount> dataCountList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataCount> getDataCountList() {
		return this.dataCountList;
	}

	public void setDataCountList(List<DataCount> dataCountList) {
		this.dataCountList = dataCountList;
	}

	public static class DataCount {

		private Long productId;

		private String productCode;

		private Instance instance;

		private Table table;

		private _Package _package;

		private Column column;

		private Oss oss;

		public Long getProductId() {
			return this.productId;
		}

		public void setProductId(Long productId) {
			this.productId = productId;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

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

		public _Package get_Package() {
			return this._package;
		}

		public void set_Package(_Package _package) {
			this._package = _package;
		}

		public Column getColumn() {
			return this.column;
		}

		public void setColumn(Column column) {
			this.column = column;
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

		public static class _Package {

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

		public static class Column {

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

	@Override
	public DescribeDataCountsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataCountsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

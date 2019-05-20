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
import com.aliyuncs.yundun_ds.transform.v20190103.DescribeDataTotalCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataTotalCountResponse extends AcsResponse {

	private String requestId;

	private DataCount dataCount;

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

	public static class DataCount {

		private Instance instance;

		private Table table;

		private _Package _package;

		private Column column;

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

			private List<RiskCount> riskCountList;

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

			public List<RiskCount> getRiskCountList() {
				return this.riskCountList;
			}

			public void setRiskCountList(List<RiskCount> riskCountList) {
				this.riskCountList = riskCountList;
			}

			public static class RiskCount {

				private Long id;

				private String name;

				private Long count;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Long getCount() {
					return this.count;
				}

				public void setCount(Long count) {
					this.count = count;
				}
			}
		}

		public static class Table {

			private Long totalCount;

			private Long count;

			private Long sensitiveCount;

			private Long lastCount;

			private Long lastSensitiveCount;

			private List<RiskCount2> riskCountList1;

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

			public List<RiskCount2> getRiskCountList1() {
				return this.riskCountList1;
			}

			public void setRiskCountList1(List<RiskCount2> riskCountList1) {
				this.riskCountList1 = riskCountList1;
			}

			public static class RiskCount2 {

				private Long id;

				private String name;

				private Long count;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Long getCount() {
					return this.count;
				}

				public void setCount(Long count) {
					this.count = count;
				}
			}
		}

		public static class _Package {

			private Long totalCount;

			private Long count;

			private Long sensitiveCount;

			private Long lastCount;

			private Long lastSensitiveCount;

			private List<RiskCount4> riskCountList3;

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

			public List<RiskCount4> getRiskCountList3() {
				return this.riskCountList3;
			}

			public void setRiskCountList3(List<RiskCount4> riskCountList3) {
				this.riskCountList3 = riskCountList3;
			}

			public static class RiskCount4 {

				private Long id;

				private String name;

				private Long count;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Long getCount() {
					return this.count;
				}

				public void setCount(Long count) {
					this.count = count;
				}
			}
		}

		public static class Column {

			private Long totalCount;

			private Long count;

			private Long sensitiveCount;

			private Long lastCount;

			private Long lastSensitiveCount;

			private List<RiskCount6> riskCountList5;

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

			public List<RiskCount6> getRiskCountList5() {
				return this.riskCountList5;
			}

			public void setRiskCountList5(List<RiskCount6> riskCountList5) {
				this.riskCountList5 = riskCountList5;
			}

			public static class RiskCount6 {

				private Long id;

				private String name;

				private Long count;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Long getCount() {
					return this.count;
				}

				public void setCount(Long count) {
					this.count = count;
				}
			}
		}

		public static class Oss {

			private Long totalCount;

			private Long count;

			private Long sensitiveCount;

			private Long lastCount;

			private Long lastSensitiveCount;

			private List<RiskCount8> riskCountList7;

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

			public List<RiskCount8> getRiskCountList7() {
				return this.riskCountList7;
			}

			public void setRiskCountList7(List<RiskCount8> riskCountList7) {
				this.riskCountList7 = riskCountList7;
			}

			public static class RiskCount8 {

				private Long id;

				private String name;

				private Long count;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Long getCount() {
					return this.count;
				}

				public void setCount(Long count) {
					this.count = count;
				}
			}
		}
	}

	@Override
	public DescribeDataTotalCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataTotalCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

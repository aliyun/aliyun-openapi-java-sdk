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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeWarningResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWarningResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private Integer pageSize;

	private Integer totalCount;

	private Integer currentPage;

	private List<Warning> warnings;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<Warning> getWarnings() {
		return this.warnings;
	}

	public void setWarnings(List<Warning> warnings) {
		this.warnings = warnings;
	}

	public static class Warning {

		private Long riskWarningId;

		private String riskName;

		private String uuid;

		private String rirstFoundTime;

		private String lastFoundTime;

		private String level;

		private String typeName;

		private String subTypeName;

		private String typeAlias;

		private String subTypeAlias;

		private Integer status;

		private List<Detail> details;

		public Long getRiskWarningId() {
			return this.riskWarningId;
		}

		public void setRiskWarningId(Long riskWarningId) {
			this.riskWarningId = riskWarningId;
		}

		public String getRiskName() {
			return this.riskName;
		}

		public void setRiskName(String riskName) {
			this.riskName = riskName;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getRirstFoundTime() {
			return this.rirstFoundTime;
		}

		public void setRirstFoundTime(String rirstFoundTime) {
			this.rirstFoundTime = rirstFoundTime;
		}

		public String getLastFoundTime() {
			return this.lastFoundTime;
		}

		public void setLastFoundTime(String lastFoundTime) {
			this.lastFoundTime = lastFoundTime;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getTypeName() {
			return this.typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}

		public String getSubTypeName() {
			return this.subTypeName;
		}

		public void setSubTypeName(String subTypeName) {
			this.subTypeName = subTypeName;
		}

		public String getTypeAlias() {
			return this.typeAlias;
		}

		public void setTypeAlias(String typeAlias) {
			this.typeAlias = typeAlias;
		}

		public String getSubTypeAlias() {
			return this.subTypeAlias;
		}

		public void setSubTypeAlias(String subTypeAlias) {
			this.subTypeAlias = subTypeAlias;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public List<Detail> getDetails() {
			return this.details;
		}

		public void setDetails(List<Detail> details) {
			this.details = details;
		}

		public static class Detail {

			private List<DetailItem> detailItems;

			public List<DetailItem> getDetailItems() {
				return this.detailItems;
			}

			public void setDetailItems(List<DetailItem> detailItems) {
				this.detailItems = detailItems;
			}

			public static class DetailItem {

				private String name;

				private String value;

				private String type;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}
		}
	}

	@Override
	public DescribeWarningResponse getInstance(UnmarshallerContext context) {
		return	DescribeWarningResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

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
import com.aliyuncs.aegis.transform.v20161111.DescribesummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribesummaryResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private Integer pageSize;

	private Integer totalCount;

	private Integer currentPage;

	private List<WarningSummary> warningSummarys;

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

	public List<WarningSummary> getWarningSummarys() {
		return this.warningSummarys;
	}

	public void setWarningSummarys(List<WarningSummary> warningSummarys) {
		this.warningSummarys = warningSummarys;
	}

	public static class WarningSummary {

		private Long riskId;

		private String riskName;

		private String level;

		private String typeAlias;

		private String subTypeAlias;

		private String lastFoundTime;

		private Integer pendingCount;

		private Integer totalCount;

		private String riskDetail;

		public Long getRiskId() {
			return this.riskId;
		}

		public void setRiskId(Long riskId) {
			this.riskId = riskId;
		}

		public String getRiskName() {
			return this.riskName;
		}

		public void setRiskName(String riskName) {
			this.riskName = riskName;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
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

		public String getLastFoundTime() {
			return this.lastFoundTime;
		}

		public void setLastFoundTime(String lastFoundTime) {
			this.lastFoundTime = lastFoundTime;
		}

		public Integer getPendingCount() {
			return this.pendingCount;
		}

		public void setPendingCount(Integer pendingCount) {
			this.pendingCount = pendingCount;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public String getRiskDetail() {
			return this.riskDetail;
		}

		public void setRiskDetail(String riskDetail) {
			this.riskDetail = riskDetail;
		}
	}

	@Override
	public DescribesummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribesummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

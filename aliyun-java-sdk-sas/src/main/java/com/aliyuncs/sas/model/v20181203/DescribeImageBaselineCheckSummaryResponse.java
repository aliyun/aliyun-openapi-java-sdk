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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeImageBaselineCheckSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageBaselineCheckSummaryResponse extends AcsResponse {

	private String requestId;

	private List<BaselineResultSummaryItem> baselineResultSummary;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BaselineResultSummaryItem> getBaselineResultSummary() {
		return this.baselineResultSummary;
	}

	public void setBaselineResultSummary(List<BaselineResultSummaryItem> baselineResultSummary) {
		this.baselineResultSummary = baselineResultSummary;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class BaselineResultSummaryItem {

		private Integer status;

		private Integer middleRiskImage;

		private String baselineNameLevel;

		private Long lastScanTime;

		private Integer highRiskImage;

		private String baselineNameKey;

		private String baselineClassKey;

		private String baselineNameAlias;

		private String baselineClassAlias;

		private Long firstScanTime;

		private Integer lowRiskImage;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getMiddleRiskImage() {
			return this.middleRiskImage;
		}

		public void setMiddleRiskImage(Integer middleRiskImage) {
			this.middleRiskImage = middleRiskImage;
		}

		public String getBaselineNameLevel() {
			return this.baselineNameLevel;
		}

		public void setBaselineNameLevel(String baselineNameLevel) {
			this.baselineNameLevel = baselineNameLevel;
		}

		public Long getLastScanTime() {
			return this.lastScanTime;
		}

		public void setLastScanTime(Long lastScanTime) {
			this.lastScanTime = lastScanTime;
		}

		public Integer getHighRiskImage() {
			return this.highRiskImage;
		}

		public void setHighRiskImage(Integer highRiskImage) {
			this.highRiskImage = highRiskImage;
		}

		public String getBaselineNameKey() {
			return this.baselineNameKey;
		}

		public void setBaselineNameKey(String baselineNameKey) {
			this.baselineNameKey = baselineNameKey;
		}

		public String getBaselineClassKey() {
			return this.baselineClassKey;
		}

		public void setBaselineClassKey(String baselineClassKey) {
			this.baselineClassKey = baselineClassKey;
		}

		public String getBaselineNameAlias() {
			return this.baselineNameAlias;
		}

		public void setBaselineNameAlias(String baselineNameAlias) {
			this.baselineNameAlias = baselineNameAlias;
		}

		public String getBaselineClassAlias() {
			return this.baselineClassAlias;
		}

		public void setBaselineClassAlias(String baselineClassAlias) {
			this.baselineClassAlias = baselineClassAlias;
		}

		public Long getFirstScanTime() {
			return this.firstScanTime;
		}

		public void setFirstScanTime(Long firstScanTime) {
			this.firstScanTime = firstScanTime;
		}

		public Integer getLowRiskImage() {
			return this.lowRiskImage;
		}

		public void setLowRiskImage(Integer lowRiskImage) {
			this.lowRiskImage = lowRiskImage;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
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

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeImageBaselineCheckSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageBaselineCheckSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

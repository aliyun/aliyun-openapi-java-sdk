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
import com.aliyuncs.sas.transform.v20181203.DescribeImageBaselineItemListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageBaselineItemListResponse extends AcsResponse {

	private String requestId;

	private List<BaselineItemInfosItem> baselineItemInfos;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BaselineItemInfosItem> getBaselineItemInfos() {
		return this.baselineItemInfos;
	}

	public void setBaselineItemInfos(List<BaselineItemInfosItem> baselineItemInfos) {
		this.baselineItemInfos = baselineItemInfos;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class BaselineItemInfosItem {

		private Integer status;

		private Integer whiteList;

		private String baselineNameKey;

		private String baselineItemAlias;

		private String baselineClassKey;

		private String baselineClassAlias;

		private String baselineNameAlias;

		private String baselineItemKey;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getWhiteList() {
			return this.whiteList;
		}

		public void setWhiteList(Integer whiteList) {
			this.whiteList = whiteList;
		}

		public String getBaselineNameKey() {
			return this.baselineNameKey;
		}

		public void setBaselineNameKey(String baselineNameKey) {
			this.baselineNameKey = baselineNameKey;
		}

		public String getBaselineItemAlias() {
			return this.baselineItemAlias;
		}

		public void setBaselineItemAlias(String baselineItemAlias) {
			this.baselineItemAlias = baselineItemAlias;
		}

		public String getBaselineClassKey() {
			return this.baselineClassKey;
		}

		public void setBaselineClassKey(String baselineClassKey) {
			this.baselineClassKey = baselineClassKey;
		}

		public String getBaselineClassAlias() {
			return this.baselineClassAlias;
		}

		public void setBaselineClassAlias(String baselineClassAlias) {
			this.baselineClassAlias = baselineClassAlias;
		}

		public String getBaselineNameAlias() {
			return this.baselineNameAlias;
		}

		public void setBaselineNameAlias(String baselineNameAlias) {
			this.baselineNameAlias = baselineNameAlias;
		}

		public String getBaselineItemKey() {
			return this.baselineItemKey;
		}

		public void setBaselineItemKey(String baselineItemKey) {
			this.baselineItemKey = baselineItemKey;
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
	public DescribeImageBaselineItemListResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageBaselineItemListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

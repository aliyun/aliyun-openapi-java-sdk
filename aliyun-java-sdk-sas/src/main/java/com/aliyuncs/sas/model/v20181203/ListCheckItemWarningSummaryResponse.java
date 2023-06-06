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
import com.aliyuncs.sas.transform.v20181203.ListCheckItemWarningSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCheckItemWarningSummaryResponse extends AcsResponse {

	private String requestId;

	private List<ListItem> list;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ListItem {

		private String riskType;

		private String alias;

		private Long checkId;

		private String checkItem;

		private String checkLevel;

		private String checkType;

		private String advice;

		private String description;

		private Integer status;

		private Integer warningMachineCount;

		private Boolean containerCheckItem;

		public String getRiskType() {
			return this.riskType;
		}

		public void setRiskType(String riskType) {
			this.riskType = riskType;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public Long getCheckId() {
			return this.checkId;
		}

		public void setCheckId(Long checkId) {
			this.checkId = checkId;
		}

		public String getCheckItem() {
			return this.checkItem;
		}

		public void setCheckItem(String checkItem) {
			this.checkItem = checkItem;
		}

		public String getCheckLevel() {
			return this.checkLevel;
		}

		public void setCheckLevel(String checkLevel) {
			this.checkLevel = checkLevel;
		}

		public String getCheckType() {
			return this.checkType;
		}

		public void setCheckType(String checkType) {
			this.checkType = checkType;
		}

		public String getAdvice() {
			return this.advice;
		}

		public void setAdvice(String advice) {
			this.advice = advice;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getWarningMachineCount() {
			return this.warningMachineCount;
		}

		public void setWarningMachineCount(Integer warningMachineCount) {
			this.warningMachineCount = warningMachineCount;
		}

		public Boolean getContainerCheckItem() {
			return this.containerCheckItem;
		}

		public void setContainerCheckItem(Boolean containerCheckItem) {
			this.containerCheckItem = containerCheckItem;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private String lastRowKey;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public String getLastRowKey() {
			return this.lastRowKey;
		}

		public void setLastRowKey(String lastRowKey) {
			this.lastRowKey = lastRowKey;
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
	public ListCheckItemWarningSummaryResponse getInstance(UnmarshallerContext context) {
		return	ListCheckItemWarningSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

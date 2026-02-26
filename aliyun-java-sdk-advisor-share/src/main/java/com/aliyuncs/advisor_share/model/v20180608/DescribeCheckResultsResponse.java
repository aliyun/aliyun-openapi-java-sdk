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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.DescribeCheckResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCheckResultsResponse extends AcsResponse {

	private String requestId;

	private List<CheckResult> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CheckResult> getData() {
		return this.data;
	}

	public void setData(List<CheckResult> data) {
		this.data = data;
	}

	public static class CheckResult {

		private Integer severity;

		private Integer adviceCount;

		private String summary;

		private String product;

		private String operateColumn;

		private String viewColumn;

		private String description;

		private String tips;

		private String checkId;

		private String refreshDateTime;

		private String category;

		private String checkName;

		private Boolean configSupport;

		public Integer getSeverity() {
			return this.severity;
		}

		public void setSeverity(Integer severity) {
			this.severity = severity;
		}

		public Integer getAdviceCount() {
			return this.adviceCount;
		}

		public void setAdviceCount(Integer adviceCount) {
			this.adviceCount = adviceCount;
		}

		public String getSummary() {
			return this.summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getOperateColumn() {
			return this.operateColumn;
		}

		public void setOperateColumn(String operateColumn) {
			this.operateColumn = operateColumn;
		}

		public String getViewColumn() {
			return this.viewColumn;
		}

		public void setViewColumn(String viewColumn) {
			this.viewColumn = viewColumn;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTips() {
			return this.tips;
		}

		public void setTips(String tips) {
			this.tips = tips;
		}

		public String getCheckId() {
			return this.checkId;
		}

		public void setCheckId(String checkId) {
			this.checkId = checkId;
		}

		public String getRefreshDateTime() {
			return this.refreshDateTime;
		}

		public void setRefreshDateTime(String refreshDateTime) {
			this.refreshDateTime = refreshDateTime;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getCheckName() {
			return this.checkName;
		}

		public void setCheckName(String checkName) {
			this.checkName = checkName;
		}

		public Boolean getConfigSupport() {
			return this.configSupport;
		}

		public void setConfigSupport(Boolean configSupport) {
			this.configSupport = configSupport;
		}
	}

	@Override
	public DescribeCheckResultsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCheckResultsResponseUnmarshaller.unmarshall(this, context);
	}
}

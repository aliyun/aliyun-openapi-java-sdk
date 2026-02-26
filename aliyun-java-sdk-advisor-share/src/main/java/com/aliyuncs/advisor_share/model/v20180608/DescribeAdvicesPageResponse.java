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
import com.aliyuncs.advisor_share.transform.v20180608.DescribeAdvicesPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAdvicesPageResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageNo;

		private Long pageSize;

		private Long total;

		private List<ResultItem> result;

		public Long getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Long pageNo) {
			this.pageNo = pageNo;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<ResultItem> getResult() {
			return this.result;
		}

		public void setResult(List<ResultItem> result) {
			this.result = result;
		}

		public static class ResultItem {

			private String action;

			private Long aliyunId;

			private String checkId;

			private String checkName;

			private String content;

			private String description;

			private String details;

			private String gmtCreated;

			private String gmtModified;

			private Long id;

			private Boolean isExpired;

			private String links;

			private String product;

			private String reason;

			private String resource;

			private String resourceId;

			private Long severity;

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public Long getAliyunId() {
				return this.aliyunId;
			}

			public void setAliyunId(Long aliyunId) {
				this.aliyunId = aliyunId;
			}

			public String getCheckId() {
				return this.checkId;
			}

			public void setCheckId(String checkId) {
				this.checkId = checkId;
			}

			public String getCheckName() {
				return this.checkName;
			}

			public void setCheckName(String checkName) {
				this.checkName = checkName;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDetails() {
				return this.details;
			}

			public void setDetails(String details) {
				this.details = details;
			}

			public String getGmtCreated() {
				return this.gmtCreated;
			}

			public void setGmtCreated(String gmtCreated) {
				this.gmtCreated = gmtCreated;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Boolean getIsExpired() {
				return this.isExpired;
			}

			public void setIsExpired(Boolean isExpired) {
				this.isExpired = isExpired;
			}

			public String getLinks() {
				return this.links;
			}

			public void setLinks(String links) {
				this.links = links;
			}

			public String getProduct() {
				return this.product;
			}

			public void setProduct(String product) {
				this.product = product;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}

			public String getResource() {
				return this.resource;
			}

			public void setResource(String resource) {
				this.resource = resource;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public Long getSeverity() {
				return this.severity;
			}

			public void setSeverity(Long severity) {
				this.severity = severity;
			}
		}
	}

	@Override
	public DescribeAdvicesPageResponse getInstance(UnmarshallerContext context) {
		return	DescribeAdvicesPageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

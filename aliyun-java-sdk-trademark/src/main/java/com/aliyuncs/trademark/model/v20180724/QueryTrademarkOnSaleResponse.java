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

package com.aliyuncs.trademark.model.v20180724;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.QueryTrademarkOnSaleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTrademarkOnSaleResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalPageNumber;

	private Integer totalCount;

	private List<Trademark> trademarks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalPageNumber() {
		return this.totalPageNumber;
	}

	public void setTotalPageNumber(Integer totalPageNumber) {
		this.totalPageNumber = totalPageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Trademark> getTrademarks() {
		return this.trademarks;
	}

	public void setTrademarks(List<Trademark> trademarks) {
		this.trademarks = trademarks;
	}

	public static class Trademark {

		private String trademarkName;

		private Long status;

		private String registrationNumber;

		private String icon;

		private String classification;

		private String orderPrice;

		private String tmType;

		private String auditResult;

		public String getTrademarkName() {
			return this.trademarkName;
		}

		public void setTrademarkName(String trademarkName) {
			this.trademarkName = trademarkName;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getRegistrationNumber() {
			return this.registrationNumber;
		}

		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}

		public String getIcon() {
			return this.icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public String getClassification() {
			return this.classification;
		}

		public void setClassification(String classification) {
			this.classification = classification;
		}

		public String getOrderPrice() {
			return this.orderPrice;
		}

		public void setOrderPrice(String orderPrice) {
			this.orderPrice = orderPrice;
		}

		public String getTmType() {
			return this.tmType;
		}

		public void setTmType(String tmType) {
			this.tmType = tmType;
		}

		public String getAuditResult() {
			return this.auditResult;
		}

		public void setAuditResult(String auditResult) {
			this.auditResult = auditResult;
		}
	}

	@Override
	public QueryTrademarkOnSaleResponse getInstance(UnmarshallerContext context) {
		return	QueryTrademarkOnSaleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

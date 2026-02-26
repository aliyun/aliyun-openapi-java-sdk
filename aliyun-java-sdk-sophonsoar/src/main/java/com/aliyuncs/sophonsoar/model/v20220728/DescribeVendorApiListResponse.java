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

package com.aliyuncs.sophonsoar.model.v20220728;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.DescribeVendorApiListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVendorApiListResponse extends AcsResponse {

	private String requestId;

	private List<Data> apiList;

	private Page page;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getApiList() {
		return this.apiList;
	}

	public void setApiList(List<Data> apiList) {
		this.apiList = apiList;
	}

	public Page getPage() {
		return this.page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public static class Data {

		private String vendorCode;

		private String productCode;

		private String productName;

		private String parameter;

		private String productDomain;

		private String protocol;

		private String method;

		private String apiName;

		private Boolean needPageInfo;

		private String pageInfo;

		private String apiVersion;

		private Boolean needAdvanceConfig;

		private String advanceConfig;

		public String getVendorCode() {
			return this.vendorCode;
		}

		public void setVendorCode(String vendorCode) {
			this.vendorCode = vendorCode;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getParameter() {
			return this.parameter;
		}

		public void setParameter(String parameter) {
			this.parameter = parameter;
		}

		public String getProductDomain() {
			return this.productDomain;
		}

		public void setProductDomain(String productDomain) {
			this.productDomain = productDomain;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		public String getApiName() {
			return this.apiName;
		}

		public void setApiName(String apiName) {
			this.apiName = apiName;
		}

		public Boolean getNeedPageInfo() {
			return this.needPageInfo;
		}

		public void setNeedPageInfo(Boolean needPageInfo) {
			this.needPageInfo = needPageInfo;
		}

		public String getPageInfo() {
			return this.pageInfo;
		}

		public void setPageInfo(String pageInfo) {
			this.pageInfo = pageInfo;
		}

		public String getApiVersion() {
			return this.apiVersion;
		}

		public void setApiVersion(String apiVersion) {
			this.apiVersion = apiVersion;
		}

		public Boolean getNeedAdvanceConfig() {
			return this.needAdvanceConfig;
		}

		public void setNeedAdvanceConfig(Boolean needAdvanceConfig) {
			this.needAdvanceConfig = needAdvanceConfig;
		}

		public String getAdvanceConfig() {
			return this.advanceConfig;
		}

		public void setAdvanceConfig(String advanceConfig) {
			this.advanceConfig = advanceConfig;
		}
	}

	public static class Page {

		private Long totalCount;

		private Long pageNumber;

		private Integer pageSize;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}
	}

	@Override
	public DescribeVendorApiListResponse getInstance(UnmarshallerContext context) {
		return	DescribeVendorApiListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

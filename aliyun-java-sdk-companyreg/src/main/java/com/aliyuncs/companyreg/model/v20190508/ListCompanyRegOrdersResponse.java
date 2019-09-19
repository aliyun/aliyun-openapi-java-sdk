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

package com.aliyuncs.companyreg.model.v20190508;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20190508.ListCompanyRegOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCompanyRegOrdersResponse extends AcsResponse {

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private Boolean prePage;

	private Boolean nextPage;

	private List<CompanyRegOrder> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
	}

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

	public List<CompanyRegOrder> getData() {
		return this.data;
	}

	public void setData(List<CompanyRegOrder> data) {
		this.data = data;
	}

	public static class CompanyRegOrder {

		private String bizId;

		private String companyName;

		private String bizStatus;

		private String bizInfo;

		private String supplementBizInfo;

		private String aliyunOrderId;

		private Long gmtModified;

		private String extend;

		private String bizSubCode;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getCompanyName() {
			return this.companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getBizStatus() {
			return this.bizStatus;
		}

		public void setBizStatus(String bizStatus) {
			this.bizStatus = bizStatus;
		}

		public String getBizInfo() {
			return this.bizInfo;
		}

		public void setBizInfo(String bizInfo) {
			this.bizInfo = bizInfo;
		}

		public String getSupplementBizInfo() {
			return this.supplementBizInfo;
		}

		public void setSupplementBizInfo(String supplementBizInfo) {
			this.supplementBizInfo = supplementBizInfo;
		}

		public String getAliyunOrderId() {
			return this.aliyunOrderId;
		}

		public void setAliyunOrderId(String aliyunOrderId) {
			this.aliyunOrderId = aliyunOrderId;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getExtend() {
			return this.extend;
		}

		public void setExtend(String extend) {
			this.extend = extend;
		}

		public String getBizSubCode() {
			return this.bizSubCode;
		}

		public void setBizSubCode(String bizSubCode) {
			this.bizSubCode = bizSubCode;
		}
	}

	@Override
	public ListCompanyRegOrdersResponse getInstance(UnmarshallerContext context) {
		return	ListCompanyRegOrdersResponseUnmarshaller.unmarshall(this, context);
	}
}

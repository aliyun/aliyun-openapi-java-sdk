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
import com.aliyuncs.companyreg.transform.v20190508.ListCompanyRegConsultationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCompanyRegConsultationsResponse extends AcsResponse {

	private Boolean nextPage;

	private String requestId;

	private Integer totalItemNum;

	private Boolean prePage;

	private Integer currentPageNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private List<CompanyRegConsultation> data;

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

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

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
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

	public List<CompanyRegConsultation> getData() {
		return this.data;
	}

	public void setData(List<CompanyRegConsultation> data) {
		this.data = data;
	}

	public static class CompanyRegConsultation {

		private String platformName;

		private String bizId;

		private String city;

		private String outboundPhone;

		private Long gmtModified;

		private String inboundPhone;

		private String consultInfo;

		public String getPlatformName() {
			return this.platformName;
		}

		public void setPlatformName(String platformName) {
			this.platformName = platformName;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getOutboundPhone() {
			return this.outboundPhone;
		}

		public void setOutboundPhone(String outboundPhone) {
			this.outboundPhone = outboundPhone;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getInboundPhone() {
			return this.inboundPhone;
		}

		public void setInboundPhone(String inboundPhone) {
			this.inboundPhone = inboundPhone;
		}

		public String getConsultInfo() {
			return this.consultInfo;
		}

		public void setConsultInfo(String consultInfo) {
			this.consultInfo = consultInfo;
		}
	}

	@Override
	public ListCompanyRegConsultationsResponse getInstance(UnmarshallerContext context) {
		return	ListCompanyRegConsultationsResponseUnmarshaller.unmarshall(this, context);
	}
}

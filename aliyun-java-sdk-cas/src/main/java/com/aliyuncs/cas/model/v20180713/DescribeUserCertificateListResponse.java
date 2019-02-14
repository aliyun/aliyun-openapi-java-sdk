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

package com.aliyuncs.cas.model.v20180713;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20180713.DescribeUserCertificateListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserCertificateListResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer showSize;

	private Integer currentPage;

	private List<Certificate> certificateList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getShowSize() {
		return this.showSize;
	}

	public void setShowSize(Integer showSize) {
		this.showSize = showSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<Certificate> getCertificateList() {
		return this.certificateList;
	}

	public void setCertificateList(List<Certificate> certificateList) {
		this.certificateList = certificateList;
	}

	public static class Certificate {

		private Long id;

		private String name;

		private String common;

		private String fingerprint;

		private String issuer;

		private String orgName;

		private String province;

		private String city;

		private String country;

		private String startDate;

		private String endDate;

		private String sans;

		private Boolean expired;

		private Boolean buyInAliyun;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCommon() {
			return this.common;
		}

		public void setCommon(String common) {
			this.common = common;
		}

		public String getFingerprint() {
			return this.fingerprint;
		}

		public void setFingerprint(String fingerprint) {
			this.fingerprint = fingerprint;
		}

		public String getIssuer() {
			return this.issuer;
		}

		public void setIssuer(String issuer) {
			this.issuer = issuer;
		}

		public String getOrgName() {
			return this.orgName;
		}

		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getSans() {
			return this.sans;
		}

		public void setSans(String sans) {
			this.sans = sans;
		}

		public Boolean getExpired() {
			return this.expired;
		}

		public void setExpired(Boolean expired) {
			this.expired = expired;
		}

		public Boolean getBuyInAliyun() {
			return this.buyInAliyun;
		}

		public void setBuyInAliyun(Boolean buyInAliyun) {
			this.buyInAliyun = buyInAliyun;
		}
	}

	@Override
	public DescribeUserCertificateListResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserCertificateListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

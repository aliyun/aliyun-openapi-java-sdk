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

package com.aliyuncs.domain_intl.model.v20171218;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain_intl.transform.v20171218.QueryRegistrantProfilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRegistrantProfilesResponse extends AcsResponse {

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer totalPageNum;

	private Integer pageSize;

	private Boolean prePage;

	private Boolean nextPage;

	private List<RegistrantProfile> registrantProfiles;

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

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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

	public List<RegistrantProfile> getRegistrantProfiles() {
		return this.registrantProfiles;
	}

	public void setRegistrantProfiles(List<RegistrantProfile> registrantProfiles) {
		this.registrantProfiles = registrantProfiles;
	}

	public static class RegistrantProfile {

		private Long registrantProfileId;

		private String createTime;

		private String updateTime;

		private Boolean defaultRegistrantProfile;

		private String registrantName;

		private String registrantOrganization;

		private String country;

		private String province;

		private String city;

		private String address;

		private String email;

		private String postalCode;

		private String telArea;

		private String telephone;

		private String telExt;

		private Integer emailVerificationStatus;

		private String registrantType;

		private String realNameStatus;

		private String registrantProfileType;

		public Long getRegistrantProfileId() {
			return this.registrantProfileId;
		}

		public void setRegistrantProfileId(Long registrantProfileId) {
			this.registrantProfileId = registrantProfileId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Boolean getDefaultRegistrantProfile() {
			return this.defaultRegistrantProfile;
		}

		public void setDefaultRegistrantProfile(Boolean defaultRegistrantProfile) {
			this.defaultRegistrantProfile = defaultRegistrantProfile;
		}

		public String getRegistrantName() {
			return this.registrantName;
		}

		public void setRegistrantName(String registrantName) {
			this.registrantName = registrantName;
		}

		public String getRegistrantOrganization() {
			return this.registrantOrganization;
		}

		public void setRegistrantOrganization(String registrantOrganization) {
			this.registrantOrganization = registrantOrganization;
		}

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
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

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPostalCode() {
			return this.postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getTelArea() {
			return this.telArea;
		}

		public void setTelArea(String telArea) {
			this.telArea = telArea;
		}

		public String getTelephone() {
			return this.telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

		public String getTelExt() {
			return this.telExt;
		}

		public void setTelExt(String telExt) {
			this.telExt = telExt;
		}

		public Integer getEmailVerificationStatus() {
			return this.emailVerificationStatus;
		}

		public void setEmailVerificationStatus(Integer emailVerificationStatus) {
			this.emailVerificationStatus = emailVerificationStatus;
		}

		public String getRegistrantType() {
			return this.registrantType;
		}

		public void setRegistrantType(String registrantType) {
			this.registrantType = registrantType;
		}

		public String getRealNameStatus() {
			return this.realNameStatus;
		}

		public void setRealNameStatus(String realNameStatus) {
			this.realNameStatus = realNameStatus;
		}

		public String getRegistrantProfileType() {
			return this.registrantProfileType;
		}

		public void setRegistrantProfileType(String registrantProfileType) {
			this.registrantProfileType = registrantProfileType;
		}
	}

	@Override
	public QueryRegistrantProfilesResponse getInstance(UnmarshallerContext context) {
		return	QueryRegistrantProfilesResponseUnmarshaller.unmarshall(this, context);
	}
}

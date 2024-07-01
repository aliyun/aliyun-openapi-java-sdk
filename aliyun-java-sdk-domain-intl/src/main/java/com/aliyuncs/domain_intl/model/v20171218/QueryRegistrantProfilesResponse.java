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

	private Boolean nextPage;

	private String requestId;

	private Integer totalItemNum;

	private Boolean prePage;

	private Integer currentPageNum;

	private Integer totalPageNum;

	private Integer pageSize;

	private List<RegistrantProfile> registrantProfiles;

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

	public List<RegistrantProfile> getRegistrantProfiles() {
		return this.registrantProfiles;
	}

	public void setRegistrantProfiles(List<RegistrantProfile> registrantProfiles) {
		this.registrantProfiles = registrantProfiles;
	}

	public static class RegistrantProfile {

		private String postalCode;

		private String telExt;

		private String updateTime;

		private String registrantProfileType;

		private Long registrantProfileId;

		private String telephone;

		private String createTime;

		private Boolean defaultRegistrantProfile;

		private String registrantOrganization;

		private String city;

		private String email;

		private String registrantType;

		private String telArea;

		private String address;

		private String country;

		private String registrantName;

		private String realNameStatus;

		private Integer emailVerificationStatus;

		private String province;

		public String getPostalCode() {
			return this.postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getTelExt() {
			return this.telExt;
		}

		public void setTelExt(String telExt) {
			this.telExt = telExt;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getRegistrantProfileType() {
			return this.registrantProfileType;
		}

		public void setRegistrantProfileType(String registrantProfileType) {
			this.registrantProfileType = registrantProfileType;
		}

		public Long getRegistrantProfileId() {
			return this.registrantProfileId;
		}

		public void setRegistrantProfileId(Long registrantProfileId) {
			this.registrantProfileId = registrantProfileId;
		}

		public String getTelephone() {
			return this.telephone;
		}

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Boolean getDefaultRegistrantProfile() {
			return this.defaultRegistrantProfile;
		}

		public void setDefaultRegistrantProfile(Boolean defaultRegistrantProfile) {
			this.defaultRegistrantProfile = defaultRegistrantProfile;
		}

		public String getRegistrantOrganization() {
			return this.registrantOrganization;
		}

		public void setRegistrantOrganization(String registrantOrganization) {
			this.registrantOrganization = registrantOrganization;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getRegistrantType() {
			return this.registrantType;
		}

		public void setRegistrantType(String registrantType) {
			this.registrantType = registrantType;
		}

		public String getTelArea() {
			return this.telArea;
		}

		public void setTelArea(String telArea) {
			this.telArea = telArea;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getRegistrantName() {
			return this.registrantName;
		}

		public void setRegistrantName(String registrantName) {
			this.registrantName = registrantName;
		}

		public String getRealNameStatus() {
			return this.realNameStatus;
		}

		public void setRealNameStatus(String realNameStatus) {
			this.realNameStatus = realNameStatus;
		}

		public Integer getEmailVerificationStatus() {
			return this.emailVerificationStatus;
		}

		public void setEmailVerificationStatus(Integer emailVerificationStatus) {
			this.emailVerificationStatus = emailVerificationStatus;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}
	}

	@Override
	public QueryRegistrantProfilesResponse getInstance(UnmarshallerContext context) {
		return	QueryRegistrantProfilesResponseUnmarshaller.unmarshall(this, context);
	}
}

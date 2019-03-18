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

package com.aliyuncs.cas.model.v20180813;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20180813.DescribeOrderMaterialResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOrderMaterialResponse extends AcsResponse {

	private String requestId;

	private String companyName;

	private String companyPhone;

	private String companyCode;

	private String personName;

	private String personPhone;

	private String personEmail;

	private String companyEmail;

	private String companyAddress;

	private String personIdCardNumber;

	private Integer companyType;

	private String city;

	private String province;

	private Integer createCsr;

	private String postCode;

	private String csrContent;

	private String personTitle;

	private String leaderName;

	private String leaderTitle;

	private String leaderEmail;

	private String leaderPhone;

	private String countryCode;

	private String personDepartment;

	private Integer domainAuthType;

	private String domain;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyPhone() {
		return this.companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonPhone() {
		return this.personPhone;
	}

	public void setPersonPhone(String personPhone) {
		this.personPhone = personPhone;
	}

	public String getPersonEmail() {
		return this.personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

	public String getCompanyEmail() {
		return this.companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanyAddress() {
		return this.companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getPersonIdCardNumber() {
		return this.personIdCardNumber;
	}

	public void setPersonIdCardNumber(String personIdCardNumber) {
		this.personIdCardNumber = personIdCardNumber;
	}

	public Integer getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(Integer companyType) {
		this.companyType = companyType;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Integer getCreateCsr() {
		return this.createCsr;
	}

	public void setCreateCsr(Integer createCsr) {
		this.createCsr = createCsr;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCsrContent() {
		return this.csrContent;
	}

	public void setCsrContent(String csrContent) {
		this.csrContent = csrContent;
	}

	public String getPersonTitle() {
		return this.personTitle;
	}

	public void setPersonTitle(String personTitle) {
		this.personTitle = personTitle;
	}

	public String getLeaderName() {
		return this.leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	public String getLeaderTitle() {
		return this.leaderTitle;
	}

	public void setLeaderTitle(String leaderTitle) {
		this.leaderTitle = leaderTitle;
	}

	public String getLeaderEmail() {
		return this.leaderEmail;
	}

	public void setLeaderEmail(String leaderEmail) {
		this.leaderEmail = leaderEmail;
	}

	public String getLeaderPhone() {
		return this.leaderPhone;
	}

	public void setLeaderPhone(String leaderPhone) {
		this.leaderPhone = leaderPhone;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPersonDepartment() {
		return this.personDepartment;
	}

	public void setPersonDepartment(String personDepartment) {
		this.personDepartment = personDepartment;
	}

	public Integer getDomainAuthType() {
		return this.domainAuthType;
	}

	public void setDomainAuthType(Integer domainAuthType) {
		this.domainAuthType = domainAuthType;
	}

	public String getBizDomain() {
		return this.domain;
	}

	public void setBizDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @deprecated use getBizDomain instead of this.
	 */
	@Deprecated
	public String getDomain() {
		return this.domain;
	}

	/**
	 * @deprecated use setBizDomain instead of this.
	 */
	@Deprecated
	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public DescribeOrderMaterialResponse getInstance(UnmarshallerContext context) {
		return	DescribeOrderMaterialResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

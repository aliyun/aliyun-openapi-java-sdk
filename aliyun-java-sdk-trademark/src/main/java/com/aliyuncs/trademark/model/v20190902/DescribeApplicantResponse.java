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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20190902.DescribeApplicantResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplicantResponse extends AcsResponse {

	private String contactDistrict;

	private String businessLicenceUrl;

	private String passportUrl;

	private String contactProvince;

	private String legalNoticeUrl;

	private String eAddress;

	private String contactCounty;

	private String applicantName;

	private String contactEmail;

	private String contactCity;

	private String requestId;

	private Integer authorizationAuditStatus;

	private Integer applicantRegion;

	private Long applicantId;

	private String address;

	private String note;

	private Integer principalName;

	private Integer applicantType;

	private Integer auditStatus;

	private String contactNumber;

	private String contactAddress;

	private String contactZipcode;

	private String authorizationUrl;

	private String contactName;

	private String eName;

	private Long validDate;

	private String cardNumber;

	private String idCardUrl;

	private String country;

	private String province;

	private Long personalType;

	private String idCardName;

	private String idCardNumber;

	private String applicantVersion;

	public String getContactDistrict() {
		return this.contactDistrict;
	}

	public void setContactDistrict(String contactDistrict) {
		this.contactDistrict = contactDistrict;
	}

	public String getBusinessLicenceUrl() {
		return this.businessLicenceUrl;
	}

	public void setBusinessLicenceUrl(String businessLicenceUrl) {
		this.businessLicenceUrl = businessLicenceUrl;
	}

	public String getPassportUrl() {
		return this.passportUrl;
	}

	public void setPassportUrl(String passportUrl) {
		this.passportUrl = passportUrl;
	}

	public String getContactProvince() {
		return this.contactProvince;
	}

	public void setContactProvince(String contactProvince) {
		this.contactProvince = contactProvince;
	}

	public String getLegalNoticeUrl() {
		return this.legalNoticeUrl;
	}

	public void setLegalNoticeUrl(String legalNoticeUrl) {
		this.legalNoticeUrl = legalNoticeUrl;
	}

	public String getEAddress() {
		return this.eAddress;
	}

	public void setEAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	public String getContactCounty() {
		return this.contactCounty;
	}

	public void setContactCounty(String contactCounty) {
		this.contactCounty = contactCounty;
	}

	public String getApplicantName() {
		return this.applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactCity() {
		return this.contactCity;
	}

	public void setContactCity(String contactCity) {
		this.contactCity = contactCity;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getAuthorizationAuditStatus() {
		return this.authorizationAuditStatus;
	}

	public void setAuthorizationAuditStatus(Integer authorizationAuditStatus) {
		this.authorizationAuditStatus = authorizationAuditStatus;
	}

	public Integer getApplicantRegion() {
		return this.applicantRegion;
	}

	public void setApplicantRegion(Integer applicantRegion) {
		this.applicantRegion = applicantRegion;
	}

	public Long getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getPrincipalName() {
		return this.principalName;
	}

	public void setPrincipalName(Integer principalName) {
		this.principalName = principalName;
	}

	public Integer getApplicantType() {
		return this.applicantType;
	}

	public void setApplicantType(Integer applicantType) {
		this.applicantType = applicantType;
	}

	public Integer getAuditStatus() {
		return this.auditStatus;
	}

	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactAddress() {
		return this.contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getContactZipcode() {
		return this.contactZipcode;
	}

	public void setContactZipcode(String contactZipcode) {
		this.contactZipcode = contactZipcode;
	}

	public String getAuthorizationUrl() {
		return this.authorizationUrl;
	}

	public void setAuthorizationUrl(String authorizationUrl) {
		this.authorizationUrl = authorizationUrl;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getEName() {
		return this.eName;
	}

	public void setEName(String eName) {
		this.eName = eName;
	}

	public Long getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Long validDate) {
		this.validDate = validDate;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getIdCardUrl() {
		return this.idCardUrl;
	}

	public void setIdCardUrl(String idCardUrl) {
		this.idCardUrl = idCardUrl;
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

	public Long getPersonalType() {
		return this.personalType;
	}

	public void setPersonalType(Long personalType) {
		this.personalType = personalType;
	}

	public String getIdCardName() {
		return this.idCardName;
	}

	public void setIdCardName(String idCardName) {
		this.idCardName = idCardName;
	}

	public String getIdCardNumber() {
		return this.idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getApplicantVersion() {
		return this.applicantVersion;
	}

	public void setApplicantVersion(String applicantVersion) {
		this.applicantVersion = applicantVersion;
	}

	@Override
	public DescribeApplicantResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplicantResponseUnmarshaller.unmarshall(this, context);
	}
}

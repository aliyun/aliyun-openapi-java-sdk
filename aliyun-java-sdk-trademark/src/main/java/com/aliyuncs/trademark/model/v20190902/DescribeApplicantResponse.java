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

	private String requestId;

	private Integer applicantType;

	private Integer applicantRegion;

	private String contactName;

	private String contactNumber;

	private String contactEmail;

	private String contactAddress;

	private String contactZipcode;

	private Integer auditStatus;

	private String authorizationUrl;

	private String applicantName;

	private String cardNumber;

	private String province;

	private String address;

	private String eName;

	private String eAddress;

	private Integer authorizationAuditStatus;

	private String idCardUrl;

	private String businessLicenceUrl;

	private String passportUrl;

	private Long applicantId;

	private String legalNoticeUrl;

	private String note;

	private String country;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getApplicantType() {
		return this.applicantType;
	}

	public void setApplicantType(Integer applicantType) {
		this.applicantType = applicantType;
	}

	public Integer getApplicantRegion() {
		return this.applicantRegion;
	}

	public void setApplicantRegion(Integer applicantRegion) {
		this.applicantRegion = applicantRegion;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
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

	public Integer getAuditStatus() {
		return this.auditStatus;
	}

	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getAuthorizationUrl() {
		return this.authorizationUrl;
	}

	public void setAuthorizationUrl(String authorizationUrl) {
		this.authorizationUrl = authorizationUrl;
	}

	public String getApplicantName() {
		return this.applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEName() {
		return this.eName;
	}

	public void setEName(String eName) {
		this.eName = eName;
	}

	public String getEAddress() {
		return this.eAddress;
	}

	public void setEAddress(String eAddress) {
		this.eAddress = eAddress;
	}

	public Integer getAuthorizationAuditStatus() {
		return this.authorizationAuditStatus;
	}

	public void setAuthorizationAuditStatus(Integer authorizationAuditStatus) {
		this.authorizationAuditStatus = authorizationAuditStatus;
	}

	public String getIdCardUrl() {
		return this.idCardUrl;
	}

	public void setIdCardUrl(String idCardUrl) {
		this.idCardUrl = idCardUrl;
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

	public Long getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}

	public String getLegalNoticeUrl() {
		return this.legalNoticeUrl;
	}

	public void setLegalNoticeUrl(String legalNoticeUrl) {
		this.legalNoticeUrl = legalNoticeUrl;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public DescribeApplicantResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplicantResponseUnmarshaller.unmarshall(this, context);
	}
}

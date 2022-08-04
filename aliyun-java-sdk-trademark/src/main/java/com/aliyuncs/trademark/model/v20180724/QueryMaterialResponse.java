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
import com.aliyuncs.trademark.transform.v20180724.QueryMaterialResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMaterialResponse extends AcsResponse {

	private Integer type;

	private Integer status;

	private String reviewApplicationFile;

	private String contactDistrict;

	private String businessLicenceUrl;

	private String passportUrl;

	private String contactProvince;

	private String legalNoticeUrl;

	private String city;

	private String eAddress;

	private String contactCounty;

	private String contactEmail;

	private String requestId;

	private String contactCity;

	private Integer region;

	private String loaUrl;

	private String address;

	private String note;

	private Integer principalName;

	private String name;

	private String principalDescription;

	private String contactNumber;

	private String contactAddress;

	private String contactZipcode;

	private String contactName;

	private String eName;

	private Long validDate;

	private String idCardUrl;

	private Long expirationDate;

	private String cardNumber;

	private String country;

	private String town;

	private Integer loaStatus;

	private String reason;

	private Long id;

	private String province;

	private String legalNoticeKey;

	private String idCardNumber;

	private Long personalType;

	private String idCardName;

	private String materialVersion;

	private String fgsqPath;

	private String factandreasonPdfPath;

	private String fileBgPath;

	private String fileGtPath;

	private String fileFsSqPath;

	private String evidenceCatalogPath;

	private String evidencePath;

	private String evidenceOfservicePath;

	private String fileYgPath;

	private List<String> reviewAdditionalFiles;

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getReviewApplicationFile() {
		return this.reviewApplicationFile;
	}

	public void setReviewApplicationFile(String reviewApplicationFile) {
		this.reviewApplicationFile = reviewApplicationFile;
	}

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

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getContactCity() {
		return this.contactCity;
	}

	public void setContactCity(String contactCity) {
		this.contactCity = contactCity;
	}

	public Integer getRegion() {
		return this.region;
	}

	public void setRegion(Integer region) {
		this.region = region;
	}

	public String getLoaUrl() {
		return this.loaUrl;
	}

	public void setLoaUrl(String loaUrl) {
		this.loaUrl = loaUrl;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrincipalDescription() {
		return this.principalDescription;
	}

	public void setPrincipalDescription(String principalDescription) {
		this.principalDescription = principalDescription;
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

	public String getIdCardUrl() {
		return this.idCardUrl;
	}

	public void setIdCardUrl(String idCardUrl) {
		this.idCardUrl = idCardUrl;
	}

	public Long getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Long expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public Integer getLoaStatus() {
		return this.loaStatus;
	}

	public void setLoaStatus(Integer loaStatus) {
		this.loaStatus = loaStatus;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getLegalNoticeKey() {
		return this.legalNoticeKey;
	}

	public void setLegalNoticeKey(String legalNoticeKey) {
		this.legalNoticeKey = legalNoticeKey;
	}

	public String getIdCardNumber() {
		return this.idCardNumber;
	}

	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
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

	public String getMaterialVersion() {
		return this.materialVersion;
	}

	public void setMaterialVersion(String materialVersion) {
		this.materialVersion = materialVersion;
	}

	public String getFgsqPath() {
		return this.fgsqPath;
	}

	public void setFgsqPath(String fgsqPath) {
		this.fgsqPath = fgsqPath;
	}

	public String getFactandreasonPdfPath() {
		return this.factandreasonPdfPath;
	}

	public void setFactandreasonPdfPath(String factandreasonPdfPath) {
		this.factandreasonPdfPath = factandreasonPdfPath;
	}

	public String getFileBgPath() {
		return this.fileBgPath;
	}

	public void setFileBgPath(String fileBgPath) {
		this.fileBgPath = fileBgPath;
	}

	public String getFileGtPath() {
		return this.fileGtPath;
	}

	public void setFileGtPath(String fileGtPath) {
		this.fileGtPath = fileGtPath;
	}

	public String getFileFsSqPath() {
		return this.fileFsSqPath;
	}

	public void setFileFsSqPath(String fileFsSqPath) {
		this.fileFsSqPath = fileFsSqPath;
	}

	public String getEvidenceCatalogPath() {
		return this.evidenceCatalogPath;
	}

	public void setEvidenceCatalogPath(String evidenceCatalogPath) {
		this.evidenceCatalogPath = evidenceCatalogPath;
	}

	public String getEvidencePath() {
		return this.evidencePath;
	}

	public void setEvidencePath(String evidencePath) {
		this.evidencePath = evidencePath;
	}

	public String getEvidenceOfservicePath() {
		return this.evidenceOfservicePath;
	}

	public void setEvidenceOfservicePath(String evidenceOfservicePath) {
		this.evidenceOfservicePath = evidenceOfservicePath;
	}

	public String getFileYgPath() {
		return this.fileYgPath;
	}

	public void setFileYgPath(String fileYgPath) {
		this.fileYgPath = fileYgPath;
	}

	public List<String> getReviewAdditionalFiles() {
		return this.reviewAdditionalFiles;
	}

	public void setReviewAdditionalFiles(List<String> reviewAdditionalFiles) {
		this.reviewAdditionalFiles = reviewAdditionalFiles;
	}

	@Override
	public QueryMaterialResponse getInstance(UnmarshallerContext context) {
		return	QueryMaterialResponseUnmarshaller.unmarshall(this, context);
	}
}

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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.QueryTradeMarkApplicationDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTradeMarkApplicationDetailResponse extends AcsResponse {

	private Integer type;

	private Integer status;

	private String acceptUrl;

	private Float orderPrice;

	private Long submitAuditTime;

	private Long updateTime;

	private Long createTime;

	private String notAcceptUrl;

	private String sendTime;

	private Float servicePrice;

	private String partnerMobile;

	private String recvUserLogistics;

	private String requestId;

	private String grayIconUrl;

	private Long materialId;

	private String sendSbjLogistics;

	private String sendUserLogistics;

	private String loaUrl;

	private String legalNoticeUrl;

	private String tmNumber;

	private String note;

	private Integer principalName;

	private String partnerName;

	private String logisticsCertificateUrl;

	private String bizId;

	private String partnerCode;

	private Integer tmNameType;

	private Map<Object,Object> extendInfo;

	private String tmIcon;

	private String tmName;

	private String logisticsNo;

	private Float totalPrice;

	private Long submitTime;

	private String orderId;

	private List<SupplementsItem> supplements;

	private List<ThirdClassifications> thirdClassification;

	private List<String> receiptUrl;

	private List<String> judgeResultUrl;

	private List<Integer> flags;

	private AdminUploads adminUploads;

	private FirstClassification firstClassification;

	private MaterialDetail materialDetail;

	private RenewResponse renewResponse;

	private ReviewOfficialFiles reviewOfficialFiles;

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

	public String getAcceptUrl() {
		return this.acceptUrl;
	}

	public void setAcceptUrl(String acceptUrl) {
		this.acceptUrl = acceptUrl;
	}

	public Float getOrderPrice() {
		return this.orderPrice;
	}

	public void setOrderPrice(Float orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Long getSubmitAuditTime() {
		return this.submitAuditTime;
	}

	public void setSubmitAuditTime(Long submitAuditTime) {
		this.submitAuditTime = submitAuditTime;
	}

	public Long getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getNotAcceptUrl() {
		return this.notAcceptUrl;
	}

	public void setNotAcceptUrl(String notAcceptUrl) {
		this.notAcceptUrl = notAcceptUrl;
	}

	public String getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public Float getServicePrice() {
		return this.servicePrice;
	}

	public void setServicePrice(Float servicePrice) {
		this.servicePrice = servicePrice;
	}

	public String getPartnerMobile() {
		return this.partnerMobile;
	}

	public void setPartnerMobile(String partnerMobile) {
		this.partnerMobile = partnerMobile;
	}

	public String getRecvUserLogistics() {
		return this.recvUserLogistics;
	}

	public void setRecvUserLogistics(String recvUserLogistics) {
		this.recvUserLogistics = recvUserLogistics;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGrayIconUrl() {
		return this.grayIconUrl;
	}

	public void setGrayIconUrl(String grayIconUrl) {
		this.grayIconUrl = grayIconUrl;
	}

	public Long getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}

	public String getSendSbjLogistics() {
		return this.sendSbjLogistics;
	}

	public void setSendSbjLogistics(String sendSbjLogistics) {
		this.sendSbjLogistics = sendSbjLogistics;
	}

	public String getSendUserLogistics() {
		return this.sendUserLogistics;
	}

	public void setSendUserLogistics(String sendUserLogistics) {
		this.sendUserLogistics = sendUserLogistics;
	}

	public String getLoaUrl() {
		return this.loaUrl;
	}

	public void setLoaUrl(String loaUrl) {
		this.loaUrl = loaUrl;
	}

	public String getLegalNoticeUrl() {
		return this.legalNoticeUrl;
	}

	public void setLegalNoticeUrl(String legalNoticeUrl) {
		this.legalNoticeUrl = legalNoticeUrl;
	}

	public String getTmNumber() {
		return this.tmNumber;
	}

	public void setTmNumber(String tmNumber) {
		this.tmNumber = tmNumber;
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

	public String getPartnerName() {
		return this.partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getLogisticsCertificateUrl() {
		return this.logisticsCertificateUrl;
	}

	public void setLogisticsCertificateUrl(String logisticsCertificateUrl) {
		this.logisticsCertificateUrl = logisticsCertificateUrl;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getPartnerCode() {
		return this.partnerCode;
	}

	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}

	public Integer getTmNameType() {
		return this.tmNameType;
	}

	public void setTmNameType(Integer tmNameType) {
		this.tmNameType = tmNameType;
	}

	public Map<Object,Object> getExtendInfo() {
		return this.extendInfo;
	}

	public void setExtendInfo(Map<Object,Object> extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getTmIcon() {
		return this.tmIcon;
	}

	public void setTmIcon(String tmIcon) {
		this.tmIcon = tmIcon;
	}

	public String getTmName() {
		return this.tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}

	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public Float getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Long getSubmitTime() {
		return this.submitTime;
	}

	public void setSubmitTime(Long submitTime) {
		this.submitTime = submitTime;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<SupplementsItem> getSupplements() {
		return this.supplements;
	}

	public void setSupplements(List<SupplementsItem> supplements) {
		this.supplements = supplements;
	}

	public List<ThirdClassifications> getThirdClassification() {
		return this.thirdClassification;
	}

	public void setThirdClassification(List<ThirdClassifications> thirdClassification) {
		this.thirdClassification = thirdClassification;
	}

	public List<String> getReceiptUrl() {
		return this.receiptUrl;
	}

	public void setReceiptUrl(List<String> receiptUrl) {
		this.receiptUrl = receiptUrl;
	}

	public List<String> getJudgeResultUrl() {
		return this.judgeResultUrl;
	}

	public void setJudgeResultUrl(List<String> judgeResultUrl) {
		this.judgeResultUrl = judgeResultUrl;
	}

	public List<Integer> getFlags() {
		return this.flags;
	}

	public void setFlags(List<Integer> flags) {
		this.flags = flags;
	}

	public AdminUploads getAdminUploads() {
		return this.adminUploads;
	}

	public void setAdminUploads(AdminUploads adminUploads) {
		this.adminUploads = adminUploads;
	}

	public FirstClassification getFirstClassification() {
		return this.firstClassification;
	}

	public void setFirstClassification(FirstClassification firstClassification) {
		this.firstClassification = firstClassification;
	}

	public MaterialDetail getMaterialDetail() {
		return this.materialDetail;
	}

	public void setMaterialDetail(MaterialDetail materialDetail) {
		this.materialDetail = materialDetail;
	}

	public RenewResponse getRenewResponse() {
		return this.renewResponse;
	}

	public void setRenewResponse(RenewResponse renewResponse) {
		this.renewResponse = renewResponse;
	}

	public ReviewOfficialFiles getReviewOfficialFiles() {
		return this.reviewOfficialFiles;
	}

	public void setReviewOfficialFiles(ReviewOfficialFiles reviewOfficialFiles) {
		this.reviewOfficialFiles = reviewOfficialFiles;
	}

	public static class SupplementsItem {

		private Integer type;

		private Long operateTime;

		private String serialNumber;

		private Integer status;

		private Long sbjDeadTime;

		private Long acceptDeadTime;

		private Long sendTime;

		private String batchNum;

		private Long acceptTime;

		private String tmNumber;

		private String uploadFileTemplateUrl;

		private String content;

		private Long id;

		private String orderId;

		private List<String> fileTemplateUrls;

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Long getOperateTime() {
			return this.operateTime;
		}

		public void setOperateTime(Long operateTime) {
			this.operateTime = operateTime;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getSbjDeadTime() {
			return this.sbjDeadTime;
		}

		public void setSbjDeadTime(Long sbjDeadTime) {
			this.sbjDeadTime = sbjDeadTime;
		}

		public Long getAcceptDeadTime() {
			return this.acceptDeadTime;
		}

		public void setAcceptDeadTime(Long acceptDeadTime) {
			this.acceptDeadTime = acceptDeadTime;
		}

		public Long getSendTime() {
			return this.sendTime;
		}

		public void setSendTime(Long sendTime) {
			this.sendTime = sendTime;
		}

		public String getBatchNum() {
			return this.batchNum;
		}

		public void setBatchNum(String batchNum) {
			this.batchNum = batchNum;
		}

		public Long getAcceptTime() {
			return this.acceptTime;
		}

		public void setAcceptTime(Long acceptTime) {
			this.acceptTime = acceptTime;
		}

		public String getTmNumber() {
			return this.tmNumber;
		}

		public void setTmNumber(String tmNumber) {
			this.tmNumber = tmNumber;
		}

		public String getUploadFileTemplateUrl() {
			return this.uploadFileTemplateUrl;
		}

		public void setUploadFileTemplateUrl(String uploadFileTemplateUrl) {
			this.uploadFileTemplateUrl = uploadFileTemplateUrl;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public List<String> getFileTemplateUrls() {
			return this.fileTemplateUrls;
		}

		public void setFileTemplateUrls(List<String> fileTemplateUrls) {
			this.fileTemplateUrls = fileTemplateUrls;
		}
	}

	public static class ThirdClassifications {

		private String name;

		private String code;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}
	}

	public static class AdminUploads {

		private String loaPicUrl;

		private String licensePicUrl;

		public String getLoaPicUrl() {
			return this.loaPicUrl;
		}

		public void setLoaPicUrl(String loaPicUrl) {
			this.loaPicUrl = loaPicUrl;
		}

		public String getLicensePicUrl() {
			return this.licensePicUrl;
		}

		public void setLicensePicUrl(String licensePicUrl) {
			this.licensePicUrl = licensePicUrl;
		}
	}

	public static class FirstClassification {

		private String name;

		private String code;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}
	}

	public static class MaterialDetail {

		private Integer type;

		private String reviewApplicationFile;

		private Integer status;

		private String businessLicenceUrl;

		private String passportUrl;

		private String city;

		private String legalNoticeUrl;

		private String eAddress;

		private String contactEmail;

		private Integer region;

		private String loaUrl;

		private String address;

		private Integer principalName;

		private String name;

		private String contactNumber;

		private String contactCity;

		private String contactDistrict;

		private String contactProvince;

		private String contactAddress;

		private String contactZipcode;

		private String contactName;

		private String eName;

		private String cardNumber;

		private String expirationDate;

		private String idCardUrl;

		private String country;

		private String town;

		private String province;

		private String detailedContactAddress;

		private String idCardNumber;

		private Long personalType;

		private String idCardName;

		private String materialVersion;

		private List<String> reviewAdditionalFiles;

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getReviewApplicationFile() {
			return this.reviewApplicationFile;
		}

		public void setReviewApplicationFile(String reviewApplicationFile) {
			this.reviewApplicationFile = reviewApplicationFile;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
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

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
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

		public String getContactEmail() {
			return this.contactEmail;
		}

		public void setContactEmail(String contactEmail) {
			this.contactEmail = contactEmail;
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

		public String getContactNumber() {
			return this.contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		public String getContactCity() {
			return this.contactCity;
		}

		public void setContactCity(String contactCity) {
			this.contactCity = contactCity;
		}

		public String getContactDistrict() {
			return this.contactDistrict;
		}

		public void setContactDistrict(String contactDistrict) {
			this.contactDistrict = contactDistrict;
		}

		public String getContactProvince() {
			return this.contactProvince;
		}

		public void setContactProvince(String contactProvince) {
			this.contactProvince = contactProvince;
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

		public String getCardNumber() {
			return this.cardNumber;
		}

		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}

		public String getExpirationDate() {
			return this.expirationDate;
		}

		public void setExpirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
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

		public String getTown() {
			return this.town;
		}

		public void setTown(String town) {
			this.town = town;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getDetailedContactAddress() {
			return this.detailedContactAddress;
		}

		public void setDetailedContactAddress(String detailedContactAddress) {
			this.detailedContactAddress = detailedContactAddress;
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

		public List<String> getReviewAdditionalFiles() {
			return this.reviewAdditionalFiles;
		}

		public void setReviewAdditionalFiles(List<String> reviewAdditionalFiles) {
			this.reviewAdditionalFiles = reviewAdditionalFiles;
		}
	}

	public static class RenewResponse {

		private String engName;

		private Long registerTime;

		private String engAddress;

		private String address;

		private String name;

		private Long submitSbjtime;

		public String getEngName() {
			return this.engName;
		}

		public void setEngName(String engName) {
			this.engName = engName;
		}

		public Long getRegisterTime() {
			return this.registerTime;
		}

		public void setRegisterTime(Long registerTime) {
			this.registerTime = registerTime;
		}

		public String getEngAddress() {
			return this.engAddress;
		}

		public void setEngAddress(String engAddress) {
			this.engAddress = engAddress;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getSubmitSbjtime() {
			return this.submitSbjtime;
		}

		public void setSubmitSbjtime(Long submitSbjtime) {
			this.submitSbjtime = submitSbjtime;
		}
	}

	public static class ReviewOfficialFiles {

		private String reviewKeep;

		private String reviewAudit;

		private String reviewPart;

		private String reviewPass;

		private List<String> reviewSupplements;

		public String getReviewKeep() {
			return this.reviewKeep;
		}

		public void setReviewKeep(String reviewKeep) {
			this.reviewKeep = reviewKeep;
		}

		public String getReviewAudit() {
			return this.reviewAudit;
		}

		public void setReviewAudit(String reviewAudit) {
			this.reviewAudit = reviewAudit;
		}

		public String getReviewPart() {
			return this.reviewPart;
		}

		public void setReviewPart(String reviewPart) {
			this.reviewPart = reviewPart;
		}

		public String getReviewPass() {
			return this.reviewPass;
		}

		public void setReviewPass(String reviewPass) {
			this.reviewPass = reviewPass;
		}

		public List<String> getReviewSupplements() {
			return this.reviewSupplements;
		}

		public void setReviewSupplements(List<String> reviewSupplements) {
			this.reviewSupplements = reviewSupplements;
		}
	}

	@Override
	public QueryTradeMarkApplicationDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryTradeMarkApplicationDetailResponseUnmarshaller.unmarshall(this, context);
	}
}

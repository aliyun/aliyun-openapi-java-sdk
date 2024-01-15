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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20190902.DescribeAdminTrademarkApplicationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAdminTrademarkApplicationResponse extends AcsResponse {

	private String acceptUrl;

	private Float orderPrice;

	private String blackAndWhiteIconUrl;

	private Long updateTime;

	private Long createTime;

	private String userId;

	private Float servicePrice;

	private String recvUserLogistics;

	private String requestId;

	private String trademarkIcon;

	private String sendSbjLogistics;

	private Long applicantId;

	private Integer applicationStatus;

	private String sendUserLogistics;

	private String note;

	private Integer principalName;

	private String trademarkName;

	private String authorizationUrl;

	private Integer applicationType;

	private String bizId;

	private Map<Object,Object> extendInfo;

	private Integer trademarkNameType;

	private String trademarkNumber;

	private Float totalPrice;

	private String orderId;

	private List<ThirdClassification> thirdClassifications;

	private List<Supplement> supplements;

	private List<String> judgeResultUrls;

	private List<String> receiptUrls;

	private Applicant applicant;

	private FirstClassification firstClassification;

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

	public String getBlackAndWhiteIconUrl() {
		return this.blackAndWhiteIconUrl;
	}

	public void setBlackAndWhiteIconUrl(String blackAndWhiteIconUrl) {
		this.blackAndWhiteIconUrl = blackAndWhiteIconUrl;
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

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Float getServicePrice() {
		return this.servicePrice;
	}

	public void setServicePrice(Float servicePrice) {
		this.servicePrice = servicePrice;
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

	public String getTrademarkIcon() {
		return this.trademarkIcon;
	}

	public void setTrademarkIcon(String trademarkIcon) {
		this.trademarkIcon = trademarkIcon;
	}

	public String getSendSbjLogistics() {
		return this.sendSbjLogistics;
	}

	public void setSendSbjLogistics(String sendSbjLogistics) {
		this.sendSbjLogistics = sendSbjLogistics;
	}

	public Long getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}

	public Integer getApplicationStatus() {
		return this.applicationStatus;
	}

	public void setApplicationStatus(Integer applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getSendUserLogistics() {
		return this.sendUserLogistics;
	}

	public void setSendUserLogistics(String sendUserLogistics) {
		this.sendUserLogistics = sendUserLogistics;
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

	public String getTrademarkName() {
		return this.trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		this.trademarkName = trademarkName;
	}

	public String getAuthorizationUrl() {
		return this.authorizationUrl;
	}

	public void setAuthorizationUrl(String authorizationUrl) {
		this.authorizationUrl = authorizationUrl;
	}

	public Integer getApplicationType() {
		return this.applicationType;
	}

	public void setApplicationType(Integer applicationType) {
		this.applicationType = applicationType;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Map<Object,Object> getExtendInfo() {
		return this.extendInfo;
	}

	public void setExtendInfo(Map<Object,Object> extendInfo) {
		this.extendInfo = extendInfo;
	}

	public Integer getTrademarkNameType() {
		return this.trademarkNameType;
	}

	public void setTrademarkNameType(Integer trademarkNameType) {
		this.trademarkNameType = trademarkNameType;
	}

	public String getTrademarkNumber() {
		return this.trademarkNumber;
	}

	public void setTrademarkNumber(String trademarkNumber) {
		this.trademarkNumber = trademarkNumber;
	}

	public Float getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<ThirdClassification> getThirdClassifications() {
		return this.thirdClassifications;
	}

	public void setThirdClassifications(List<ThirdClassification> thirdClassifications) {
		this.thirdClassifications = thirdClassifications;
	}

	public List<Supplement> getSupplements() {
		return this.supplements;
	}

	public void setSupplements(List<Supplement> supplements) {
		this.supplements = supplements;
	}

	public List<String> getJudgeResultUrls() {
		return this.judgeResultUrls;
	}

	public void setJudgeResultUrls(List<String> judgeResultUrls) {
		this.judgeResultUrls = judgeResultUrls;
	}

	public List<String> getReceiptUrls() {
		return this.receiptUrls;
	}

	public void setReceiptUrls(List<String> receiptUrls) {
		this.receiptUrls = receiptUrls;
	}

	public Applicant getApplicant() {
		return this.applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public FirstClassification getFirstClassification() {
		return this.firstClassification;
	}

	public void setFirstClassification(FirstClassification firstClassification) {
		this.firstClassification = firstClassification;
	}

	public static class ThirdClassification {

		private String classificationName;

		private String classificationCode;

		public String getClassificationName() {
			return this.classificationName;
		}

		public void setClassificationName(String classificationName) {
			this.classificationName = classificationName;
		}

		public String getClassificationCode() {
			return this.classificationCode;
		}

		public void setClassificationCode(String classificationCode) {
			this.classificationCode = classificationCode;
		}
	}

	public static class Supplement {

		private Long operateTime;

		private String serialNumber;

		private String officialFile;

		private Long acceptExpirationDate;

		private Integer applicationType;

		private Long sendTime;

		private Long acceptTime;

		private Long sbjExpirationDate;

		private Long supplementId;

		private String trademarkNumber;

		private Integer supplementStatus;

		private String content;

		private String orderId;

		private List<String> userFiles;

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

		public String getOfficialFile() {
			return this.officialFile;
		}

		public void setOfficialFile(String officialFile) {
			this.officialFile = officialFile;
		}

		public Long getAcceptExpirationDate() {
			return this.acceptExpirationDate;
		}

		public void setAcceptExpirationDate(Long acceptExpirationDate) {
			this.acceptExpirationDate = acceptExpirationDate;
		}

		public Integer getApplicationType() {
			return this.applicationType;
		}

		public void setApplicationType(Integer applicationType) {
			this.applicationType = applicationType;
		}

		public Long getSendTime() {
			return this.sendTime;
		}

		public void setSendTime(Long sendTime) {
			this.sendTime = sendTime;
		}

		public Long getAcceptTime() {
			return this.acceptTime;
		}

		public void setAcceptTime(Long acceptTime) {
			this.acceptTime = acceptTime;
		}

		public Long getSbjExpirationDate() {
			return this.sbjExpirationDate;
		}

		public void setSbjExpirationDate(Long sbjExpirationDate) {
			this.sbjExpirationDate = sbjExpirationDate;
		}

		public Long getSupplementId() {
			return this.supplementId;
		}

		public void setSupplementId(Long supplementId) {
			this.supplementId = supplementId;
		}

		public String getTrademarkNumber() {
			return this.trademarkNumber;
		}

		public void setTrademarkNumber(String trademarkNumber) {
			this.trademarkNumber = trademarkNumber;
		}

		public Integer getSupplementStatus() {
			return this.supplementStatus;
		}

		public void setSupplementStatus(Integer supplementStatus) {
			this.supplementStatus = supplementStatus;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public List<String> getUserFiles() {
			return this.userFiles;
		}

		public void setUserFiles(List<String> userFiles) {
			this.userFiles = userFiles;
		}
	}

	public static class Applicant {

		private String contactNumber;

		private String contactAddress;

		private String businessLicenceUrl;

		private String passportUrl;

		private String contactZipcode;

		private String authorizationUrl;

		private String contactName;

		private String legalNoticeUrl;

		private String eAddress;

		private String eName;

		private String idCardUrl;

		private String applicantName;

		private String cardNumber;

		private String contactEmail;

		private Integer applicantRegion;

		private String address;

		private String country;

		private Integer principalName;

		private Integer applicantType;

		private Integer auditStatus;

		private String province;

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

		public String getEName() {
			return this.eName;
		}

		public void setEName(String eName) {
			this.eName = eName;
		}

		public String getIdCardUrl() {
			return this.idCardUrl;
		}

		public void setIdCardUrl(String idCardUrl) {
			this.idCardUrl = idCardUrl;
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

		public String getContactEmail() {
			return this.contactEmail;
		}

		public void setContactEmail(String contactEmail) {
			this.contactEmail = contactEmail;
		}

		public Integer getApplicantRegion() {
			return this.applicantRegion;
		}

		public void setApplicantRegion(Integer applicantRegion) {
			this.applicantRegion = applicantRegion;
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

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}
	}

	public static class FirstClassification {

		private String classificationName;

		private String classificationCode;

		public String getClassificationName() {
			return this.classificationName;
		}

		public void setClassificationName(String classificationName) {
			this.classificationName = classificationName;
		}

		public String getClassificationCode() {
			return this.classificationCode;
		}

		public void setClassificationCode(String classificationCode) {
			this.classificationCode = classificationCode;
		}
	}

	@Override
	public DescribeAdminTrademarkApplicationResponse getInstance(UnmarshallerContext context) {
		return	DescribeAdminTrademarkApplicationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

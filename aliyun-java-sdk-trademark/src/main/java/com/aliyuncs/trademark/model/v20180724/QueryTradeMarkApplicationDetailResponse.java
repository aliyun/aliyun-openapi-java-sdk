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

	private Integer status;

	private String requestId;

	private String loaUrl;

	private Integer orderPrice;

	private String tmIcon;

	private String orderId;

	private Integer type;

	private Integer tmNameType;

	private String tmName;

	private String bizId;

	private String grayIconUrl;

	private String note;

	private String tmNumber;

	private String acceptUrl;

	private Long createTime;

	private Long updateTime;

	private Map<Object,Object> extendInfo;

	private String sendSbjLogistics;

	private String sendUserLogistics;

	private String recvUserLogistics;

	private Long materialId;

	private List<ThirdClassifications> thirdClassification;

	private List<SupplementsItem> supplements;

	private List<String> receiptUrl;

	private List<String> judgeResultUrl;

	private AdminUploads adminUploads;

	private MaterialDetail materialDetail;

	private FirstClassification firstClassification;

	private RenewResponse renewResponse;

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLoaUrl() {
		return this.loaUrl;
	}

	public void setLoaUrl(String loaUrl) {
		this.loaUrl = loaUrl;
	}

	public Integer getOrderPrice() {
		return this.orderPrice;
	}

	public void setOrderPrice(Integer orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getTmIcon() {
		return this.tmIcon;
	}

	public void setTmIcon(String tmIcon) {
		this.tmIcon = tmIcon;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getTmNameType() {
		return this.tmNameType;
	}

	public void setTmNameType(Integer tmNameType) {
		this.tmNameType = tmNameType;
	}

	public String getTmName() {
		return this.tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getGrayIconUrl() {
		return this.grayIconUrl;
	}

	public void setGrayIconUrl(String grayIconUrl) {
		this.grayIconUrl = grayIconUrl;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getTmNumber() {
		return this.tmNumber;
	}

	public void setTmNumber(String tmNumber) {
		this.tmNumber = tmNumber;
	}

	public String getAcceptUrl() {
		return this.acceptUrl;
	}

	public void setAcceptUrl(String acceptUrl) {
		this.acceptUrl = acceptUrl;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public Map<Object,Object> getExtendInfo() {
		return this.extendInfo;
	}

	public void setExtendInfo(Map<Object,Object> extendInfo) {
		this.extendInfo = extendInfo;
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

	public String getRecvUserLogistics() {
		return this.recvUserLogistics;
	}

	public void setRecvUserLogistics(String recvUserLogistics) {
		this.recvUserLogistics = recvUserLogistics;
	}

	public Long getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}

	public List<ThirdClassifications> getThirdClassification() {
		return this.thirdClassification;
	}

	public void setThirdClassification(List<ThirdClassifications> thirdClassification) {
		this.thirdClassification = thirdClassification;
	}

	public List<SupplementsItem> getSupplements() {
		return this.supplements;
	}

	public void setSupplements(List<SupplementsItem> supplements) {
		this.supplements = supplements;
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

	public AdminUploads getAdminUploads() {
		return this.adminUploads;
	}

	public void setAdminUploads(AdminUploads adminUploads) {
		this.adminUploads = adminUploads;
	}

	public MaterialDetail getMaterialDetail() {
		return this.materialDetail;
	}

	public void setMaterialDetail(MaterialDetail materialDetail) {
		this.materialDetail = materialDetail;
	}

	public FirstClassification getFirstClassification() {
		return this.firstClassification;
	}

	public void setFirstClassification(FirstClassification firstClassification) {
		this.firstClassification = firstClassification;
	}

	public RenewResponse getRenewResponse() {
		return this.renewResponse;
	}

	public void setRenewResponse(RenewResponse renewResponse) {
		this.renewResponse = renewResponse;
	}

	public static class ThirdClassifications {

		private String code;

		private String name;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static class SupplementsItem {

		private Long id;

		private String serialNumber;

		private Integer type;

		private Integer status;

		private String orderId;

		private String tmNumber;

		private Long sendTime;

		private Long acceptTime;

		private Long sbjDeadTime;

		private Long acceptDeadTime;

		private String uploadFileTemplateUrl;

		private String content;

		private String batchNum;

		private Long operateTime;

		private List<String> fileTemplateUrls;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

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

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getTmNumber() {
			return this.tmNumber;
		}

		public void setTmNumber(String tmNumber) {
			this.tmNumber = tmNumber;
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

		public String getBatchNum() {
			return this.batchNum;
		}

		public void setBatchNum(String batchNum) {
			this.batchNum = batchNum;
		}

		public Long getOperateTime() {
			return this.operateTime;
		}

		public void setOperateTime(Long operateTime) {
			this.operateTime = operateTime;
		}

		public List<String> getFileTemplateUrls() {
			return this.fileTemplateUrls;
		}

		public void setFileTemplateUrls(List<String> fileTemplateUrls) {
			this.fileTemplateUrls = fileTemplateUrls;
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

	public static class MaterialDetail {

		private String cardNumber;

		private String contactAddress;

		private Integer status;

		private String eName;

		private String address;

		private String loaUrl;

		private String city;

		private String passportUrl;

		private String province;

		private String eAddress;

		private String name;

		private String idCardUrl;

		private String businessLicenceUrl;

		private Integer type;

		private String expirationDate;

		private String contactZipcode;

		private String town;

		private String contactNumber;

		private String contactEmail;

		private String country;

		private Integer region;

		private String contactName;

		private String legalNoticeUrl;

		public String getCardNumber() {
			return this.cardNumber;
		}

		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}

		public String getContactAddress() {
			return this.contactAddress;
		}

		public void setContactAddress(String contactAddress) {
			this.contactAddress = contactAddress;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getEName() {
			return this.eName;
		}

		public void setEName(String eName) {
			this.eName = eName;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getLoaUrl() {
			return this.loaUrl;
		}

		public void setLoaUrl(String loaUrl) {
			this.loaUrl = loaUrl;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getPassportUrl() {
			return this.passportUrl;
		}

		public void setPassportUrl(String passportUrl) {
			this.passportUrl = passportUrl;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getEAddress() {
			return this.eAddress;
		}

		public void setEAddress(String eAddress) {
			this.eAddress = eAddress;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
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

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getExpirationDate() {
			return this.expirationDate;
		}

		public void setExpirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
		}

		public String getContactZipcode() {
			return this.contactZipcode;
		}

		public void setContactZipcode(String contactZipcode) {
			this.contactZipcode = contactZipcode;
		}

		public String getTown() {
			return this.town;
		}

		public void setTown(String town) {
			this.town = town;
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

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public Integer getRegion() {
			return this.region;
		}

		public void setRegion(Integer region) {
			this.region = region;
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
	}

	public static class FirstClassification {

		private String code;

		private String name;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static class RenewResponse {

		private String name;

		private String engName;

		private String address;

		private String engAddress;

		private Long registerTime;

		private Long submitSbjtime;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEngName() {
			return this.engName;
		}

		public void setEngName(String engName) {
			this.engName = engName;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getEngAddress() {
			return this.engAddress;
		}

		public void setEngAddress(String engAddress) {
			this.engAddress = engAddress;
		}

		public Long getRegisterTime() {
			return this.registerTime;
		}

		public void setRegisterTime(Long registerTime) {
			this.registerTime = registerTime;
		}

		public Long getSubmitSbjtime() {
			return this.submitSbjtime;
		}

		public void setSubmitSbjtime(Long submitSbjtime) {
			this.submitSbjtime = submitSbjtime;
		}
	}

	@Override
	public QueryTradeMarkApplicationDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryTradeMarkApplicationDetailResponseUnmarshaller.unmarshall(this, context);
	}
}

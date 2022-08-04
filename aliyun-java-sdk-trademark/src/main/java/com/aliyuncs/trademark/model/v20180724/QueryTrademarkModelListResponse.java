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
import com.aliyuncs.trademark.transform.v20180724.QueryTrademarkModelListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTrademarkModelListResponse extends AcsResponse {

	private Moudle moudle;

	public Moudle getMoudle() {
		return this.moudle;
	}

	public void setMoudle(Moudle moudle) {
		this.moudle = moudle;
	}

	public static class Moudle {

		private Integer totalPageNum;

		private String requestId;

		private List<Item> data;

		public Integer getTotalPageNum() {
			return this.totalPageNum;
		}

		public void setTotalPageNum(Integer totalPageNum) {
			this.totalPageNum = totalPageNum;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public List<Item> getData() {
			return this.data;
		}

		public void setData(List<Item> data) {
			this.data = data;
		}

		public static class Item {

			private String bizId;

			private String bizType;

			private String trademarkNumber;

			private String trademarkName;

			private Integer trademarkNameType;

			private String produceType;

			private String status;

			private String statusStr;

			private Integer bitFlag;

			private String icon;

			private String grayIconUrl;

			private String orderId;

			private String partnerCode;

			private Integer submitTimes;

			private String submitStatus;

			private Long submitTimeValue;

			private String submitTimeStr;

			private Long submitAuditTimeValue;

			private String submitAuditTimeStr;

			private String principalName;

			private String principalKey;

			private Map<Object,Object> extendInfo;

			private List<LeafCode> leafCodes;

			private MaterialInfo materialInfo;

			private RootCode rootCode;

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public String getBizType() {
				return this.bizType;
			}

			public void setBizType(String bizType) {
				this.bizType = bizType;
			}

			public String getTrademarkNumber() {
				return this.trademarkNumber;
			}

			public void setTrademarkNumber(String trademarkNumber) {
				this.trademarkNumber = trademarkNumber;
			}

			public String getTrademarkName() {
				return this.trademarkName;
			}

			public void setTrademarkName(String trademarkName) {
				this.trademarkName = trademarkName;
			}

			public Integer getTrademarkNameType() {
				return this.trademarkNameType;
			}

			public void setTrademarkNameType(Integer trademarkNameType) {
				this.trademarkNameType = trademarkNameType;
			}

			public String getProduceType() {
				return this.produceType;
			}

			public void setProduceType(String produceType) {
				this.produceType = produceType;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getStatusStr() {
				return this.statusStr;
			}

			public void setStatusStr(String statusStr) {
				this.statusStr = statusStr;
			}

			public Integer getBitFlag() {
				return this.bitFlag;
			}

			public void setBitFlag(Integer bitFlag) {
				this.bitFlag = bitFlag;
			}

			public String getIcon() {
				return this.icon;
			}

			public void setIcon(String icon) {
				this.icon = icon;
			}

			public String getGrayIconUrl() {
				return this.grayIconUrl;
			}

			public void setGrayIconUrl(String grayIconUrl) {
				this.grayIconUrl = grayIconUrl;
			}

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
			}

			public String getPartnerCode() {
				return this.partnerCode;
			}

			public void setPartnerCode(String partnerCode) {
				this.partnerCode = partnerCode;
			}

			public Integer getSubmitTimes() {
				return this.submitTimes;
			}

			public void setSubmitTimes(Integer submitTimes) {
				this.submitTimes = submitTimes;
			}

			public String getSubmitStatus() {
				return this.submitStatus;
			}

			public void setSubmitStatus(String submitStatus) {
				this.submitStatus = submitStatus;
			}

			public Long getSubmitTimeValue() {
				return this.submitTimeValue;
			}

			public void setSubmitTimeValue(Long submitTimeValue) {
				this.submitTimeValue = submitTimeValue;
			}

			public String getSubmitTimeStr() {
				return this.submitTimeStr;
			}

			public void setSubmitTimeStr(String submitTimeStr) {
				this.submitTimeStr = submitTimeStr;
			}

			public Long getSubmitAuditTimeValue() {
				return this.submitAuditTimeValue;
			}

			public void setSubmitAuditTimeValue(Long submitAuditTimeValue) {
				this.submitAuditTimeValue = submitAuditTimeValue;
			}

			public String getSubmitAuditTimeStr() {
				return this.submitAuditTimeStr;
			}

			public void setSubmitAuditTimeStr(String submitAuditTimeStr) {
				this.submitAuditTimeStr = submitAuditTimeStr;
			}

			public String getPrincipalName() {
				return this.principalName;
			}

			public void setPrincipalName(String principalName) {
				this.principalName = principalName;
			}

			public String getPrincipalKey() {
				return this.principalKey;
			}

			public void setPrincipalKey(String principalKey) {
				this.principalKey = principalKey;
			}

			public Map<Object,Object> getExtendInfo() {
				return this.extendInfo;
			}

			public void setExtendInfo(Map<Object,Object> extendInfo) {
				this.extendInfo = extendInfo;
			}

			public List<LeafCode> getLeafCodes() {
				return this.leafCodes;
			}

			public void setLeafCodes(List<LeafCode> leafCodes) {
				this.leafCodes = leafCodes;
			}

			public MaterialInfo getMaterialInfo() {
				return this.materialInfo;
			}

			public void setMaterialInfo(MaterialInfo materialInfo) {
				this.materialInfo = materialInfo;
			}

			public RootCode getRootCode() {
				return this.rootCode;
			}

			public void setRootCode(RootCode rootCode) {
				this.rootCode = rootCode;
			}

			public static class LeafCode {

				private String classificationCode;

				private String classificationName;

				public String getClassificationCode() {
					return this.classificationCode;
				}

				public void setClassificationCode(String classificationCode) {
					this.classificationCode = classificationCode;
				}

				public String getClassificationName() {
					return this.classificationName;
				}

				public void setClassificationName(String classificationName) {
					this.classificationName = classificationName;
				}
			}

			public static class MaterialInfo {

				private String name;

				private Integer type;

				private Integer region;

				private String loaUrl;

				private String cardNumber;

				private String province;

				private String country;

				private String address;

				private String eName;

				private String eAddress;

				private String loaKey;

				private String idCardUrl;

				private String businessLicenceUrl;

				private String passportUrl;

				private String cnInfoUrl;

				private String reasonFileOssKey;

				private String postCode;

				private Integer personalType;

				private String idCardNumber;

				private String contactAddress;

				private String contactEmail;

				private String contactZipCode;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Integer getType() {
					return this.type;
				}

				public void setType(Integer type) {
					this.type = type;
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

				public String getCountry() {
					return this.country;
				}

				public void setCountry(String country) {
					this.country = country;
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

				public String getLoaKey() {
					return this.loaKey;
				}

				public void setLoaKey(String loaKey) {
					this.loaKey = loaKey;
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

				public String getCnInfoUrl() {
					return this.cnInfoUrl;
				}

				public void setCnInfoUrl(String cnInfoUrl) {
					this.cnInfoUrl = cnInfoUrl;
				}

				public String getReasonFileOssKey() {
					return this.reasonFileOssKey;
				}

				public void setReasonFileOssKey(String reasonFileOssKey) {
					this.reasonFileOssKey = reasonFileOssKey;
				}

				public String getPostCode() {
					return this.postCode;
				}

				public void setPostCode(String postCode) {
					this.postCode = postCode;
				}

				public Integer getPersonalType() {
					return this.personalType;
				}

				public void setPersonalType(Integer personalType) {
					this.personalType = personalType;
				}

				public String getIdCardNumber() {
					return this.idCardNumber;
				}

				public void setIdCardNumber(String idCardNumber) {
					this.idCardNumber = idCardNumber;
				}

				public String getContactAddress() {
					return this.contactAddress;
				}

				public void setContactAddress(String contactAddress) {
					this.contactAddress = contactAddress;
				}

				public String getContactEmail() {
					return this.contactEmail;
				}

				public void setContactEmail(String contactEmail) {
					this.contactEmail = contactEmail;
				}

				public String getContactZipCode() {
					return this.contactZipCode;
				}

				public void setContactZipCode(String contactZipCode) {
					this.contactZipCode = contactZipCode;
				}
			}

			public static class RootCode {

				private String classificationCode;

				private String classificationName;

				public String getClassificationCode() {
					return this.classificationCode;
				}

				public void setClassificationCode(String classificationCode) {
					this.classificationCode = classificationCode;
				}

				public String getClassificationName() {
					return this.classificationName;
				}

				public void setClassificationName(String classificationName) {
					this.classificationName = classificationName;
				}
			}
		}
	}

	@Override
	public QueryTrademarkModelListResponse getInstance(UnmarshallerContext context) {
		return	QueryTrademarkModelListResponseUnmarshaller.unmarshall(this, context);
	}
}

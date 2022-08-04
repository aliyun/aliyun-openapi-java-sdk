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
import com.aliyuncs.trademark.transform.v20180724.QueryTmSbjProduceDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTmSbjProduceDetailResponse extends AcsResponse {

	private String acceptUrl;

	private String cnInfoUrl;

	private Integer type;

	private Integer status;

	private String bizId;

	private Map<Object,Object> extendInfo;

	private Integer tmNameType;

	private String issueDate;

	private String tmIcon;

	private String grayIconUrl;

	private String tmName;

	private String requestId;

	private String loaUrl;

	private String tmNumber;

	private String note;

	private Integer principalName;

	private String tmOrderId;

	private Integer submitCount;

	private String orderId;

	private String submitStatus;

	private String materialName;

	private List<LeafCodesItem> leafCodes;

	private List<String> flags;

	private MaterialDetail materialDetail;

	private RootCode rootCode;

	public String getAcceptUrl() {
		return this.acceptUrl;
	}

	public void setAcceptUrl(String acceptUrl) {
		this.acceptUrl = acceptUrl;
	}

	public String getCnInfoUrl() {
		return this.cnInfoUrl;
	}

	public void setCnInfoUrl(String cnInfoUrl) {
		this.cnInfoUrl = cnInfoUrl;
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

	public Integer getTmNameType() {
		return this.tmNameType;
	}

	public void setTmNameType(Integer tmNameType) {
		this.tmNameType = tmNameType;
	}

	public String getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getTmIcon() {
		return this.tmIcon;
	}

	public void setTmIcon(String tmIcon) {
		this.tmIcon = tmIcon;
	}

	public String getGrayIconUrl() {
		return this.grayIconUrl;
	}

	public void setGrayIconUrl(String grayIconUrl) {
		this.grayIconUrl = grayIconUrl;
	}

	public String getTmName() {
		return this.tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
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

	public String getTmOrderId() {
		return this.tmOrderId;
	}

	public void setTmOrderId(String tmOrderId) {
		this.tmOrderId = tmOrderId;
	}

	public Integer getSubmitCount() {
		return this.submitCount;
	}

	public void setSubmitCount(Integer submitCount) {
		this.submitCount = submitCount;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSubmitStatus() {
		return this.submitStatus;
	}

	public void setSubmitStatus(String submitStatus) {
		this.submitStatus = submitStatus;
	}

	public String getMaterialName() {
		return this.materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public List<LeafCodesItem> getLeafCodes() {
		return this.leafCodes;
	}

	public void setLeafCodes(List<LeafCodesItem> leafCodes) {
		this.leafCodes = leafCodes;
	}

	public List<String> getFlags() {
		return this.flags;
	}

	public void setFlags(List<String> flags) {
		this.flags = flags;
	}

	public MaterialDetail getMaterialDetail() {
		return this.materialDetail;
	}

	public void setMaterialDetail(MaterialDetail materialDetail) {
		this.materialDetail = materialDetail;
	}

	public RootCode getRootCode() {
		return this.rootCode;
	}

	public void setRootCode(RootCode rootCode) {
		this.rootCode = rootCode;
	}

	public static class LeafCodesItem {

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

		private String contactNumber;

		private Integer type;

		private Integer status;

		private String contactAddress;

		private String businessLicenceUrl;

		private String passportUrl;

		private String contactZipcode;

		private String contactName;

		private String city;

		private String eAddress;

		private String eName;

		private String expirationDate;

		private String idCardUrl;

		private String cardNumber;

		private String contactEmail;

		private Integer region;

		private String loaUrl;

		private String address;

		private String country;

		private String town;

		private String name;

		private String province;

		private Integer personalType;

		private String idCardNumber;

		private String contactProvince;

		private String detailedContactAddress;

		public String getContactNumber() {
			return this.contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
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

		public String getContactName() {
			return this.contactName;
		}

		public void setContactName(String contactName) {
			this.contactName = contactName;
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

		public String getEName() {
			return this.eName;
		}

		public void setEName(String eName) {
			this.eName = eName;
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

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
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

		public String getContactProvince() {
			return this.contactProvince;
		}

		public void setContactProvince(String contactProvince) {
			this.contactProvince = contactProvince;
		}

		public String getDetailedContactAddress() {
			return this.detailedContactAddress;
		}

		public void setDetailedContactAddress(String detailedContactAddress) {
			this.detailedContactAddress = detailedContactAddress;
		}
	}

	public static class RootCode {

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

	@Override
	public QueryTmSbjProduceDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryTmSbjProduceDetailResponseUnmarshaller.unmarshall(this, context);
	}
}

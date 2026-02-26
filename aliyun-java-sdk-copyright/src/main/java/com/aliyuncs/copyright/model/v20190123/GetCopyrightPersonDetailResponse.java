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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.GetCopyrightPersonDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCopyrightPersonDetailResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String legalPersonType;

		private String city;

		private String county;

		private String enterpriseTime;

		private String cardNum;

		private String expiredDate;

		private String address;

		private String idFrontImage;

		private String name;

		private Integer auditStatus;

		private String enterpriseType;

		private String idHandedImage;

		private Integer roleType;

		private String enterpriseLicensePath;

		private Integer useType;

		private String idBackImage;

		private String phone;

		private String cardType;

		private String userPk;

		private String email;

		private String enterprisePark;

		private Integer ownerType;

		private String personId;

		private String province;

		private String contactPerson;

		public String getLegalPersonType() {
			return this.legalPersonType;
		}

		public void setLegalPersonType(String legalPersonType) {
			this.legalPersonType = legalPersonType;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCounty() {
			return this.county;
		}

		public void setCounty(String county) {
			this.county = county;
		}

		public String getEnterpriseTime() {
			return this.enterpriseTime;
		}

		public void setEnterpriseTime(String enterpriseTime) {
			this.enterpriseTime = enterpriseTime;
		}

		public String getCardNum() {
			return this.cardNum;
		}

		public void setCardNum(String cardNum) {
			this.cardNum = cardNum;
		}

		public String getExpiredDate() {
			return this.expiredDate;
		}

		public void setExpiredDate(String expiredDate) {
			this.expiredDate = expiredDate;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getIdFrontImage() {
			return this.idFrontImage;
		}

		public void setIdFrontImage(String idFrontImage) {
			this.idFrontImage = idFrontImage;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
		}

		public String getEnterpriseType() {
			return this.enterpriseType;
		}

		public void setEnterpriseType(String enterpriseType) {
			this.enterpriseType = enterpriseType;
		}

		public String getIdHandedImage() {
			return this.idHandedImage;
		}

		public void setIdHandedImage(String idHandedImage) {
			this.idHandedImage = idHandedImage;
		}

		public Integer getRoleType() {
			return this.roleType;
		}

		public void setRoleType(Integer roleType) {
			this.roleType = roleType;
		}

		public String getEnterpriseLicensePath() {
			return this.enterpriseLicensePath;
		}

		public void setEnterpriseLicensePath(String enterpriseLicensePath) {
			this.enterpriseLicensePath = enterpriseLicensePath;
		}

		public Integer getUseType() {
			return this.useType;
		}

		public void setUseType(Integer useType) {
			this.useType = useType;
		}

		public String getIdBackImage() {
			return this.idBackImage;
		}

		public void setIdBackImage(String idBackImage) {
			this.idBackImage = idBackImage;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCardType() {
			return this.cardType;
		}

		public void setCardType(String cardType) {
			this.cardType = cardType;
		}

		public String getUserPk() {
			return this.userPk;
		}

		public void setUserPk(String userPk) {
			this.userPk = userPk;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEnterprisePark() {
			return this.enterprisePark;
		}

		public void setEnterprisePark(String enterprisePark) {
			this.enterprisePark = enterprisePark;
		}

		public Integer getOwnerType() {
			return this.ownerType;
		}

		public void setOwnerType(Integer ownerType) {
			this.ownerType = ownerType;
		}

		public String getPersonId() {
			return this.personId;
		}

		public void setPersonId(String personId) {
			this.personId = personId;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getContactPerson() {
			return this.contactPerson;
		}

		public void setContactPerson(String contactPerson) {
			this.contactPerson = contactPerson;
		}
	}

	@Override
	public GetCopyrightPersonDetailResponse getInstance(UnmarshallerContext context) {
		return	GetCopyrightPersonDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

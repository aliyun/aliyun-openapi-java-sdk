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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.QueryEnterpriseInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEnterpriseInfoResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private ProfileInfo profileInfo;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public ProfileInfo getProfileInfo() {
		return this.profileInfo;
	}

	public void setProfileInfo(ProfileInfo profileInfo) {
		this.profileInfo = profileInfo;
	}

	public static class ProfileInfo {

		private String postalCode;

		private String years;

		private String aliyunPK;

		private String updateTime;

		private String createTime;

		private String businessLicenseType;

		private String phone;

		private String profile;

		private String certifiedTime;

		private String extend;

		private String businessLicenseImgSrc;

		private String certifiedFrom;

		private String entityIDNumber;

		private String fax;

		private String eInterpriseSize;

		private String detailAddress;

		private String businessLicenseNumber;

		private String enterpriseEntity;

		private String name;

		private String auditStatus;

		private String alias;

		private Province province;

		private City city;

		public String getPostalCode() {
			return this.postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getYears() {
			return this.years;
		}

		public void setYears(String years) {
			this.years = years;
		}

		public String getAliyunPK() {
			return this.aliyunPK;
		}

		public void setAliyunPK(String aliyunPK) {
			this.aliyunPK = aliyunPK;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getBusinessLicenseType() {
			return this.businessLicenseType;
		}

		public void setBusinessLicenseType(String businessLicenseType) {
			this.businessLicenseType = businessLicenseType;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getProfile() {
			return this.profile;
		}

		public void setProfile(String profile) {
			this.profile = profile;
		}

		public String getCertifiedTime() {
			return this.certifiedTime;
		}

		public void setCertifiedTime(String certifiedTime) {
			this.certifiedTime = certifiedTime;
		}

		public String getExtend() {
			return this.extend;
		}

		public void setExtend(String extend) {
			this.extend = extend;
		}

		public String getBusinessLicenseImgSrc() {
			return this.businessLicenseImgSrc;
		}

		public void setBusinessLicenseImgSrc(String businessLicenseImgSrc) {
			this.businessLicenseImgSrc = businessLicenseImgSrc;
		}

		public String getCertifiedFrom() {
			return this.certifiedFrom;
		}

		public void setCertifiedFrom(String certifiedFrom) {
			this.certifiedFrom = certifiedFrom;
		}

		public String getEntityIDNumber() {
			return this.entityIDNumber;
		}

		public void setEntityIDNumber(String entityIDNumber) {
			this.entityIDNumber = entityIDNumber;
		}

		public String getFax() {
			return this.fax;
		}

		public void setFax(String fax) {
			this.fax = fax;
		}

		public String getEInterpriseSize() {
			return this.eInterpriseSize;
		}

		public void setEInterpriseSize(String eInterpriseSize) {
			this.eInterpriseSize = eInterpriseSize;
		}

		public String getDetailAddress() {
			return this.detailAddress;
		}

		public void setDetailAddress(String detailAddress) {
			this.detailAddress = detailAddress;
		}

		public String getBusinessLicenseNumber() {
			return this.businessLicenseNumber;
		}

		public void setBusinessLicenseNumber(String businessLicenseNumber) {
			this.businessLicenseNumber = businessLicenseNumber;
		}

		public String getEnterpriseEntity() {
			return this.enterpriseEntity;
		}

		public void setEnterpriseEntity(String enterpriseEntity) {
			this.enterpriseEntity = enterpriseEntity;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(String auditStatus) {
			this.auditStatus = auditStatus;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public Province getProvince() {
			return this.province;
		}

		public void setProvince(Province province) {
			this.province = province;
		}

		public City getCity() {
			return this.city;
		}

		public void setCity(City city) {
			this.city = city;
		}

		public static class Province {

			private String name;

			private String id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class City {

			private String name;

			private String id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public QueryEnterpriseInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryEnterpriseInfoResponseUnmarshaller.unmarshall(this, context);
	}
}

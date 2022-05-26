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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.QueryAccountDeliveryAddressInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAccountDeliveryAddressInfoResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Boolean success;

	private List<AddressList> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<AddressList> getData() {
		return this.data;
	}

	public void setData(List<AddressList> data) {
		this.data = data;
	}

	public static class AddressList {

		private String address;

		private String areaId;

		private String cityId;

		private String contacts;

		private Boolean defaultAddress;

		private String email;

		private String mobile;

		private String phone;

		private String pk;

		private String postalcode;

		private String proviceId;

		private String townId;

		private AreaDivision areaDivision;

		private CityDivision cityDivision;

		private ProviceDivision proviceDivision;

		private TownDivision townDivision;

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getAreaId() {
			return this.areaId;
		}

		public void setAreaId(String areaId) {
			this.areaId = areaId;
		}

		public String getCityId() {
			return this.cityId;
		}

		public void setCityId(String cityId) {
			this.cityId = cityId;
		}

		public String getContacts() {
			return this.contacts;
		}

		public void setContacts(String contacts) {
			this.contacts = contacts;
		}

		public Boolean getDefaultAddress() {
			return this.defaultAddress;
		}

		public void setDefaultAddress(Boolean defaultAddress) {
			this.defaultAddress = defaultAddress;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getPk() {
			return this.pk;
		}

		public void setPk(String pk) {
			this.pk = pk;
		}

		public String getPostalcode() {
			return this.postalcode;
		}

		public void setPostalcode(String postalcode) {
			this.postalcode = postalcode;
		}

		public String getProviceId() {
			return this.proviceId;
		}

		public void setProviceId(String proviceId) {
			this.proviceId = proviceId;
		}

		public String getTownId() {
			return this.townId;
		}

		public void setTownId(String townId) {
			this.townId = townId;
		}

		public AreaDivision getAreaDivision() {
			return this.areaDivision;
		}

		public void setAreaDivision(AreaDivision areaDivision) {
			this.areaDivision = areaDivision;
		}

		public CityDivision getCityDivision() {
			return this.cityDivision;
		}

		public void setCityDivision(CityDivision cityDivision) {
			this.cityDivision = cityDivision;
		}

		public ProviceDivision getProviceDivision() {
			return this.proviceDivision;
		}

		public void setProviceDivision(ProviceDivision proviceDivision) {
			this.proviceDivision = proviceDivision;
		}

		public TownDivision getTownDivision() {
			return this.townDivision;
		}

		public void setTownDivision(TownDivision townDivision) {
			this.townDivision = townDivision;
		}

		public static class AreaDivision {

			private String divisionAbbName;

			private Long divisionId;

			private Long divisionLevel;

			private String divisionName;

			private String divisionTname;

			private Long newDivisionId;

			private Long parentId;

			private String pinyin;

			private String remark;

			public String getDivisionAbbName() {
				return this.divisionAbbName;
			}

			public void setDivisionAbbName(String divisionAbbName) {
				this.divisionAbbName = divisionAbbName;
			}

			public Long getDivisionId() {
				return this.divisionId;
			}

			public void setDivisionId(Long divisionId) {
				this.divisionId = divisionId;
			}

			public Long getDivisionLevel() {
				return this.divisionLevel;
			}

			public void setDivisionLevel(Long divisionLevel) {
				this.divisionLevel = divisionLevel;
			}

			public String getDivisionName() {
				return this.divisionName;
			}

			public void setDivisionName(String divisionName) {
				this.divisionName = divisionName;
			}

			public String getDivisionTname() {
				return this.divisionTname;
			}

			public void setDivisionTname(String divisionTname) {
				this.divisionTname = divisionTname;
			}

			public Long getNewDivisionId() {
				return this.newDivisionId;
			}

			public void setNewDivisionId(Long newDivisionId) {
				this.newDivisionId = newDivisionId;
			}

			public Long getParentId() {
				return this.parentId;
			}

			public void setParentId(Long parentId) {
				this.parentId = parentId;
			}

			public String getPinyin() {
				return this.pinyin;
			}

			public void setPinyin(String pinyin) {
				this.pinyin = pinyin;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}
		}

		public static class CityDivision {

			private String divisionAbbName;

			private Long divisionId;

			private Long divisionLevel;

			private String divisionName;

			private String divisionTname;

			private Long newDivisionId;

			private Long parentId;

			private String pinyin;

			private String remark;

			public String getDivisionAbbName() {
				return this.divisionAbbName;
			}

			public void setDivisionAbbName(String divisionAbbName) {
				this.divisionAbbName = divisionAbbName;
			}

			public Long getDivisionId() {
				return this.divisionId;
			}

			public void setDivisionId(Long divisionId) {
				this.divisionId = divisionId;
			}

			public Long getDivisionLevel() {
				return this.divisionLevel;
			}

			public void setDivisionLevel(Long divisionLevel) {
				this.divisionLevel = divisionLevel;
			}

			public String getDivisionName() {
				return this.divisionName;
			}

			public void setDivisionName(String divisionName) {
				this.divisionName = divisionName;
			}

			public String getDivisionTname() {
				return this.divisionTname;
			}

			public void setDivisionTname(String divisionTname) {
				this.divisionTname = divisionTname;
			}

			public Long getNewDivisionId() {
				return this.newDivisionId;
			}

			public void setNewDivisionId(Long newDivisionId) {
				this.newDivisionId = newDivisionId;
			}

			public Long getParentId() {
				return this.parentId;
			}

			public void setParentId(Long parentId) {
				this.parentId = parentId;
			}

			public String getPinyin() {
				return this.pinyin;
			}

			public void setPinyin(String pinyin) {
				this.pinyin = pinyin;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}
		}

		public static class ProviceDivision {

			private String divisionAbbName;

			private Long divisionId;

			private Long divisionLevel;

			private String divisionName;

			private String divisionTname;

			private Long newDivisionId;

			private Long parentId;

			private String pinyin;

			private String remark;

			public String getDivisionAbbName() {
				return this.divisionAbbName;
			}

			public void setDivisionAbbName(String divisionAbbName) {
				this.divisionAbbName = divisionAbbName;
			}

			public Long getDivisionId() {
				return this.divisionId;
			}

			public void setDivisionId(Long divisionId) {
				this.divisionId = divisionId;
			}

			public Long getDivisionLevel() {
				return this.divisionLevel;
			}

			public void setDivisionLevel(Long divisionLevel) {
				this.divisionLevel = divisionLevel;
			}

			public String getDivisionName() {
				return this.divisionName;
			}

			public void setDivisionName(String divisionName) {
				this.divisionName = divisionName;
			}

			public String getDivisionTname() {
				return this.divisionTname;
			}

			public void setDivisionTname(String divisionTname) {
				this.divisionTname = divisionTname;
			}

			public Long getNewDivisionId() {
				return this.newDivisionId;
			}

			public void setNewDivisionId(Long newDivisionId) {
				this.newDivisionId = newDivisionId;
			}

			public Long getParentId() {
				return this.parentId;
			}

			public void setParentId(Long parentId) {
				this.parentId = parentId;
			}

			public String getPinyin() {
				return this.pinyin;
			}

			public void setPinyin(String pinyin) {
				this.pinyin = pinyin;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}
		}

		public static class TownDivision {

			private String divisionAbbName;

			private Long divisionId;

			private Long divisionLevel;

			private String divisionName;

			private String divisionTname;

			private Long newDivisionId;

			private Long parentId;

			private String pinyin;

			private String remark;

			public String getDivisionAbbName() {
				return this.divisionAbbName;
			}

			public void setDivisionAbbName(String divisionAbbName) {
				this.divisionAbbName = divisionAbbName;
			}

			public Long getDivisionId() {
				return this.divisionId;
			}

			public void setDivisionId(Long divisionId) {
				this.divisionId = divisionId;
			}

			public Long getDivisionLevel() {
				return this.divisionLevel;
			}

			public void setDivisionLevel(Long divisionLevel) {
				this.divisionLevel = divisionLevel;
			}

			public String getDivisionName() {
				return this.divisionName;
			}

			public void setDivisionName(String divisionName) {
				this.divisionName = divisionName;
			}

			public String getDivisionTname() {
				return this.divisionTname;
			}

			public void setDivisionTname(String divisionTname) {
				this.divisionTname = divisionTname;
			}

			public Long getNewDivisionId() {
				return this.newDivisionId;
			}

			public void setNewDivisionId(Long newDivisionId) {
				this.newDivisionId = newDivisionId;
			}

			public Long getParentId() {
				return this.parentId;
			}

			public void setParentId(Long parentId) {
				this.parentId = parentId;
			}

			public String getPinyin() {
				return this.pinyin;
			}

			public void setPinyin(String pinyin) {
				this.pinyin = pinyin;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}
		}
	}

	@Override
	public QueryAccountDeliveryAddressInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryAccountDeliveryAddressInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

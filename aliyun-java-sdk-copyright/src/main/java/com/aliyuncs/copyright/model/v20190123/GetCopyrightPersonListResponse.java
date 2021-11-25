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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.GetCopyrightPersonListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCopyrightPersonListResponse extends AcsResponse {

	private Integer pageNum;

	private String requestId;

	private Integer pageSize;

	private Boolean success;

	private Integer totalItemNum;

	private List<DataItem> data;

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String legalPersonType;

		private Integer roleType;

		private String city;

		private Integer useType;

		private String phone;

		private String county;

		private String userPk;

		private String cardType;

		private String email;

		private String expiredDate;

		private String cardNum;

		private String address;

		private Integer ownerType;

		private String name;

		private String personId;

		private Integer auditStatus;

		private String province;

		public String getLegalPersonType() {
			return this.legalPersonType;
		}

		public void setLegalPersonType(String legalPersonType) {
			this.legalPersonType = legalPersonType;
		}

		public Integer getRoleType() {
			return this.roleType;
		}

		public void setRoleType(Integer roleType) {
			this.roleType = roleType;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public Integer getUseType() {
			return this.useType;
		}

		public void setUseType(Integer useType) {
			this.useType = useType;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCounty() {
			return this.county;
		}

		public void setCounty(String county) {
			this.county = county;
		}

		public String getUserPk() {
			return this.userPk;
		}

		public void setUserPk(String userPk) {
			this.userPk = userPk;
		}

		public String getCardType() {
			return this.cardType;
		}

		public void setCardType(String cardType) {
			this.cardType = cardType;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getExpiredDate() {
			return this.expiredDate;
		}

		public void setExpiredDate(String expiredDate) {
			this.expiredDate = expiredDate;
		}

		public String getCardNum() {
			return this.cardNum;
		}

		public void setCardNum(String cardNum) {
			this.cardNum = cardNum;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Integer getOwnerType() {
			return this.ownerType;
		}

		public void setOwnerType(Integer ownerType) {
			this.ownerType = ownerType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPersonId() {
			return this.personId;
		}

		public void setPersonId(String personId) {
			this.personId = personId;
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

	@Override
	public GetCopyrightPersonListResponse getInstance(UnmarshallerContext context) {
		return	GetCopyrightPersonListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

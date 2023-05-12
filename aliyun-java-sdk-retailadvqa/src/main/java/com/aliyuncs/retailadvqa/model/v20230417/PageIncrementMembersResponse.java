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

package com.aliyuncs.retailadvqa.model.v20230417;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa.transform.v20230417.PageIncrementMembersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PageIncrementMembersResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String success;

	private String errorCode;

	private String errorMessage;

	private List<DataItem> data;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String openMerchantId;

		private String outerMemberId;

		private String name;

		private String mobile;

		private String mixMobile;

		private String birthday;

		private String province;

		private String city;

		private String sex;

		private String email;

		private Integer status;

		private String entryChannel;

		private Integer levelNum;

		private String levelPoints;

		private String consumePoints;

		private String siteUsers;

		public String getOpenMerchantId() {
			return this.openMerchantId;
		}

		public void setOpenMerchantId(String openMerchantId) {
			this.openMerchantId = openMerchantId;
		}

		public String getOuterMemberId() {
			return this.outerMemberId;
		}

		public void setOuterMemberId(String outerMemberId) {
			this.outerMemberId = outerMemberId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getMixMobile() {
			return this.mixMobile;
		}

		public void setMixMobile(String mixMobile) {
			this.mixMobile = mixMobile;
		}

		public String getBirthday() {
			return this.birthday;
		}

		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getSex() {
			return this.sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getEntryChannel() {
			return this.entryChannel;
		}

		public void setEntryChannel(String entryChannel) {
			this.entryChannel = entryChannel;
		}

		public Integer getLevelNum() {
			return this.levelNum;
		}

		public void setLevelNum(Integer levelNum) {
			this.levelNum = levelNum;
		}

		public String getLevelPoints() {
			return this.levelPoints;
		}

		public void setLevelPoints(String levelPoints) {
			this.levelPoints = levelPoints;
		}

		public String getConsumePoints() {
			return this.consumePoints;
		}

		public void setConsumePoints(String consumePoints) {
			this.consumePoints = consumePoints;
		}

		public String getSiteUsers() {
			return this.siteUsers;
		}

		public void setSiteUsers(String siteUsers) {
			this.siteUsers = siteUsers;
		}
	}

	@Override
	public PageIncrementMembersResponse getInstance(UnmarshallerContext context) {
		return	PageIncrementMembersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}

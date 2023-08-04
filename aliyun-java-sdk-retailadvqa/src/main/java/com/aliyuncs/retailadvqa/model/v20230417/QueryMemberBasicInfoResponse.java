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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa.transform.v20230417.QueryMemberBasicInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMemberBasicInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String openMerchantId;

		private String outerMemberId;

		private String memberName;

		private String mobile;

		private String sex;

		private String birthday;

		private String country;

		private String province;

		private String city;

		private String email;

		private String avatar;

		private String levelNum;

		private String levelName;

		private String points;

		private String score;

		private String extra;

		private String area;

		private String memberNickName;

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

		public String getMemberName() {
			return this.memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getSex() {
			return this.sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public String getBirthday() {
			return this.birthday;
		}

		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
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

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAvatar() {
			return this.avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		public String getLevelNum() {
			return this.levelNum;
		}

		public void setLevelNum(String levelNum) {
			this.levelNum = levelNum;
		}

		public String getLevelName() {
			return this.levelName;
		}

		public void setLevelName(String levelName) {
			this.levelName = levelName;
		}

		public String getPoints() {
			return this.points;
		}

		public void setPoints(String points) {
			this.points = points;
		}

		public String getScore() {
			return this.score;
		}

		public void setScore(String score) {
			this.score = score;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

		public String getArea() {
			return this.area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getMemberNickName() {
			return this.memberNickName;
		}

		public void setMemberNickName(String memberNickName) {
			this.memberNickName = memberNickName;
		}
	}

	@Override
	public QueryMemberBasicInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryMemberBasicInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
